// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/a/a/b/a/e, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    static 
    {
        a = new e("NONE", 0);
        b = new e("IN_SAMPLE_POWER_OF_2", 1);
        c = new e("IN_SAMPLE_INT", 2);
        d = new e("EXACTLY", 3);
        e = new e("EXACTLY_STRETCHED", 4);
        f = (new e[] {
            a, b, c, d, e
        });
    }
}
