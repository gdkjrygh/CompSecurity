// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import android.content.res.Resources;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.RideFlags;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.ui.MainActivity;
import me.lyft.android.utils.TextToSpeech;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class DriverCloseToCurrentStopJob
    implements Job
{

    IAppForegroundDetector appForegroundDetector;
    LyftApplication application;
    IConstantsProvider constantsProvider;
    ILocationService locationService;
    ILyftPreferences lyftPreferences;
    IDriverRideProvider routeProvider;
    TextToSpeech textToSpeech;

    public DriverCloseToCurrentStopJob()
    {
    }

    private boolean shouldAutoSwitchBackToApp(Location location, Location location1)
    {
        boolean flag;
        if (location != null && location1 != null && location1.distanceTo(location) < (double)constantsProvider.getConstants().getAutoRestoreDistanceThreshold().longValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return routeProvider.getDriverRide().getCurrentStop().isPickup() && flag;
    }

    private void speakCloseToStop()
    {
        String s = routeProvider.getDriverRide().getCurrentPassenger().getFirstName();
        if (!Strings.isNullOrEmpty(s))
        {
            s = application.getResources().getString(0x7f07006a, new Object[] {
                s
            });
        } else
        {
            s = application.getResources().getString(0x7f070069);
        }
        textToSpeech.speak(s);
    }

    public void execute()
    {
        RideFlags rideflags;
        for (rideflags = lyftPreferences.getRideFlags(); !routeProvider.getDriverRide().isInProgress() || rideflags.hasAutoSwitchedBack() || !shouldAutoSwitchBackToApp(routeProvider.getDriverRide().getCurrentStop().getLocation(), locationService.getLastCachedLocation());)
        {
            return;
        }

        if (!appForegroundDetector.isForegrounded())
        {
            MainActivity.startActivity(application);
        }
        speakCloseToStop();
        rideflags.setHasAutoSwitchedback(true);
        lyftPreferences.setRideFlags(rideflags);
    }
}
