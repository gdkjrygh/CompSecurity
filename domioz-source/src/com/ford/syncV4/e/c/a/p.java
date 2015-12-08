// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class p extends Enum
{

    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    private static final p f[];

    private p(String s, int i)
    {
        super(s, i);
    }

    public static p a(String s)
    {
        return valueOf(s);
    }

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(com/ford/syncV4/e/c/a/p, s);
    }

    public static p[] values()
    {
        return (p[])f.clone();
    }

    static 
    {
        a = new p("TEXT", 0);
        b = new p("SAPI_PHONEMES", 1);
        c = new p("LHPLUS_PHONEMES", 2);
        d = new p("PRE_RECORDED", 3);
        e = new p("SILENCE", 4);
        f = (new p[] {
            a, b, c, d, e
        });
    }
}
