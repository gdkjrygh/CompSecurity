// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.LatLng;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bq, cb, bp

final class b
    implements b
{

    private LatLng a;
    private float b;
    private bq c;

    public final void a(bp bp1, int i, cb cb1)
    {
        cb1.b(aD);
        bp1.a(a, b, i);
    }

    public final String toString()
    {
        String s = String.valueOf(aD);
        return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
    }

    tLng(bq bq1, LatLng latlng, float f)
    {
        c = bq1;
        a = latlng;
        b = f;
        super();
    }
}
