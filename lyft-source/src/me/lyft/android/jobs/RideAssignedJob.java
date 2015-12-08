// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class RideAssignedJob
    implements Job
{

    private final RideDTO currentRide;
    ILyftPreferences preferences;
    private final RideDTO previousRide;

    public RideAssignedJob(RideDTO ridedto, RideDTO ridedto1)
    {
        previousRide = ridedto;
        currentRide = ridedto1;
    }

    public void execute()
    {
        if (!Objects.equals(Objects.firstNonNull(previousRide.getId(), ""), Objects.firstNonNull(currentRide.getId(), "")))
        {
            preferences.resetRideFlags();
        }
    }
}
