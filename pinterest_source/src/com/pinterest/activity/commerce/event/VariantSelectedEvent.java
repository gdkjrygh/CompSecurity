// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;

import com.pinterest.activity.commerce.viewmodel.VariantRowItem;

public class VariantSelectedEvent
{

    private VariantRowItem variantRowItem;

    public VariantSelectedEvent(VariantRowItem variantrowitem)
    {
        variantRowItem = variantrowitem;
    }

    public VariantRowItem getVariantRowItem()
    {
        return variantRowItem;
    }
}
