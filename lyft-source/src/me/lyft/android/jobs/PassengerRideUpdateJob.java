// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.Collections;
import java.util.List;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.ICancellationOptionsProvider;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.passenger.PassengerRideMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRideDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class PassengerRideUpdateJob
    implements Job
{

    ICancellationOptionsProvider cancellationOptionsProvider;
    private final AppStateDTO currentAppState;
    IPassengerRideProvider passengerRideProvider;

    public PassengerRideUpdateJob(AppStateDTO appstatedto)
    {
        currentAppState = appstatedto;
    }

    public void execute()
    {
        cancellationOptionsProvider.updateCancellationOptions((List)Objects.firstNonNull(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getCancellationStatuses(), Collections.emptyList()));
        if (!"passenger".equalsIgnoreCase(((UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance())).getMode()))
        {
            return;
        }
        try
        {
            me.lyft.android.domain.passenger.PassengerRide passengerride = PassengerRideMapper.createPassengerRide((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance()), (UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance()));
            passengerRideProvider.updatePassengerRide(passengerride);
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "ride mapping failed", new Object[0]);
        }
    }
}
