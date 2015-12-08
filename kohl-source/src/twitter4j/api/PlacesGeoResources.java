// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.GeoLocation;
import twitter4j.GeoQuery;
import twitter4j.Place;
import twitter4j.ResponseList;
import twitter4j.SimilarPlaces;
import twitter4j.TwitterException;

public interface PlacesGeoResources
{

    public abstract Place createPlace(String s, String s1, String s2, GeoLocation geolocation, String s3)
        throws TwitterException;

    public abstract Place getGeoDetails(String s)
        throws TwitterException;

    public abstract SimilarPlaces getSimilarPlaces(GeoLocation geolocation, String s, String s1, String s2)
        throws TwitterException;

    public abstract ResponseList reverseGeoCode(GeoQuery geoquery)
        throws TwitterException;

    public abstract ResponseList searchPlaces(GeoQuery geoquery)
        throws TwitterException;
}
