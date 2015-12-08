// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


public final class u extends Enum
{

    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    public static final u e;
    public static final u f;
    public static final u g;
    public static final u h;
    private static final u i[];

    private u(String s, int j)
    {
        super(s, j);
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/nuance/b/b/a/u, s);
    }

    public static u[] values()
    {
        return (u[])i.clone();
    }

    static 
    {
        a = new u("ILLEGAL_STATE_CONNECTING_ATTEMPT", 0);
        b = new u("ILLEGAL_STATE_DISCONNECTING_ATTEMPT", 1);
        c = new u("ILLEGAL_STATE_DISCONNECTED", 2);
        d = new u("NETWORK_UNREACHABLE", 3);
        e = new u("INVALID_REQUEST", 4);
        f = new u("EXCEPTION", 5);
        g = new u("SESSION_EXPIRED", 6);
        h = new u("OTHER", 7);
        i = (new u[] {
            a, b, c, d, e, f, g, h
        });
    }
}
