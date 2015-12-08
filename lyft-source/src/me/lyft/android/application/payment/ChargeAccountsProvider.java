// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.ChargeAccount;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.application.payment:
//            IChargeAccountsProvider

public class ChargeAccountsProvider
    implements IChargeAccountsProvider
{

    private final BehaviorSubject chargeAccountsSubject = BehaviorSubject.create(Collections.emptyList());
    private final BehaviorSubject creditSubject = BehaviorSubject.create(Collections.emptyList());

    public ChargeAccountsProvider()
    {
    }

    private int getCreditCardsCount()
    {
        Iterator iterator = getChargeAccounts().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ChargeAccount chargeaccount = (ChargeAccount)iterator.next();
            if (chargeaccount.isCreditCard() && !chargeaccount.isWallet())
            {
                i++;
            }
        } while (true);
        return i;
    }

    private int getPaymentMethodsCount()
    {
        Iterator iterator = getChargeAccounts().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ChargeAccount chargeaccount = (ChargeAccount)iterator.next();
            if (chargeaccount.isCreditCard() || chargeaccount.isWallet() || chargeaccount.isPayPal())
            {
                i++;
            }
        } while (true);
        return i;
    }

    public ChargeAccount findChargeAccountById(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return null;
        }
        for (Iterator iterator = getChargeAccounts().iterator(); iterator.hasNext();)
        {
            ChargeAccount chargeaccount = (ChargeAccount)iterator.next();
            if (chargeaccount.getId().equals(s))
            {
                return chargeaccount;
            }
        }

        return null;
    }

    public List getChargeAccounts()
    {
        return (List)chargeAccountsSubject.getValue();
    }

    public List getCredits()
    {
        return (List)creditSubject.getValue();
    }

    public ChargeAccount getDefaultOrFirstValidChargeAccount()
    {
        Object obj = getChargeAccounts();
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
        {
            ChargeAccount chargeaccount1 = (ChargeAccount)iterator.next();
            if (chargeaccount1.isDefault().booleanValue())
            {
                return chargeaccount1;
            }
        }

        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            ChargeAccount chargeaccount = (ChargeAccount)((Iterator) (obj)).next();
            if (!chargeaccount.isFailed().booleanValue())
            {
                return chargeaccount;
            }
        }

        return null;
    }

    public boolean hasLessThanTwoPaymentMethods()
    {
        return getPaymentMethodsCount() < 2;
    }

    public boolean hasMaximumCreditCardsAmount()
    {
        return getCreditCardsCount() >= 3;
    }

    public boolean hasNoChargeAccounts()
    {
        return getChargeAccounts().isEmpty();
    }

    public boolean hasPayPalChargeAccount()
    {
        for (Iterator iterator = getChargeAccounts().iterator(); iterator.hasNext();)
        {
            if (((ChargeAccount)iterator.next()).isPayPal())
            {
                return true;
            }
        }

        return false;
    }

    public boolean hasValidChargeAccount()
    {
        ChargeAccount chargeaccount = getDefaultOrFirstValidChargeAccount();
        return chargeaccount != null && !chargeaccount.isFailed().booleanValue();
    }

    public boolean hasWalletCard()
    {
        for (Iterator iterator = getChargeAccounts().iterator(); iterator.hasNext();)
        {
            if (((ChargeAccount)iterator.next()).isWallet())
            {
                return true;
            }
        }

        return false;
    }

    public void updateChargeAccounts(List list)
    {
        chargeAccountsSubject.onNext(list);
    }

    public void updateCredits(List list)
    {
        creditSubject.onNext(list);
    }
}
