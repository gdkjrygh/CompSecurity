// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;


public final class Y extends Enum
{

    private static final VERTICAL $VALUES[];
    public static final VERTICAL HORIZONTAL;
    public static final VERTICAL VERTICAL;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/pinterest/activity/pin/view/modules/util/IconDoubleTextCellView$TextOrientation, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        HORIZONTAL = new <init>("HORIZONTAL", 0);
        VERTICAL = new <init>("VERTICAL", 1);
        $VALUES = (new .VALUES[] {
            HORIZONTAL, VERTICAL
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
