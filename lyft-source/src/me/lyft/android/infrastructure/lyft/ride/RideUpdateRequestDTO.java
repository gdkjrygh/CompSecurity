// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import java.util.List;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class RideUpdateRequestDTO
{

    public final Boolean concurEnabled;
    public final String driverFeedback;
    public final String driverImprovementAreas;
    public final Integer driverRating;
    public final LocationDTO dropoffLocation;
    public final String expenseCode;
    public final String expenseNote;
    public final Object fare;
    public final String fixedFareToken;
    public final List payments;

    public RideUpdateRequestDTO(List list, LocationDTO locationdto, Integer integer, String s, String s1, Boolean boolean1, String s2, 
            String s3, Object obj, String s4)
    {
        payments = list;
        dropoffLocation = locationdto;
        driverRating = integer;
        driverFeedback = s;
        driverImprovementAreas = s1;
        concurEnabled = boolean1;
        expenseNote = s2;
        expenseCode = s3;
        fare = obj;
        fixedFareToken = s4;
    }
}
