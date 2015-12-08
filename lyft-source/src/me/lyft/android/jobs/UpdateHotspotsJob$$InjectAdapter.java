// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IHotspotRepository;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateHotspotsJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding hotspotRepository;

    public void attach(Linker linker)
    {
        hotspotRepository = linker.requestBinding("me.lyft.android.application.ride.IHotspotRepository", me/lyft/android/jobs/UpdateHotspotsJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(hotspotRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateHotspotsJob)obj);
    }

    public void injectMembers(UpdateHotspotsJob updatehotspotsjob)
    {
        updatehotspotsjob.hotspotRepository = (IHotspotRepository)hotspotRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.UpdateHotspotsJob", false, me/lyft/android/jobs/UpdateHotspotsJob);
    }
}
