// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IAppInfoService;

// Referenced classes of package me.lyft.android.jobs:
//            LoadAppInfoJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding appInfoService;

    public void attach(Linker linker)
    {
        appInfoService = linker.requestBinding("me.lyft.android.application.IAppInfoService", me/lyft/android/jobs/LoadAppInfoJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appInfoService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((LoadAppInfoJob)obj);
    }

    public void injectMembers(LoadAppInfoJob loadappinfojob)
    {
        loadappinfojob.appInfoService = (IAppInfoService)appInfoService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.LoadAppInfoJob", false, me/lyft/android/jobs/LoadAppInfoJob);
    }
}
