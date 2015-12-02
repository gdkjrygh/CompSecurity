// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;


public final class o extends Enum
{

    private static final o $VALUES[];
    public static final o BOTTOM;
    public static final o MIDDLE;
    public static final o TOP;

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/facebook/widget/listview/o, s);
    }

    public static o[] values()
    {
        return (o[])$VALUES.clone();
    }

    static 
    {
        BOTTOM = new o("BOTTOM", 0);
        TOP = new o("TOP", 1);
        MIDDLE = new o("MIDDLE", 2);
        $VALUES = (new o[] {
            BOTTOM, TOP, MIDDLE
        });
    }
}
