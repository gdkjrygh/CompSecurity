// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


public final class al extends Enum
{

    public static final al a;
    public static final al b;
    public static final al c;
    public static final al d;
    public static final al e;
    public static final al f;
    public static final al g;
    public static final al h;
    private static final al i[];

    private al(String s, int j)
    {
        super(s, j);
    }

    public static al valueOf(String s)
    {
        return (al)Enum.valueOf(com/nuance/b/b/a/al, s);
    }

    public static al[] values()
    {
        return (al[])i.clone();
    }

    static 
    {
        a = new al("ILLEGAL_STATE_CONNECTING_ATTEMPT", 0);
        b = new al("ILLEGAL_STATE_DISCONNECTING_ATTEMPT", 1);
        c = new al("ILLEGAL_STATE_DISCONNECTED", 2);
        d = new al("INVALID_TIMEOUT", 3);
        e = new al("RECORD_ERROR", 4);
        f = new al("RECORDING_IN_PROGRESS", 5);
        g = new al("EXCEPTION", 6);
        h = new al("OTHER", 7);
        i = (new al[] {
            a, b, c, d, e, f, g, h
        });
    }
}
