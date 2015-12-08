// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


public final class _value extends Enum
{

    private static final INGREDIENT $VALUES[];
    public static final INGREDIENT BRAND;
    public static final INGREDIENT DIET;
    public static final INGREDIENT INGREDIENT;
    public static final INGREDIENT MODE;
    public static final INGREDIENT PRICE;
    public static final INGREDIENT SALIENT_COLOR;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/pinterest/api/model/SearchFilter$FilterType, s);
    }

    public static _value[] values()
    {
        return (_value[])$VALUES.clone();
    }

    public final String getValue()
    {
        return _value;
    }

    static 
    {
        MODE = new <init>("MODE", 0, "mode");
        SALIENT_COLOR = new <init>("SALIENT_COLOR", 1, "salient_color");
        BRAND = new <init>("BRAND", 2, "brand");
        PRICE = new <init>("PRICE", 3, "price");
        DIET = new <init>("DIET", 4, "diet");
        INGREDIENT = new <init>("INGREDIENT", 5, "ingredient");
        $VALUES = (new .VALUES[] {
            MODE, SALIENT_COLOR, BRAND, PRICE, DIET, INGREDIENT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
