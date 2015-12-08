// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static final e e[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/c/a/a/b/e, s);
    }

    public static e[] values()
    {
        return (e[])e.clone();
    }

    static 
    {
        a = new e("SPDY_SYN_STREAM", 0);
        b = new e("SPDY_REPLY", 1);
        c = new e("SPDY_HEADERS", 2);
        d = new e("HTTP_20_HEADERS", 3);
        e = (new e[] {
            a, b, c, d
        });
    }
}
