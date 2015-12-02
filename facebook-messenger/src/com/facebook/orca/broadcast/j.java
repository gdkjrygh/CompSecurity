// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;


final class j extends Enum
{

    private static final j $VALUES[];
    public static final j FROM_LEFT;
    public static final j FROM_RIGHT;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/orca/broadcast/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    static 
    {
        FROM_RIGHT = new j("FROM_RIGHT", 0);
        FROM_LEFT = new j("FROM_LEFT", 1);
        $VALUES = (new j[] {
            FROM_RIGHT, FROM_LEFT
        });
    }
}
