package td2;

public abstract class ConsumerProduct implements Product{
	private String name;
	private double price;
	private static final double VAT=0.2;

	public ConsumerProduct(String _name, double _price) {
		this.name=_name;
		this.price=_price;

	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public double getVat() {
		return  VAT;
	}
	public double getVatPrice() {

		double m= this.price  + this.price * getVat();
		return m;
	}
	public double getVatAmount() {
		return this.price * getVat();
	}
	public double getUnitVatPrice() {
		return (getUnitPrice()* (1+ getUnitPrice()));
		
	}
	public double getUnitVatAmount() {
		return getUnitPrice()*getVat();
	}
	public abstract getUnitPrice();
}