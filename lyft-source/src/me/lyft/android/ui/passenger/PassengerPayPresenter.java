// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.ChargeAccountPayment;
import me.lyft.android.domain.payment.CouponPayment;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.domain.payment.FacebookChargeAccount;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.Payment;
import me.lyft.android.domain.payment.SplitFarePayment;
import me.lyft.android.domain.payment.WalletChargeAccount;
import me.lyft.android.domain.splitfare.SplitFareState;

public class PassengerPayPresenter
{

    private ICheckoutSession checkoutSession;
    private Resources resources;
    private ISplitFareStateRepository splitFareStateRepository;

    public PassengerPayPresenter(ICheckoutSession icheckoutsession, ISplitFareStateRepository isplitfarestaterepository, Resources resources1)
    {
        checkoutSession = icheckoutsession;
        splitFareStateRepository = isplitfarestaterepository;
        resources = resources1;
    }

    private int getAppliedCreditsTotal()
    {
        for (Iterator iterator = checkoutSession.getPayments().iterator(); iterator.hasNext();)
        {
            Payment payment = (Payment)iterator.next();
            if (payment instanceof CouponPayment)
            {
                int i = payment.getMoney().getAmount().intValue();
                if (i > 0)
                {
                    return i;
                }
            }
        }

        return 0;
    }

    private int getChargeAccountTotal()
    {
        for (Iterator iterator = checkoutSession.getPayments().iterator(); iterator.hasNext();)
        {
            Payment payment = (Payment)iterator.next();
            if (payment instanceof ChargeAccountPayment)
            {
                int i = payment.getMoney().getAmount().intValue();
                if (i > 0)
                {
                    return i;
                }
            }
        }

        return 0;
    }

    private int getSplitFareTotal()
    {
        for (Iterator iterator = checkoutSession.getPayments().iterator(); iterator.hasNext();)
        {
            Payment payment = (Payment)iterator.next();
            if (payment instanceof SplitFarePayment)
            {
                int i = payment.getMoney().getAmount().intValue();
                if (i > 0)
                {
                    return i;
                }
            }
        }

        return 0;
    }

    private boolean isUsingCredits()
    {
        return getChargeAccountTotal() <= 0;
    }

    public String getAppliedCreditsTitle()
    {
        String s = "";
        int i = getAppliedCreditsTotal();
        if (i > 0)
        {
            s = resources.getString(0x7f0702d7, new Object[] {
                Money.format(i)
            });
        }
        return s;
    }

    public String getFormattedTotalAmount()
    {
        return Money.format(getChargeAccountTotal());
    }

    public String getPaymentMethodLabel()
    {
        if (isUsingCredits())
        {
            return resources.getString(0x7f0702d9);
        }
        Object obj = checkoutSession.getSelectedOrDefaultChargeAccount();
        if (((ChargeAccount) (obj)).isCreditLine())
        {
            return ((ChargeAccount) (obj)).getLabel();
        }
        if (((ChargeAccount) (obj)).isPayPal())
        {
            return resources.getString(0x7f070280);
        }
        if (obj instanceof CreditCardChargeAccount)
        {
            obj = (CreditCardChargeAccount)obj;
            if (Strings.isNullOrEmpty(((CreditCardChargeAccount) (obj)).getLabel()))
            {
                return (new StringBuilder()).append("*").append(((CreditCardChargeAccount) (obj)).getLastFour()).toString();
            } else
            {
                return ((CreditCardChargeAccount) (obj)).getLabel();
            }
        }
        if (obj instanceof WalletChargeAccount)
        {
            return ((WalletChargeAccount)obj).getLabel();
        }
        if (obj instanceof FacebookChargeAccount)
        {
            return resources.getString(0x7f07027c);
        }
        if (((ChargeAccount) (obj)).isNull())
        {
            return resources.getString(0x7f0702da);
        } else
        {
            return "";
        }
    }

    public String getSplitPaymentTitle()
    {
        String s = "";
        int i = getSplitFareTotal();
        if (i > 0)
        {
            s = resources.getString(0x7f0702de, new Object[] {
                Money.format(i), Integer.valueOf(splitFareStateRepository.getSplitFareState().getTotalContributorsCount())
            });
        }
        return s;
    }
}
