// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bq, cb, bp

final class b
    implements b
{

    private LatLngBounds a;
    private int b;
    private bq c;

    public final void a(bp bp1, int i, cb cb1)
    {
        cb1.b(aE);
        bp1.a(a, b, i);
    }

    public final String toString()
    {
        String s = String.valueOf(aE);
        return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
    }

    tLngBounds(bq bq1, LatLngBounds latlngbounds, int i)
    {
        c = bq1;
        a = latlngbounds;
        b = i;
        super();
    }
}
