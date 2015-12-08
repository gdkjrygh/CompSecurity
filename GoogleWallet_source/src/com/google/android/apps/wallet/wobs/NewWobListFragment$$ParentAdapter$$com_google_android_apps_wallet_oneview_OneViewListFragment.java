// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            NewWobListFragment

public final class it>
    implements MembersInjector
{

    private Binding networkAccessChecker;
    private injectMembers nextInjectableAncestor;
    private Binding spinnerManager;
    private Binding wobListAdapter;
    private Binding wobsManager;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.ach(linker);
        wobListAdapter = linker.requestBinding("com.google.android.apps.wallet.wobs.list.WoblListAdapter", com/google/android/apps/wallet/wobs/NewWobListFragment, getClass().getClassLoader());
        wobsManager = linker.requestBinding("com.google.android.apps.wallet.wobs.caching.WobsManager", com/google/android/apps/wallet/wobs/NewWobListFragment, getClass().getClassLoader());
        spinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/wobs/NewWobListFragment, getClass().getClassLoader());
        networkAccessChecker = linker.requestBinding("com.google.android.apps.wallet.network.ui.NetworkAccessChecker", com/google/android/apps/wallet/wobs/NewWobListFragment, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(wobListAdapter);
        set1.add(wobsManager);
        set1.add(spinnerManager);
        set1.add(networkAccessChecker);
        nextInjectableAncestor.Dependencies(null, set1);
    }

    public final void injectMembers(NewWobListFragment newwoblistfragment)
    {
        newwoblistfragment.wobListAdapter = (WoblListAdapter)wobListAdapter.get();
        newwoblistfragment.wobsManager = (WobsManager)wobsManager.get();
        newwoblistfragment.spinnerManager = (FullScreenProgressSpinnerManager)spinnerManager.get();
        newwoblistfragment.networkAccessChecker = (NetworkAccessChecker)networkAccessChecker.get();
        nextInjectableAncestor.ectMembers(newwoblistfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((NewWobListFragment)obj);
    }

    public ()
    {
        nextInjectableAncestor = new it>();
    }
}
