// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


final class ae extends Enum
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    private static final ae g[];
    final int d;
    final int e;
    final int f;

    private ae(String s, int i, int j, int k, int l)
    {
        super(s, i);
        d = j;
        e = k;
        f = l;
    }

    public static ae valueOf(String s)
    {
        return (ae)Enum.valueOf(com/squareup/a/ae, s);
    }

    public static ae[] values()
    {
        return (ae[])g.clone();
    }

    static 
    {
        a = new ae("MICRO", 0, 3, 96, 96);
        b = new ae("MINI", 1, 1, 512, 384);
        c = new ae("FULL", 2, 2, -1, -1);
        g = (new ae[] {
            a, b, c
        });
    }
}
