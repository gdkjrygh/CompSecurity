// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    private static final d i[];

    private d(String s, int j)
    {
        super(s, j);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/nuance/b/b/a/d, s);
    }

    public static d[] values()
    {
        return (d[])i.clone();
    }

    static 
    {
        a = new d("ILLEGAL_STATE_CONNECTED", 0);
        b = new d("ILLEGAL_STATE_CONNECTING_ATTEMPT", 1);
        c = new d("ILLEGAL_STATE_DISCONNECTING_ATTEMPT", 2);
        d = new d("APPLICATION_MUST_UPGRADE", 3);
        e = new d("NETWORK_UNREACHABLE", 4);
        f = new d("EXCEPTION", 5);
        g = new d("APP_NOT_FOUND", 6);
        h = new d("OTHER", 7);
        i = (new d[] {
            a, b, c, d, e, f, g, h
        });
    }
}
