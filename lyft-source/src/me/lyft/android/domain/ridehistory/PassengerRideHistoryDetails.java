// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory;

import java.util.List;

public class PassengerRideHistoryDetails
{

    private String distance;
    private String driverName;
    private String driverPhotoUrl;
    private int driverRating;
    private String dropoffAddress;
    private String dropoffTime;
    private String duration;
    private String mapImageUrl;
    private List paymentsBreakdown;
    private String pickupAddress;
    private String pickupDateTime;
    private String pickupTime;
    private String region;
    private String rideTotal;
    private String rideTypeLabel;

    public PassengerRideHistoryDetails(String s, int i, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, String s12, 
            List list)
    {
        mapImageUrl = s;
        driverRating = i;
        distance = s1;
        duration = s2;
        rideTypeLabel = s3;
        pickupAddress = s4;
        dropoffAddress = s5;
        pickupTime = s6;
        dropoffTime = s7;
        pickupDateTime = s8;
        driverPhotoUrl = s9;
        driverName = s10;
        rideTotal = s11;
        region = s12;
        paymentsBreakdown = list;
    }

    public String getDistance()
    {
        return distance;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public String getDriverPhotoUrl()
    {
        return driverPhotoUrl;
    }

    public int getDriverRating()
    {
        return driverRating;
    }

    public String getDropoffAddress()
    {
        return dropoffAddress;
    }

    public String getDropoffTime()
    {
        return dropoffTime;
    }

    public String getDuration()
    {
        return duration;
    }

    public String getMapImageUrl()
    {
        return mapImageUrl;
    }

    public List getPaymentsBreakdown()
    {
        return paymentsBreakdown;
    }

    public String getPickupAddress()
    {
        return pickupAddress;
    }

    public String getPickupDateTime()
    {
        return pickupDateTime;
    }

    public String getPickupTime()
    {
        return pickupTime;
    }

    public String getRegion()
    {
        return region;
    }

    public String getRideTotal()
    {
        return rideTotal;
    }

    public String getRideTypeLabel()
    {
        return rideTypeLabel;
    }
}
