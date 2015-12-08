// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class y extends Enum
{

    public static final y a;
    public static final y b;
    private static final y c[];

    private y(String s, int i)
    {
        super(s, i);
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(com/nuance/b/a/y, s);
    }

    public static y[] values()
    {
        return (y[])c.clone();
    }

    static 
    {
        a = new y("SELECTIVE", 0);
        b = new y("ITERATIVE", 1);
        c = (new y[] {
            a, b
        });
    }
}
