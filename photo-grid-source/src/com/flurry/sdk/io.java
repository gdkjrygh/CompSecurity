// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class io extends Enum
{

    public static final io a;
    public static final io b;
    public static final io c;
    public static final io d;
    private static final io f[];
    private int e;

    private io(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static io a(int i)
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

    public static io valueOf(String s)
    {
        return (io)Enum.valueOf(com/flurry/sdk/io, s);
    }

    public static io[] values()
    {
        return (io[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new io("INSTALL", 0, 1);
        b = new io("SESSION_START", 1, 2);
        c = new io("SESSION_END", 2, 3);
        d = new io("APPLICATION_EVENT", 3, 4);
        f = (new io[] {
            a, b, c, d
        });
    }
}
