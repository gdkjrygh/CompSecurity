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
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.session.AnalyticsSession;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule, AnalyticsApi, MixpanelWrapper

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding analyticsApi;
    private Binding analyticsSession;
    private Binding appForegroundDetector;
    private Binding device;
    private Binding locationService;
    private Binding lyftPreferences;
    private final AnalyticsModule module;
    private Binding userSession;

    public void attach(Linker linker)
    {
        analyticsApi = linker.requestBinding("me.lyft.android.analytics.trackers.AnalyticsApi", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        analyticsSession = linker.requestBinding("me.lyft.android.analytics.session.AnalyticsSession", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public MixpanelWrapper get()
    {
        return module.provideMixpanelWrapper((AnalyticsApi)analyticsApi.get(), (IUserSession)userSession.get(), (ILocationService)locationService.get(), (ILyftPreferences)lyftPreferences.get(), (IDevice)device.get(), (IAppForegroundDetector)appForegroundDetector.get(), (AnalyticsSession)analyticsSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(analyticsApi);
        set.add(userSession);
        set.add(locationService);
        set.add(lyftPreferences);
        set.add(device);
        set.add(appForegroundDetector);
        set.add(analyticsSession);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.trackers.MixpanelWrapper", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideMixpanelWrapper");
        module = analyticsmodule;
        setLibrary(true);
    }
}
