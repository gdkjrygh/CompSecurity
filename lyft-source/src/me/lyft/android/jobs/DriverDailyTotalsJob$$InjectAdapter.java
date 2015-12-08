// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.driver.IDailyTotalsRepository;

// Referenced classes of package me.lyft.android.jobs:
//            DriverDailyTotalsJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding dailyTotalsRepository;

    public void attach(Linker linker)
    {
        dailyTotalsRepository = linker.requestBinding("me.lyft.android.application.driver.IDailyTotalsRepository", me/lyft/android/jobs/DriverDailyTotalsJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dailyTotalsRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverDailyTotalsJob)obj);
    }

    public void injectMembers(DriverDailyTotalsJob driverdailytotalsjob)
    {
        driverdailytotalsjob.dailyTotalsRepository = (IDailyTotalsRepository)dailyTotalsRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.DriverDailyTotalsJob", false, me/lyft/android/jobs/DriverDailyTotalsJob);
    }
}
