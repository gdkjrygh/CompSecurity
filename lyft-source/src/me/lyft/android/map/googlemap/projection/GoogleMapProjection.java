// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap.projection;

import android.graphics.Point;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.projection.IProjection;

public class GoogleMapProjection
    implements IProjection
{

    private final Projection googleProjection;

    public GoogleMapProjection(Projection projection)
    {
        googleProjection = projection;
    }

    public static double distanceBetween(Point point, Point point1)
    {
        double d = point.x - point1.x;
        double d1 = point.y - point1.y;
        return Math.sqrt(d * d + d1 * d1);
    }

    public Location fromSreenLocation(Point point)
    {
        point = googleProjection.a(point);
        return new Location(((LatLng) (point)).a, ((LatLng) (point)).b);
    }

    public boolean isNull()
    {
        return false;
    }

    public Point toScreenLocation(Location location)
    {
        location = new LatLng(location.getLat().doubleValue(), location.getLng().doubleValue());
        return googleProjection.a(location);
    }
}
