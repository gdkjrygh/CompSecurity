// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.SharedPreferences;
import com.soundcloud.android.analytics.adjust.AdjustAnalyticsProvider;
import com.soundcloud.android.analytics.comscore.ComScoreAnalyticsProvider;
import com.soundcloud.android.analytics.crashlytics.FabricAnalyticsProvider;
import com.soundcloud.android.analytics.eventlogger.EventLoggerAnalyticsProvider;
import com.soundcloud.android.analytics.playcounts.PlayCountAnalyticsProvider;
import com.soundcloud.android.analytics.promoted.PromotedAnalyticsProvider;
import com.soundcloud.android.properties.FeatureFlags;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsProviderFactory, AnalyticsProperties

public final class  extends b
    implements Provider
{

    private b adjustAnalyticsProvider;
    private b analyticsProperties;
    private b appboyAnalyticsProvider;
    private b comScoreProvider;
    private b eventLoggerProvider;
    private b fabricAnalyticsProvider;
    private b featureFlags;
    private b playCountProvider;
    private b promotedProvider;
    private b sharedPreferences;

    public final void attach(l l1)
    {
        analyticsProperties = l1.a("com.soundcloud.android.analytics.AnalyticsProperties", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        sharedPreferences = l1.a("android.content.SharedPreferences", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        eventLoggerProvider = l1.a("com.soundcloud.android.analytics.eventlogger.EventLoggerAnalyticsProvider", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        playCountProvider = l1.a("com.soundcloud.android.analytics.playcounts.PlayCountAnalyticsProvider", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        appboyAnalyticsProvider = l1.a("javax.inject.Provider<com.soundcloud.android.analytics.appboy.AppboyAnalyticsProvider>", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        promotedProvider = l1.a("com.soundcloud.android.analytics.promoted.PromotedAnalyticsProvider", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        adjustAnalyticsProvider = l1.a("com.soundcloud.android.analytics.adjust.AdjustAnalyticsProvider", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        comScoreProvider = l1.a("com.soundcloud.android.analytics.comscore.ComScoreAnalyticsProvider", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
        fabricAnalyticsProvider = l1.a("com.soundcloud.android.analytics.crashlytics.FabricAnalyticsProvider", com/soundcloud/android/analytics/AnalyticsProviderFactory, getClass().getClassLoader());
    }

    public final AnalyticsProviderFactory get()
    {
        return new AnalyticsProviderFactory((AnalyticsProperties)analyticsProperties.get(), (SharedPreferences)sharedPreferences.get(), (FeatureFlags)featureFlags.get(), (EventLoggerAnalyticsProvider)eventLoggerProvider.get(), (PlayCountAnalyticsProvider)playCountProvider.get(), (Provider)appboyAnalyticsProvider.get(), (PromotedAnalyticsProvider)promotedProvider.get(), (AdjustAnalyticsProvider)adjustAnalyticsProvider.get(), (ComScoreAnalyticsProvider)comScoreProvider.get(), (FabricAnalyticsProvider)fabricAnalyticsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(analyticsProperties);
        set.add(sharedPreferences);
        set.add(featureFlags);
        set.add(eventLoggerProvider);
        set.add(playCountProvider);
        set.add(appboyAnalyticsProvider);
        set.add(promotedProvider);
        set.add(adjustAnalyticsProvider);
        set.add(comScoreProvider);
        set.add(fabricAnalyticsProvider);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.AnalyticsProviderFactory", "members/com.soundcloud.android.analytics.AnalyticsProviderFactory", false, com/soundcloud/android/analytics/AnalyticsProviderFactory);
    }
}
