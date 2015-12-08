// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ridehistory;

import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.lyft.ridehistory:
//            ReceiptItemDTO, SplitPaymentDTO

public class PaymentBreakdownDTO
{

    public final List charges;
    public final List coupons;
    public final ReceiptItemDTO lineItemTotal;
    public final List lineItems;
    public final SplitPaymentDTO splitPayment;
    public final String title;

    public PaymentBreakdownDTO(String s, List list, ReceiptItemDTO receiptitemdto, SplitPaymentDTO splitpaymentdto, List list1, List list2)
    {
        title = s;
        lineItems = list;
        lineItemTotal = receiptitemdto;
        splitPayment = splitpaymentdto;
        coupons = list1;
        charges = list2;
    }
}
