// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

public final class Projection
{

    private final IProjectionDelegate ZM;

    Projection(IProjectionDelegate iprojectiondelegate)
    {
        ZM = iprojectiondelegate;
    }

    public LatLng fromScreenLocation(Point point)
    {
        try
        {
            point = ZM.fromScreenLocation(e.h(point));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }

    public VisibleRegion getVisibleRegion()
    {
        VisibleRegion visibleregion;
        try
        {
            visibleregion = ZM.getVisibleRegion();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return visibleregion;
    }

    public Point toScreenLocation(LatLng latlng)
    {
        try
        {
            latlng = (Point)e.e(ZM.toScreenLocation(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }
}
