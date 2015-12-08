// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.events;

import com.pinterest.api.model.Pin;

public class VariantUpdatedEvent
{

    private com.pinterest.api.model.BuyableProduct.Variant a;
    private Pin b;

    public VariantUpdatedEvent(com.pinterest.api.model.BuyableProduct.Variant variant, Pin pin)
    {
        a = variant;
        b = pin;
    }

    public final com.pinterest.api.model.BuyableProduct.Variant a()
    {
        return a;
    }

    public final boolean a(Pin pin)
    {
        return pin != null && b != null && pin.getUid().equals(b.getUid());
    }
}
