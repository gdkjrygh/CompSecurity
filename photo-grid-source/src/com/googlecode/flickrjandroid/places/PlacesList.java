// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.places;

import com.googlecode.flickrjandroid.SearchResultList;

public class PlacesList extends SearchResultList
{

    private static final long serialVersionUID = 0xa1ff4987938e76ceL;
    private double latitude;
    private double longitude;

    public PlacesList()
    {
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public void setLatitude(double d)
    {
        latitude = d;
    }

    public void setLongitude(double d)
    {
        longitude = d;
    }
}
