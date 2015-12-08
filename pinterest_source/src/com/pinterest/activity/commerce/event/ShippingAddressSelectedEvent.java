// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;

import com.pinterest.model.commerce.DetailedShipping;

public class ShippingAddressSelectedEvent
{

    private DetailedShipping detailedShipping;
    private boolean isNewlyCreated;

    public ShippingAddressSelectedEvent(DetailedShipping detailedshipping)
    {
        detailedShipping = detailedshipping;
    }

    public ShippingAddressSelectedEvent(DetailedShipping detailedshipping, boolean flag)
    {
        detailedShipping = detailedshipping;
        isNewlyCreated = flag;
    }

    public DetailedShipping getDetailedShipping()
    {
        return detailedShipping;
    }

    public boolean isNewlyCreated()
    {
        return isNewlyCreated;
    }
}
