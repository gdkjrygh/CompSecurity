// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b;

class TransactionState
{

    private final b purchase;
    private final b status;

    TransactionState(b b, b b1)
    {
        purchase = b;
        status = b1;
    }

    public boolean isRetrievingStatus()
    {
        return status != null;
    }

    public boolean isTransactionInProgress()
    {
        return status != null || purchase != null;
    }

    public b purchase()
    {
        return purchase;
    }

    public b status()
    {
        return status;
    }
}
