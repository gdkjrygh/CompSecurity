// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;
import java.util.List;

public class OrderDetails
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String basePoints;
    private String bonusPoints;
    private List orderItems;
    private String orderTotal;
    private String qualifyingTotal;
    private String salesTax;
    private String shippingCharge;
    private String shippingTax;

    public OrderDetails()
    {
    }

    public String getBasePoints()
    {
        return basePoints;
    }

    public String getBonusPoints()
    {
        return bonusPoints;
    }

    public List getOrderItems()
    {
        return orderItems;
    }

    public String getOrderTotal()
    {
        return orderTotal;
    }

    public String getQualifyingTotal()
    {
        return qualifyingTotal;
    }

    public String getSalesTax()
    {
        return salesTax;
    }

    public String getShippingCharge()
    {
        return shippingCharge;
    }

    public String getShippingTax()
    {
        return shippingTax;
    }

    public void setBasePoints(String s)
    {
        basePoints = s;
    }

    public void setBonusPoints(String s)
    {
        bonusPoints = s;
    }

    public void setOrderItems(List list)
    {
        orderItems = list;
    }

    public void setOrderTotal(String s)
    {
        orderTotal = s;
    }

    public void setQualifyingTotal(String s)
    {
        qualifyingTotal = s;
    }

    public void setSalesTax(String s)
    {
        salesTax = s;
    }

    public void setShippingCharge(String s)
    {
        shippingCharge = s;
    }

    public void setShippingTax(String s)
    {
        shippingTax = s;
    }
}
