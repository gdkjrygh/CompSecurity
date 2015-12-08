// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


final class ad extends Enum
{

    public static final ad a;
    public static final ad b;
    public static final ad c;
    private static final ad g[];
    final int d;
    final int e;
    final int f;

    private ad(String s, int i, int j, int k, int l)
    {
        super(s, i);
        d = j;
        e = k;
        f = l;
    }

    public static ad valueOf(String s)
    {
        return (ad)Enum.valueOf(com/c/b/ad, s);
    }

    public static ad[] values()
    {
        return (ad[])g.clone();
    }

    static 
    {
        a = new ad("MICRO", 0, 3, 96, 96);
        b = new ad("MINI", 1, 1, 512, 384);
        c = new ad("FULL", 2, 2, -1, -1);
        g = (new ad[] {
            a, b, c
        });
    }
}
