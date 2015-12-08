// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.geo.WLCircle;
import com.worklight.location.api.geo.WLCoordinate;
import com.worklight.location.api.geo.WLGeoUtils;
import com.worklight.location.api.geo.WLPolygon;

// Referenced classes of package com.worklight.location.internal.geo:
//            AreaVisitor

public class IsInsideAreaVisitor
    implements AreaVisitor
{

    private final double bufferZoneWidth;
    private final WLConfidenceLevel confidence;
    private final WLCoordinate coordinate;

    public IsInsideAreaVisitor(WLCoordinate wlcoordinate, WLConfidenceLevel wlconfidencelevel, double d)
    {
        coordinate = wlcoordinate;
        confidence = wlconfidencelevel;
        bufferZoneWidth = d;
    }

    public Boolean visitCircle(WLCircle wlcircle)
    {
        return Boolean.valueOf(WLGeoUtils.isInsideCircle(coordinate, wlcircle, bufferZoneWidth, confidence));
    }

    public volatile Object visitCircle(WLCircle wlcircle)
    {
        return visitCircle(wlcircle);
    }

    public Boolean visitPolygon(WLPolygon wlpolygon)
    {
        return Boolean.valueOf(WLGeoUtils.isInsidePolygon(coordinate, wlpolygon, bufferZoneWidth, confidence));
    }

    public volatile Object visitPolygon(WLPolygon wlpolygon)
    {
        return visitPolygon(wlpolygon);
    }
}
