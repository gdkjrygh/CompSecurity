// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ridehistory.PaymentBreakdown;
import me.lyft.android.domain.ridehistory.charge.AccountInfoItem;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryPaymentReceiptItemView, PassengerRideHistoryPaymentChargeItemView, PassengerRideHistorySplitPaymentBreakdownView

public class PassengerRideHistoryPaymentBreakdownView extends LinearLayout
{

    ViewGroup chargeItemsContainer;
    private final ImageLoader imageLoader;
    private final LayoutInflater inflater;
    private final PaymentBreakdown paymentBreakdown;
    TextView paymentTitleTextView;
    ViewGroup receiptItemsContainer;
    ViewGroup totalItemsContainer;

    public PassengerRideHistoryPaymentBreakdownView(Context context, PaymentBreakdown paymentbreakdown, ImageLoader imageloader)
    {
        super(context);
        inflater = Scoop.a(this).a(context);
        ButterKnife.a(this, inflater.inflate(0x7f0300cf, this, true));
        paymentBreakdown = paymentbreakdown;
        imageLoader = imageloader;
        init();
    }

    private void addCouponItem(AccountInfoItem accountinfoitem)
    {
        accountinfoitem = new PassengerRideHistoryPaymentReceiptItemView(getContext(), accountinfoitem, true);
        totalItemsContainer.addView(accountinfoitem);
    }

    private void addLineItem(me.lyft.android.domain.ridehistory.PaymentBreakdown.ReceiptItem receiptitem)
    {
        receiptitem = new PassengerRideHistoryPaymentReceiptItemView(getContext(), receiptitem, false);
        receiptItemsContainer.addView(receiptitem);
    }

    private void addPayment(AccountInfoItem accountinfoitem)
    {
        accountinfoitem = new PassengerRideHistoryPaymentChargeItemView(getContext(), accountinfoitem);
        chargeItemsContainer.addView(accountinfoitem);
    }

    private void addSplitPaymentView(me.lyft.android.domain.ridehistory.PaymentBreakdown.SplitPayment splitpayment)
    {
        splitpayment = new PassengerRideHistorySplitPaymentBreakdownView(getContext(), splitpayment, imageLoader);
        totalItemsContainer.addView(splitpayment);
    }

    public void init()
    {
        if (!Strings.isNullOrEmpty(paymentBreakdown.getTitle()))
        {
            paymentTitleTextView.setText(paymentBreakdown.getTitle());
            paymentTitleTextView.setVisibility(0);
        }
        for (Iterator iterator = paymentBreakdown.getReceiptItems().iterator(); iterator.hasNext(); addLineItem((me.lyft.android.domain.ridehistory.PaymentBreakdown.ReceiptItem)iterator.next())) { }
        Object obj = new PassengerRideHistoryPaymentReceiptItemView(getContext(), paymentBreakdown.getTotalReceiptItem(), false);
        totalItemsContainer.addView(((android.view.View) (obj)));
        if (paymentBreakdown.getSplitPayment() != null)
        {
            addSplitPaymentView(paymentBreakdown.getSplitPayment());
        }
        obj = paymentBreakdown.getCoupons().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            AccountInfoItem accountinfoitem = (AccountInfoItem)((Iterator) (obj)).next();
            if (!accountinfoitem.isNull())
            {
                addCouponItem(accountinfoitem);
            }
        } while (true);
        obj = paymentBreakdown.getCharges().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            AccountInfoItem accountinfoitem1 = (AccountInfoItem)((Iterator) (obj)).next();
            if (!accountinfoitem1.isNull())
            {
                addPayment(accountinfoitem1);
            }
        } while (true);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode());
    }
}
