// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.LatLng;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bq, cb, bp

final class a
    implements a
{

    private LatLng a;
    private bq b;

    public final void a(bp bp1, int i, cb cb1)
    {
        cb1.b(aC);
        bp1.a(a, i);
    }

    public final String toString()
    {
        String s = String.valueOf(aC);
        return (new StringBuilder(String.valueOf(s).length() + 0)).append(s).toString();
    }

    tLng(bq bq1, LatLng latlng)
    {
        b = bq1;
        a = latlng;
        super();
    }
}
