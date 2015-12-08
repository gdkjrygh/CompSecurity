// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IRequestRideTypeProvider;

// Referenced classes of package me.lyft.android.jobs:
//            RideTypesChangedJob

public final class r extends Binding
    implements MembersInjector
{

    private Binding rideTypeUpdater;

    public void attach(Linker linker)
    {
        rideTypeUpdater = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/jobs/RideTypesChangedJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(rideTypeUpdater);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((RideTypesChangedJob)obj);
    }

    public void injectMembers(RideTypesChangedJob ridetypeschangedjob)
    {
        ridetypeschangedjob.rideTypeUpdater = (IRequestRideTypeProvider)rideTypeUpdater.get();
    }

    public r()
    {
        super(null, "members/me.lyft.android.jobs.RideTypesChangedJob", false, me/lyft/android/jobs/RideTypesChangedJob);
    }
}
