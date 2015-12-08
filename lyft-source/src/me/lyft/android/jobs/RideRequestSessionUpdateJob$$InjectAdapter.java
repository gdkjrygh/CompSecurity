// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.location.ILocationService;

// Referenced classes of package me.lyft.android.jobs:
//            RideRequestSessionUpdateJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding locationService;
    private Binding rideRequestSession;

    public void attach(Linker linker)
    {
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/jobs/RideRequestSessionUpdateJob, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/jobs/RideRequestSessionUpdateJob, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/jobs/RideRequestSessionUpdateJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(rideRequestSession);
        set1.add(appFlow);
        set1.add(locationService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((RideRequestSessionUpdateJob)obj);
    }

    public void injectMembers(RideRequestSessionUpdateJob riderequestsessionupdatejob)
    {
        riderequestsessionupdatejob.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        riderequestsessionupdatejob.appFlow = (AppFlow)appFlow.get();
        riderequestsessionupdatejob.locationService = (ILocationService)locationService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.RideRequestSessionUpdateJob", false, me/lyft/android/jobs/RideRequestSessionUpdateJob);
    }
}
