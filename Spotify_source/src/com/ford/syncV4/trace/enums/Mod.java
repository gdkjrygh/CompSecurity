// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.trace.enums;


public final class Mod extends Enum
{

    public static final Mod a;
    public static final Mod b;
    public static final Mod c;
    public static final Mod d;
    public static final Mod e;
    private static Mod f;
    private static final Mod g[];

    private Mod(String s, int i)
    {
        super(s, i);
    }

    public static Mod valueOf(String s)
    {
        return (Mod)Enum.valueOf(com/ford/syncV4/trace/enums/Mod, s);
    }

    public static Mod[] values()
    {
        return (Mod[])g.clone();
    }

    static 
    {
        a = new Mod("tran", 0);
        b = new Mod("proto", 1);
        c = new Mod("mar", 2);
        d = new Mod("rpc", 3);
        f = new Mod("app", 4);
        e = new Mod("proxy", 5);
        g = (new Mod[] {
            a, b, c, d, f, e
        });
    }
}
