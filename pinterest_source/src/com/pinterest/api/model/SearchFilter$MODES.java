// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


public final class _value extends Enum
{

    private static final MAKE $VALUES[];
    public static final MAKE MAKE;
    public static final MAKE SHOP;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/pinterest/api/model/SearchFilter$MODES, s);
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
        SHOP = new <init>("SHOP", 0, "shop");
        MAKE = new <init>("MAKE", 1, "make");
        $VALUES = (new .VALUES[] {
            SHOP, MAKE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
