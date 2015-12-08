// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.internal.InternalGeoUtils;
import com.worklight.location.internal.geo.GetDistanceToAreaVisitor;
import com.worklight.location.internal.geo.IsInsideAreaVisitor;
import com.worklight.location.internal.geo.IsOutsideAreaVisitor;
import java.util.List;

// Referenced classes of package com.worklight.location.api.geo:
//            WLCoordinate, WLArea, WLCircle, WLPolygon

public class WLGeoUtils
{

    public WLGeoUtils()
    {
    }

    public static double getDistanceBetweenCoordinates(WLCoordinate wlcoordinate, WLCoordinate wlcoordinate1)
    {
        double d4 = wlcoordinate.getLongitude();
        double d2 = wlcoordinate.getLatitude();
        double d5 = wlcoordinate1.getLongitude();
        double d3 = wlcoordinate1.getLatitude();
        double d1 = d5 - d4;
        double d = d1;
        if (Math.abs(d1) > 180D)
        {
            d = InternalGeoUtils.transformLongitude(d5) - InternalGeoUtils.transformLongitude(d4);
        }
        d = InternalGeoUtils.radians(d);
        d1 = InternalGeoUtils.radians(d3 - d2);
        d = Math.sin(d1 / 2D) * Math.sin(d1 / 2D) + Math.cos(InternalGeoUtils.radians(d2)) * Math.cos(InternalGeoUtils.radians(d3)) * Math.sin(d / 2D) * Math.sin(d / 2D);
        return InternalGeoUtils.radiansToMeters(2D * Math.atan2(Math.sqrt(d), Math.sqrt(1.0D - d)));
    }

    public static double getDistanceToArea(WLCoordinate wlcoordinate, WLArea wlarea)
    {
        return getDistanceToArea(wlcoordinate, wlarea, 0.0D);
    }

    public static double getDistanceToArea(WLCoordinate wlcoordinate, WLArea wlarea, double d)
    {
        return ((Double)wlarea.accept(new GetDistanceToAreaVisitor(wlcoordinate, d))).doubleValue();
    }

    public static double getDistanceToCircle(WLCoordinate wlcoordinate, WLCircle wlcircle)
    {
        return getDistanceToCircle(wlcoordinate, wlcircle, 0.0D);
    }

    public static double getDistanceToCircle(WLCoordinate wlcoordinate, WLCircle wlcircle, double d)
    {
        if (d < 0.0D && -d > wlcircle.getRadius())
        {
            throw new ArithmeticException(String.format("bufferedZoneWidth (%f) is negative and its absolute value is larger than the circle's radius (%f)", new Object[] {
                Double.valueOf(d), Double.valueOf(wlcircle.getRadius())
            }));
        } else
        {
            return getDistanceBetweenCoordinates(wlcircle.getCenter(), wlcoordinate) - wlcircle.getRadius() - d;
        }
    }

    public static double getDistanceToPolygon(WLCoordinate wlcoordinate, WLPolygon wlpolygon)
    {
        return getDistanceToPolygon(wlcoordinate, wlpolygon, 0.0D);
    }

    public static double getDistanceToPolygon(WLCoordinate wlcoordinate, WLPolygon wlpolygon, double d)
    {
        double d1 = 1.7976931348623157E+308D;
        WLPolygon wlpolygon1 = InternalGeoUtils.transformPolygon(wlpolygon);
        WLCoordinate wlcoordinate1 = wlcoordinate;
        if (!wlpolygon.equals(wlpolygon1))
        {
            wlcoordinate1 = InternalGeoUtils.transformCoordinate(wlcoordinate);
        }
        int j = wlpolygon1.getCoordinates().size();
        for (int i = 0; i < j;)
        {
            double d3 = InternalGeoUtils.distanceFromLineSegment(wlcoordinate1, (WLCoordinate)wlpolygon1.getCoordinates().get(i), (WLCoordinate)wlpolygon1.getCoordinates().get((i + 1) % j));
            double d2 = d1;
            if (d3 < d1)
            {
                d2 = d3;
            }
            i++;
            d1 = d2;
        }

        if (InternalGeoUtils.isInsidePolygonBoundary(wlcoordinate1, wlpolygon1))
        {
            return -(d1 + d);
        } else
        {
            return d1 - d;
        }
    }

    public static boolean isInsideArea(WLCoordinate wlcoordinate, WLArea wlarea)
    {
        return isInsideArea(wlcoordinate, wlarea, 0.0D, WLConfidenceLevel.LOW);
    }

    public static boolean isInsideArea(WLCoordinate wlcoordinate, WLArea wlarea, double d, WLConfidenceLevel wlconfidencelevel)
    {
        return ((Boolean)wlarea.accept(new IsInsideAreaVisitor(wlcoordinate, wlconfidencelevel, d))).booleanValue();
    }

    public static boolean isInsideCircle(WLCoordinate wlcoordinate, WLCircle wlcircle)
    {
        return isInsideCircle(wlcoordinate, wlcircle, 0.0D, WLConfidenceLevel.LOW);
    }

    public static boolean isInsideCircle(WLCoordinate wlcoordinate, WLCircle wlcircle, double d, WLConfidenceLevel wlconfidencelevel)
    {
        d = getDistanceToCircle(wlcoordinate, wlcircle, d);
        return d <= 0.0D && InternalGeoUtils.isDistanceWithinConfidenceLevel(-d, wlconfidencelevel, wlcoordinate.getAccuracy());
    }

    public static boolean isInsidePolygon(WLCoordinate wlcoordinate, WLPolygon wlpolygon)
    {
        return isInsidePolygon(wlcoordinate, wlpolygon, 0.0D, WLConfidenceLevel.LOW);
    }

    public static boolean isInsidePolygon(WLCoordinate wlcoordinate, WLPolygon wlpolygon, double d, WLConfidenceLevel wlconfidencelevel)
    {
        d = getDistanceToPolygon(wlcoordinate, wlpolygon, d);
        return d <= 0.0D && InternalGeoUtils.isDistanceWithinConfidenceLevel(-d, wlconfidencelevel, wlcoordinate.getAccuracy());
    }

    public static boolean isOutsideArea(WLCoordinate wlcoordinate, WLArea wlarea)
    {
        return isOutsideArea(wlcoordinate, wlarea, 0.0D, WLConfidenceLevel.LOW);
    }

    public static boolean isOutsideArea(WLCoordinate wlcoordinate, WLArea wlarea, double d, WLConfidenceLevel wlconfidencelevel)
    {
        return ((Boolean)wlarea.accept(new IsOutsideAreaVisitor(wlconfidencelevel, wlcoordinate, d))).booleanValue();
    }

    public static boolean isOutsideCircle(WLCoordinate wlcoordinate, WLCircle wlcircle)
    {
        return isOutsideCircle(wlcoordinate, wlcircle, 0.0D, WLConfidenceLevel.LOW);
    }

    public static boolean isOutsideCircle(WLCoordinate wlcoordinate, WLCircle wlcircle, double d, WLConfidenceLevel wlconfidencelevel)
    {
        d = getDistanceToCircle(wlcoordinate, wlcircle, d);
        return d > 0.0D && InternalGeoUtils.isDistanceWithinConfidenceLevel(d, wlconfidencelevel, wlcoordinate.getAccuracy());
    }

    public static boolean isOutsidePolygon(WLCoordinate wlcoordinate, WLPolygon wlpolygon)
    {
        return isOutsideArea(wlcoordinate, wlpolygon, 0.0D, WLConfidenceLevel.LOW);
    }

    public static boolean isOutsidePolygon(WLCoordinate wlcoordinate, WLPolygon wlpolygon, double d, WLConfidenceLevel wlconfidencelevel)
    {
        d = getDistanceToPolygon(wlcoordinate, wlpolygon, d);
        return d > 0.0D && InternalGeoUtils.isDistanceWithinConfidenceLevel(d, wlconfidencelevel, wlcoordinate.getAccuracy());
    }
}
