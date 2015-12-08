// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bs;

import com.google.android.m4b.maps.ac.a;

public final class d
{

    public final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final long h;
    private final boolean i;

    public d(a a1)
    {
        b = a1.d(1);
        c = a1.d(2);
        e = a1.d(3);
        f = a1.d(4);
        g = a1.d(5);
        a = a1.d(6);
        d = a1.d(7);
        h = a1.e(8);
        i = a1.b(9);
    }

    public final String toString()
    {
        int j = b;
        int k = c;
        int l = e;
        int i1 = f;
        int j1 = g;
        int k1 = a;
        return (new StringBuilder(174)).append("maxTiles: ").append(j).append(" maxServerTiles: ").append(k).append(" prefetchPeriod: ").append(l).append(" prefetchInitiatorDelay: ").append(i1).append(" prefetchInitiatorPeriod: ").append(j1).append(" timeToWipe: ").append(k1).toString();
    }
}
