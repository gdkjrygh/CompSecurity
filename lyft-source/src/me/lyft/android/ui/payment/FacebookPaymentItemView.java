// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.FacebookChargeAccount;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChargeAccountPaymentItemView

public class FacebookPaymentItemView extends ChargeAccountPaymentItemView
{

    AppFlow appFlow;

    public FacebookPaymentItemView(Context context, ChargeAccount chargeaccount, int i)
    {
        super(context, chargeaccount, i);
        Scoop.a(this).b(this);
    }

    private FacebookChargeAccount getFacebookChargeAccount()
    {
        return (FacebookChargeAccount)getChargeAccount();
    }

    protected int getIcon()
    {
        return 0x7f02006f;
    }

    protected String getTitle()
    {
        return getResources().getString(0x7f070267, new Object[] {
            getFacebookChargeAccount().getType(), getFacebookChargeAccount().getLastFour()
        });
    }

    protected void onOpenChargeAccountEdit()
    {
        PaymentAnalytics.trackEditFacebookCard();
        appFlow.goTo(new PaymentScreens.EditFacebookCreditCardScreen(getFacebookChargeAccount()));
    }
}
