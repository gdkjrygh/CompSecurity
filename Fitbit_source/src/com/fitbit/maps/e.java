// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.graphics.Point;
import com.google.android.gms.maps.b;

// Referenced classes of package com.fitbit.maps:
//            d, CameraPosition, LatLng, LatLngBounds

public final class e
{

    private e()
    {
    }

    public static d a()
    {
        return new d(com.google.android.gms.maps.b.a());
    }

    public static d a(float f)
    {
        return new d(com.google.android.gms.maps.b.a(f));
    }

    public static d a(float f, float f1)
    {
        return new d(com.google.android.gms.maps.b.a(f, f1));
    }

    public static d a(float f, Point point)
    {
        return new d(com.google.android.gms.maps.b.a(f, point));
    }

    public static d a(CameraPosition cameraposition)
    {
        return new d(com.google.android.gms.maps.b.a(cameraposition.a()));
    }

    public static d a(LatLng latlng)
    {
        return new d(com.google.android.gms.maps.b.a(latlng.a()));
    }

    public static d a(LatLng latlng, float f)
    {
        return new d(com.google.android.gms.maps.b.a(latlng.a(), f));
    }

    public static d a(LatLngBounds latlngbounds, int i)
    {
        return new d(com.google.android.gms.maps.b.a(latlngbounds.a(), i));
    }

    public static d a(LatLngBounds latlngbounds, int i, int j, int k)
    {
        return new d(com.google.android.gms.maps.b.a(latlngbounds.a(), i, j, k));
    }

    public static d b()
    {
        return new d(com.google.android.gms.maps.b.b());
    }

    public static d b(float f)
    {
        return new d(com.google.android.gms.maps.b.b(f));
    }
}
