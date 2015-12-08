// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


public final class af extends Enum
{

    public static final af a;
    public static final af b;
    public static final af c;
    public static final af d;
    public static final af e;
    public static final af f;
    public static final af g;
    private static final af h[];

    private af(String s, int i)
    {
        super(s, i);
    }

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(com/nuance/b/b/a/af, s);
    }

    public static af[] values()
    {
        return (af[])h.clone();
    }

    static 
    {
        a = new af("ILLEGAL_STATE_CONNECTING_ATTEMPT", 0);
        b = new af("ILLEGAL_STATE_DISCONNECTING_ATTEMPT", 1);
        c = new af("ILLEGAL_STATE_DISCONNECTED", 2);
        d = new af("NULL_PROMPT", 3);
        e = new af("NULL_PROMPT_TYPE", 4);
        f = new af("EXCEPTION", 5);
        g = new af("OTHER", 6);
        h = (new af[] {
            a, b, c, d, e, f, g
        });
    }
}
