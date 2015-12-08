// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ridehistory;

import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;

public class PassengerRideHistoryItemDTO
{

    public final int distance;
    public final String driverFirstName;
    public final String driverPhotoUrl;
    public final long dropoffTimestamp;
    public final long pickupTimestamp;
    public final String rideId;
    public final String rideType;
    public final String rideTypeLabel;
    public final String timezone;
    public final MoneyDTO totalMoney;

    public PassengerRideHistoryItemDTO(String s, String s1, String s2, MoneyDTO moneydto, int i, long l, 
            long l1, String s3, String s4, String s5)
    {
        rideId = s;
        driverFirstName = s1;
        driverPhotoUrl = s2;
        totalMoney = moneydto;
        distance = i;
        pickupTimestamp = l;
        dropoffTimestamp = l1;
        timezone = s3;
        rideType = s4;
        rideTypeLabel = s5;
    }
}
