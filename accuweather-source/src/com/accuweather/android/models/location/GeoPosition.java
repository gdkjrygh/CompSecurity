// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location;


public class GeoPosition
{

    private Double Latitude;
    private Double Longitude;

    public GeoPosition()
    {
    }

    public GeoPosition(Double double1, Double double2)
    {
        Latitude = double1;
        Longitude = double2;
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
        obj = (GeoPosition)obj;
        if (Latitude == null)
        {
            if (((GeoPosition) (obj)).Latitude != null)
            {
                return false;
            }
        } else
        if (!Latitude.equals(((GeoPosition) (obj)).Latitude))
        {
            return false;
        }
        if (Longitude != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((GeoPosition) (obj)).Longitude == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Longitude.equals(((GeoPosition) (obj)).Longitude)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Double getLatitude()
    {
        return Latitude;
    }

    public Double getLongitude()
    {
        return Longitude;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (Latitude == null)
        {
            i = 0;
        } else
        {
            i = Latitude.hashCode();
        }
        if (Longitude != null)
        {
            j = Longitude.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setLatitude(Double double1)
    {
        Latitude = double1;
    }

    public void setLongitude(Double double1)
    {
        Longitude = double1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("GeoPosition [Latitude=").append(Latitude).append(", Longitude=").append(Longitude).append("]").toString();
    }
}
