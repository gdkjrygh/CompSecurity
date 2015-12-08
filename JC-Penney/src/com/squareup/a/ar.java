// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


public final class ar extends Enum
{

    public static final ar a;
    public static final ar b;
    public static final ar c;
    private static final ar d[];

    private ar(String s, int i)
    {
        super(s, i);
    }

    public static ar valueOf(String s)
    {
        return (ar)Enum.valueOf(com/squareup/a/ar, s);
    }

    public static ar[] values()
    {
        return (ar[])d.clone();
    }

    static 
    {
        a = new ar("LOW", 0);
        b = new ar("NORMAL", 1);
        c = new ar("HIGH", 2);
        d = (new ar[] {
            a, b, c
        });
    }
}
