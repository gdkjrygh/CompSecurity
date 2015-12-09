// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


public final class ac extends Enum
{

    public static final ac a;
    public static final ac b;
    public static final ac c;
    public static final ac d;
    public static final ac e;
    public static final ac f;
    public static final ac g;
    private static final ac h[];

    private ac(String s, int i)
    {
        super(s, i);
    }

    public static ac valueOf(String s)
    {
        return (ac)Enum.valueOf(com/nuance/b/b/a/ac, s);
    }

    public static ac[] values()
    {
        return (ac[])h.clone();
    }

    static 
    {
        a = new ac("ILLEGAL_STATE_CONNECTING_ATTEMPT", 0);
        b = new ac("ILLEGAL_STATE_DISCONNECTING_ATTEMPT", 1);
        c = new ac("ILLEGAL_STATE_DISCONNECTED", 2);
        d = new ac("EXCEPTION", 3);
        e = new ac("SESSION_EXPIRED", 4);
        f = new ac("FAILURE", 5);
        g = new ac("OTHER", 6);
        h = (new ac[] {
            a, b, c, d, e, f, g
        });
    }
}
