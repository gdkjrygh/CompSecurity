// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.CreditLineChargeAccount;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChargeAccountPaymentItemView

public class CreditLinePaymentItemView extends ChargeAccountPaymentItemView
{

    AppFlow appFlow;

    public CreditLinePaymentItemView(Context context, CreditLineChargeAccount creditlinechargeaccount, int i)
    {
        super(context, creditlinechargeaccount, i);
        Scoop.a(this).b(this);
    }

    private CreditLineChargeAccount getCreditLineChargeAccount()
    {
        return (CreditLineChargeAccount)getChargeAccount();
    }

    protected int getIcon()
    {
        return 0x7f02007e;
    }

    protected String getTitle()
    {
        return getCreditLineChargeAccount().getLabel();
    }

    protected void onOpenChargeAccountEdit()
    {
        PaymentAnalytics.openEditCreditLine();
        appFlow.goTo(new PaymentScreens.EditCreditLineScreen(getCreditLineChargeAccount()));
    }
}
