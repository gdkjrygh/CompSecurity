// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.ride.IRideRequestSession;

// Referenced classes of package me.lyft.android.jobs:
//            PrefillLocationJob

public final class  extends Binding
    implements MembersInjector
{

    private Binding rideRequestSession;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/jobs/PrefillLocationJob, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/jobs/PrefillLocationJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(rideRequestSession);
        set1.add(userProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PrefillLocationJob)obj);
    }

    public void injectMembers(PrefillLocationJob prefilllocationjob)
    {
        prefilllocationjob.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        prefilllocationjob.userProvider = (IUserProvider)userProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.jobs.PrefillLocationJob", false, me/lyft/android/jobs/PrefillLocationJob);
    }
}
