// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.utils.TextToSpeech;

// Referenced classes of package me.lyft.android.jobs:
//            DriverCloseToCurrentStopJob

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding appForegroundDetector;
    private Binding application;
    private Binding constantsProvider;
    private Binding locationService;
    private Binding lyftPreferences;
    private Binding routeProvider;
    private Binding textToSpeech;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/jobs/DriverCloseToCurrentStopJob, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/jobs/DriverCloseToCurrentStopJob, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/jobs/DriverCloseToCurrentStopJob, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/jobs/DriverCloseToCurrentStopJob, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/DriverCloseToCurrentStopJob, getClass().getClassLoader());
        textToSpeech = linker.requestBinding("me.lyft.android.utils.TextToSpeech", me/lyft/android/jobs/DriverCloseToCurrentStopJob, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/jobs/DriverCloseToCurrentStopJob, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public DriverCloseToCurrentStopJob get()
    {
        DriverCloseToCurrentStopJob driverclosetocurrentstopjob = new DriverCloseToCurrentStopJob();
        injectMembers(driverclosetocurrentstopjob);
        return driverclosetocurrentstopjob;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(application);
        set1.add(routeProvider);
        set1.add(constantsProvider);
        set1.add(locationService);
        set1.add(lyftPreferences);
        set1.add(textToSpeech);
        set1.add(appForegroundDetector);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverCloseToCurrentStopJob)obj);
    }

    public void injectMembers(DriverCloseToCurrentStopJob driverclosetocurrentstopjob)
    {
        driverclosetocurrentstopjob.application = (LyftApplication)application.get();
        driverclosetocurrentstopjob.routeProvider = (IDriverRideProvider)routeProvider.get();
        driverclosetocurrentstopjob.constantsProvider = (IConstantsProvider)constantsProvider.get();
        driverclosetocurrentstopjob.locationService = (ILocationService)locationService.get();
        driverclosetocurrentstopjob.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        driverclosetocurrentstopjob.textToSpeech = (TextToSpeech)textToSpeech.get();
        driverclosetocurrentstopjob.appForegroundDetector = (IAppForegroundDetector)appForegroundDetector.get();
    }

    public ()
    {
        super("me.lyft.android.jobs.DriverCloseToCurrentStopJob", "members/me.lyft.android.jobs.DriverCloseToCurrentStopJob", false, me/lyft/android/jobs/DriverCloseToCurrentStopJob);
    }
}
