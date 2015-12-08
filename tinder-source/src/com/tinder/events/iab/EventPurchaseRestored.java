// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.iab;

import java.util.List;

public class EventPurchaseRestored
{

    private List productSkus;
    private boolean showStrings;
    private List subscriptionSkus;

    public EventPurchaseRestored(List list, List list1, boolean flag)
    {
        productSkus = list;
        subscriptionSkus = list1;
        showStrings = flag;
    }

    public List getProductSkus()
    {
        return productSkus;
    }

    public List getSubscriptionSkus()
    {
        return subscriptionSkus;
    }

    public boolean showStrings()
    {
        return showStrings;
    }
}
