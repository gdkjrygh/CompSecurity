// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule, AnalyticsApi, GoogleEventTracker, RedshiftEventTracker, 
//            AppEventTracker, LogEventTracker, LeanplumTracker, RealTimeEventTracker, 
//            AnalyticsService

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding analyticsApi;
    private Binding appEventTracker;
    private Binding device;
    private Binding googleTracker;
    private Binding leanplumTracker;
    private Binding logEventTracker;
    private Binding lyftPreferences;
    private final AnalyticsModule module;
    private Binding realTimeEventTracker;
    private Binding redshiftTracker;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        analyticsApi = linker.requestBinding("me.lyft.android.analytics.trackers.AnalyticsApi", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        googleTracker = linker.requestBinding("me.lyft.android.analytics.trackers.GoogleEventTracker", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        redshiftTracker = linker.requestBinding("me.lyft.android.analytics.trackers.RedshiftEventTracker", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        appEventTracker = linker.requestBinding("me.lyft.android.analytics.trackers.AppEventTracker", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        logEventTracker = linker.requestBinding("me.lyft.android.analytics.trackers.LogEventTracker", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        leanplumTracker = linker.requestBinding("me.lyft.android.analytics.trackers.LeanplumTracker", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        realTimeEventTracker = linker.requestBinding("me.lyft.android.analytics.trackers.RealTimeEventTracker", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public AnalyticsService get()
    {
        return module.provideAnalyticsInitializer((AnalyticsApi)analyticsApi.get(), (IDevice)device.get(), (IUserProvider)userProvider.get(), (GoogleEventTracker)googleTracker.get(), (RedshiftEventTracker)redshiftTracker.get(), (AppEventTracker)appEventTracker.get(), (LogEventTracker)logEventTracker.get(), (LeanplumTracker)leanplumTracker.get(), (RealTimeEventTracker)realTimeEventTracker.get(), (ILyftPreferences)lyftPreferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(analyticsApi);
        set.add(device);
        set.add(userProvider);
        set.add(googleTracker);
        set.add(redshiftTracker);
        set.add(appEventTracker);
        set.add(logEventTracker);
        set.add(leanplumTracker);
        set.add(realTimeEventTracker);
        set.add(lyftPreferences);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.trackers.AnalyticsService", true, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideAnalyticsInitializer");
        module = analyticsmodule;
        setLibrary(true);
    }
}
