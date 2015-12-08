// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;


public final class _cls9 extends Enum
{

    private static final DYNAMIC_GRID $VALUES[];
    public static final DYNAMIC_GRID DYNAMIC_GRID;
    public static final DYNAMIC_GRID SEARCH;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/pinterest/activity/dynamicgrid/PinMiniCell$MODE, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        SEARCH = new <init>("SEARCH", 0);
        DYNAMIC_GRID = new <init>("DYNAMIC_GRID", 1);
        $VALUES = (new .VALUES[] {
            SEARCH, DYNAMIC_GRID
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
