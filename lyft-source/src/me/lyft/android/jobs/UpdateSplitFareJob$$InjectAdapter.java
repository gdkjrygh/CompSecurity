// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateSplitFareJob

public final class estRepository extends Binding
    implements MembersInjector
{

    private Binding splitFareRequestRepository;

    public void attach(Linker linker)
    {
        splitFareRequestRepository = linker.requestBinding("me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository", me/lyft/android/jobs/UpdateSplitFareJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(splitFareRequestRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateSplitFareJob)obj);
    }

    public void injectMembers(UpdateSplitFareJob updatesplitfarejob)
    {
        updatesplitfarejob.splitFareRequestRepository = (ISplitFareRequestRepository)splitFareRequestRepository.get();
    }

    public estRepository()
    {
        super(null, "members/me.lyft.android.jobs.UpdateSplitFareJob", false, me/lyft/android/jobs/UpdateSplitFareJob);
    }
}
