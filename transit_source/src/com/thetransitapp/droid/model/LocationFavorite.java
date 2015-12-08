// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;

public class LocationFavorite
    implements Serializable
{

    private static final long serialVersionUID = 0x20c123e1f96a766L;
    private double latitude;
    private double longitude;
    private String name;

    public LocationFavorite()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof LocationFavorite;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof LocationFavorite))
            {
                return false;
            }
            obj = (LocationFavorite)obj;
            if (!((LocationFavorite) (obj)).canEqual(this))
            {
                return false;
            }
            String s = getName();
            String s1 = ((LocationFavorite) (obj)).getName();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            if (Double.compare(getLatitude(), ((LocationFavorite) (obj)).getLatitude()) != 0)
            {
                return false;
            }
            if (Double.compare(getLongitude(), ((LocationFavorite) (obj)).getLongitude()) != 0)
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

    public String toString()
    {
        return (new StringBuilder("LocationFavorite(name=")).append(getName()).append(", latitude=").append(getLatitude()).append(", longitude=").append(getLongitude()).append(")").toString();
    }
}
