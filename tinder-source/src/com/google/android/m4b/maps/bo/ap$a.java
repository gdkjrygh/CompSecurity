// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.bs.e;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ap, ah, bb, ac

public static final class k
{

    public ac a;
    int b;
    int c;
    public bb d[];
    public long e;
    String f[];
    String g[];
    int h;
    ah i;
    long j;
    private final e k;

    public final ap a()
    {
        ac ac = a;
        int l = b;
        int i1 = c;
        String as[];
        String as1[];
        bb abb[];
        int j1;
        if (f == null)
        {
            as = new String[0];
        } else
        {
            as = f;
        }
        if (g == null)
        {
            as1 = new String[0];
        } else
        {
            as1 = g;
        }
        j1 = h;
        if (d == null)
        {
            abb = new bb[0];
        } else
        {
            abb = d;
        }
        return new ap(ac, l, (byte)0, i1, as, as1, j1, abb, i, null, e, j, k);
    }

    public (e e1)
    {
        c = -1;
        e = -1L;
        h = -1;
        i = ah.a;
        j = -1L;
        k = e1;
    }
}
