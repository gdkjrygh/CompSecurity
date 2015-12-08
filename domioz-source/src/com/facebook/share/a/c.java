// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.a;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    static c d;
    private static final c g[];
    private String e;
    private int f;

    private c(String s, int i, String s1, int j)
    {
        super(s, i);
        e = s1;
        f = j;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/share/a/c, s);
    }

    public static c[] values()
    {
        return (c[])g.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new c("BOTTOM", 0, "bottom", 0);
        b = new c("INLINE", 1, "inline", 1);
        c = new c("TOP", 2, "top", 2);
        g = (new c[] {
            a, b, c
        });
        d = a;
    }
}
