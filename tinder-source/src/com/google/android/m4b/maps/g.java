// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;

public final class g
{

    private final com.google.android.m4b.maps.df.g a;

    g(com.google.android.m4b.maps.df.g g1)
    {
        a = g1;
    }

    public final Point a(LatLng latlng)
    {
        try
        {
            latlng = (Point)d.a(a.a(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    public final LatLng a(Point point)
    {
        try
        {
            point = a.a(d.a(point));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }
}
