// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

public class GeoLocation
    implements Serializable
{

    private static final long serialVersionUID = 0xbcb9fb5a874f20f1L;
    protected double latitude;
    protected double longitude;

    GeoLocation()
    {
    }

    public GeoLocation(double d, double d1)
    {
        latitude = d;
        longitude = d1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof GeoLocation))
            {
                return false;
            }
            obj = (GeoLocation)obj;
            if (Double.compare(((GeoLocation) (obj)).getLatitude(), latitude) != 0)
            {
                return false;
            }
            if (Double.compare(((GeoLocation) (obj)).getLongitude(), longitude) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(latitude);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(longitude);
        return i * 31 + (int)(l ^ l >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder("GeoLocation{latitude=")).append(latitude).append(", longitude=").append(longitude).append('}').toString();
    }
}
