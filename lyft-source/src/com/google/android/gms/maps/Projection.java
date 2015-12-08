// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class Projection
{

    private final IProjectionDelegate a;

    Projection(IProjectionDelegate iprojectiondelegate)
    {
        a = iprojectiondelegate;
    }

    public Point a(LatLng latlng)
    {
        try
        {
            latlng = (Point)zze.a(a.a(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    public LatLng a(Point point)
    {
        try
        {
            point = a.a(zze.a(point));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }
}
