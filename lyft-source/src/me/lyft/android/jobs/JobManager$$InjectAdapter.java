// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.jobs:
//            JobManager

public final class  extends Binding
    implements Provider
{

    private Binding application;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/jobs/JobManager, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public JobManager get()
    {
        return new JobManager((LyftApplication)application.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public ()
    {
        super("me.lyft.android.jobs.JobManager", "members/me.lyft.android.jobs.JobManager", true, me/lyft/android/jobs/JobManager);
    }
}
