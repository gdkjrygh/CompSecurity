// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bb, k, d, t

public final class bo
    implements bb
{

    public k a;
    public t b;
    private int c;
    private final int d;
    private final String e;
    private int f;
    private int g;
    private final int h[];

    public bo(int i, k k1, t t, int j, String s, int l, int i1, 
            int ai[])
    {
        c = i;
        a = k1;
        b = t;
        d = j;
        e = s;
        f = l;
        g = i1;
        h = ai;
    }

    public final int a()
    {
        return 5;
    }

    public final a b()
    {
        return null;
    }

    public final t d()
    {
        return b;
    }

    public final int e()
    {
        return f;
    }

    public final int[] f()
    {
        return h;
    }

    public final int g()
    {
        return a.f() + 44 + com.google.android.m4b.maps.bo.d.a(e) + com.google.android.m4b.maps.bo.d.a(b);
    }
}
