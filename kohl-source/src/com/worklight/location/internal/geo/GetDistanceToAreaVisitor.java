// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLCircle;
import com.worklight.location.api.geo.WLCoordinate;
import com.worklight.location.api.geo.WLGeoUtils;
import com.worklight.location.api.geo.WLPolygon;

// Referenced classes of package com.worklight.location.internal.geo:
//            AreaVisitor

public class GetDistanceToAreaVisitor
    implements AreaVisitor
{

    private final double bufferZoneWidth;
    private final WLCoordinate coordinate;

    public GetDistanceToAreaVisitor(WLCoordinate wlcoordinate, double d)
    {
        coordinate = wlcoordinate;
        bufferZoneWidth = d;
    }

    public Double visitCircle(WLCircle wlcircle)
    {
        return Double.valueOf(WLGeoUtils.getDistanceToCircle(coordinate, wlcircle, bufferZoneWidth));
    }

    public volatile Object visitCircle(WLCircle wlcircle)
    {
        return visitCircle(wlcircle);
    }

    public Double visitPolygon(WLPolygon wlpolygon)
    {
        return Double.valueOf(WLGeoUtils.getDistanceToPolygon(coordinate, wlpolygon, bufferZoneWidth));
    }

    public volatile Object visitPolygon(WLPolygon wlpolygon)
    {
        return visitPolygon(wlpolygon);
    }
}
