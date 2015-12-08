// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.ui:
//            SetupNfcPaymentTile

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding analyticsUtil;
    private Binding eventBus;
    private Binding featureManager;
    private Binding networkAccessChecker;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/hce/setup/ui/SetupNfcPaymentTile, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/hce/setup/ui/SetupNfcPaymentTile, getClass().getClassLoader());
        networkAccessChecker = linker.requestBinding("com.google.android.apps.wallet.network.ui.NetworkAccessChecker", com/google/android/apps/wallet/hce/setup/ui/SetupNfcPaymentTile, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/hce/setup/ui/SetupNfcPaymentTile, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/hce/setup/ui/SetupNfcPaymentTile, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/hce/setup/ui/SetupNfcPaymentTile, getClass().getClassLoader());
    }

    public final SetupNfcPaymentTile get()
    {
        return new SetupNfcPaymentTile((Activity)activity.get(), (EventBus)eventBus.get(), (NetworkAccessChecker)networkAccessChecker.get(), (FeatureManager)featureManager.get(), (SharedPreferences)sharedPreferences.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(eventBus);
        set.add(networkAccessChecker);
        set.add(featureManager);
        set.add(sharedPreferences);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.setup.ui.SetupNfcPaymentTile", "members/com.google.android.apps.wallet.hce.setup.ui.SetupNfcPaymentTile", false, com/google/android/apps/wallet/hce/setup/ui/SetupNfcPaymentTile);
    }
}
