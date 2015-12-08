// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class w extends Enum
{

    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final w e;
    private static final w f[];

    private w(String s, int i)
    {
        super(s, i);
    }

    public static w a(String s)
    {
        return valueOf(s);
    }

    public static w valueOf(String s)
    {
        return (w)Enum.valueOf(com/ford/syncV4/e/c/a/w, s);
    }

    public static w[] values()
    {
        return (w[])f.clone();
    }

    static 
    {
        a = new w("NO_EVENT", 0);
        b = new w("NO", 1);
        c = new w("YES", 2);
        d = new w("NOT_SUPPORTED", 3);
        e = new w("FAULT", 4);
        f = (new w[] {
            a, b, c, d, e
        });
    }
}
