// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;


class TitleType
{

    static final int $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[];

    static 
    {
        $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType = new int[com.pinterest.activity.commerce.util.Type.values().length];
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.Type.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.Type.ON_SALE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.Type.OUT_OF_STOCK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.Type.UNAVAILABLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
