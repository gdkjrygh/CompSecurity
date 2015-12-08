// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.driver.IVehicleProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;

// Referenced classes of package me.lyft.android.jobs:
//            UserUpdateJob

public final class sProvider extends Binding
    implements MembersInjector
{

    private Binding chargeAccountsProvider;
    private Binding userProvider;
    private Binding vehicleProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/jobs/UserUpdateJob, getClass().getClassLoader());
        vehicleProvider = linker.requestBinding("me.lyft.android.application.driver.IVehicleProvider", me/lyft/android/jobs/UserUpdateJob, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/jobs/UserUpdateJob, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userProvider);
        set1.add(vehicleProvider);
        set1.add(chargeAccountsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UserUpdateJob)obj);
    }

    public void injectMembers(UserUpdateJob userupdatejob)
    {
        userupdatejob.userProvider = (IUserProvider)userProvider.get();
        userupdatejob.vehicleProvider = (IVehicleProvider)vehicleProvider.get();
        userupdatejob.chargeAccountsProvider = (IChargeAccountsProvider)chargeAccountsProvider.get();
    }

    public sProvider()
    {
        super(null, "members/me.lyft.android.jobs.UserUpdateJob", false, me/lyft/android/jobs/UserUpdateJob);
    }
}
