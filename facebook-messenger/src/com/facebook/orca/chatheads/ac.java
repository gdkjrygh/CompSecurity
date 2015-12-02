// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;


public final class ac extends Enum
{

    private static final ac $VALUES[];
    public static final ac LEFT;
    public static final ac RIGHT;

    private ac(String s, int i)
    {
        super(s, i);
    }

    public static ac valueOf(String s)
    {
        return (ac)Enum.valueOf(com/facebook/orca/chatheads/ac, s);
    }

    public static ac[] values()
    {
        return (ac[])$VALUES.clone();
    }

    static 
    {
        RIGHT = new ac("RIGHT", 0);
        LEFT = new ac("LEFT", 1);
        $VALUES = (new ac[] {
            RIGHT, LEFT
        });
    }
}
