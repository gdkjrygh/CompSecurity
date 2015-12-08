// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.location;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package me.lyft.android.domain.location:
//            Location

public class SphericalUtils
{

    static final double EARTH_RADIUS = 6371009D;
    private static final double LAT_LNG_EPSILON = 1.0000000000000001E-05D;

    public SphericalUtils()
    {
    }

    private static double computeAngleBetween(Location location, Location location1)
    {
        return distanceRadians(Math.toRadians(location.getLat().doubleValue()), Math.toRadians(location.getLng().doubleValue()), Math.toRadians(location1.getLat().doubleValue()), Math.toRadians(location1.getLng().doubleValue()));
    }

    public static double computeArea(List list)
    {
        return StrictMath.abs(computeSignedArea(list));
    }

    public static void computeDistanceAndBearing(double d, double d1, double d2, double d3, 
            float af[])
    {
        double d12 = (6378137D - 6356752.3141999999D) / 6378137D;
        double d13 = (6378137D * 6378137D - 6356752.3141999999D * 6356752.3141999999D) / (6356752.3141999999D * 6356752.3141999999D);
        double d9 = 0.017453292519943295D * d3 - 0.017453292519943295D * d1;
        d = Math.atan(Math.tan(0.017453292519943295D * d) * (1.0D - d12));
        d1 = Math.atan(Math.tan(0.017453292519943295D * d2) * (1.0D - d12));
        double d10 = Math.cos(d);
        double d11 = Math.cos(d1);
        double d14 = Math.sin(d);
        double d15 = Math.sin(d1);
        double d16 = d10 * d11;
        double d17 = d14 * d15;
        int i = 0;
        double d5 = d9;
        double d4 = 0.0D;
        d3 = 0.0D;
        d2 = 0.0D;
        d1 = 0.0D;
        d = 0.0D;
        do
        {
            double d6;
label0:
            {
                if (i < 20)
                {
                    d1 = Math.cos(d5);
                    d3 = Math.sin(d5);
                    d = d11 * d3;
                    d2 = d10 * d15 - d14 * d11 * d1;
                    double d18 = Math.sqrt(d * d + d2 * d2);
                    double d19 = d17 + d16 * d1;
                    d = Math.atan2(d18, d19);
                    double d7;
                    double d20;
                    double d21;
                    double d22;
                    if (d18 == 0.0D)
                    {
                        d4 = 0.0D;
                    } else
                    {
                        d4 = (d16 * d3) / d18;
                    }
                    d6 = 1.0D - d4 * d4;
                    if (d6 == 0.0D)
                    {
                        d7 = 0.0D;
                    } else
                    {
                        d7 = d19 - (2D * d17) / d6;
                    }
                    d20 = d6 * d13;
                    d2 = 1.0D + (d20 / 16384D) * (4096D + (-768D + (320D - 175D * d20) * d20) * d20);
                    d20 = (d20 * (-128D + (74D - 47D * d20) * d20) + 256D) * (d20 / 1024D);
                    d21 = (d12 / 16D) * d6 * ((4D - d6 * 3D) * d12 + 4D);
                    d6 = d7 * d7;
                    d22 = d20 / 4D;
                    d6 = (((-1D + 2D * d6) * d19 - (d6 * 4D - 3D) * ((d20 / 6D) * d7 * (-3D + 4D * d18 * d18))) * d22 + d7) * (d20 * d18);
                    d4 = d9 + ((d7 + d19 * d21 * (-1D + 2D * d7 * d7)) * (d18 * d21) + d) * (d4 * ((1.0D - d21) * d12));
                    if (Math.abs((d4 - d5) / d4) >= 9.9999999999999998E-13D)
                    {
                        break label0;
                    }
                    d4 = d3;
                    d3 = d1;
                    d1 = d;
                    d = d2;
                    d2 = d6;
                }
                af[0] = (float)((d1 - d2) * (d * 6356752.3141999999D));
                if (af.length > 1)
                {
                    af[1] = (float)((double)(float)Math.atan2(d11 * d4, d10 * d15 - d14 * d11 * d3) * 57.295779513082323D);
                    if (af.length > 2)
                    {
                        af[2] = (float)((double)(float)Math.atan2(d4 * d10, d3 * (d10 * d15) + -d14 * d11) * 57.295779513082323D);
                    }
                }
                return;
            }
            i++;
            d5 = d4;
            double d8 = d2;
            d4 = d3;
            d3 = d1;
            d2 = d6;
            d1 = d;
            d = d8;
        } while (true);
    }

    public static double computeDistanceBetween(Location location, Location location1)
    {
        return computeAngleBetween(location, location1) * 6371009D;
    }

    public static double computeHeading(Location location, Location location1)
    {
        double d = Math.toRadians(location.getLat().doubleValue());
        double d2 = Math.toRadians(location.getLng().doubleValue());
        double d1 = Math.toRadians(location1.getLat().doubleValue());
        d2 = Math.toRadians(location1.getLng().doubleValue()) - d2;
        return wrap(Math.toDegrees(Math.atan2(Math.sin(d2) * Math.cos(d1), Math.cos(d) * Math.sin(d1) - Math.sin(d) * Math.cos(d1) * Math.cos(d2))), -180D, 180D);
    }

    public static double computeLength(List list)
    {
        if (list.size() < 2)
        {
            return 0.0D;
        }
        Location location = (Location)list.get(0);
        double d1 = Math.toRadians(location.getLat().doubleValue());
        double d2 = Math.toRadians(location.getLng().doubleValue());
        list = list.iterator();
        double d = 0.0D;
        while (list.hasNext()) 
        {
            Location location1 = (Location)list.next();
            double d3 = Math.toRadians(location1.getLat().doubleValue());
            double d4 = Math.toRadians(location1.getLng().doubleValue());
            d1 = distanceRadians(d1, d2, d3, d4);
            d2 = d4;
            d = d1 + d;
            d1 = d3;
        }
        return d * 6371009D;
    }

    public static Location computeOffset(Location location, double d, double d1)
    {
        double d3 = d / 6371009D;
        d1 = Math.toRadians(d1);
        double d5 = Math.toRadians(location.getLat().doubleValue());
        d = Math.toRadians(location.getLng().doubleValue());
        double d2 = Math.cos(d3);
        d3 = Math.sin(d3);
        double d4 = Math.sin(d5);
        double d6 = Math.cos(d5);
        d5 = d2 * d4 + d3 * d6 * Math.cos(d1);
        d1 = Math.atan2(d3 * d6 * Math.sin(d1), d2 - d4 * d5);
        return new Location(Math.toDegrees(Math.asin(d5)), Math.toDegrees(d1 + d));
    }

    public static Location computeOffsetOrigin(Location location, double d, double d1)
    {
        double d4 = Math.toRadians(d1);
        d /= 6371009D;
        d1 = Math.cos(d);
        double d2 = Math.sin(d) * Math.cos(d4);
        double d3 = Math.sin(d);
        d4 = Math.sin(d4);
        double d5 = Math.sin(Math.toRadians(location.getLat().doubleValue()));
        d = d1 * d1;
        double d7 = (d2 * d2 * d + d * d) - d * d5 * d5;
        if (d7 < 0.0D)
        {
            return null;
        }
        d = (d2 * d5 + Math.sqrt(d7)) / (d1 * d1 + d2 * d2);
        double d8 = (d5 - d2 * d) / d1;
        d = Math.atan2(d8, d);
        if (d < -1.5707963267948966D || d > 1.5707963267948966D)
        {
            d = Math.atan2(d8, (d2 * d5 - Math.sqrt(d7)) / (d1 * d1 + d2 * d2));
        }
        if (d < -1.5707963267948966D || d > 1.5707963267948966D)
        {
            return null;
        } else
        {
            double d6 = Math.toRadians(location.getLng().doubleValue());
            d1 = Math.atan2(d3 * d4, d1 * Math.cos(d) - d2 * Math.sin(d));
            return new Location(Math.toDegrees(d), Math.toDegrees(d6 - d1));
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
        Location location = (Location)list.get(i - 1);
        double d2 = Math.tan((1.5707963267948966D - Math.toRadians(location.getLat().doubleValue())) / 2D);
        double d3 = Math.toRadians(location.getLng().doubleValue());
        list = list.iterator();
        double d1 = 0.0D;
        while (list.hasNext()) 
        {
            Location location1 = (Location)list.next();
            double d4 = Math.tan((1.5707963267948966D - Math.toRadians(location1.getLat().doubleValue())) / 2D);
            double d5 = Math.toRadians(location1.getLng().doubleValue());
            d2 = polarTriangleArea(d4, d5, d2, d3);
            d3 = d5;
            d1 = d2 + d1;
            d2 = d4;
        }
        return d * d * d1;
    }

    public static List decodeOverviewPolyLineToLatLngs(me.lyft.android.infrastructure.googlegeo.GoogleRouteDTO.OverviewPolyLine overviewpolyline)
    {
        ArrayList arraylist;
        int i;
        int j;
        int k;
        int k1;
        overviewpolyline = overviewpolyline.getPoints();
        arraylist = new ArrayList();
        k1 = overviewpolyline.length();
        j = 0;
        k = 0;
        i = 0;
_L5:
        if (i >= k1) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        int j1;
        l = 0;
        i1 = 0;
        j1 = i;
_L7:
        i = j1 + 1;
        j1 = overviewpolyline.charAt(j1) - 63;
        i1 |= (j1 & 0x1f) << l;
        l += 5;
        if (j1 >= 32)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        if ((i1 & 1) != 0)
        {
            l = ~(i1 >> 1);
        } else
        {
            l = i1 >> 1;
        }
        j1 = k + l;
        l = 0;
        k = 0;
        i1 = i;
_L6:
        i = i1 + 1;
        i1 = overviewpolyline.charAt(i1) - 63;
        l |= (i1 & 0x1f) << k;
        k += 5;
        if (i1 >= 32) goto _L4; else goto _L3
_L3:
        if ((l & 1) != 0)
        {
            k = ~(l >> 1);
        } else
        {
            k = l >> 1;
        }
        j = k + j;
        arraylist.add(new Location((double)j1 / 100000D, (double)j / 100000D));
        k = j1;
          goto _L5
_L2:
        return arraylist;
_L4:
        i1 = i;
          goto _L6
        j1 = i;
          goto _L7
    }

    private static double distanceRadians(double d, double d1, double d2, double d3)
    {
        return inverseHaversine(haversineDistance(d, d2, d1 - d3));
    }

    private static double haversine(double d)
    {
        d = Math.sin(0.5D * d);
        return d * d;
    }

    private static double haversineDistance(double d, double d1, double d2)
    {
        return haversine(d - d1) + haversine(d2) * Math.cos(d) * Math.cos(d1);
    }

    public static Location interpolate(Location location, Location location1, double d)
    {
        double d1 = Math.toRadians(location.getLat().doubleValue());
        double d4 = Math.toRadians(location.getLng().doubleValue());
        double d2 = Math.toRadians(location1.getLat().doubleValue());
        double d5 = Math.toRadians(location1.getLng().doubleValue());
        double d6 = Math.cos(d1);
        double d7 = Math.cos(d2);
        double d8 = computeAngleBetween(location, location1);
        double d9 = Math.sin(d8);
        if (d9 < 9.9999999999999995E-07D)
        {
            return location;
        } else
        {
            double d3 = Math.sin((1.0D - d) * d8) / d9;
            d8 = Math.sin(d8 * d) / d9;
            d = d3 * d6 * Math.cos(d4) + d8 * d7 * Math.cos(d5);
            d4 = Math.sin(d4) * (d6 * d3) + Math.sin(d5) * (d8 * d7);
            d1 = Math.atan2(Math.sin(d1) * d3 + Math.sin(d2) * d8, Math.sqrt(d * d + d4 * d4));
            d = Math.atan2(d4, d);
            return new Location(Math.toDegrees(d1), Math.toDegrees(d));
        }
    }

    private static double inverseHaversine(double d)
    {
        return 2D * Math.asin(Math.sqrt(d));
    }

    public static boolean latLngApproximateEquals(Location location, Location location1)
    {
        boolean flag;
        boolean flag1;
        if (Math.abs(location.getLat().doubleValue() - location1.getLat().doubleValue()) <= 1.0000000000000001E-05D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Math.abs(location.getLng().doubleValue() - location1.getLng().doubleValue()) <= 1.0000000000000001E-05D)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

    private static double mod(double d, double d1)
    {
        return (d % d1 + d1) % d1;
    }

    private static double polarTriangleArea(double d, double d1, double d2, double d3)
    {
        d1 -= d3;
        d *= d2;
        return Math.atan2(Math.sin(d1) * d, Math.cos(d1) * d + 1.0D) * 2D;
    }

    private static double wrap(double d, double d1, double d2)
    {
        if (d >= d1 && d < d2)
        {
            return d;
        } else
        {
            return mod(d - d1, d2 - d1) + d1;
        }
    }
}
