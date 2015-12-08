// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.enums;


public final class LayoutStyleType extends Enum
{

    private static final LayoutStyleType $VALUES[];
    public static final LayoutStyleType DAILY_TABLE;
    public static final LayoutStyleType HOURLY_TABLE;
    public static final LayoutStyleType LEFT_MARGIN;
    public static final LayoutStyleType RIGHT_MARGIN;

    private LayoutStyleType(String s, int i)
    {
        super(s, i);
    }

    public static LayoutStyleType valueOf(String s)
    {
        return (LayoutStyleType)Enum.valueOf(com/accuweather/android/enums/LayoutStyleType, s);
    }

    public static LayoutStyleType[] values()
    {
        return (LayoutStyleType[])$VALUES.clone();
    }

    static 
    {
        RIGHT_MARGIN = new LayoutStyleType("RIGHT_MARGIN", 0);
        LEFT_MARGIN = new LayoutStyleType("LEFT_MARGIN", 1);
        DAILY_TABLE = new LayoutStyleType("DAILY_TABLE", 2);
        HOURLY_TABLE = new LayoutStyleType("HOURLY_TABLE", 3);
        $VALUES = (new LayoutStyleType[] {
            RIGHT_MARGIN, LEFT_MARGIN, DAILY_TABLE, HOURLY_TABLE
        });
    }
}
