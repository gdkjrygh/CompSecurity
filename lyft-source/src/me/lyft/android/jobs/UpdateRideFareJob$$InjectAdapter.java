// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRideFareRepository;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateRideFareJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding constantsProvider;
    private Binding rideFareRepository;

    public void attach(Linker linker)
    {
        rideFareRepository = linker.requestBinding("me.lyft.android.application.ride.IRideFareRepository", me/lyft/android/jobs/UpdateRideFareJob, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/jobs/UpdateRideFareJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(rideFareRepository);
        set1.add(constantsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateRideFareJob)obj);
    }

    public void injectMembers(UpdateRideFareJob updateridefarejob)
    {
        updateridefarejob.rideFareRepository = (IRideFareRepository)rideFareRepository.get();
        updateridefarejob.constantsProvider = (IConstantsProvider)constantsProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.UpdateRideFareJob", false, me/lyft/android/jobs/UpdateRideFareJob);
    }
}
