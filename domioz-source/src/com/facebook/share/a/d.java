// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.a;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    static d d;
    private static final d g[];
    private String e;
    private int f;

    private d(String s, int i, String s1, int j)
    {
        super(s, i);
        e = s1;
        f = j;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/share/a/d, s);
    }

    public static d[] values()
    {
        return (d[])g.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new d("CENTER", 0, "center", 0);
        b = new d("LEFT", 1, "left", 1);
        c = new d("RIGHT", 2, "right", 2);
        g = (new d[] {
            a, b, c
        });
        d = a;
    }
}
