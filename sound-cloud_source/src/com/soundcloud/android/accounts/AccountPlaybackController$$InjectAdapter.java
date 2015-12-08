// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import com.soundcloud.android.ServiceInitiator;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.accounts:
//            AccountPlaybackController, AccountOperations

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b serviceInitiator;
    private b supertype;

    public final void attach(l l1)
    {
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/accounts/AccountPlaybackController, getClass().getClassLoader());
        serviceInitiator = l1.a("com.soundcloud.android.ServiceInitiator", com/soundcloud/android/accounts/AccountPlaybackController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/accounts/AccountPlaybackController, getClass().getClassLoader(), false);
    }

    public final AccountPlaybackController get()
    {
        AccountPlaybackController accountplaybackcontroller = new AccountPlaybackController((AccountOperations)accountOperations.get(), (ServiceInitiator)serviceInitiator.get());
        injectMembers(accountplaybackcontroller);
        return accountplaybackcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(accountOperations);
        set.add(serviceInitiator);
        set1.add(supertype);
    }

    public final void injectMembers(AccountPlaybackController accountplaybackcontroller)
    {
        supertype.injectMembers(accountplaybackcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AccountPlaybackController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.accounts.AccountPlaybackController", "members/com.soundcloud.android.accounts.AccountPlaybackController", false, com/soundcloud/android/accounts/AccountPlaybackController);
    }
}
