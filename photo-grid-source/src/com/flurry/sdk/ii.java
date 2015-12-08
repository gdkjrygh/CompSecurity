// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class ii extends Enum
{

    public static final ii a;
    public static final ii b;
    public static final ii c;
    public static final ii d;
    private static final ii f[];
    private int e;

    private ii(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static ii a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;

        case 4: // '\004'
            return d;
        }
    }

    public static ii valueOf(String s)
    {
        return (ii)Enum.valueOf(com/flurry/sdk/ii, s);
    }

    public static ii[] values()
    {
        return (ii[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new ii("COMPLETE", 0, 1);
        b = new ii("TIMEOUT", 1, 2);
        c = new ii("INVALID_RESPONSE", 2, 3);
        d = new ii("PENDING_COMPLETION", 3, 4);
        f = (new ii[] {
            a, b, c, d
        });
    }
}
