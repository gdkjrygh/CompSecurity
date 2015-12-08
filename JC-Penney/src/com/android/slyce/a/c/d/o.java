// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;


public final class o extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    private static final o e[];

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/android/slyce/a/c/d/o, s);
    }

    public static o[] values()
    {
        return (o[])e.clone();
    }

    public boolean a()
    {
        return this == b || this == c;
    }

    public boolean b()
    {
        return this == a;
    }

    static 
    {
        a = new o("SPDY_SYN_STREAM", 0);
        b = new o("SPDY_REPLY", 1);
        c = new o("SPDY_HEADERS", 2);
        d = new o("HTTP_20_HEADERS", 3);
        e = (new o[] {
            a, b, c, d
        });
    }
}
