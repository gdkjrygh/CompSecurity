// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.common.base.Objects;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccountsModel

public class BankAccountsModelEvent
{

    private final boolean bankAccountFeatureEnabled;
    private final Exception failureCause;
    private final BankAccountsModel model;

    private BankAccountsModelEvent(BankAccountsModel bankaccountsmodel, Exception exception, boolean flag)
    {
        model = bankaccountsmodel;
        failureCause = exception;
        bankAccountFeatureEnabled = flag;
    }

    public static BankAccountsModelEvent newExceptionEvent(Exception exception)
    {
        return new BankAccountsModelEvent(null, exception, true);
    }

    public static BankAccountsModelEvent newFeatureDisabledEvent()
    {
        return new BankAccountsModelEvent(null, null, false);
    }

    public static BankAccountsModelEvent newModelEvent(BankAccountsModel bankaccountsmodel)
    {
        return new BankAccountsModelEvent(bankaccountsmodel, null, true);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof BankAccountsModelEvent))
            {
                return false;
            }
            obj = (BankAccountsModelEvent)obj;
            if (!Objects.equal(model, ((BankAccountsModelEvent) (obj)).model) || !Objects.equal(failureCause, ((BankAccountsModelEvent) (obj)).failureCause) || bankAccountFeatureEnabled != ((BankAccountsModelEvent) (obj)).bankAccountFeatureEnabled)
            {
                return false;
            }
        }
        return true;
    }

    public final Exception getFailureCause()
    {
        return failureCause;
    }

    public final BankAccountsModel getModel()
    {
        return model;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            model, failureCause, Boolean.valueOf(bankAccountFeatureEnabled)
        });
    }

    public final boolean isFeatureEnabled()
    {
        return bankAccountFeatureEnabled;
    }
}
