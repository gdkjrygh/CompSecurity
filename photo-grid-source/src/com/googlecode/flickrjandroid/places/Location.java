// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.places;


// Referenced classes of package com.googlecode.flickrjandroid.places:
//            Place

public class Location
{

    private static final long serialVersionUID = 12L;
    private Place country;
    private Place county;
    private double latitude;
    private Place locality;
    private double longitude;
    private String placeId;
    private int placeType;
    private String placeUrl;
    private Place region;
    private String woeId;

    public Location()
    {
        woeId = "";
        placeId = "";
        placeUrl = "";
        locality = null;
        county = null;
        region = null;
        country = null;
        latitude = 0.0D;
        longitude = 0.0D;
        placeType = 0;
    }

    public Place getCountry()
    {
        return country;
    }

    public Place getCounty()
    {
        return county;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public Place getLocality()
    {
        return locality;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public int getPlaceType()
    {
        return placeType;
    }

    public String getPlaceUrl()
    {
        return placeUrl;
    }

    public Place getRegion()
    {
        return region;
    }

    public String getWoeId()
    {
        return woeId;
    }

    public void setCountry(Place place)
    {
        country = place;
    }

    public void setCounty(Place place)
    {
        county = place;
    }

    public void setLatitude(double d)
    {
        latitude = d;
    }

    public void setLatitude(String s)
    {
        try
        {
            setLatitude(Double.parseDouble(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setLocality(Place place)
    {
        locality = place;
    }

    public void setLongitude(double d)
    {
        longitude = d;
    }

    public void setLongitude(String s)
    {
        try
        {
            setLongitude(Double.parseDouble(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setPlaceId(String s)
    {
        placeId = s;
    }

    public void setPlaceType(int i)
    {
        placeType = i;
    }

    public void setPlaceUrl(String s)
    {
        placeUrl = s;
    }

    public void setRegion(Place place)
    {
        region = place;
    }

    public void setWoeId(String s)
    {
        woeId = s;
    }
}
