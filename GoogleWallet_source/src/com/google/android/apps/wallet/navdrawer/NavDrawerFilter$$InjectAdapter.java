// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.app.Activity;
import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFilter, NavDrawerFragment

public final class  extends Binding
    implements Provider
{

    private Binding eventBus;
    private Binding navDrawerFragment;
    private Binding walletActivity;

    public final void attach(Linker linker)
    {
        walletActivity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/navdrawer/NavDrawerFilter, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/navdrawer/NavDrawerFilter, getClass().getClassLoader());
        navDrawerFragment = linker.requestBinding("com.google.android.apps.wallet.navdrawer.NavDrawerFragment", com/google/android/apps/wallet/navdrawer/NavDrawerFilter, getClass().getClassLoader());
    }

    public final NavDrawerFilter get()
    {
        return new NavDrawerFilter((Activity)walletActivity.get(), (EventBus)eventBus.get(), (NavDrawerFragment)navDrawerFragment.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(walletActivity);
        set.add(eventBus);
        set.add(navDrawerFragment);
    }

    public ()
    {
        super("com.google.android.apps.wallet.navdrawer.NavDrawerFilter", "members/com.google.android.apps.wallet.navdrawer.NavDrawerFilter", false, com/google/android/apps/wallet/navdrawer/NavDrawerFilter);
    }
}
