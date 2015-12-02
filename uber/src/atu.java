// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public final class atu
{

    private final auo a;

    atu(auo auo1)
    {
        a = auo1;
    }

    public final Point a(LatLng latlng)
    {
        try
        {
            latlng = (Point)aai.a(a.a(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new ayb(latlng);
        }
        return latlng;
    }

    public final LatLng a(Point point)
    {
        try
        {
            point = a.a(aai.a(point));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new ayb(point);
        }
        return point;
    }

    public final VisibleRegion a()
    {
        VisibleRegion visibleregion;
        try
        {
            visibleregion = a.a();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return visibleregion;
    }
}
