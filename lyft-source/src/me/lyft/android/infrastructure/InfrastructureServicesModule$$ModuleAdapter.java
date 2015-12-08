// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (InfrastructureServicesModule)obj);
    }

    public void getBindings(BindingsGroup bindingsgroup, InfrastructureServicesModule infrastructureservicesmodule)
    {
        class ProvideActivityServiceRegistryProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding analyticsService;
            private Binding appboyService;
            private Binding driverDefenseStarterService;
            private Binding facebookService;
            private Binding galleryService;
            private Binding googleApiProvider;
            private Binding inAppNotificationService;
            private Binding instabugService;
            private Binding installTrackerService;
            private Binding leanplumService;
            private Binding locationSettingsService;
            private final InfrastructureServicesModule module;
            private Binding payPalService;
            private Binding scanService;
            private Binding statusBarNotificationsService;
            private Binding viewServerService;
            private Binding walletService;

            public void attach(Linker linker)
            {
                facebookService = linker.requestBinding("me.lyft.android.infrastructure.facebook.IFacebookService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                googleApiProvider = linker.requestBinding("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                walletService = linker.requestBinding("me.lyft.android.infrastructure.wallet.IWalletService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                galleryService = linker.requestBinding("me.lyft.android.infrastructure.gallery.IGalleryService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                analyticsService = linker.requestBinding("me.lyft.android.analytics.trackers.AnalyticsService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                scanService = linker.requestBinding("me.lyft.android.infrastructure.cardscan.ICardScanService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                payPalService = linker.requestBinding("me.lyft.android.infrastructure.paypal.IPayPalService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                locationSettingsService = linker.requestBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                viewServerService = linker.requestBinding("me.lyft.android.infrastructure.viewserver.IViewServerService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                driverDefenseStarterService = linker.requestBinding("me.lyft.android.infrastructure.driverdefense.DriverDefenseStarterService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                inAppNotificationService = linker.requestBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                installTrackerService = linker.requestBinding("me.lyft.android.infrastructure.competition.InstallTrackerService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                appboyService = linker.requestBinding("me.lyft.android.infrastructure.appboy.IAppboyService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                statusBarNotificationsService = linker.requestBinding("me.lyft.android.notifications.IStatusBarNotificationsService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                leanplumService = linker.requestBinding("me.lyft.android.infrastructure.leanplum.ILeanplumService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                instabugService = linker.requestBinding("me.lyft.android.infrastructure.instabug.IInstabugService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ActivityServiceRegistry get()
            {
                return module.provideActivityServiceRegistry((IFacebookService)facebookService.get(), (IGoogleApiProvider)googleApiProvider.get(), (IWalletService)walletService.get(), (IGalleryService)galleryService.get(), (AnalyticsService)analyticsService.get(), (ICardScanService)scanService.get(), (IPayPalService)payPalService.get(), (ILocationSettingsService)locationSettingsService.get(), (IViewServerService)viewServerService.get(), (DriverDefenseStarterService)driverDefenseStarterService.get(), (InAppNotificationService)inAppNotificationService.get(), (InstallTrackerService)installTrackerService.get(), (IAppboyService)appboyService.get(), (IStatusBarNotificationsService)statusBarNotificationsService.get(), (ILeanplumService)leanplumService.get(), (IInstabugService)instabugService.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(facebookService);
                set.add(googleApiProvider);
                set.add(walletService);
                set.add(galleryService);
                set.add(analyticsService);
                set.add(scanService);
                set.add(payPalService);
                set.add(locationSettingsService);
                set.add(viewServerService);
                set.add(driverDefenseStarterService);
                set.add(inAppNotificationService);
                set.add(installTrackerService);
                set.add(appboyService);
                set.add(statusBarNotificationsService);
                set.add(leanplumService);
                set.add(instabugService);
            }

            public ProvideActivityServiceRegistryProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.activity.ActivityServiceRegistry", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideActivityServiceRegistry");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.activity.ActivityServiceRegistry", new ProvideActivityServiceRegistryProvidesAdapter(infrastructureservicesmodule));
        class ProvideAppServiceRegistryProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding backgroundLocationSupervisor;
            private final InfrastructureServicesModule module;
            private Binding pollingSupervisor;

            public void attach(Linker linker)
            {
                pollingSupervisor = linker.requestBinding("me.lyft.android.application.polling.IPollingAppProcess", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                backgroundLocationSupervisor = linker.requestBinding("me.lyft.android.application.polling.IBackgroundLocationAppProcess", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public AppProcessRegistry get()
            {
                return module.provideAppServiceRegistry((IPollingAppProcess)pollingSupervisor.get(), (IBackgroundLocationAppProcess)backgroundLocationSupervisor.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(pollingSupervisor);
                set.add(backgroundLocationSupervisor);
            }

            public ProvideAppServiceRegistryProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.service.AppProcessRegistry", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideAppServiceRegistry");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.service.AppProcessRegistry", new ProvideAppServiceRegistryProvidesAdapter(infrastructureservicesmodule));
        class ProvideAppForegroundDetectorProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;

            public volatile Object get()
            {
                return get();
            }

            public IAppForegroundDetector get()
            {
                return module.provideAppForegroundDetector();
            }

            public ProvideAppForegroundDetectorProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideAppForegroundDetector");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", new ProvideAppForegroundDetectorProvidesAdapter(infrastructureservicesmodule));
        class ProvideLocationServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApplication;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ILocationService get()
            {
                return module.provideLocationService((LyftApplication)lyftApplication.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApplication);
            }

            public ProvideLocationServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.location.ILocationService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideLocationService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.location.ILocationService", new ProvideLocationServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideFacebookServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;

            public volatile Object get()
            {
                return get();
            }

            public IFacebookService get()
            {
                return module.provideFacebookService();
            }

            public ProvideFacebookServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.facebook.IFacebookService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideFacebookService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.facebook.IFacebookService", new ProvideFacebookServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideGoogleApiProviderProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftPreferences;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IGoogleApiProvider get()
            {
                return module.provideGoogleApiProvider((ILyftPreferences)lyftPreferences.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftPreferences);
            }

            public ProvideGoogleApiProviderProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGoogleApiProvider");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", new ProvideGoogleApiProviderProvidesAdapter(infrastructureservicesmodule));
        class ProvideWalletServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding googleApiProvider;
            private final InfrastructureServicesModule module;
            private Binding preferences;

            public void attach(Linker linker)
            {
                googleApiProvider = linker.requestBinding("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IWalletService get()
            {
                return module.provideWalletService((IGoogleApiProvider)googleApiProvider.get(), (ILyftPreferences)preferences.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(googleApiProvider);
                set.add(preferences);
            }

            public ProvideWalletServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.wallet.IWalletService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideWalletService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.wallet.IWalletService", new ProvideWalletServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideStripeServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftPreferences;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IStripeService get()
            {
                return module.provideStripeService((ILyftPreferences)lyftPreferences.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftPreferences);
            }

            public ProvideStripeServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.stripe.IStripeService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideStripeService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.stripe.IStripeService", new ProvideStripeServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideGooglePlaceServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding googleApiProvider;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                googleApiProvider = linker.requestBinding("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IGooglePlaceService get()
            {
                return module.provideGooglePlaceService((IGoogleApiProvider)googleApiProvider.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(googleApiProvider);
            }

            public ProvideGooglePlaceServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.googleplaces.IGooglePlaceService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGooglePlaceService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.googleplaces.IGooglePlaceService", new ProvideGooglePlaceServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideGoogleApiServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding gson;
            private final InfrastructureServicesModule module;
            private Binding okHttpClient;

            public void attach(Linker linker)
            {
                okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IGoogleGeoApiService get()
            {
                return module.provideGoogleApiService((OkHttpClient)okHttpClient.get(), (Gson)gson.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(okHttpClient);
                set.add(gson);
            }

            public ProvideGoogleApiServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGoogleApiService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService", new ProvideGoogleApiServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideGalleryServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding captureImageSession;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                captureImageSession = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImageSession", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IGalleryService get()
            {
                return module.provideGalleryService((ICaptureImageSession)captureImageSession.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(captureImageSession);
            }

            public ProvideGalleryServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.gallery.IGalleryService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGalleryService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.gallery.IGalleryService", new ProvideGalleryServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideGalleryServiceProvidesAdapter2 extends ProvidesBinding
            implements Provider
        {

            private Binding captureImage;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                captureImage = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImage", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IPhotoPickerService get()
            {
                return module.provideGalleryService((ICaptureImage)captureImage.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(captureImage);
            }

            public ProvideGalleryServiceProvidesAdapter2(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.photo.IPhotoPickerService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGalleryService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.photo.IPhotoPickerService", new ProvideGalleryServiceProvidesAdapter2(infrastructureservicesmodule));
        class ProvideVerificationAutoFillServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;

            public volatile Object get()
            {
                return get();
            }

            public IVerificationAutoFillService get()
            {
                return module.provideVerificationAutoFillService();
            }

            public ProvideVerificationAutoFillServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.sms.IVerificationAutoFillService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideVerificationAutoFillService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.sms.IVerificationAutoFillService", new ProvideVerificationAutoFillServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideCaptureImageSessionProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding appFlow;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public CaptureImageSession get()
            {
                return module.provideCaptureImageSession((AppFlow)appFlow.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(appFlow);
            }

            public ProvideCaptureImageSessionProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.camera.CaptureImageSession", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideCaptureImageSession");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.camera.CaptureImageSession", new ProvideCaptureImageSessionProvidesAdapter(infrastructureservicesmodule));
        class ProvideICaptureImageSessionProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;
            private Binding session;

            public void attach(Linker linker)
            {
                session = linker.requestBinding("me.lyft.android.infrastructure.camera.CaptureImageSession", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ICaptureImageSession get()
            {
                return module.provideICaptureImageSession((CaptureImageSession)session.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(session);
            }

            public ProvideICaptureImageSessionProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.camera.ICaptureImageSession", false, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideICaptureImageSession");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.camera.ICaptureImageSession", new ProvideICaptureImageSessionProvidesAdapter(infrastructureservicesmodule));
        class ProvideICaptureImageProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;
            private Binding session;

            public void attach(Linker linker)
            {
                session = linker.requestBinding("me.lyft.android.infrastructure.camera.CaptureImageSession", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ICaptureImage get()
            {
                return module.provideICaptureImage((CaptureImageSession)session.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(session);
            }

            public ProvideICaptureImageProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.camera.ICaptureImage", false, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideICaptureImage");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.camera.ICaptureImage", new ProvideICaptureImageProvidesAdapter(infrastructureservicesmodule));
        class ProvideIProfilePhotoLoaderProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;
            private Binding myProfilePhotoLoader;

            public void attach(Linker linker)
            {
                myProfilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.ProfilePhotoLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IProfilePhotoLoader get()
            {
                return module.provideIProfilePhotoLoader((ProfilePhotoLoader)myProfilePhotoLoader.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(myProfilePhotoLoader);
            }

            public ProvideIProfilePhotoLoaderProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.profile.IProfilePhotoLoader", false, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideIProfilePhotoLoader");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.profile.IProfilePhotoLoader", new ProvideIProfilePhotoLoaderProvidesAdapter(infrastructureservicesmodule));
        class ProvideProfilePhotoFileRecipientProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;
            private Binding myProfilePhotoLoader;

            public void attach(Linker linker)
            {
                myProfilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.ProfilePhotoLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IProfilePhotoFileRecipient get()
            {
                return module.provideProfilePhotoFileRecipient((ProfilePhotoLoader)myProfilePhotoLoader.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(myProfilePhotoLoader);
            }

            public ProvideProfilePhotoFileRecipientProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.application.profile.IProfilePhotoFileRecipient", false, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideProfilePhotoFileRecipient");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.application.profile.IProfilePhotoFileRecipient", new ProvideProfilePhotoFileRecipientProvidesAdapter(infrastructureservicesmodule));
        class ProvideCardScanServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;

            public volatile Object get()
            {
                return get();
            }

            public ICardScanService get()
            {
                return module.provideCardScanService();
            }

            public ProvideCardScanServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.cardscan.ICardScanService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideCardScanService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.cardscan.ICardScanService", new ProvideCardScanServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideIPayPalServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding chargeAccountsProvider;
            private final InfrastructureServicesModule module;
            private Binding passengerRideProvider;
            private Binding rideRequestSession;

            public void attach(Linker linker)
            {
                chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IPayPalService get()
            {
                return module.provideIPayPalService((IChargeAccountsProvider)chargeAccountsProvider.get(), (IRideRequestSession)rideRequestSession.get(), (IPassengerRideProvider)passengerRideProvider.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(chargeAccountsProvider);
                set.add(rideRequestSession);
                set.add(passengerRideProvider);
            }

            public ProvideIPayPalServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.paypal.IPayPalService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideIPayPalService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.paypal.IPayPalService", new ProvideIPayPalServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideIInstabugServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding application;
            private final InfrastructureServicesModule module;
            private Binding userProvider;

            public void attach(Linker linker)
            {
                application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IInstabugService get()
            {
                return module.provideIInstabugService((LyftApplication)application.get(), (IUserProvider)userProvider.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(application);
                set.add(userProvider);
            }

            public ProvideIInstabugServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.instabug.IInstabugService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideIInstabugService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.instabug.IInstabugService", new ProvideIInstabugServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideS3ApiProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding gson;
            private final InfrastructureServicesModule module;
            private Binding okHttpClient;

            public void attach(Linker linker)
            {
                okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IS3Api get()
            {
                return module.provideS3Api((OkHttpClient)okHttpClient.get(), (Gson)gson.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(okHttpClient);
                set.add(gson);
            }

            public ProvideS3ApiProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.s3.IS3Api", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideS3Api");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.s3.IS3Api", new ProvideS3ApiProvidesAdapter(infrastructureservicesmodule));
        class ProvideLyftApiProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding device;
            private Binding gson;
            private Binding handler;
            private final InfrastructureServicesModule module;
            private Binding okHttpClient;
            private Binding preferences;

            public void attach(Linker linker)
            {
                okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                handler = linker.requestBinding("me.lyft.android.IAppStateHandler", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ILyftApi get()
            {
                return module.provideLyftApi((OkHttpClient)okHttpClient.get(), (Gson)gson.get(), (ILyftPreferences)preferences.get(), (IDevice)device.get(), (IAppStateHandler)handler.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(okHttpClient);
                set.add(gson);
                set.add(preferences);
                set.add(device);
                set.add(handler);
            }

            public ProvideLyftApiProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.lyft.ILyftApi", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideLyftApi");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.lyft.ILyftApi", new ProvideLyftApiProvidesAdapter(infrastructureservicesmodule));
        class ProvideISendSmsServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding application;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ISmsService get()
            {
                return module.provideISendSmsService((LyftApplication)application.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(application);
            }

            public ProvideISendSmsServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.sms.ISmsService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideISendSmsService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.sms.ISmsService", new ProvideISendSmsServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideIGcmIdServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding gcmIdService;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                gcmIdService = linker.requestBinding("me.lyft.android.infrastructure.gcm.GcmIdService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IGcmIdService get()
            {
                return module.provideIGcmIdService((GcmIdService)gcmIdService.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(gcmIdService);
            }

            public ProvideIGcmIdServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.gcm.IGcmIdService", false, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideIGcmIdService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.gcm.IGcmIdService", new ProvideIGcmIdServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideILocationSettingsServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApplication;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ILocationSettingsService get()
            {
                return module.provideILocationSettingsService((LyftApplication)lyftApplication.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApplication);
            }

            public ProvideILocationSettingsServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideILocationSettingsService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", new ProvideILocationSettingsServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideLoadingServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding device;
            private Binding imageLoader;
            private Binding lyftApplication;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IAssetLoadingService get()
            {
                return module.provideLoadingService((LyftApplication)lyftApplication.get(), (IDevice)device.get(), (ImageLoader)imageLoader.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApplication);
                set.add(device);
                set.add(imageLoader);
            }

            public ProvideLoadingServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.assets.IAssetLoadingService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideLoadingService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.assets.IAssetLoadingService", new ProvideLoadingServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideAssetPackagingServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApplication;
            private final InfrastructureServicesModule module;
            private Binding okHttpClient;
            private Binding preferences;

            public void attach(Linker linker)
            {
                lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IAssetPackagingService get()
            {
                return module.provideAssetPackagingService((LyftApplication)lyftApplication.get(), (ILyftPreferences)preferences.get(), (OkHttpClient)okHttpClient.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApplication);
                set.add(preferences);
                set.add(okHttpClient);
            }

            public ProvideAssetPackagingServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.assets.IAssetPackagingService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideAssetPackagingService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.assets.IAssetPackagingService", new ProvideAssetPackagingServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideAppboyServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding dialogFlow;
            private Binding gcmIdService;
            private Binding imageLoader;
            private Binding inAppNotificationService;
            private final InfrastructureServicesModule module;
            private Binding userProvider;

            public void attach(Linker linker)
            {
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                gcmIdService = linker.requestBinding("me.lyft.android.infrastructure.gcm.IGcmIdService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                inAppNotificationService = linker.requestBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IAppboyService get()
            {
                return module.provideAppboyService((IUserProvider)userProvider.get(), (IGcmIdService)gcmIdService.get(), (DialogFlow)dialogFlow.get(), (ImageLoader)imageLoader.get(), (InAppNotificationService)inAppNotificationService.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(userProvider);
                set.add(gcmIdService);
                set.add(dialogFlow);
                set.add(imageLoader);
                set.add(inAppNotificationService);
            }

            public ProvideAppboyServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.appboy.IAppboyService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideAppboyService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.appboy.IAppboyService", new ProvideAppboyServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideStatusBarServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding appForegroundDetector;
            private Binding deepLinkManager;
            private Binding gson;
            private Binding imageLoader;
            private final InfrastructureServicesModule module;
            private Binding notificationManager;
            private Binding preferences;

            public void attach(Linker linker)
            {
                imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                notificationManager = linker.requestBinding("android.app.NotificationManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IStatusBarNotificationsService get()
            {
                return module.provideStatusBarService((ImageLoader)imageLoader.get(), (NotificationManager)notificationManager.get(), (ILyftPreferences)preferences.get(), (IAppForegroundDetector)appForegroundDetector.get(), (Gson)gson.get(), (DeepLinkManager)deepLinkManager.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(imageLoader);
                set.add(notificationManager);
                set.add(preferences);
                set.add(appForegroundDetector);
                set.add(gson);
                set.add(deepLinkManager);
            }

            public ProvideStatusBarServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.notifications.IStatusBarNotificationsService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideStatusBarService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.notifications.IStatusBarNotificationsService", new ProvideStatusBarServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideViewServerServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final InfrastructureServicesModule module;

            public volatile Object get()
            {
                return get();
            }

            public IViewServerService get()
            {
                return module.provideViewServerService();
            }

            public ProvideViewServerServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.viewserver.IViewServerService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideViewServerService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.viewserver.IViewServerService", new ProvideViewServerServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideDeviceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding accountManager;
            private Binding app;
            private Binding connectivityManager;
            private final InfrastructureServicesModule module;
            private Binding packageManager;
            private Binding telephonyManager;
            private Binding windowManager;

            public void attach(Linker linker)
            {
                app = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                windowManager = linker.requestBinding("android.view.WindowManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                telephonyManager = linker.requestBinding("android.telephony.TelephonyManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                connectivityManager = linker.requestBinding("android.net.ConnectivityManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                accountManager = linker.requestBinding("android.accounts.AccountManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                packageManager = linker.requestBinding("android.content.pm.PackageManager", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IDevice get()
            {
                return module.provideDevice((LyftApplication)app.get(), (WindowManager)windowManager.get(), (TelephonyManager)telephonyManager.get(), (ConnectivityManager)connectivityManager.get(), (AccountManager)accountManager.get(), (PackageManager)packageManager.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(app);
                set.add(windowManager);
                set.add(telephonyManager);
                set.add(connectivityManager);
                set.add(accountManager);
                set.add(packageManager);
            }

            public ProvideDeviceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.device.IDevice", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideDevice");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.device.IDevice", new ProvideDeviceProvidesAdapter(infrastructureservicesmodule));
        class ProvideDriverDefenseStarterServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftPreferences;
            private final InfrastructureServicesModule module;
            private Binding userProvider;

            public void attach(Linker linker)
            {
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public DriverDefenseStarterService get()
            {
                return module.provideDriverDefenseStarterService((IUserProvider)userProvider.get(), (ILyftPreferences)lyftPreferences.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(userProvider);
                set.add(lyftPreferences);
            }

            public ProvideDriverDefenseStarterServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.driverdefense.DriverDefenseStarterService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideDriverDefenseStarterService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.driverdefense.DriverDefenseStarterService", new ProvideDriverDefenseStarterServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideInAppNotificationServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding bus;
            private Binding dialogFlow;
            private Binding lyftApi;
            private Binding lyftPreferences;
            private final InfrastructureServicesModule module;
            private Binding userProvider;

            public void attach(Linker linker)
            {
                lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public InAppNotificationService get()
            {
                return module.provideInAppNotificationService((ILyftApi)lyftApi.get(), (IUserProvider)userProvider.get(), (MessageBus)bus.get(), (ILyftPreferences)lyftPreferences.get(), (DialogFlow)dialogFlow.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApi);
                set.add(userProvider);
                set.add(bus);
                set.add(lyftPreferences);
                set.add(dialogFlow);
            }

            public ProvideInAppNotificationServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.notifications.InAppNotificationService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideInAppNotificationService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", new ProvideInAppNotificationServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideInstallTrackerServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding constantsProvider;
            private Binding device;
            private final InfrastructureServicesModule module;

            public void attach(Linker linker)
            {
                constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public InstallTrackerService get()
            {
                return module.provideInstallTrackerService((IConstantsProvider)constantsProvider.get(), (IDevice)device.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(constantsProvider);
                set.add(device);
            }

            public ProvideInstallTrackerServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.competition.InstallTrackerService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideInstallTrackerService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.competition.InstallTrackerService", new ProvideInstallTrackerServiceProvidesAdapter(infrastructureservicesmodule));
        class ProvideLeanplumServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding appInfoService;
            private Binding lyftApplication;
            private final InfrastructureServicesModule module;
            private Binding userProvider;

            public void attach(Linker linker)
            {
                lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
                appInfoService = linker.requestBinding("me.lyft.android.application.IAppInfoService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ILeanplumService get()
            {
                return module.provideLeanplumService((LyftApplication)lyftApplication.get(), (IUserProvider)userProvider.get(), (IAppInfoService)appInfoService.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApplication);
                set.add(userProvider);
                set.add(appInfoService);
            }

            public ProvideLeanplumServiceProvidesAdapter(InfrastructureServicesModule infrastructureservicesmodule)
            {
                super("me.lyft.android.infrastructure.leanplum.ILeanplumService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideLeanplumService");
                module = infrastructureservicesmodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.infrastructure.leanplum.ILeanplumService", new ProvideLeanplumServiceProvidesAdapter(infrastructureservicesmodule));
    }

    public volatile Object newModule()
    {
        return newModule();
    }

    public InfrastructureServicesModule newModule()
    {
        return new InfrastructureServicesModule();
    }


    public ProvideLeanplumServiceProvidesAdapter()
    {
        super(me/lyft/android/infrastructure/InfrastructureServicesModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
