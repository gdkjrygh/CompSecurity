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
//            RideAssignedJob

public final class _cls9 extends Binding
    implements MembersInjector
{

    private Binding preferences;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/RideAssignedJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(preferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((RideAssignedJob)obj);
    }

    public void injectMembers(RideAssignedJob rideassignedjob)
    {
        rideassignedjob.preferences = (ILyftPreferences)preferences.get();
    }

    public _cls9()
    {
        super(null, "members/me.lyft.android.jobs.RideAssignedJob", false, me/lyft/android/jobs/RideAssignedJob);
    }
}
