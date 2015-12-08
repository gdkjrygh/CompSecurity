// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateSplitFareStateJob

public final class ory extends Binding
    implements MembersInjector
{

    private Binding splitFareService;
    private Binding splitFareStateRepository;

    public void attach(Linker linker)
    {
        splitFareStateRepository = linker.requestBinding("me.lyft.android.application.splitfare.ISplitFareStateRepository", me/lyft/android/jobs/UpdateSplitFareStateJob, getClass().getClassLoader());
        splitFareService = linker.requestBinding("me.lyft.android.infrastructure.splitfare.ISplitFareService", me/lyft/android/jobs/UpdateSplitFareStateJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(splitFareStateRepository);
        set1.add(splitFareService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateSplitFareStateJob)obj);
    }

    public void injectMembers(UpdateSplitFareStateJob updatesplitfarestatejob)
    {
        updatesplitfarestatejob.splitFareStateRepository = (ISplitFareStateRepository)splitFareStateRepository.get();
        updatesplitfarestatejob.splitFareService = (ISplitFareService)splitFareService.get();
    }

    public ory()
    {
        super(null, "members/me.lyft.android.jobs.UpdateSplitFareStateJob", false, me/lyft/android/jobs/UpdateSplitFareStateJob);
    }
}
