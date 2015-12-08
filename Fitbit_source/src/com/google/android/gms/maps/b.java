// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.internal.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            a

public final class b
{

    private static a a;

    private b()
    {
    }

    public static com.google.android.gms.maps.a a()
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(c().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }

    public static com.google.android.gms.maps.a a(float f)
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(c().a(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }

    public static com.google.android.gms.maps.a a(float f, float f1)
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(c().a(f, f1));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }

    public static com.google.android.gms.maps.a a(float f, Point point)
    {
        try
        {
            point = new com.google.android.gms.maps.a(c().a(f, point.x, point.y));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }

    public static com.google.android.gms.maps.a a(CameraPosition cameraposition)
    {
        try
        {
            cameraposition = new com.google.android.gms.maps.a(c().a(cameraposition));
        }
        // Misplaced declaration of an exception variable
        catch (CameraPosition cameraposition)
        {
            throw new RuntimeRemoteException(cameraposition);
        }
        return cameraposition;
    }

    public static com.google.android.gms.maps.a a(LatLng latlng)
    {
        try
        {
            latlng = new com.google.android.gms.maps.a(c().a(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    public static com.google.android.gms.maps.a a(LatLng latlng, float f)
    {
        try
        {
            latlng = new com.google.android.gms.maps.a(c().a(latlng, f));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    public static com.google.android.gms.maps.a a(LatLngBounds latlngbounds, int i)
    {
        try
        {
            latlngbounds = new com.google.android.gms.maps.a(c().a(latlngbounds, i));
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new RuntimeRemoteException(latlngbounds);
        }
        return latlngbounds;
    }

    public static com.google.android.gms.maps.a a(LatLngBounds latlngbounds, int i, int j, int k)
    {
        try
        {
            latlngbounds = new com.google.android.gms.maps.a(c().a(latlngbounds, i, j, k));
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new RuntimeRemoteException(latlngbounds);
        }
        return latlngbounds;
    }

    public static void a(a a1)
    {
        a = (a)am.a(a1);
    }

    public static com.google.android.gms.maps.a b()
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(c().b());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }

    public static com.google.android.gms.maps.a b(float f)
    {
        com.google.android.gms.maps.a a1;
        try
        {
            a1 = new com.google.android.gms.maps.a(c().b(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }

    private static a c()
    {
        return (a)am.a(a, "CameraUpdateFactory is not initialized");
    }
}
