// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;

public class SimplePlacemark
    implements Serializable
{

    private static final double EARTH_RADIUS_KILOMETERS = 6371.009D;
    private static final long serialVersionUID = 0x487b10010847325dL;
    private double latitude;
    private double longitude;
    private String name;

    public SimplePlacemark()
    {
    }

    public SimplePlacemark(double d, double d1)
    {
        latitude = d;
        longitude = d1;
    }

    public SimplePlacemark(Location location)
    {
        this(location.getLatitude(), location.getLongitude());
    }

    public SimplePlacemark(LatLng latlng)
    {
        this(latlng.latitude, latlng.longitude);
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof SimplePlacemark;
    }

    public float distanceTo(Location location)
    {
        return toLocation().distanceTo(location);
    }

    public float distanceTo(SimplePlacemark simpleplacemark)
    {
        return toLocation().distanceTo(simpleplacemark.toLocation());
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof SimplePlacemark))
            {
                return false;
            }
            obj = (SimplePlacemark)obj;
            if (!((SimplePlacemark) (obj)).canEqual(this))
            {
                return false;
            }
            String s = getName();
            String s1 = ((SimplePlacemark) (obj)).getName();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            if (Double.compare(getLatitude(), ((SimplePlacemark) (obj)).getLatitude()) != 0)
            {
                return false;
            }
            if (Double.compare(getLongitude(), ((SimplePlacemark) (obj)).getLongitude()) != 0)
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

    public String getName()
    {
        return name;
    }

    public int hashCode()
    {
        String s = getName();
        int i;
        int j;
        long l;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        l = Double.doubleToLongBits(getLatitude());
        j = (int)(l >>> 32 ^ l);
        l = Double.doubleToLongBits(getLongitude());
        return ((i + 31) * 31 + j) * 31 + (int)(l >>> 32 ^ l);
    }

    public void setLatitude(double d)
    {
        latitude = d;
    }

    public void setLongitude(double d)
    {
        longitude = d;
    }

    public void setName(String s)
    {
        name = s;
    }

    public LatLng toLatLng()
    {
        return new LatLng(latitude, longitude);
    }

    public Location toLocation()
    {
        Location location = new Location("Transit");
        location.setLatitude(latitude);
        location.setLongitude(longitude);
        return location;
    }

    public String toString()
    {
        return (new StringBuilder("SimplePlacemark(name=")).append(getName()).append(", latitude=").append(getLatitude()).append(", longitude=").append(getLongitude()).append(")").toString();
    }

    public SimplePlacemark travel(double d, double d1)
    {
        double d2 = Math.toRadians(d);
        double d3 = Math.toRadians(latitude);
        d = Math.toRadians(longitude);
        double d4 = d1 / 6371.009D;
        double d5 = Math.sin(d4) * Math.cos(d3);
        d1 = Math.asin(Math.sin(d3) * Math.cos(d4) + Math.cos(d2) * d5);
        d2 = Math.atan2(Math.sin(d2) * d5, Math.cos(d4) - Math.sin(d3) * Math.sin(d1));
        return new SimplePlacemark(Math.toDegrees(d1), Math.toDegrees(d + d2));
    }
}
