// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.c;

// Referenced classes of package com.google.android.gms.maps:
//            a

public final class CameraUpdateFactory
{

    private static a zzaFo;

    private CameraUpdateFactory()
    {
    }

    public static com.google.android.gms.maps.a newCameraPosition(CameraPosition cameraposition)
    {
        try
        {
            cameraposition = new com.google.android.gms.maps.a(zzwC().a(cameraposition));
        }
        // Misplaced declaration of an exception variable
        catch (CameraPosition cameraposition)
        {
            throw new c(cameraposition);
        }
        return cameraposition;
    }

    public static com.google.android.gms.maps.a newLatLng(LatLng latlng)
    {
        try
        {
            latlng = new com.google.android.gms.maps.a(zzwC().a(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new c(latlng);
        }
        return latlng;
    }

    public static com.google.android.gms.maps.a newLatLngBounds(LatLngBounds latlngbounds, int i)
    {
        try
        {
            latlngbounds = new com.google.android.gms.maps.a(zzwC().a(latlngbounds, i));
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new c(latlngbounds);
        }
        return latlngbounds;
    }

    public static com.google.android.gms.maps.a newLatLngBounds(LatLngBounds latlngbounds, int i, int j, int k)
    {
        try
        {
            latlngbounds = new com.google.android.gms.maps.a(zzwC().a(latlngbounds, i, j, k));
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new c(latlngbounds);
        }
        return latlngbounds;
    }

    public static com.google.android.gms.maps.a newLatLngZoom(LatLng latlng, float f)
    {
        try
        {
            latlng = new com.google.android.gms.maps.a(zzwC().a(latlng, f));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new c(latlng);
        }
        return latlng;
    }

    public static com.google.android.gms.maps.a scrollBy(float f, float f1)
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(zzwC().a(f, f1));
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return a1;
    }

    public static com.google.android.gms.maps.a zoomBy(float f)
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(zzwC().b(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return a1;
    }

    public static com.google.android.gms.maps.a zoomBy(float f, Point point)
    {
        try
        {
            point = new com.google.android.gms.maps.a(zzwC().a(f, point.x, point.y));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new c(point);
        }
        return point;
    }

    public static com.google.android.gms.maps.a zoomIn()
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(zzwC().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return a1;
    }

    public static com.google.android.gms.maps.a zoomOut()
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(zzwC().b());
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return a1;
    }

    public static com.google.android.gms.maps.a zoomTo(float f)
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(zzwC().a(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return a1;
    }

    public static void zza(a a1)
    {
        zzaFo = (a)y.a(a1);
    }

    private static a zzwC()
    {
        return (a)y.a(zzaFo, "CameraUpdateFactory is not initialized");
    }
}
