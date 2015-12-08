// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.User;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.ui.Presenter;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.utils.CardExtensions;

public class PaymentWidgetPresenter extends Presenter
{

    final IChargeAccountsProvider chargeAccountsProvider;
    final PassengerRequestRideRouter router;
    final IUserProvider userProvider;

    public PaymentWidgetPresenter(IChargeAccountsProvider ichargeaccountsprovider, IUserProvider iuserprovider, PassengerRequestRideRouter passengerrequestriderouter)
    {
        chargeAccountsProvider = ichargeaccountsprovider;
        userProvider = iuserprovider;
        router = passengerrequestriderouter;
    }

    private void updateChargeAccount(ChargeAccount chargeaccount)
    {
        int i;
        boolean flag;
        if (chargeaccount.isWallet())
        {
            i = 0x7f020070;
            chargeaccount = null;
        } else
        if (chargeaccount.isPayPal())
        {
            i = 0x7f020079;
            chargeaccount = null;
        } else
        if (chargeaccount.isFacebook())
        {
            i = 0x7f020078;
            chargeaccount = null;
        } else
        if (chargeaccount.isCreditLine())
        {
            chargeaccount = chargeaccount.getLabel();
            i = 0x7f02007d;
        } else
        if (chargeaccount.isCreditCard())
        {
            i = CardExtensions.getCardTypeImageResource(((CreditCardChargeAccount)chargeaccount).getType());
            chargeaccount = chargeaccount.getLabel();
        } else
        {
            i = 0x7f020069;
            chargeaccount = null;
        }
        ((PaymentWidgetView)view).setImageResource(i);
        if (!Strings.isNullOrEmpty(chargeaccount))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PaymentWidgetView)view).showCreditCardLabel(flag);
        if (flag)
        {
            ((PaymentWidgetView)view).setLabel(chargeaccount);
        }
    }

    protected void onAttach()
    {
        ChargeAccount chargeaccount = chargeAccountsProvider.getDefaultOrFirstValidChargeAccount();
        boolean flag;
        if (chargeaccount != null && !chargeaccount.isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ((PaymentWidgetView)view).setHasPaymentMethod(true);
            ((PaymentWidgetView)view).showConcurRideReceipts(userProvider.getUser().sendConcurRideReceipts());
            updateChargeAccount(chargeaccount);
            return;
        } else
        {
            ((PaymentWidgetView)view).setHasPaymentMethod(false);
            return;
        }
    }

    public void onPaymentWidgetClick()
    {
        router.showPaymentScreenWithBackButton();
    }

    private class PaymentWidgetView
        implements me.lyft.android.ui.Presenter.View
    {

        public abstract void setHasPaymentMethod(boolean flag);

        public abstract void setImageResource(int i);

        public abstract void setLabel(String s);

        public abstract void showConcurRideReceipts(boolean flag);

        public abstract void showCreditCardLabel(boolean flag);
    }

}
