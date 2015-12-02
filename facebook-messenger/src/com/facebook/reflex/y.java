// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


public final class y extends Enum
{

    private static final y $VALUES[];
    public static final y PanHorizontal;
    public static final y PanUnconstrained;
    public static final y PanVertical;

    private y(String s, int i)
    {
        super(s, i);
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(com/facebook/reflex/y, s);
    }

    public static y[] values()
    {
        return (y[])$VALUES.clone();
    }

    static 
    {
        PanHorizontal = new y("PanHorizontal", 0);
        PanVertical = new y("PanVertical", 1);
        PanUnconstrained = new y("PanUnconstrained", 2);
        $VALUES = (new y[] {
            PanHorizontal, PanVertical, PanUnconstrained
        });
    }
}
