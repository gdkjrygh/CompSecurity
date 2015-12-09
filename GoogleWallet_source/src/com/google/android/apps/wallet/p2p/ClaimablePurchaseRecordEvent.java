// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.common.base.Objects;
import java.util.List;

public class ClaimablePurchaseRecordEvent
{

    private final Exception failureCause;
    private final List purchaseRecords;

    public ClaimablePurchaseRecordEvent(List list, Exception exception)
    {
        purchaseRecords = list;
        failureCause = exception;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ClaimablePurchaseRecordEvent))
            {
                return false;
            }
            obj = (ClaimablePurchaseRecordEvent)obj;
            if (!Objects.equal(purchaseRecords, ((ClaimablePurchaseRecordEvent) (obj)).purchaseRecords) || !Objects.equal(failureCause, ((ClaimablePurchaseRecordEvent) (obj)).failureCause))
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

    public final List getPurchaseRecords()
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
