// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class o extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    private static final o e[];
    String d;

    private o(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/ford/syncV4/e/c/a/o, s);
    }

    public static o[] values()
    {
        return (o[])e.clone();
    }

    public final String toString()
    {
        return d;
    }

    static 
    {
        a = new o("SBT_TEXT", 0, "TEXT");
        b = new o("SBT_IMAGE", 1, "IMAGE");
        c = new o("SBT_BOTH", 2, "BOTH");
        e = (new o[] {
            a, b, c
        });
    }
}
