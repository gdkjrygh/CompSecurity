// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;


public class WLCoordinate
{

    static final boolean $assertionsDisabled;
    private final double accuracy;
    private final Double altitude;
    private final Double altitudeAccuracy;
    private final Double heading;
    private final double latitude;
    private final double longitude;
    private final Double speed;

    public WLCoordinate(double d, double d1)
    {
        this(d, d1, null, 0.0D, null, null, null);
    }

    public WLCoordinate(double d, double d1, double d2)
    {
        this(d, d1, null, d2, null, null, null);
    }

    public WLCoordinate(double d, double d1, Double double1, double d2, 
            Double double2, Double double3, Double double4)
    {
        double d3;
        double d4;
        d4 = d % 360D;
        d3 = d1 % 360D;
        if (d4 >= -90D || d4 <= -270D) goto _L2; else goto _L1
_L1:
        d = -180D - d4;
        d1 = d3 + 180D;
_L8:
        if (d <= 90D || d >= 270D) goto _L4; else goto _L3
_L3:
        d3 = 180D - d;
        d4 = d1 + 180D;
_L6:
        d = d4;
        if (d4 > 180D)
        {
            d = d4 - 360D;
        }
        d1 = d;
        if (d < -180D)
        {
            d1 = d + 360D;
        }
        if (!$assertionsDisabled && Math.abs(d3) > 90D)
        {
            throw new AssertionError();
        }
        break; /* Loop/switch isn't completed */
_L2:
        d = d4;
        d1 = d3;
        if (d4 < -270D)
        {
            d = d4 + 360D;
            d1 = d3;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        d3 = d;
        d4 = d1;
        if (d > 270D)
        {
            d3 = d - 360D;
            d4 = d1;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!$assertionsDisabled && Math.abs(d1) > 180D)
        {
            throw new AssertionError();
        }
        latitude = d3;
        longitude = d1;
        if (d2 < 0.0D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("accuracy must be non-negative, was ").append(d2).toString());
        }
        accuracy = d2;
        altitude = double1;
        altitudeAccuracy = double2;
        if (double3 != null && (double3.doubleValue() < 0.0D || double3.doubleValue() >= 360D))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("heading must conform to: 0 <= heading < 360, was ").append(double2).toString());
        }
        heading = double3;
        if (double4 != null && double4.doubleValue() < 0.0D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("speed must be non-negative, was ").append(double4).toString());
        }
        speed = double4;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (WLCoordinate)obj;
        if (Double.doubleToLongBits(accuracy) != Double.doubleToLongBits(((WLCoordinate) (obj)).accuracy))
        {
            return false;
        }
        if (altitude == null)
        {
            if (((WLCoordinate) (obj)).altitude != null)
            {
                return false;
            }
        } else
        if (!altitude.equals(((WLCoordinate) (obj)).altitude))
        {
            return false;
        }
        if (altitudeAccuracy == null)
        {
            if (((WLCoordinate) (obj)).altitudeAccuracy != null)
            {
                return false;
            }
        } else
        if (!altitudeAccuracy.equals(((WLCoordinate) (obj)).altitudeAccuracy))
        {
            return false;
        }
        if (heading == null)
        {
            if (((WLCoordinate) (obj)).heading != null)
            {
                return false;
            }
        } else
        if (!heading.equals(((WLCoordinate) (obj)).heading))
        {
            return false;
        }
        if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(((WLCoordinate) (obj)).latitude))
        {
            return false;
        }
        if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(((WLCoordinate) (obj)).longitude))
        {
            return false;
        }
        if (speed != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLCoordinate) (obj)).speed == null) goto _L1; else goto _L3
_L3:
        return false;
        if (speed.equals(((WLCoordinate) (obj)).speed)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public double getAccuracy()
    {
        return accuracy;
    }

    public Double getAltitude()
    {
        return altitude;
    }

    public Double getAltitudeAccuracy()
    {
        return altitudeAccuracy;
    }

    public Double getHeading()
    {
        return heading;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public Double getSpeed()
    {
        return speed;
    }

    public int hashCode()
    {
        int l = 0;
        long l1 = Double.doubleToLongBits(accuracy);
        int i1 = (int)(l1 >>> 32 ^ l1);
        int i;
        int j;
        int k;
        int j1;
        int k1;
        if (altitude == null)
        {
            i = 0;
        } else
        {
            i = altitude.hashCode();
        }
        if (altitudeAccuracy == null)
        {
            j = 0;
        } else
        {
            j = altitudeAccuracy.hashCode();
        }
        if (heading == null)
        {
            k = 0;
        } else
        {
            k = heading.hashCode();
        }
        l1 = Double.doubleToLongBits(latitude);
        j1 = (int)(l1 >>> 32 ^ l1);
        l1 = Double.doubleToLongBits(longitude);
        k1 = (int)(l1 >>> 32 ^ l1);
        if (speed != null)
        {
            l = speed.hashCode();
        }
        return ((((((i1 + 31) * 31 + i) * 31 + j) * 31 + k) * 31 + j1) * 31 + k1) * 31 + l;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(String.format("(%f,%f)", new Object[] {
            Double.valueOf(latitude), Double.valueOf(longitude)
        }));
        String s;
        if (accuracy != 0.0D)
        {
            s = (new StringBuilder()).append(" ~").append(accuracy).toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }

    static 
    {
        boolean flag;
        if (!com/worklight/location/api/geo/WLCoordinate.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
