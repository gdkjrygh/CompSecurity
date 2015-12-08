// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.system.ILyftSystemRepository;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateSystemJob

public final class tory extends Binding
    implements MembersInjector
{

    private Binding lyftSystemRepository;

    public void attach(Linker linker)
    {
        lyftSystemRepository = linker.requestBinding("me.lyft.android.application.system.ILyftSystemRepository", me/lyft/android/jobs/UpdateSystemJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftSystemRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateSystemJob)obj);
    }

    public void injectMembers(UpdateSystemJob updatesystemjob)
    {
        updatesystemjob.lyftSystemRepository = (ILyftSystemRepository)lyftSystemRepository.get();
    }

    public tory()
    {
        super(null, "members/me.lyft.android.jobs.UpdateSystemJob", false, me/lyft/android/jobs/UpdateSystemJob);
    }
}
