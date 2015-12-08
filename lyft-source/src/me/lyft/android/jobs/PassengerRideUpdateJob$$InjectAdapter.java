// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.ICancellationOptionsProvider;

// Referenced classes of package me.lyft.android.jobs:
//            PassengerRideUpdateJob

public final class er extends Binding
    implements MembersInjector
{

    private Binding cancellationOptionsProvider;
    private Binding passengerRideProvider;

    public void attach(Linker linker)
    {
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/jobs/PassengerRideUpdateJob, getClass().getClassLoader());
        cancellationOptionsProvider = linker.requestBinding("me.lyft.android.application.ride.ICancellationOptionsProvider", me/lyft/android/jobs/PassengerRideUpdateJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(passengerRideProvider);
        set1.add(cancellationOptionsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRideUpdateJob)obj);
    }

    public void injectMembers(PassengerRideUpdateJob passengerrideupdatejob)
    {
        passengerrideupdatejob.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengerrideupdatejob.cancellationOptionsProvider = (ICancellationOptionsProvider)cancellationOptionsProvider.get();
    }

    public er()
    {
        super(null, "members/me.lyft.android.jobs.PassengerRideUpdateJob", false, me/lyft/android/jobs/PassengerRideUpdateJob);
    }
}
