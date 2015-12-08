// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ridehistory;

import java.util.List;
import me.lyft.android.domain.payment.Money;

public class PassengerRideHistoryDetailsDTO
{

    public final int distance;
    public final String driverName;
    public final String driverPhotoUrl;
    public final int driverRating;
    public final String dropoffAddress;
    public final long dropoffTimestamp;
    public final String generatedAt;
    public final String mapImageUrl;
    public final List paymentBreakdownItems;
    public final String pickupAddress;
    public final long pickupTimestamp;
    public final String region;
    public final String rideId;
    public final String rideType;
    public final String rideTypeLabel;
    public final long timestamp;
    public final String timezone;
    public final Money totalMoney;

    public PassengerRideHistoryDetailsDTO(String s, String s1, int i, int j, String s2, String s3, String s4, 
            String s5, long l, long l1, String s6, String s7, 
            String s8, Money money, String s9, long l2, String s10, List list)
    {
        rideId = s;
        mapImageUrl = s1;
        driverRating = i;
        distance = j;
        rideType = s2;
        rideTypeLabel = s3;
        pickupAddress = s4;
        dropoffAddress = s5;
        pickupTimestamp = l;
        dropoffTimestamp = l1;
        timezone = s6;
        driverPhotoUrl = s7;
        driverName = s8;
        totalMoney = money;
        generatedAt = s9;
        timestamp = l2;
        region = s10;
        paymentBreakdownItems = list;
    }
}
