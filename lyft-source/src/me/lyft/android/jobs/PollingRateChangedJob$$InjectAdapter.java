// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.jobs:
//            PollingRateChangedJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding preferences;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/PollingRateChangedJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(preferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PollingRateChangedJob)obj);
    }

    public void injectMembers(PollingRateChangedJob pollingratechangedjob)
    {
        pollingratechangedjob.preferences = (ILyftPreferences)preferences.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.PollingRateChangedJob", false, me/lyft/android/jobs/PollingRateChangedJob);
    }
}
