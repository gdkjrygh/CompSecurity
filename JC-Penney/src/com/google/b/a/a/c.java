// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.a;


final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    private static final c g[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/google/b/a/a/c, s);
    }

    public static c[] values()
    {
        return (c[])g.clone();
    }

    static 
    {
        a = new c("UPPER", 0);
        b = new c("LOWER", 1);
        c = new c("MIXED", 2);
        d = new c("DIGIT", 3);
        e = new c("PUNCT", 4);
        f = new c("BINARY", 5);
        g = (new c[] {
            a, b, c, d, e, f
        });
    }
}
