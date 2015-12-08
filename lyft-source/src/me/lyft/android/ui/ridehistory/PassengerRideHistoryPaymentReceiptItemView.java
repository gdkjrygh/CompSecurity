// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class PassengerRideHistoryPaymentReceiptItemView extends LinearLayout
{

    private final boolean isCoupon;
    private final me.lyft.android.domain.ridehistory.PaymentBreakdown.ReceiptItem item;
    TextView titleTextView;
    TextView valueTextView;

    public PassengerRideHistoryPaymentReceiptItemView(Context context, me.lyft.android.domain.ridehistory.PaymentBreakdown.ReceiptItem receiptitem, boolean flag)
    {
        super(context);
        item = receiptitem;
        isCoupon = flag;
        ButterKnife.a(this, LayoutInflater.from(context).inflate(0x7f0300ce, this, true));
        init();
    }

    private void init()
    {
        titleTextView.setText(item.getTitle());
        valueTextView.setText(item.getValue());
        if (isCoupon)
        {
            int i = getResources().getColor(0x7f0c000b);
            titleTextView.setTextColor(i);
            valueTextView.setTextColor(i);
        }
    }
}
