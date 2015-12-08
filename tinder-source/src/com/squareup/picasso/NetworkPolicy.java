// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


public final class NetworkPolicy extends Enum
{

    public static final NetworkPolicy a;
    public static final NetworkPolicy b;
    public static final NetworkPolicy c;
    private static final NetworkPolicy e[];
    final int d;

    private NetworkPolicy(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static boolean a(int i)
    {
        return (a.d & i) == 0;
    }

    public static boolean b(int i)
    {
        return (b.d & i) == 0;
    }

    public static boolean c(int i)
    {
        return (c.d & i) != 0;
    }

    public static NetworkPolicy valueOf(String s)
    {
        return (NetworkPolicy)Enum.valueOf(com/squareup/picasso/NetworkPolicy, s);
    }

    public static NetworkPolicy[] values()
    {
        return (NetworkPolicy[])e.clone();
    }

    static 
    {
        a = new NetworkPolicy("NO_CACHE", 0, 1);
        b = new NetworkPolicy("NO_STORE", 1, 2);
        c = new NetworkPolicy("OFFLINE", 2, 4);
        e = (new NetworkPolicy[] {
            a, b, c
        });
    }
}
