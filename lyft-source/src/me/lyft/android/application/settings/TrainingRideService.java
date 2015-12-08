// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import rx.Observable;

// Referenced classes of package me.lyft.android.application.settings:
//            ITrainingRideService

public class TrainingRideService
    implements ITrainingRideService
{

    private ILyftApi lyftApi;

    public TrainingRideService(ILyftApi ilyftapi)
    {
        lyftApi = ilyftapi;
    }

    public Observable startTrainingRide(Location location)
    {
        return lyftApi.startCouchRide(LocationMapper.fromLocationDomain(location)).map(Unit.func1());
    }
}
