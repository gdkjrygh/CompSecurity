// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.LyftApplication;
import me.lyft.android.infrastructure.location.ILocationService;

// Referenced classes of package me.lyft.android.jobs:
//            ThreatMetrixJob

public final class vice extends Binding
    implements MembersInjector
{

    private Binding locationService;
    private Binding lyftApplication;

    public void attach(Linker linker)
    {
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/jobs/ThreatMetrixJob, getClass().getClassLoader());
        lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/jobs/ThreatMetrixJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(locationService);
        set1.add(lyftApplication);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ThreatMetrixJob)obj);
    }

    public void injectMembers(ThreatMetrixJob threatmetrixjob)
    {
        threatmetrixjob.locationService = (ILocationService)locationService.get();
        threatmetrixjob.lyftApplication = (LyftApplication)lyftApplication.get();
    }

    public vice()
    {
        super(null, "members/me.lyft.android.jobs.ThreatMetrixJob", false, me/lyft/android/jobs/ThreatMetrixJob);
    }
}
