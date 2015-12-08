// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UserModeChangeJob
    implements Job
{

    private final AppStateDTO currentAppState;
    ILyftPreferences preferences;
    private AppStateDTO previousAppState;
    IRequestRideTypeProvider requestRideTypeProvider;
    IRideRequestSession rideRequestSession;

    public UserModeChangeJob(AppStateDTO appstatedto, AppStateDTO appstatedto1)
    {
        previousAppState = appstatedto;
        currentAppState = appstatedto1;
    }

    private boolean changedToDriver()
    {
        return "passenger".equalsIgnoreCase(((UserDTO)Objects.firstNonNull(previousAppState.getUser(), NullUserDTO.getInstance())).getMode()) && "driver".equalsIgnoreCase(((UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance())).getMode());
    }

    private boolean changedToPassenger()
    {
        return "driver".equalsIgnoreCase(((UserDTO)Objects.firstNonNull(previousAppState.getUser(), NullUserDTO.getInstance())).getMode()) && "passenger".equalsIgnoreCase(((UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance())).getMode());
    }

    public void execute()
    {
        if (changedToDriver())
        {
            requestRideTypeProvider.clearDrivers();
            preferences.clearRideRequest();
        } else
        if (changedToPassenger())
        {
            rideRequestSession.resetCurrentRideType();
            preferences.clearRideRequest();
            return;
        }
    }
}
