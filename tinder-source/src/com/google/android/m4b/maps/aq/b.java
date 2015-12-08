// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.graphics.Color;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bv.t;
import com.google.android.m4b.maps.cg.ay;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLink;

public final class b
{

    public static int a(double d)
    {
        return (int)Math.round(1000000D * d);
    }

    public static int a(int i)
    {
        int j = Color.alpha(i);
        return Color.argb(j, (Color.red(i) * j) / 255, (Color.green(i) * j) / 255, (Color.blue(i) * j) / 255);
    }

    public static com.google.android.m4b.maps.ak.b a(LatLng latlng)
    {
        return new com.google.android.m4b.maps.ak.b(a(latlng.b), a(latlng.c));
    }

    public static ar a(LatLngBounds latlngbounds)
    {
        if (latlngbounds.c.c >= latlngbounds.b.c)
        {
            return ar.a(new m(b(latlngbounds.b), b(latlngbounds.c)));
        } else
        {
            return ar.a(new m(b(latlngbounds.b), b(latlngbounds.c).e(new g(0x40000000, 0))));
        }
    }

    public static CameraPosition a(c c1)
    {
        com.google.android.m4b.maps.model.CameraPosition.a a1 = new com.google.android.m4b.maps.model.CameraPosition.a();
        a1.a = a(g.a(c1.a));
        a1.b = c1.b;
        a1.d = c1.d;
        a1.c = c1.c;
        return a1.a();
    }

    public static LatLng a(g g1)
    {
        return new LatLng(g1.b(), g1.d());
    }

    public static StreetViewPanoramaCamera a(ay ay1)
    {
        if (ay1 == null)
        {
            return null;
        } else
        {
            return new StreetViewPanoramaCamera(ay1.c, ay1.b(), ay1.a);
        }
    }

    public static StreetViewPanoramaLink[] a(t at[])
    {
        if (at == null)
        {
            return null;
        }
        StreetViewPanoramaLink astreetviewpanoramalink[] = new StreetViewPanoramaLink[at.length];
        for (int i = 0; i < at.length; i++)
        {
            astreetviewpanoramalink[i] = new StreetViewPanoramaLink(at[i].c, at[i].a);
        }

        return astreetviewpanoramalink;
    }

    public static g b(LatLng latlng)
    {
        return g.a(latlng.b, latlng.c);
    }
}
