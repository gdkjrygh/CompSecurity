// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.geo.WLCoordinate;
import com.worklight.location.api.geo.WLGeoUtils;
import com.worklight.location.api.geo.WLPolygon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InternalGeoUtils
{

    private static double EARTH_RADIUS = 6371000D;

    public InternalGeoUtils()
    {
    }

    public static double distanceFromLineSegment(WLCoordinate wlcoordinate, WLCoordinate wlcoordinate1, WLCoordinate wlcoordinate2)
    {
        return WLGeoUtils.getDistanceBetweenCoordinates(wlcoordinate, nearestPointOnLineSegment(wlcoordinate, wlcoordinate1, wlcoordinate2));
    }

    public static boolean isDistanceWithinConfidenceLevel(double d, WLConfidenceLevel wlconfidencelevel, double d1)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$worklight$location$api$WLConfidenceLevel[];

            static 
            {
                $SwitchMap$com$worklight$location$api$WLConfidenceLevel = new int[WLConfidenceLevel.values().length];
                try
                {
                    $SwitchMap$com$worklight$location$api$WLConfidenceLevel[WLConfidenceLevel.LOW.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$location$api$WLConfidenceLevel[WLConfidenceLevel.MEDIUM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$location$api$WLConfidenceLevel[WLConfidenceLevel.HIGH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.worklight.location.api.WLConfidenceLevel[wlconfidencelevel.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 73
    //                   2 63
    //                   3 77;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError((new StringBuilder()).append("Unknown WLConfidenceLevel value ").append(wlconfidencelevel).toString());
_L3:
        if (d <= 0.5D * d1) goto _L5; else goto _L2
_L2:
        return true;
_L5:
        return false;
_L4:
        if (d <= 2.0499999999999998D * d1)
        {
            return false;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public static boolean isInsidePolygonBoundary(WLCoordinate wlcoordinate, WLPolygon wlpolygon)
    {
        WLPolygon wlpolygon1 = transformPolygon(wlpolygon);
        WLCoordinate wlcoordinate1 = wlcoordinate;
        if (!wlpolygon.equals(wlpolygon1))
        {
            wlcoordinate1 = transformCoordinate(wlcoordinate);
        }
        double d4 = wlcoordinate1.getLongitude();
        double d5 = wlcoordinate1.getLatitude();
        wlcoordinate = new HashMap();
        double d6 = 180D / (double)(wlpolygon1.length + 1);
        int i = 0;
        while (i < wlpolygon1.length) 
        {
            double d = wlpolygon1.get(i).getLongitude();
            double d2 = wlpolygon1.get(i).getLatitude();
            if (d - d4 == 0.0D)
            {
                wlcoordinate.put(Integer.valueOf(0), Integer.valueOf(1));
            } else
            {
                wlcoordinate.put(Integer.valueOf((int)Math.floor((90D + Math.atan((d2 - d5) / (d - d4))) / d6)), Integer.valueOf(1));
            }
            i++;
        }
        double d3 = 1.0D;
        i = 0;
        do
        {
            int k;
label0:
            {
label1:
                {
                    double d1 = d3;
                    if (i <= wlpolygon1.length)
                    {
                        if (!wlcoordinate.containsKey(Integer.valueOf(i)) || ((Integer)wlcoordinate.get(Integer.valueOf(i))).intValue() == 1)
                        {
                            break label1;
                        }
                        d1 = Math.tan(((double)i + 0.5D) * d6 - 90D);
                    }
                    k = 0;
                    d3 = d5 - d1 * d4;
                    int j = 0;
                    while (j < wlpolygon1.length) 
                    {
                        i = (j + 1) % wlpolygon1.length;
                        WLCoordinate wlcoordinate2 = wlpolygon1.get(j);
                        WLCoordinate wlcoordinate3 = wlpolygon1.get(i);
                        wlpolygon = wlcoordinate2;
                        wlcoordinate = wlcoordinate3;
                        if (wlcoordinate2.getLongitude() > wlcoordinate3.getLongitude())
                        {
                            wlpolygon = wlpolygon1.get(i);
                            wlcoordinate = wlpolygon1.get(j);
                        }
                        if (d4 > wlcoordinate.getLongitude())
                        {
                            i = k;
                        } else
                        {
                            double d7 = wlpolygon.getLongitude();
                            double d9 = wlcoordinate.getLongitude();
                            int l = sign(wlpolygon.getLatitude() - (d7 * d1 + d3));
                            int i1 = sign(wlcoordinate.getLatitude() - (d9 * d1 + d3));
                            if (l == i1 && i1 == 0 && d4 >= wlpolygon.getLongitude())
                            {
                                return true;
                            }
                            i = k;
                            if (l != i1)
                            {
                                i = k;
                                if (l + i1 <= 0)
                                {
                                    if (d4 <= wlpolygon.getLongitude() || i1 == 0)
                                    {
                                        i = k + 1;
                                    } else
                                    {
                                        double d8 = wlcoordinate.getLongitude() - wlpolygon.getLongitude();
                                        if (d8 == 0.0D)
                                        {
                                            i = k + 1;
                                        } else
                                        {
                                            i = k;
                                            if ((double)(sign((d5 - wlpolygon.getLatitude()) * d8 - (wlcoordinate.getLatitude() - wlpolygon.getLatitude()) * (d4 - wlpolygon.getLongitude())) * sign(d8)) == (double)i1)
                                            {
                                                i = k + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j++;
                        k = i;
                    }
                    break label0;
                }
                i++;
                continue;
            }
            if (k % 2 == 1)
            {
                return true;
            }
            return false;
        } while (true);
    }

    public static double max(double ad[])
    {
        double d = 4.9406564584124654E-324D;
        int j = ad.length;
        for (int i = 0; i < j;)
        {
            double d2 = ad[i];
            double d1 = d;
            if (d < d2)
            {
                d1 = d2;
            }
            i++;
            d = d1;
        }

        return d;
    }

    public static double min(double ad[])
    {
        double d = 1.7976931348623157E+308D;
        int j = ad.length;
        for (int i = 0; i < j;)
        {
            double d2 = ad[i];
            double d1 = d;
            if (d > d2)
            {
                d1 = d2;
            }
            i++;
            d = d1;
        }

        return d;
    }

    public static WLCoordinate nearestPointOnLineSegment(WLCoordinate wlcoordinate, WLCoordinate wlcoordinate1, WLCoordinate wlcoordinate2)
    {
        double d;
        double d1;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d13;
        double d14;
        double d15;
        double d16;
        int i;
        if (wlcoordinate1.equals(wlcoordinate2))
        {
            return wlcoordinate1;
        }
        d9 = wlcoordinate1.getLatitude();
        d7 = wlcoordinate1.getLongitude();
        double d17 = wlcoordinate.getLatitude();
        double d18 = wlcoordinate.getLongitude();
        d13 = wlcoordinate1.getLatitude();
        d15 = wlcoordinate1.getLongitude();
        d14 = wlcoordinate2.getLatitude();
        d16 = wlcoordinate2.getLongitude();
        d6 = 0.0D;
        d = WLGeoUtils.getDistanceBetweenCoordinates(wlcoordinate, wlcoordinate1);
        d8 = 1.0D;
        d5 = WLGeoUtils.getDistanceBetweenCoordinates(wlcoordinate, wlcoordinate2);
        wlcoordinate1 = new WLCoordinate((d13 + d14) / 2D, (d15 + d16) / 2D, 0.0D);
        d2 = 0.5D;
        d1 = WLGeoUtils.getDistanceBetweenCoordinates(wlcoordinate, wlcoordinate1);
        double d11;
        boolean flag;
        if (d < d5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = 0;
_L1:
        d3 = d9;
        d4 = d7;
        d10 = d2;
        d7 = d;
        d9 = d1;
        if (i < 30)
        {
            d10 = d6;
            d11 = d8;
            d7 = d;
            d9 = d5;
            if (d5 < d)
            {
                d9 = d;
                d7 = d5;
                d11 = d6;
                d10 = d8;
            }
            d4 = d10;
            d = d11;
            d6 = d2;
            d5 = d7;
            d3 = d9;
            d8 = d1;
            if (d1 < d9)
            {
                d4 = d10;
                d = d2;
                d6 = d11;
                d5 = d7;
                d3 = d1;
                d8 = d9;
                if (d1 < d7)
                {
                    d = d10;
                    d3 = d7;
                    d8 = d9;
                    d5 = d1;
                    d6 = d11;
                    d4 = d2;
                }
            }
            d2 = d15 + (d16 - d15) * d4;
            d1 = d13 + (d14 - d13) * d4;
            if (d4 == d || d4 == d6)
            {
                break MISSING_BLOCK_LABEL_1000;
            }
            if (d == d6)
            {
                d9 = d8;
                d7 = d5;
                d10 = d6;
                d4 = d2;
                d3 = d1;
            } else
            {
label0:
                {
                    d9 = min(new double[] {
                        d4, d, d6
                    });
                    d10 = max(new double[] {
                        d4, d, d6
                    });
                    if (d10 - d9 >= 0.001D)
                    {
                        break label0;
                    }
                    d7 = min(new double[] {
                        d5, d3, d8
                    });
                    if (max(new double[] {
    d5, d3, d8
}) - d7 >= 0.5D)
                    {
                        break label0;
                    }
                    d3 = d1;
                    d4 = d2;
                    d10 = d6;
                    d7 = d5;
                    d9 = d8;
                }
            }
        }
_L2:
        if (d9 < d7)
        {
            d7 = d9;
            d1 = d15 + (d16 - d15) * d10;
            d = d13 + (d14 - d13) * d10;
        } else
        {
            d1 = d4;
            d = d3;
        }
        d2 = ((d18 - d15) * (d16 - d15) + (d17 - d13) * (d14 - d13)) / ((d16 - d15) * (d16 - d15) + (d14 - d13) * (d14 - d13));
        if (d2 >= 0.0D && d2 <= 1.0D && WLGeoUtils.getDistanceBetweenCoordinates(wlcoordinate, new WLCoordinate((d14 - d13) * d2 + d13, d15 + (d16 - d15) * d2, 0.0D)) < d7)
        {
            d1 = d15 + (d16 - d15) * d2;
            d = d13 + (d14 - d13) * d2;
        }
        d2 = d;
        d3 = d1;
        if (sign(d - d13) == sign(d - d14))
        {
            d2 = d;
            d3 = d1;
            double d12;
            if (sign(d1 - d15) == sign(d1 - d16))
            {
                if (flag)
                {
                    d3 = d15;
                    d2 = d13;
                } else
                {
                    d3 = d16;
                    d2 = d14;
                }
            }
        }
        return new WLCoordinate(d2, d3, 0.0D);
        d7 = (d3 - d5) / (d - d4);
        d8 = (d8 - d3 - (d6 - d) * d7) / ((d6 - d) * (d6 - d4));
        if (d8 != 0.0D)
        {
            d6 = -(d7 - (d + d4) * d8) / (2D * d8);
        } else
        {
label1:
            {
                d8 = d4;
                if (d8 != d9)
                {
                    d7 = d8;
                    if (d8 != d10)
                    {
                        break label1;
                    }
                }
                d7 = d;
            }
label2:
            {
                if (d7 != d9)
                {
                    d8 = d7;
                    if (d7 != d10)
                    {
                        break label2;
                    }
                }
                d8 = d6;
            }
            if (d10 - d8 > d8 - d9)
            {
                d6 = Math.min(1.0D, 0.38200000000000001D * (d10 - d8) + d8);
            } else
            {
                d6 = Math.max(0.0D, d8 - 0.38200000000000001D * (d8 - d9));
            }
        }
        d10 = WLGeoUtils.getDistanceBetweenCoordinates(wlcoordinate, new WLCoordinate((d14 - d13) * d6 + d13, d15 + (d16 - d15) * d6, 0.0D));
        d12 = d6;
        i++;
        d9 = d1;
        d7 = d2;
        d6 = d4;
        d8 = d;
        d2 = d12;
        d = d5;
        d5 = d3;
        d1 = d10;
          goto _L1
        d3 = d1;
        d4 = d2;
        d10 = d6;
        d7 = d5;
        d9 = d8;
          goto _L2
    }

    public static double radians(double d)
    {
        return (3.1415926535897931D * d) / 180D;
    }

    public static double radiansToMeters(double d)
    {
        return EARTH_RADIUS * d;
    }

    public static int sign(double d)
    {
        if (d > 0.0D)
        {
            return 1;
        }
        return d >= 0.0D ? 0 : -1;
    }

    public static WLCoordinate transformCoordinate(WLCoordinate wlcoordinate)
    {
        return new WLCoordinate(wlcoordinate.getLatitude(), transformLongitude(wlcoordinate.getLongitude()), 0.0D);
    }

    public static double transformLongitude(double d)
    {
        if (d > 0.0D)
        {
            return d - 180D;
        } else
        {
            return d + 180D;
        }
    }

    public static WLPolygon transformPolygon(WLPolygon wlpolygon)
    {
        double ad[] = new double[wlpolygon.length];
        for (int i = 0; i < ad.length; i++)
        {
            ad[i] = wlpolygon.get(i).getLongitude();
        }

        if (max(ad) - min(ad) < 180D)
        {
            return wlpolygon;
        }
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < wlpolygon.length; j++)
        {
            arraylist.add(new WLCoordinate(wlpolygon.get(j).getLatitude(), transformLongitude(wlpolygon.get(j).getLongitude()), 0.0D));
        }

        return new WLPolygon(arraylist);
    }

}
