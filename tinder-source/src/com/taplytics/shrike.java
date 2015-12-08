// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


public final class shrike extends Enum
{

    public static final shrike a;
    public static final shrike b;
    public static final shrike c;
    public static final shrike d;
    public static final shrike e;
    public static final shrike f;
    public static final shrike g;
    private static final shrike h[];

    private shrike(String s, int i)
    {
        super(s, i);
    }

    public static shrike valueOf(String s)
    {
        return (shrike)Enum.valueOf(com/taplytics/shrike, s);
    }

    public static shrike[] values()
    {
        return (shrike[])h.clone();
    }

    static 
    {
        a = new shrike("ldpi", 0);
        b = new shrike("mdpi", 1);
        c = new shrike("tvdpi", 2);
        d = new shrike("hdpi", 3);
        e = new shrike("xhdpi", 4);
        f = new shrike("xxhdpi", 5);
        g = new shrike("xxxhdpi", 6);
        h = (new shrike[] {
            a, b, c, d, e, f, g
        });
    }
}
