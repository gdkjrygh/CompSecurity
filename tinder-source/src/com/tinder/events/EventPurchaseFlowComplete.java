// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;

import com.tinder.model.TinderPurchase;

public class EventPurchaseFlowComplete
{

    private TinderPurchase purchase;

    public EventPurchaseFlowComplete(TinderPurchase tinderpurchase)
    {
        purchase = tinderpurchase;
    }

    public TinderPurchase getPurchase()
    {
        return purchase;
    }
}
