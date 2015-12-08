// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.places;


public class Place
{

    public static final int TYPE_CONTINENT = 29;
    public static final int TYPE_COUNTRY = 12;
    public static final int TYPE_COUNTY = 9;
    public static final int TYPE_LOCALITY = 7;
    public static final int TYPE_NEIGHBOURHOOD = 22;
    public static final int TYPE_REGION = 8;
    public static final int TYPE_UNSET = 0;
    private static final long serialVersionUID = 12L;
    private double latitude;
    private double longitude;
    private String name;
    private int photoCount;
    private String placeId;
    private int placeType;
    private String placeUrl;
    private String woeId;

    public Place()
    {
        name = "";
        placeId = "";
        woeId = "";
        latitude = 0.0D;
        longitude = 0.0D;
        placeUrl = "";
        placeType = 0;
        photoCount = 0;
    }

    public Place(String s, String s1)
    {
        name = "";
        placeId = "";
        woeId = "";
        latitude = 0.0D;
        longitude = 0.0D;
        placeUrl = "";
        placeType = 0;
        photoCount = 0;
        name = s1;
        placeId = s;
    }

    public Place(String s, String s1, int i)
    {
        name = "";
        placeId = "";
        woeId = "";
        latitude = 0.0D;
        longitude = 0.0D;
        placeUrl = "";
        placeType = 0;
        photoCount = 0;
        name = s1;
        placeId = s;
        placeType = i;
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

    public int getPhotoCount()
    {
        return photoCount;
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

    public String getWoeId()
    {
        return woeId;
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

    public void setName(String s)
    {
        name = s;
    }

    public void setPhotoCount(int i)
    {
        photoCount = i;
    }

    public void setPhotoCount(String s)
    {
        try
        {
            setPhotoCount(Integer.parseInt(s));
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

    public void setPlaceType(String s)
    {
        try
        {
            setPlaceType(Integer.parseInt(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setPlaceUrl(String s)
    {
        placeUrl = s;
    }

    public void setWoeId(String s)
    {
        woeId = s;
    }
}
