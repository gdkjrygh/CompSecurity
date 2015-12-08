// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.GeoLocation;
import twitter4j.TwitterException;

public interface TrendsResourcesAsync
{

    public abstract void getAvailableTrends();

    public abstract void getClosestTrends(GeoLocation geolocation)
        throws TwitterException;

    public abstract void getPlaceTrends(int i);
}
