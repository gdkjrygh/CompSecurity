// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import com.jcp.model.trackorder.Charges;
import com.jcp.model.trackorder.InvoiceInfo;
import com.jcp.model.trackorder.PaymentMethods;
import com.jcp.model.trackorder.Shipping;
import com.jcp.model.trackorder.ShippingCharges;
import java.io.Serializable;

// Referenced classes of package com.jcp.model:
//            CartItemsDetails, Adjustments, EstimatedShippingCharges

public class OrderItemsDetails
    implements Serializable
{

    private Adjustments adjustments[];
    private double adjustmentsTotal;
    private Charges charges[];
    private int count;
    private String email;
    private EstimatedShippingCharges estimatedShippingCharges[];
    private boolean expressCheckoutEligible;
    private double giftWrapCharge;
    private String id;
    private InvoiceInfo invoiceInfo[];
    private boolean isPriceAccurate;
    private double itemSubTotal;
    private CartItemsDetails items[];
    private String orderDate;
    private double overSizedSurcharges;
    private PaymentMethods paymentMethods[];
    private boolean roundUp;
    private double roundUpAmount;
    private String shippedDate;
    private Shipping shipping;
    private String shippingCarrier;
    private double shippingCharge;
    private ShippingCharges shippingCharges[];
    private double shippingHandling;
    private double shippingHandlingCharges;
    private String shippingMethod;
    private String shippingStatus;
    private String shortForShippingDiscount;
    private double subTotal;
    private double tax;
    private double total;
    private double totalSavings;

    public OrderItemsDetails()
    {
    }

    public boolean containsTruckableItem()
    {
        boolean flag1 = false;
        boolean flag = false;
        if (items != null)
        {
            CartItemsDetails acartitemsdetails[] = items;
            int j = acartitemsdetails.length;
            int i = 0;
            do
            {
                flag1 = flag;
                if (i >= j)
                {
                    break;
                }
                flag1 = acartitemsdetails[i].isTruckDeliveryRequired();
                i++;
                flag = flag1 | flag;
            } while (true);
        }
        return flag1;
    }

    public Adjustments[] getAdjustments()
    {
        return adjustments;
    }

    public double getAdjustmentsTotal()
    {
        return adjustmentsTotal;
    }

    public Charges[] getCharges()
    {
        return charges;
    }

    public int getCount()
    {
        return count;
    }

    public String getEmail()
    {
        return email;
    }

    public EstimatedShippingCharges[] getEstimatedShippingCharges()
    {
        return estimatedShippingCharges;
    }

    public double getGiftWrapCharge()
    {
        return giftWrapCharge;
    }

    public String getId()
    {
        return id;
    }

    public InvoiceInfo[] getInvoiceInfo()
    {
        return invoiceInfo;
    }

    public boolean getIsPriceAccurate()
    {
        return isPriceAccurate;
    }

    public double getItemSubTotal()
    {
        return itemSubTotal;
    }

    public CartItemsDetails[] getItems()
    {
        return items;
    }

    public String getOrderDate()
    {
        return orderDate;
    }

    public double getOverSizedSurcharges()
    {
        return overSizedSurcharges;
    }

    public PaymentMethods[] getPaymentMethods()
    {
        return paymentMethods;
    }

    public double getRoundUpAmount()
    {
        return roundUpAmount;
    }

    public String getShippedDate()
    {
        return shippedDate;
    }

    public Shipping getShipping()
    {
        return shipping;
    }

    public String getShippingCarrier()
    {
        return shippingCarrier;
    }

    public double getShippingCharge()
    {
        return shippingCharge;
    }

    public ShippingCharges[] getShippingCharges()
    {
        return shippingCharges;
    }

    public double getShippingHandling()
    {
        return shippingHandling;
    }

    public double getShippingHandlingCharges()
    {
        return shippingHandlingCharges;
    }

    public String getShippingMethod()
    {
        return shippingMethod;
    }

    public String getShippingStatus()
    {
        return shippingStatus;
    }

    public String getShortForShippingDiscount()
    {
        return shortForShippingDiscount;
    }

    public double getSubTotal()
    {
        return subTotal;
    }

    public double getTax()
    {
        return tax;
    }

    public double getTotal()
    {
        return total;
    }

    public double getTotalSavings()
    {
        return totalSavings;
    }

    public boolean isExpressCheckoutEligible()
    {
        return expressCheckoutEligible;
    }

    public boolean isRoundUp()
    {
        return roundUp;
    }

    public void setAdjustments(Adjustments aadjustments[])
    {
        adjustments = aadjustments;
    }

    public void setAdjustmentsTotal(double d)
    {
        adjustmentsTotal = d;
    }

    public void setCount(int i)
    {
        count = i;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setEstimatedShippingCharges(EstimatedShippingCharges aestimatedshippingcharges[])
    {
        estimatedShippingCharges = aestimatedshippingcharges;
    }

    public void setExpressCheckoutEligible(boolean flag)
    {
        expressCheckoutEligible = flag;
    }

    public void setGiftWrapCharge(double d)
    {
        giftWrapCharge = d;
    }

    public void setIsPriceAccurate(boolean flag)
    {
        isPriceAccurate = flag;
    }

    public void setItemSubTotal(double d)
    {
        itemSubTotal = d;
    }

    public void setItems(CartItemsDetails acartitemsdetails[])
    {
        items = acartitemsdetails;
    }

    public void setOrderDate(String s)
    {
        orderDate = s;
    }

    public void setOverSizedSurcharges(double d)
    {
        overSizedSurcharges = d;
    }

    public void setRoundUp(boolean flag)
    {
        roundUp = flag;
    }

    public void setRoundUpAmount(double d)
    {
        roundUpAmount = d;
    }

    public void setShippedDate(String s)
    {
        shippedDate = s;
    }

    public void setShipping(Shipping shipping1)
    {
        shipping = shipping1;
    }

    public void setShippingCarrier(String s)
    {
        shippingCarrier = s;
    }

    public void setShippingCharge(double d)
    {
        shippingCharge = d;
    }

    public void setShippingHandling(double d)
    {
        shippingHandling = d;
    }

    public void setShippingHandlingCharges(double d)
    {
        shippingHandlingCharges = d;
    }

    public void setShippingMethod(String s)
    {
        shippingMethod = s;
    }

    public void setShippingStatus(String s)
    {
        shippingStatus = s;
    }

    public void setShortForShippingDiscount(String s)
    {
        shortForShippingDiscount = s;
    }

    public void setSubTotal(double d)
    {
        subTotal = d;
    }

    public void setTax(double d)
    {
        tax = d;
    }

    public void setTotal(double d)
    {
        total = d;
    }

    public void setTotalSavings(double d)
    {
        totalSavings = d;
    }
}
