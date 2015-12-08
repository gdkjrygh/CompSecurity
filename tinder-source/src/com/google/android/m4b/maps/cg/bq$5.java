// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bq, cb, bp

final class d
    implements d
{

    private LatLngBounds a;
    private int b;
    private int c;
    private int d;
    private bq e;

    public final void a(bp bp1, int i, cb cb1)
    {
        cb1.b(aF);
        bp1.a(a, b, c, d, i);
    }

    public final String toString()
    {
        String s = String.valueOf(aF);
        return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
    }

    tLngBounds(bq bq1, LatLngBounds latlngbounds, int i, int j, int k)
    {
        e = bq1;
        a = latlngbounds;
        b = i;
        c = j;
        d = k;
        super();
    }
}
