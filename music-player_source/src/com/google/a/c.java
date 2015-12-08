// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.android.gms.ads.d;

public final class c
{

    public static final c a = new c(-1, -2);
    public static final c b = new c(320, 50);
    public static final c c = new c(300, 250);
    public static final c d = new c(468, 60);
    public static final c e = new c(728, 90);
    public static final c f = new c(160, 600);
    private final d g;

    private c(int i, int j)
    {
        this(new d(i, j));
    }

    public c(d d1)
    {
        g = d1;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof c))
        {
            return false;
        } else
        {
            obj = (c)obj;
            return g.equals(((c) (obj)).g);
        }
    }

    public final int hashCode()
    {
        return g.hashCode();
    }

    public final String toString()
    {
        return g.toString();
    }

}
