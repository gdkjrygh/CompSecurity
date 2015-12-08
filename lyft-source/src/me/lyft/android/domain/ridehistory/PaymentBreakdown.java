// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory;

import java.util.ArrayList;
import java.util.List;

public class PaymentBreakdown
{

    private List charges;
    private List coupons;
    private List receiptItems;
    private SplitPayment splitPayment;
    private String title;
    private ReceiptItem totalReceiptItem;

    public PaymentBreakdown(String s, List list, ReceiptItem receiptitem, SplitPayment splitpayment, List list1, List list2)
    {
        receiptItems = new ArrayList(3);
        title = s;
        receiptItems = list;
        totalReceiptItem = receiptitem;
        splitPayment = splitpayment;
        coupons = list1;
        charges = list2;
    }

    public List getCharges()
    {
        return charges;
    }

    public List getCoupons()
    {
        return coupons;
    }

    public List getReceiptItems()
    {
        return receiptItems;
    }

    public SplitPayment getSplitPayment()
    {
        return splitPayment;
    }

    public String getTitle()
    {
        return title;
    }

    public ReceiptItem getTotalReceiptItem()
    {
        return totalReceiptItem;
    }
}
