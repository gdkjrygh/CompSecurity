// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import java.util.List;
import me.lyft.android.domain.payment.ChargeAccount;

public interface IChargeAccountsProvider
{

    public abstract ChargeAccount findChargeAccountById(String s);

    public abstract List getChargeAccounts();

    public abstract List getCredits();

    public abstract ChargeAccount getDefaultOrFirstValidChargeAccount();

    public abstract boolean hasLessThanTwoPaymentMethods();

    public abstract boolean hasMaximumCreditCardsAmount();

    public abstract boolean hasNoChargeAccounts();

    public abstract boolean hasPayPalChargeAccount();

    public abstract boolean hasValidChargeAccount();

    public abstract boolean hasWalletCard();

    public abstract void updateChargeAccounts(List list);

    public abstract void updateCredits(List list);
}
