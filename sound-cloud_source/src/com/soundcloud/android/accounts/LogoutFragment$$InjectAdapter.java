// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.accounts:
//            LogoutFragment, AccountOperations

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b eventBus;
    private b featureOperations;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/accounts/LogoutFragment, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/accounts/LogoutFragment, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/accounts/LogoutFragment, getClass().getClassLoader());
    }

    public final LogoutFragment get()
    {
        LogoutFragment logoutfragment = new LogoutFragment();
        injectMembers(logoutfragment);
        return logoutfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
        set1.add(accountOperations);
        set1.add(featureOperations);
    }

    public final void injectMembers(LogoutFragment logoutfragment)
    {
        logoutfragment.eventBus = (EventBus)eventBus.get();
        logoutfragment.accountOperations = (AccountOperations)accountOperations.get();
        logoutfragment.featureOperations = (FeatureOperations)featureOperations.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LogoutFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.accounts.LogoutFragment", "members/com.soundcloud.android.accounts.LogoutFragment", false, com/soundcloud/android/accounts/LogoutFragment);
    }
}
