// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.utils.CardExtensions;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChargeAccountPaymentItemView

public class CreditCardPaymentItemView extends ChargeAccountPaymentItemView
{

    public CreditCardPaymentItemView(Context context, CreditCardChargeAccount creditcardchargeaccount, int i)
    {
        super(context, creditcardchargeaccount, i);
    }

    private CreditCardChargeAccount getCreditCardChargeAccount()
    {
        return (CreditCardChargeAccount)getChargeAccount();
    }

    protected int getIcon()
    {
        return CardExtensions.getCardTypeImageResourceWithOutline(getCreditCardChargeAccount().getType());
    }

    protected String getTitle()
    {
        return (new StringBuilder()).append(CardExtensions.getTruncatedLabel(getCreditCardChargeAccount().getLabel())).append(" *").append(getCreditCardChargeAccount().getLastFour()).toString();
    }

    protected void onOpenChargeAccountEdit()
    {
        PaymentAnalytics.openEditCardItem();
        appFlow.goTo(new PaymentScreens.EditCreditCardScreen(getCreditCardChargeAccount()));
    }
}
