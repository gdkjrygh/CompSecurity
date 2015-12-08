// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.maps.android:
//            MathUtil

public class SphericalUtil
{

    private SphericalUtil()
    {
    }

    static double computeAngleBetween(LatLng latlng, LatLng latlng1)
    {
        return distanceRadians(Math.toRadians(latlng.latitude), Math.toRadians(latlng.longitude), Math.toRadians(latlng1.latitude), Math.toRadians(latlng1.longitude));
    }

    public static double computeArea(List list)
    {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeDistanceBetween(LatLng latlng, LatLng latlng1)
    {
        return computeAngleBetween(latlng, latlng1) * 6371009D;
    }

    public static double computeHeading(LatLng latlng, LatLng latlng1)
    {
        double d = Math.toRadians(latlng.latitude);
        double d2 = Math.toRadians(latlng.longitude);
        double d1 = Math.toRadians(latlng1.latitude);
        d2 = Math.toRadians(latlng1.longitude) - d2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.sin(d2) * Math.cos(d1), Math.cos(d) * Math.sin(d1) - Math.sin(d) * Math.cos(d1) * Math.cos(d2))), -180D, 180D);
    }

    public static double computeLength(List list)
    {
        if (list.size() < 2)
        {
            return 0.0D;
        }
        double d2 = 0.0D;
        LatLng latlng = (LatLng)list.get(0);
        double d = Math.toRadians(latlng.latitude);
        double d1 = Math.toRadians(latlng.longitude);
        for (list = list.iterator(); list.hasNext();)
        {
            LatLng latlng1 = (LatLng)list.next();
            double d4 = Math.toRadians(latlng1.latitude);
            double d3 = Math.toRadians(latlng1.longitude);
            d2 += distanceRadians(d, d1, d4, d3);
            d = d4;
            d1 = d3;
        }

        return 6371009D * d2;
    }

    public static LatLng computeOffset(LatLng latlng, double d, double d1)
    {
        double d3 = d / 6371009D;
        d1 = Math.toRadians(d1);
        double d5 = Math.toRadians(latlng.latitude);
        d = Math.toRadians(latlng.longitude);
        double d2 = Math.cos(d3);
        d3 = Math.sin(d3);
        double d4 = Math.sin(d5);
        double d6 = Math.cos(d5);
        d5 = d2 * d4 + d3 * d6 * Math.cos(d1);
        d1 = Math.atan2(d3 * d6 * Math.sin(d1), d2 - d4 * d5);
        return new LatLng(Math.toDegrees(Math.asin(d5)), Math.toDegrees(d + d1));
    }

    public static LatLng computeOffsetOrigin(LatLng latlng, double d, double d1)
    {
        double d2;
        double d3;
        double d4;
        double d5;
label0:
        {
            d1 = Math.toRadians(d1);
            d /= 6371009D;
            d2 = Math.cos(d);
            d3 = Math.sin(d) * Math.cos(d1);
            d4 = Math.sin(d);
            d5 = Math.sin(d1);
            double d6 = Math.sin(Math.toRadians(latlng.latitude));
            d = d2 * d2;
            double d7 = (d3 * d3 * d + d * d) - d * d6 * d6;
            if (d7 < 0.0D)
            {
                return null;
            }
            d = (d3 * d6 + Math.sqrt(d7)) / (d2 * d2 + d3 * d3);
            double d8 = (d6 - d3 * d) / d2;
            d1 = Math.atan2(d8, d);
            if (d1 >= -1.5707963267948966D)
            {
                d = d1;
                if (d1 <= 1.5707963267948966D)
                {
                    break label0;
                }
            }
            d = Math.atan2(d8, (d3 * d6 - Math.sqrt(d7)) / (d2 * d2 + d3 * d3));
        }
        if (d < -1.5707963267948966D || d > 1.5707963267948966D)
        {
            return null;
        } else
        {
            d1 = Math.toRadians(latlng.longitude);
            d2 = Math.atan2(d4 * d5, Math.cos(d) * d2 - Math.sin(d) * d3);
            return new LatLng(Math.toDegrees(d), Math.toDegrees(d1 - d2));
        }
    }

    public static double computeSignedArea(List list)
    {
        return computeSignedArea(list, 6371009D);
    }

    static double computeSignedArea(List list, double d)
    {
        int i = list.size();
        if (i < 3)
        {
            return 0.0D;
        }
        double d3 = 0.0D;
        LatLng latlng = (LatLng)list.get(i - 1);
        double d1 = Math.tan((1.5707963267948966D - Math.toRadians(latlng.latitude)) / 2D);
        double d2 = Math.toRadians(latlng.longitude);
        for (list = list.iterator(); list.hasNext();)
        {
            LatLng latlng1 = (LatLng)list.next();
            double d5 = Math.tan((1.5707963267948966D - Math.toRadians(latlng1.latitude)) / 2D);
            double d4 = Math.toRadians(latlng1.longitude);
            d3 += polarTriangleArea(d5, d4, d1, d2);
            d1 = d5;
            d2 = d4;
        }

        return d * d * d3;
    }

    private static double distanceRadians(double d, double d1, double d2, double d3)
    {
        return MathUtil.arcHav(MathUtil.havDistance(d, d2, d1 - d3));
    }

    public static LatLng interpolate(LatLng latlng, LatLng latlng1, double d)
    {
        double d1 = Math.toRadians(latlng.latitude);
        double d4 = Math.toRadians(latlng.longitude);
        double d2 = Math.toRadians(latlng1.latitude);
        double d5 = Math.toRadians(latlng1.longitude);
        double d6 = Math.cos(d1);
        double d7 = Math.cos(d2);
        double d8 = computeAngleBetween(latlng, latlng1);
        double d9 = Math.sin(d8);
        if (d9 < 9.9999999999999995E-07D)
        {
            return latlng;
        } else
        {
            double d3 = Math.sin((1.0D - d) * d8) / d9;
            d8 = Math.sin(d * d8) / d9;
            d = d3 * d6 * Math.cos(d4) + d8 * d7 * Math.cos(d5);
            d4 = d3 * d6 * Math.sin(d4) + d8 * d7 * Math.sin(d5);
            d1 = Math.atan2(Math.sin(d1) * d3 + Math.sin(d2) * d8, Math.sqrt(d * d + d4 * d4));
            d = Math.atan2(d4, d);
            return new LatLng(Math.toDegrees(d1), Math.toDegrees(d));
        }
    }

    private static double polarTriangleArea(double d, double d1, double d2, double d3)
    {
        d1 -= d3;
        d *= d2;
        return 2D * Math.atan2(Math.sin(d1) * d, 1.0D + Math.cos(d1) * d);
    }
}
