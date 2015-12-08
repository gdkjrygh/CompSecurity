// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;


public final class o extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    private static final o f[];

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/comscore/utils/o, s);
    }

    public static o[] values()
    {
        return (o[])f.clone();
    }

    static 
    {
        a = new o("DEFAULT", 0);
        b = new o("NEVER", 1);
        c = new o("WIFIONLY", 2);
        d = new o("PIGGYBACK", 3);
        e = new o("DISABLED", 4);
        f = (new o[] {
            a, b, c, d, e
        });
    }
}
