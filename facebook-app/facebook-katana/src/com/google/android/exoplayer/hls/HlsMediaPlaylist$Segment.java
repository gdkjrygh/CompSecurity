// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;


public final class i
    implements Comparable
{

    public final boolean a;
    public final double b;
    public final String c;
    public final long d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    private int a(Long long1)
    {
        if (d > long1.longValue())
        {
            return 1;
        }
        return d >= long1.longValue() ? 0 : -1;
    }

    public final int compareTo(Object obj)
    {
        return a((Long)obj);
    }

    public (String s, double d1, boolean flag, long l, boolean flag1, 
            String s1, String s2, int j, int k)
    {
        c = s;
        b = d1;
        a = flag;
        d = l;
        e = flag1;
        f = s1;
        g = s2;
        h = j;
        i = k;
    }
}
