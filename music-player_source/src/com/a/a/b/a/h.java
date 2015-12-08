// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    private static final h c[];

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/a/a/b/a/h, s);
    }

    public static h[] values()
    {
        return (h[])c.clone();
    }

    static 
    {
        a = new h("FIFO", 0);
        b = new h("LIFO", 1);
        c = (new h[] {
            a, b
        });
    }
}
