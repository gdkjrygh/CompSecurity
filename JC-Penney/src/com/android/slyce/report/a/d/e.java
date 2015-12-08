// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.d;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    private static final e g[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/android/slyce/report/a/d/e, s);
    }

    public static e[] values()
    {
        return (e[])g.clone();
    }

    static 
    {
        a = new e("CONTINUOUS", 0);
        b = new e("TEXT", 1);
        c = new e("BINARY", 2);
        d = new e("PING", 3);
        e = new e("PONG", 4);
        f = new e("CLOSING", 5);
        g = (new e[] {
            a, b, c, d, e, f
        });
    }
}
