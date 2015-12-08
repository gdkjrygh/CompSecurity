// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import com.jcp.model.CartItemsDetails;
import java.io.Serializable;

public class InvoiceInfo
    implements Serializable
{

    private String associateDiscount;
    private String displayedCarrierType;
    private String displayedShippingStatus;
    private String dollarAmountOff;
    private String giftWrap;
    private String giftWrapPrice;
    private String invoiceNumber;
    private String invoiceTotal;
    private String invoiceType;
    private CartItemsDetails itemInfo[];
    private String merchandiseTotal;
    private String paymentInfo;
    private String promotionCode;
    private String promotionDesc;
    private String promotionDiscount;
    private String shipRouteDesc;
    private String shipToAddressInd;
    private String shipTypeDesc;
    private String shippmentInfo;
    private String storeState;
    private String subRouteCode;
    private String subTotal;
    private String tax;
    private String totalSaving;
    private String trackPackURL;
    private String trackingNumbers;

    public InvoiceInfo()
    {
    }

    public String getAssociateDiscount()
    {
        return associateDiscount;
    }

    public String getDisplayedCarrierType()
    {
        return displayedCarrierType;
    }

    public String getDisplayedShippingStatus()
    {
        return displayedShippingStatus;
    }

    public String getDollarAmountOff()
    {
        return dollarAmountOff;
    }

    public String getGiftWrap()
    {
        return giftWrap;
    }

    public String getGiftWrapPrice()
    {
        return giftWrapPrice;
    }

    public String getInvoiceNumber()
    {
        return invoiceNumber;
    }

    public String getInvoiceTotal()
    {
        return invoiceTotal;
    }

    public String getInvoiceType()
    {
        return invoiceType;
    }

    public CartItemsDetails[] getItemInfo()
    {
        return itemInfo;
    }

    public String getMerchandiseTotal()
    {
        return merchandiseTotal;
    }

    public String getPaymentInfo()
    {
        return paymentInfo;
    }

    public String getPromotionCode()
    {
        return promotionCode;
    }

    public String getPromotionDesc()
    {
        return promotionDesc;
    }

    public String getPromotionDiscount()
    {
        return promotionDiscount;
    }

    public String getShipRouteDesc()
    {
        return shipRouteDesc;
    }

    public String getShipToAddressInd()
    {
        return shipToAddressInd;
    }

    public String getShipTypeDesc()
    {
        return shipTypeDesc;
    }

    public String getShippmentInfo()
    {
        return shippmentInfo;
    }

    public String getStoreState()
    {
        return storeState;
    }

    public String getSubRouteCode()
    {
        return subRouteCode;
    }

    public String getSubTotal()
    {
        return subTotal;
    }

    public String getTax()
    {
        return tax;
    }

    public String getTotalSaving()
    {
        return totalSaving;
    }

    public String getTrackPackURL()
    {
        return trackPackURL;
    }

    public String getTrackingNumbers()
    {
        return trackingNumbers;
    }

    public void setAssociateDiscount(String s)
    {
        associateDiscount = s;
    }

    public void setDisplayedCarrierType(String s)
    {
        displayedCarrierType = s;
    }

    public void setDisplayedShippingStatus(String s)
    {
        displayedShippingStatus = s;
    }

    public void setDollarAmountOff(String s)
    {
        dollarAmountOff = s;
    }

    public void setGiftWrap(String s)
    {
        giftWrap = s;
    }

    public void setGiftWrapPrice(String s)
    {
        giftWrapPrice = s;
    }

    public void setInvoiceNumber(String s)
    {
        invoiceNumber = s;
    }

    public void setInvoiceTotal(String s)
    {
        invoiceTotal = s;
    }

    public void setInvoiceType(String s)
    {
        invoiceType = s;
    }

    public void setMerchandiseTotal(String s)
    {
        merchandiseTotal = s;
    }

    public void setPaymentInfo(String s)
    {
        paymentInfo = s;
    }

    public void setPromotionCode(String s)
    {
        promotionCode = s;
    }

    public void setPromotionDesc(String s)
    {
        promotionDesc = s;
    }

    public void setPromotionDiscount(String s)
    {
        promotionDiscount = s;
    }

    public void setShipRouteDesc(String s)
    {
        shipRouteDesc = s;
    }

    public void setShipToAddressInd(String s)
    {
        shipToAddressInd = s;
    }

    public void setShipTypeDesc(String s)
    {
        shipTypeDesc = s;
    }

    public void setShippmentInfo(String s)
    {
        shippmentInfo = s;
    }

    public void setStoreState(String s)
    {
        storeState = s;
    }

    public void setSubRouteCode(String s)
    {
        subRouteCode = s;
    }

    public void setSubTotal(String s)
    {
        subTotal = s;
    }

    public void setTax(String s)
    {
        tax = s;
    }

    public void setTotalSaving(String s)
    {
        totalSaving = s;
    }

    public void setTrackPackURL(String s)
    {
        trackPackURL = s;
    }

    public void setTrackingNumbers(String s)
    {
        trackingNumbers = s;
    }
}
