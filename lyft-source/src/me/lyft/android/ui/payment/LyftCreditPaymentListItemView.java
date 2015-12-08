// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.Credit;
import me.lyft.android.domain.ride.RideFare;

// Referenced classes of package me.lyft.android.ui.payment:
//            CouponPaymentListItemView

public class LyftCreditPaymentListItemView extends CouponPaymentListItemView
{

    public LyftCreditPaymentListItemView(Context context, Credit credit, int i)
    {
        super(context, credit, i);
    }

    protected void onAttachedToWindow()
    {
        int i = 1;
        super.onAttachedToWindow();
        if (getMode() != 1)
        {
            i = 0;
        }
        if (i != 0 && !fareRepository.getFare().isCouponAvailableForRide(credit.getId()))
        {
            i = getResources().getColor(0x7f0c008f);
            titleTextView.setTextColor(i);
            subtitleTextView.setTextColor(i);
        }
    }

    protected void onOpenCreditDetails()
    {
        appFlow.goTo(new PaymentScreens.LyftCreditScreen(credit.getTitle(), credit.getCreditRestrictions()));
    }
}
