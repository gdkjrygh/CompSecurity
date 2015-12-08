// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;

// Referenced classes of package me.lyft.android.jobs:
//            UserModeChangeJob

public final class der extends Binding
    implements MembersInjector
{

    private Binding preferences;
    private Binding requestRideTypeProvider;
    private Binding rideRequestSession;

    public void attach(Linker linker)
    {
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/jobs/UserModeChangeJob, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/jobs/UserModeChangeJob, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/jobs/UserModeChangeJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(rideRequestSession);
        set1.add(requestRideTypeProvider);
        set1.add(preferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UserModeChangeJob)obj);
    }

    public void injectMembers(UserModeChangeJob usermodechangejob)
    {
        usermodechangejob.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        usermodechangejob.requestRideTypeProvider = (IRequestRideTypeProvider)requestRideTypeProvider.get();
        usermodechangejob.preferences = (ILyftPreferences)preferences.get();
    }

    public der()
    {
        super(null, "members/me.lyft.android.jobs.UserModeChangeJob", false, me/lyft/android/jobs/UserModeChangeJob);
    }
}
