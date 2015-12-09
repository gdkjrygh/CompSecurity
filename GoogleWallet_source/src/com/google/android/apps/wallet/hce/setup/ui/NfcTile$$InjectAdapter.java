// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.hce.util.HceUtil;
import com.google.android.apps.wallet.log.SLog;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.ui:
//            NfcTile

public final class  extends Binding
    implements Provider
{

    private Binding analyticsUtil;
    private Binding context;
    private Binding eventBus;
    private Binding featureManager;
    private Binding hceUtil;
    private Binding sharedPreferences;
    private Binding slog;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/hce/setup/ui/NfcTile, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/hce/setup/ui/NfcTile, getClass().getClassLoader());
        hceUtil = linker.requestBinding("com.google.android.apps.wallet.hce.util.HceUtil", com/google/android/apps/wallet/hce/setup/ui/NfcTile, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/hce/setup/ui/NfcTile, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/hce/setup/ui/NfcTile, getClass().getClassLoader());
        slog = linker.requestBinding("com.google.android.apps.wallet.log.SLog", com/google/android/apps/wallet/hce/setup/ui/NfcTile, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/hce/setup/ui/NfcTile, getClass().getClassLoader());
    }

    public final NfcTile get()
    {
        return new NfcTile((Activity)context.get(), (EventBus)eventBus.get(), (HceUtil)hceUtil.get(), (FeatureManager)featureManager.get(), (AnalyticsUtil)analyticsUtil.get(), (SLog)slog.get(), (SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(eventBus);
        set.add(hceUtil);
        set.add(featureManager);
        set.add(analyticsUtil);
        set.add(slog);
        set.add(sharedPreferences);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.setup.ui.NfcTile", "members/com.google.android.apps.wallet.hce.setup.ui.NfcTile", false, com/google/android/apps/wallet/hce/setup/ui/NfcTile);
    }
}
