// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.iab;

import java.util.List;

public class EventInventoryLoaded
{

    private List products;
    private List subscriptions;

    public EventInventoryLoaded(List list, List list1)
    {
        products = list;
        subscriptions = list1;
    }

    public List getProducts()
    {
        return products;
    }

    public List getSubscriptions()
    {
        return subscriptions;
    }
}
