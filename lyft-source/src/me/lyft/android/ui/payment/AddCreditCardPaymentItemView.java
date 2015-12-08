// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.User;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentListItemView

public class AddCreditCardPaymentItemView extends PaymentListItemView
{

    AppFlow appFlow;
    IUserProvider userProvider;

    public AddCreditCardPaymentItemView(Context context)
    {
        super(context);
        Scoop.a(this).b(this);
    }

    protected int getIcon()
    {
        return 0x7f02006a;
    }

    protected int getMode()
    {
        return 0;
    }

    protected String getSubTitle()
    {
        return "";
    }

    protected String getTitle()
    {
        return getResources().getString(0x7f070244);
    }

    protected boolean isFailed()
    {
        return false;
    }

    protected boolean isSelectedPayment()
    {
        return false;
    }

    public boolean performClick()
    {
        PaymentAnalytics.openAddCardItem();
        if (userProvider.getUser().isCreditCardCaptureRequired())
        {
            appFlow.goTo(new PaymentScreens.AddCreditCardFraudScreen());
        } else
        {
            appFlow.goTo(new PaymentScreens.AddCreditCardScreen());
        }
        return true;
    }
}
