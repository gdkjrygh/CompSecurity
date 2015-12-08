// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;

import com.pinterest.model.commerce.DetailedShipping;

public class ShippingAddressDeletedEvent
{

    private DetailedShipping detailedShipping;

    public ShippingAddressDeletedEvent(DetailedShipping detailedshipping)
    {
        detailedShipping = detailedshipping;
    }

    public DetailedShipping getDetailedShipping()
    {
        return detailedShipping;
    }
}
