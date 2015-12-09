// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class x extends Enum
{

    public static final x a;
    public static final x b;
    public static final x c;
    public static final x d;
    public static final x e;
    public static final x f;
    public static final x g;
    public static final x h;
    private static final x i[];

    private x(String s, int j)
    {
        super(s, j);
    }

    public static x a(String s)
    {
        return valueOf(s);
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/ford/syncV4/e/c/a/x, s);
    }

    public static x[] values()
    {
        return (x[])i.clone();
    }

    static 
    {
        a = new x("SUCCESS", 0);
        b = new x("DISALLOWED", 1);
        c = new x("USER_DISALLOWED", 2);
        d = new x("INVALID_ID", 3);
        e = new x("VEHICLE_DATA_NOT_AVAILABLE", 4);
        f = new x("DATA_ALREADY_SUBSCRIBED", 5);
        g = new x("DATA_NOT_SUBSCRIBED", 6);
        h = new x("IGNORED", 7);
        i = (new x[] {
            a, b, c, d, e, f, g, h
        });
    }
}
