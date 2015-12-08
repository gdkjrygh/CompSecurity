// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.adapter;


public final class value extends Enum
{

    private static final INTEREST $VALUES[];
    public static final INTEREST INTEREST;
    public static final INTEREST PIN;
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/pinterest/activity/home/adapter/HomefeedBuilderPinGridAdapter$TYPE, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        PIN = new <init>("PIN", 0, 0);
        INTEREST = new <init>("INTEREST", 1, 1);
        $VALUES = (new .VALUES[] {
            PIN, INTEREST
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
