// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

public final class BankAccountsModel
{

    private final ImmutableList mBankAccounts;

    public BankAccountsModel(Iterable iterable)
    {
        if (iterable != null)
        {
            mBankAccounts = ImmutableList.copyOf(iterable);
            return;
        } else
        {
            mBankAccounts = ImmutableList.of();
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof BankAccountsModel))
        {
            return false;
        } else
        {
            obj = (BankAccountsModel)obj;
            return Objects.equal(mBankAccounts, ((BankAccountsModel) (obj)).mBankAccounts);
        }
    }

    public final ImmutableList getBankAccounts()
    {
        return mBankAccounts;
    }

    public final int hashCode()
    {
        return mBankAccounts.hashCode();
    }
}
