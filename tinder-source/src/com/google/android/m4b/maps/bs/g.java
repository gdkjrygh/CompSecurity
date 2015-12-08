// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bs;

import com.google.android.m4b.maps.ac.a;

public final class g
{

    public final int a;
    public int b;
    public boolean c;
    public final String d;
    private final int e;
    private final boolean f;
    private final int g;
    private final int h;
    private final boolean i;
    private final boolean j;

    public g(a a1)
    {
        e = a1.d(1);
        f = a1.b(2);
        g = a1.d(3);
        a = a1.d(4);
        h = a1.d(6);
        b = a1.d(7);
        c = a1.b(8);
        d = a1.g(17);
        i = a1.h(19);
        j = a1.b(19);
    }

    public final String toString()
    {
        int k = e;
        boolean flag = f;
        int l = g;
        int i1 = a;
        int j1 = h;
        int k1 = b;
        boolean flag1 = c;
        return (new StringBuilder(246)).append("personalizedSmartMapsTileDuration: ").append(k).append(" onlyRequestPsmWhenPoiInBaseTile: ").append(flag).append(" minPsmRequestZoom: ").append(l).append(" pertileDuration: ").append(i1).append(" pertileClientCoverage: ").append(j1).append(" diskCacheServerSchemaVersion:").append(k1).append(" offlineBorderTiles:").append(flag1).toString();
    }
}
