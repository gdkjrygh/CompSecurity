// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.iab;

import com.a.a.a.a.g;

public class EventPurchaseConfirmed
{

    private g transactionDetails;

    public EventPurchaseConfirmed(g g)
    {
        transactionDetails = g;
    }

    public g getTransactionDetails()
    {
        return transactionDetails;
    }
}
