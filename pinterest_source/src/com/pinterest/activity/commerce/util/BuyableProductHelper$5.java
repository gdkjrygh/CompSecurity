// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.util;


class A
{

    static final int $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[];

    static 
    {
        $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability = new int[com.pinterest.api.model.Availability.values().length];
        try
        {
            $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.Availability.UNKNOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.Availability.UNAVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.Availability.PREORDER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.Availability.IN_STOCK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$BuyableProduct$Variant$Availability[com.pinterest.api.model.Availability.OUT_OF_STOCK.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
