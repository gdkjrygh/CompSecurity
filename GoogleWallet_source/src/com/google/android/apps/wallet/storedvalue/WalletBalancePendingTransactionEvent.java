// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.common.base.Objects;
import java.util.List;

public class WalletBalancePendingTransactionEvent
{

    private final Exception failureCause;
    private final List purchaseRecords;

    public WalletBalancePendingTransactionEvent(List list, Exception exception)
    {
        purchaseRecords = list;
        failureCause = exception;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof WalletBalancePendingTransactionEvent))
            {
                return false;
            }
            obj = (WalletBalancePendingTransactionEvent)obj;
            if (!Objects.equal(purchaseRecords, ((WalletBalancePendingTransactionEvent) (obj)).purchaseRecords) || !Objects.equal(failureCause, ((WalletBalancePendingTransactionEvent) (obj)).failureCause))
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

    public final List getPendingTransactions()
    {
        return purchaseRecords;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            purchaseRecords, failureCause
        });
    }
}
