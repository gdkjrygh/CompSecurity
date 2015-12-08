// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (AnalyticsModule)obj);
    }

    public void getBindings(BindingsGroup bindingsgroup, AnalyticsModule analyticsmodule)
    {
        class ProvideAnalyticsApiProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding appContext;
            private Binding lyftPreferences;
            private final AnalyticsModule module;

            public void attach(Linker linker)
            {
                appContext = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public AnalyticsApi get()
            {
                return module.provideAnalyticsApi((LyftApplication)appContext.get(), (ILyftPreferences)lyftPreferences.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(appContext);
                set.add(lyftPreferences);
            }

            public ProvideAnalyticsApiProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.AnalyticsApi", true, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideAnalyticsApi");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.AnalyticsApi", new ProvideAnalyticsApiProvidesAdapter(analyticsmodule));
        class ProvideMixpanelWrapperProvidesAdapter extends ProvidesBinding
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

            public ProvideMixpanelWrapperProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.MixpanelWrapper", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideMixpanelWrapper");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.MixpanelWrapper", new ProvideMixpanelWrapperProvidesAdapter(analyticsmodule));
        class ProvideAnalyticsInitializerProvidesAdapter extends ProvidesBinding
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

            public ProvideAnalyticsInitializerProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.AnalyticsService", true, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideAnalyticsInitializer");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.AnalyticsService", new ProvideAnalyticsInitializerProvidesAdapter(analyticsmodule));
        class ProvideRedshiftEventTrackerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding mixpanelWrapper;
            private final AnalyticsModule module;

            public void attach(Linker linker)
            {
                mixpanelWrapper = linker.requestBinding("me.lyft.android.analytics.trackers.MixpanelWrapper", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public RedshiftEventTracker get()
            {
                return module.provideRedshiftEventTracker((MixpanelWrapper)mixpanelWrapper.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(mixpanelWrapper);
            }

            public ProvideRedshiftEventTrackerProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.RedshiftEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideRedshiftEventTracker");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.RedshiftEventTracker", new ProvideRedshiftEventTrackerProvidesAdapter(analyticsmodule));
        class ProvideAnalyticsSessionProviderProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding device;
            private Binding lyftPreferences;
            private final AnalyticsModule module;

            public void attach(Linker linker)
            {
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public AnalyticsSession get()
            {
                return module.provideAnalyticsSessionProvider((ILyftPreferences)lyftPreferences.get(), (IDevice)device.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftPreferences);
                set.add(device);
            }

            public ProvideAnalyticsSessionProviderProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.session.AnalyticsSession", true, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideAnalyticsSessionProvider");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.session.AnalyticsSession", new ProvideAnalyticsSessionProviderProvidesAdapter(analyticsmodule));
        class ProvideRedshiftEventTracker2ProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding analyticsApi;
            private Binding analyticsSession;
            private Binding appForegroundDetector;
            private Binding device;
            private Binding locationService;
            private Binding lyftPreferences;
            private final AnalyticsModule module;
            private Binding rideRequestSession;
            private Binding userProvider;
            private Binding userSession;

            public void attach(Linker linker)
            {
                analyticsApi = linker.requestBinding("me.lyft.android.analytics.trackers.AnalyticsApi", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                analyticsSession = linker.requestBinding("me.lyft.android.analytics.session.AnalyticsSession", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public RealTimeEventTracker get()
            {
                return module.provideRedshiftEventTracker2((AnalyticsApi)analyticsApi.get(), (AnalyticsSession)analyticsSession.get(), (ILyftPreferences)lyftPreferences.get(), (ILocationService)locationService.get(), (IUserProvider)userProvider.get(), (IRideRequestSession)rideRequestSession.get(), (IDevice)device.get(), (IAppForegroundDetector)appForegroundDetector.get(), (IUserSession)userSession.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(analyticsApi);
                set.add(analyticsSession);
                set.add(lyftPreferences);
                set.add(locationService);
                set.add(userProvider);
                set.add(rideRequestSession);
                set.add(device);
                set.add(appForegroundDetector);
                set.add(userSession);
            }

            public ProvideRedshiftEventTracker2ProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.RealTimeEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideRedshiftEventTracker2");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.RealTimeEventTracker", new ProvideRedshiftEventTracker2ProvidesAdapter(analyticsmodule));
        class ProvideAppEventTrackerProvidesAdapter extends ProvidesBinding
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

            public ProvideAppEventTrackerProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.AppEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideAppEventTracker");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.AppEventTracker", new ProvideAppEventTrackerProvidesAdapter(analyticsmodule));
        class ProvideGoogleTrackerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApplication;
            private final AnalyticsModule module;

            public void attach(Linker linker)
            {
                lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public GoogleEventTracker get()
            {
                return module.provideGoogleTracker((LyftApplication)lyftApplication.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApplication);
            }

            public ProvideGoogleTrackerProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.GoogleEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideGoogleTracker");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.GoogleEventTracker", new ProvideGoogleTrackerProvidesAdapter(analyticsmodule));
        class ProvideMobileAppTrackerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApplication;
            private Binding lyftPreferences;
            private final AnalyticsModule module;

            public void attach(Linker linker)
            {
                lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
            }

            public MobileAppTracker get()
            {
                return module.provideMobileAppTracker((LyftApplication)lyftApplication.get(), (ILyftPreferences)lyftPreferences.get());
            }

            public volatile Object get()
            {
                return get();
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApplication);
                set.add(lyftPreferences);
            }

            public ProvideMobileAppTrackerProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("com.mobileapptracker.MobileAppTracker", true, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideMobileAppTracker");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("com.mobileapptracker.MobileAppTracker", new ProvideMobileAppTrackerProvidesAdapter(analyticsmodule));
        class ProvideKochavaAnalyticsProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApplication;
            private final AnalyticsModule module;

            public void attach(Linker linker)
            {
                lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/analytics/trackers/AnalyticsModule, getClass().getClassLoader());
            }

            public Feature get()
            {
                return module.provideKochavaAnalytics((LyftApplication)lyftApplication.get());
            }

            public volatile Object get()
            {
                return get();
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApplication);
            }

            public ProvideKochavaAnalyticsProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("com.kochava.android.tracker.Feature", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideKochavaAnalytics");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("com.kochava.android.tracker.Feature", new ProvideKochavaAnalyticsProvidesAdapter(analyticsmodule));
        class ProvideLogEventTrackerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final AnalyticsModule module;

            public volatile Object get()
            {
                return get();
            }

            public LogEventTracker get()
            {
                return module.provideLogEventTracker();
            }

            public ProvideLogEventTrackerProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.LogEventTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideLogEventTracker");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.LogEventTracker", new ProvideLogEventTrackerProvidesAdapter(analyticsmodule));
        class ProvideLeanplumTrackerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final AnalyticsModule module;

            public volatile Object get()
            {
                return get();
            }

            public LeanplumTracker get()
            {
                return module.provideLeanplumTracker();
            }

            public ProvideLeanplumTrackerProvidesAdapter(AnalyticsModule analyticsmodule)
            {
                super("me.lyft.android.analytics.trackers.LeanplumTracker", false, "me.lyft.android.analytics.trackers.AnalyticsModule", "provideLeanplumTracker");
                module = analyticsmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.analytics.trackers.LeanplumTracker", new ProvideLeanplumTrackerProvidesAdapter(analyticsmodule));
    }

    public volatile Object newModule()
    {
        return newModule();
    }

    public AnalyticsModule newModule()
    {
        return new AnalyticsModule();
    }


    public ProvideLeanplumTrackerProvidesAdapter()
    {
        super(me/lyft/android/analytics/trackers/AnalyticsModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
