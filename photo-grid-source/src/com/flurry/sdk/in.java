// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class in extends Enum
{

    public static final in a;
    public static final in b;
    public static final in c;
    private static final in f[];
    String d;
    int e;

    private in(String s, int i, String s1, int j)
    {
        super(s, i);
        d = s1;
        e = j;
    }

    public static in a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;
        }
    }

    public static in valueOf(String s)
    {
        return (in)Enum.valueOf(com/flurry/sdk/in, s);
    }

    public static in[] values()
    {
        return (in[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new in("GET", 0, "GET", 0);
        b = new in("PUT", 1, "PUT", 1);
        c = new in("POST", 2, "POST", 2);
        f = (new in[] {
            a, b, c
        });
    }
}
