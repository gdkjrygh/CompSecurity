// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


public final class NetworkPolicy extends Enum
{

    public static final NetworkPolicy a;
    public static final NetworkPolicy b;
    private static NetworkPolicy c;
    private static final NetworkPolicy d[];
    public final int index;

    private NetworkPolicy(String s, int i, int j)
    {
        super(s, i);
        index = j;
    }

    public static boolean a(int i)
    {
        return (a.index & i) == 0;
    }

    public static boolean b(int i)
    {
        return (c.index & i) == 0;
    }

    public static boolean c(int i)
    {
        return (b.index & i) != 0;
    }

    public static NetworkPolicy valueOf(String s)
    {
        return (NetworkPolicy)Enum.valueOf(com/squareup/picasso/NetworkPolicy, s);
    }

    public static NetworkPolicy[] values()
    {
        return (NetworkPolicy[])d.clone();
    }

    static 
    {
        a = new NetworkPolicy("NO_CACHE", 0, 1);
        c = new NetworkPolicy("NO_STORE", 1, 2);
        b = new NetworkPolicy("OFFLINE", 2, 4);
        d = (new NetworkPolicy[] {
            a, c, b
        });
    }
}
