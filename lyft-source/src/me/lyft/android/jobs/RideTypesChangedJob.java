// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.domain.ride.RideTypeMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class RideTypesChangedJob
    implements Job
{

    private final AppStateDTO currentAppState;
    IRequestRideTypeProvider rideTypeUpdater;

    public RideTypesChangedJob(AppStateDTO appstatedto)
    {
        currentAppState = appstatedto;
    }

    public void execute()
    {
        if (currentAppState.getRideTypes() == null)
        {
            return;
        } else
        {
            rideTypeUpdater.updateRideTypes(RideTypeMapper.fromRideTypeDTOs(currentAppState.getRideTypes()));
            return;
        }
    }
}
