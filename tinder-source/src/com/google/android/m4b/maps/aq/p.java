// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.graphics.Point;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.VisibleRegion;
import com.google.android.m4b.maps.y.h;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            b

public final class p
    implements com.google.android.m4b.maps.cg.al.a
{

    private final b a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public p(b b1, int i, int j, int k, int l)
    {
        a = b1;
        b = i;
        c = j;
        d = k;
        e = l;
    }

    public final Point a(LatLng latlng)
    {
        latlng = a.c(com.google.android.m4b.maps.aq.b.b(latlng));
        return new Point(latlng[0], latlng[1]);
    }

    public final LatLng a(Point point)
    {
        point = a.b(point.x, point.y);
        if (point == null)
        {
            return null;
        } else
        {
            return com.google.android.m4b.maps.aq.b.a(point);
        }
    }

    public final VisibleRegion a()
    {
        Object obj = a.a(b, c, d, e);
        LatLng latlng = com.google.android.m4b.maps.aq.b.a(((aq) (obj)).a[0]);
        LatLng latlng1 = com.google.android.m4b.maps.aq.b.a(((aq) (obj)).a[1]);
        LatLng latlng2 = com.google.android.m4b.maps.aq.b.a(((aq) (obj)).a[3]);
        LatLng latlng3 = com.google.android.m4b.maps.aq.b.a(((aq) (obj)).a[2]);
        obj = ((aq) (obj)).c;
        return new VisibleRegion(latlng, latlng1, latlng2, latlng3, new LatLngBounds(com.google.android.m4b.maps.aq.b.a(((ar) (obj)).b), com.google.android.m4b.maps.aq.b.a(((ar) (obj)).c)));
    }

    public final String toString()
    {
        return h.a(this).a("camera", a).toString();
    }
}
