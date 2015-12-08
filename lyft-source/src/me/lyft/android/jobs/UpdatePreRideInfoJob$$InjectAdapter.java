// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IPreRideInfoRepository;

// Referenced classes of package me.lyft.android.jobs:
//            UpdatePreRideInfoJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding preRideInfoRepository;

    public void attach(Linker linker)
    {
        preRideInfoRepository = linker.requestBinding("me.lyft.android.application.ride.IPreRideInfoRepository", me/lyft/android/jobs/UpdatePreRideInfoJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(preRideInfoRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdatePreRideInfoJob)obj);
    }

    public void injectMembers(UpdatePreRideInfoJob updateprerideinfojob)
    {
        updateprerideinfojob.preRideInfoRepository = (IPreRideInfoRepository)preRideInfoRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.UpdatePreRideInfoJob", false, me/lyft/android/jobs/UpdatePreRideInfoJob);
    }
}
