// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


public final class j extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    private static final j e[];

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/nuance/b/b/a/j, s);
    }

    public static j[] values()
    {
        return (j[])e.clone();
    }

    static 
    {
        a = new j("ILLEGAL_STATE_DISCONNECTING_ATTEMPT", 0);
        b = new j("ILLEGAL_STATE_DISCONNECTED", 1);
        c = new j("EXCEPTION", 2);
        d = new j("OTHER", 3);
        e = (new j[] {
            a, b, c, d
        });
    }
}
