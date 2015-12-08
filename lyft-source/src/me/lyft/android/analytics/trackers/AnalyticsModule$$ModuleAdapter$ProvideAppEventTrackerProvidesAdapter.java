// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import com.google.gson.Gson;
import com.kochava.android.tracker.Feature;
import com.mobileapptracker.MobileAppTracker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.providers.AdvertisingIdProvider;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule, AppEventTracker

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding advertisingIdProvider;
    private Binding device;
    private Binding etaAnalyticService;
    private Binding feature;
    private Binding gson;
    private Binding lyftPreferences;
    private Binding lyftSystemRepository;
    private Binding mobileAppTracker;
    private final AnalyticsModule module;
    private Binding rideRequestSession;
    private Binding userSession;

    public void attach(Linker linker)
    {
        etaAnalyticService = linker.requestBinding("me.lyft.android.application.geo.IEtaAnalyticService", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        feature = linker.requestBinding("com.kochava.android.tracker.Feature", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        mobileAppTracker = linker.requestBinding("com.mobileapptracker.MobileAppTracker", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        advertisingIdProvider = linker.requestBinding("me.lyft.android.providers.AdvertisingIdProvider", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
        lyftSystemRepository = linker.requestBinding("me.lyft.android.application.system.ILyftSystemRepository", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public AppEventTracker get()
    {
        return module.provideAppEventTracker((IEtaAnalyticService)etaAnalyticService.get(), (Feature)feature.get(), (MobileAppTracker)mobileAppTracker.get(), (IUserSession)userSession.get(), (Gson)gson.get(), (IDevice)device.get(), (ILyftPreferences)lyftPreferences.get(), (AdvertisingIdProvider)advertisingIdProvider.get(), (IRideRequestSession)rideRequestSession.get(), (ILyftSystemRepository)lyftSystemRepository.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(etaAnalyticService);
        set.add(feature);
        set.add(mobileAppTracker);
        set.add(userSession);
        set.add(gson);
        set.add(device);
        set.add(lyftPreferences);
        set.add(advertisingIdProvider);
        set.add(rideRequestSession);
        set.add(lyftSystemRepository);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("me.lyft.android.analytics.trackers.AppEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideAppEventTracker");
        module = analyticsmodule;
        setLibrary(true);
    }
}
