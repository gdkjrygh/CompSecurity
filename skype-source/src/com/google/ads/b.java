// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.android.gms.ads.d;

public final class b
{

    public static final b a = new b(-1, -2);
    public static final b b = new b(320, 50);
    public static final b c = new b(300, 250);
    public static final b d = new b(468, 60);
    public static final b e = new b(728, 90);
    public static final b f = new b(160, 600);
    private final d g;

    private b(int i, int j)
    {
        this(new d(i, j));
    }

    public b(d d1)
    {
        g = d1;
    }

    public final int a()
    {
        return g.b();
    }

    public final int b()
    {
        return g.a();
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof b))
        {
            return false;
        } else
        {
            obj = (b)obj;
            return g.equals(((b) (obj)).g);
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
