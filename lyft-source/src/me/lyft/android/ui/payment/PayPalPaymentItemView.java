// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.PayPalChargeAccount;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChargeAccountPaymentItemView

public class PayPalPaymentItemView extends ChargeAccountPaymentItemView
{

    AppFlow appFlow;

    public PayPalPaymentItemView(Context context, PayPalChargeAccount paypalchargeaccount, int i)
    {
        super(context, paypalchargeaccount, i);
        Scoop.a(this).b(this);
    }

    private PayPalChargeAccount getPayPalChargeAccount()
    {
        return (PayPalChargeAccount)getChargeAccount();
    }

    protected int getIcon()
    {
        return 0x7f02007a;
    }

    protected String getTitle()
    {
        return getResources().getString(0x7f07027f);
    }

    protected void onOpenChargeAccountEdit()
    {
        PaymentAnalytics.openEditPayPal();
        appFlow.goTo(new PaymentScreens.EditPayPalScreen(getPayPalChargeAccount()));
    }
}
