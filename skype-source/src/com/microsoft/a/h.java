// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    private static final h d[];
    private short c;

    private h(String s, int i, int j)
    {
        super(s, i);
        c = (short)j;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/microsoft/a/h, s);
    }

    public static h[] values()
    {
        return (h[])d.clone();
    }

    public final short a()
    {
        return c;
    }

    static 
    {
        a = new h("ONE", 0, 1);
        b = new h("TWO", 1, 2);
        d = (new h[] {
            a, b
        });
    }
}
