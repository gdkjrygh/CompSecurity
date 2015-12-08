// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.geo.IEtaRepository;

// Referenced classes of package me.lyft.android.jobs:
//            EtaUpdateJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding etaRepository;

    public void attach(Linker linker)
    {
        etaRepository = linker.requestBinding("me.lyft.android.application.geo.IEtaRepository", me/lyft/android/jobs/EtaUpdateJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(etaRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EtaUpdateJob)obj);
    }

    public void injectMembers(EtaUpdateJob etaupdatejob)
    {
        etaupdatejob.etaRepository = (IEtaRepository)etaRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.EtaUpdateJob", false, me/lyft/android/jobs/EtaUpdateJob);
    }
}
