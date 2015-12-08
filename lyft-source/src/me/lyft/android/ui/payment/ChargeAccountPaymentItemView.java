// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.payment.ChargeAccount;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentListItemView

public abstract class ChargeAccountPaymentItemView extends PaymentListItemView
{

    AppFlow appFlow;
    private final ChargeAccount chargeAccount;
    ICheckoutSession checkoutSession;
    private final int mode;

    public ChargeAccountPaymentItemView(Context context, ChargeAccount chargeaccount, int i)
    {
        super(context);
        Scoop.a(this).b(this);
        mode = i;
        chargeAccount = chargeaccount;
    }

    protected final ChargeAccount getChargeAccount()
    {
        return chargeAccount;
    }

    public int getMode()
    {
        return mode;
    }

    protected String getSubTitle()
    {
        String s = "";
        if (chargeAccount.isDefault().booleanValue())
        {
            s = getResources().getString(0x7f070278);
        }
        return s;
    }

    protected boolean isFailed()
    {
        return chargeAccount.isFailed().booleanValue();
    }

    protected boolean isSelectedPayment()
    {
        return chargeAccount.getId().equals(checkoutSession.getSelectedPaymentMethodId());
    }

    protected abstract void onOpenChargeAccountEdit();

    public boolean performClick()
    {
        if (mode == 1)
        {
            checkoutSession.selectChargeAccount(chargeAccount.getId());
            appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
            return true;
        } else
        {
            onOpenChargeAccountEdit();
            return true;
        }
    }
}
