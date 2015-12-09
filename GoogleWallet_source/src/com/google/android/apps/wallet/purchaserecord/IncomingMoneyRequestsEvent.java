// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import java.util.List;

public class IncomingMoneyRequestsEvent
{

    private final Exception failureCause;
    private final List incomingMoneyRequests;

    public IncomingMoneyRequestsEvent(List list, Exception exception)
    {
        incomingMoneyRequests = list;
        failureCause = exception;
    }

    public final Exception getFailureCause()
    {
        return failureCause;
    }

    public final List getIncomingMoneyRequests()
    {
        return incomingMoneyRequests;
    }
}
