// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.util;


public final class  extends Enum
{

    private static final ON_SALE $VALUES[];
    public static final ON_SALE NORMAL;
    public static final ON_SALE ON_SALE;
    public static final ON_SALE OUT_OF_STOCK;
    public static final ON_SALE UNAVAILABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/commerce/util/BuyableProductHelper$PriceTitleType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        OUT_OF_STOCK = new <init>("OUT_OF_STOCK", 1);
        UNAVAILABLE = new <init>("UNAVAILABLE", 2);
        ON_SALE = new <init>("ON_SALE", 3);
        $VALUES = (new .VALUES[] {
            NORMAL, OUT_OF_STOCK, UNAVAILABLE, ON_SALE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
