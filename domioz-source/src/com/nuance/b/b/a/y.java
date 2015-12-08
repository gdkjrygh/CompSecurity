// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


public final class y extends Enum
{

    public static final y a;
    public static final y b;
    public static final y c;
    public static final y d;
    public static final y e;
    public static final y f;
    public static final y g;
    public static final y h;
    public static final y i;
    public static final y j;
    public static final y k;
    public static final y l;
    private static final y m[];

    private y(String s, int i1)
    {
        super(s, i1);
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(com/nuance/b/b/a/y, s);
    }

    public static y[] values()
    {
        return (y[])m.clone();
    }

    static 
    {
        a = new y("ILLEGAL_STATE_CONNECTING_ATTEMPT", 0);
        b = new y("ILLEGAL_STATE_DISCONNECTING_ATTEMPT", 1);
        c = new y("ILLEGAL_STATE_DISCONNECTED", 2);
        d = new y("INTERPRETATION_ERROR", 3);
        e = new y("RECORD_ERROR", 4);
        f = new y("EXCEPTION", 5);
        g = new y("SESSION_EXPIRED", 6);
        h = new y("NETWORK_SEND", 7);
        i = new y("CANCELLED", 8);
        j = new y("RECORDING_IN_PROGRESS", 9);
        k = new y("INTERPRETATION_IN_PROGRESS", 10);
        l = new y("OTHER", 11);
        m = (new y[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
