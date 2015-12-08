// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.ride.RideFare;
import me.lyft.android.persistence.ISimpleStorage;

// Referenced classes of package me.lyft.android.application.ride:
//            IRideFareRepository

public class RideFareRepository
    implements IRideFareRepository
{

    private static final String KEY = "ride_fare";
    private RideFare rideFare;
    private final ISimpleStorage simpleStorage;

    public RideFareRepository(ISimpleStorage isimplestorage)
    {
        simpleStorage = isimplestorage;
        rideFare = (RideFare)isimplestorage.getOrDefault("ride_fare", me/lyft/android/domain/ride/RideFare, RideFare.empty());
    }

    public RideFare getFare()
    {
        return rideFare;
    }

    public void update(RideFare ridefare)
    {
        rideFare = ridefare;
        simpleStorage.put("ride_fare", ridefare);
    }
}
