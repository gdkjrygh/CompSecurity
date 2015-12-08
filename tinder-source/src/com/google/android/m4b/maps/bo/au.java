// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bb, ak, d, t

public final class au
    implements bb
{

    public final a a;
    public final ak b;
    public final byte c[];
    public final t d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final int i[];
    private final int j;

    public au(int k, a a1, ak ak1, byte abyte0[], t t, int l, String s, 
            int i1, int j1, int ai[])
    {
        j = k;
        a = a1;
        b = ak1;
        c = abyte0;
        d = t;
        e = l;
        f = s;
        g = i1;
        h = j1;
        i = ai;
    }

    public final int a()
    {
        return 3;
    }

    public final a b()
    {
        return a;
    }

    public final boolean c()
    {
        return c != null;
    }

    public final t d()
    {
        return d;
    }

    public final int e()
    {
        return g;
    }

    public final int[] f()
    {
        return i;
    }

    public final int g()
    {
        return b.b() + 60 + c.length + (com.google.android.m4b.maps.bo.d.a(a) + com.google.android.m4b.maps.bo.d.a(f) + com.google.android.m4b.maps.bo.d.a(d));
    }

    public final boolean h()
    {
        return com.google.android.m4b.maps.bo.d.a(h, 4);
    }
}
