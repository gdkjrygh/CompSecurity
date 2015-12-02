// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.tiles;


public final class i extends Enum
{

    private static final i $VALUES[];
    public static final i LEFT;
    public static final i RIGHT;

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/widget/tiles/i, s);
    }

    public static i[] values()
    {
        return (i[])$VALUES.clone();
    }

    static 
    {
        LEFT = new i("LEFT", 0);
        RIGHT = new i("RIGHT", 1);
        $VALUES = (new i[] {
            LEFT, RIGHT
        });
    }
}
