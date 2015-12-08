// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory;


public class PassengerRideHistoryItem
{

    private String distanceMiles;
    private String driverPhotoUrl;
    private String id;
    private String pickupTime;
    private String rideDuration;
    private String rideTypeLabel;
    private String totalMoney;

    public PassengerRideHistoryItem()
    {
    }

    public PassengerRideHistoryItem(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        id = s;
        driverPhotoUrl = s1;
        totalMoney = s2;
        distanceMiles = s3;
        rideDuration = s4;
        pickupTime = s5;
        rideTypeLabel = s6;
    }

    public String getDistance()
    {
        return distanceMiles;
    }

    public String getDriverPhotoUrl()
    {
        return driverPhotoUrl;
    }

    public String getId()
    {
        return id;
    }

    public String getPickupTime()
    {
        return pickupTime;
    }

    public String getRideDuration()
    {
        return rideDuration;
    }

    public String getRideTypeLabel()
    {
        return rideTypeLabel;
    }

    public String getTotalMoney()
    {
        return totalMoney;
    }

    void setDistanceMiles(String s)
    {
        distanceMiles = s;
    }

    void setDriverPhotoUrl(String s)
    {
        driverPhotoUrl = s;
    }

    void setId(String s)
    {
        id = s;
    }

    void setPickupTime(String s)
    {
        pickupTime = s;
    }

    void setRideDuration(String s)
    {
        rideDuration = s;
    }

    void setRideTypeLabel(String s)
    {
        rideTypeLabel = s;
    }

    void setTotalMoney(String s)
    {
        totalMoney = s;
    }
}
