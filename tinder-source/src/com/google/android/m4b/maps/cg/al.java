// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.graphics.Point;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.VisibleRegion;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            cb

public final class al extends com.google.android.m4b.maps.df.g.a
{
    public static interface a
    {

        public abstract Point a(LatLng latlng);

        public abstract LatLng a(Point point);

        public abstract VisibleRegion a();
    }


    private final cb a;
    private final a b;

    public al(cb cb1, a a1)
    {
        b = a1;
        a = cb1;
    }

    public final b a(LatLng latlng)
    {
        a.b(cb.a.by);
        return d.a(b.a(latlng));
    }

    public final LatLng a(b b1)
    {
        a.b(cb.a.bw);
        return b.a((Point)d.a(b1));
    }

    public final VisibleRegion a()
    {
        a.b(cb.a.bx);
        return b.a();
    }

    public final String toString()
    {
        return b.toString();
    }
}
