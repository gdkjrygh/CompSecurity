// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.fragment.FragmentFactory;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListActivity

public final class ctivity
    implements MembersInjector
{

    private Binding analyticsUtil;
    private Binding eventBus;
    private Binding fragmentFactory;
    private Binding fullScreenSpinnerManager;
    private com.google.android.apps.wallet.base.activity.bers nextInjectableAncestor;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.ttach(linker);
        fragmentFactory = linker.requestBinding("com.google.android.apps.wallet.fragment.FragmentFactory", com/google/android/apps/wallet/wobs/WobListActivity, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/wobs/WobListActivity, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/wobs/WobListActivity, getClass().getClassLoader());
        fullScreenSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/wobs/WobListActivity, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/wobs/WobListActivity, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(fragmentFactory);
        set1.add(eventBus);
        set1.add(analyticsUtil);
        set1.add(fullScreenSpinnerManager);
        set1.add(uriRegistry);
        nextInjectableAncestor.etDependencies(null, set1);
    }

    public final void injectMembers(WobListActivity woblistactivity)
    {
        woblistactivity.fragmentFactory = (FragmentFactory)fragmentFactory.get();
        woblistactivity.eventBus = (EventBus)eventBus.get();
        woblistactivity.analyticsUtil = (AnalyticsUtil)analyticsUtil.get();
        woblistactivity.fullScreenSpinnerManager = (FullScreenProgressSpinnerManager)fullScreenSpinnerManager.get();
        woblistactivity.uriRegistry = (UriRegistry)uriRegistry.get();
        nextInjectableAncestor.njectMembers(woblistactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WobListActivity)obj);
    }

    public ctivity()
    {
        nextInjectableAncestor = new com.google.android.apps.wallet.base.activity.init>();
    }
}
