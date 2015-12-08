// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    private static final h d[];

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/ford/syncV4/e/c/a/h, s);
    }

    public static h[] values()
    {
        return (h[])d.clone();
    }

    static 
    {
        a = new h("MANUAL_ONLY", 0);
        b = new h("VR_ONLY", 1);
        c = new h("BOTH", 2);
        d = (new h[] {
            a, b, c
        });
    }
}
