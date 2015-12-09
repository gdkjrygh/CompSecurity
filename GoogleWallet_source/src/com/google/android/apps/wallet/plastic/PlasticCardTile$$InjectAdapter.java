// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardTile

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding analyticsUtil;
    private Binding dateAndTimeHelper;
    private Binding eventBus;
    private Binding featureManager;
    private Binding networkAccessChecker;
    private Binding sharedPreferences;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/plastic/PlasticCardTile, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/plastic/PlasticCardTile, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/plastic/PlasticCardTile, getClass().getClassLoader());
        networkAccessChecker = linker.requestBinding("com.google.android.apps.wallet.network.ui.NetworkAccessChecker", com/google/android/apps/wallet/plastic/PlasticCardTile, getClass().getClassLoader());
        dateAndTimeHelper = linker.requestBinding("com.google.android.apps.wallet.util.date.DateAndTimeHelper", com/google/android/apps/wallet/plastic/PlasticCardTile, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/plastic/PlasticCardTile, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/plastic/PlasticCardTile, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/plastic/PlasticCardTile, getClass().getClassLoader());
    }

    public final PlasticCardTile get()
    {
        return new PlasticCardTile((Activity)activity.get(), (EventBus)eventBus.get(), (FeatureManager)featureManager.get(), (NetworkAccessChecker)networkAccessChecker.get(), (DateAndTimeHelper)dateAndTimeHelper.get(), (SharedPreferences)sharedPreferences.get(), (UriRegistry)uriRegistry.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(eventBus);
        set.add(featureManager);
        set.add(networkAccessChecker);
        set.add(dateAndTimeHelper);
        set.add(sharedPreferences);
        set.add(uriRegistry);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.plastic.PlasticCardTile", "members/com.google.android.apps.wallet.plastic.PlasticCardTile", false, com/google/android/apps/wallet/plastic/PlasticCardTile);
    }
}
