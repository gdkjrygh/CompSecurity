// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import me.lyft.android.ui.camera.CameraModule;
import me.lyft.android.ui.development.DevelopmentModule;
import me.lyft.android.ui.driver.DriverModule;
import me.lyft.android.ui.enterprise.EnterpriseModule;
import me.lyft.android.ui.gallery.GalleryModule;
import me.lyft.android.ui.help.HelpModule;
import me.lyft.android.ui.invites.InvitesModule;
import me.lyft.android.ui.landing.LandingModule;
import me.lyft.android.ui.onboarding.OnboardingModule;
import me.lyft.android.ui.passenger.PassengerModule;
import me.lyft.android.ui.payment.PaymentModule;
import me.lyft.android.ui.placesearch.PlaceSearchModule;
import me.lyft.android.ui.profile.ProfileModule;
import me.lyft.android.ui.ridehistory.RideHistoryModule;
import me.lyft.android.ui.settings.SettingsModule;
import me.lyft.android.ui.splitfare.SplitFareModule;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = {
        me/lyft/android/ui/landing/LandingModule, me/lyft/android/ui/profile/ProfileModule, me/lyft/android/ui/settings/SettingsModule, me/lyft/android/ui/ridehistory/RideHistoryModule, me/lyft/android/ui/camera/CameraModule, me/lyft/android/ui/development/DevelopmentModule, me/lyft/android/ui/driver/DriverModule, me/lyft/android/ui/enterprise/EnterpriseModule, me/lyft/android/ui/help/HelpModule, me/lyft/android/ui/invites/InvitesModule, 
        me/lyft/android/ui/passenger/PassengerModule, me/lyft/android/ui/payment/PaymentModule, me/lyft/android/ui/onboarding/OnboardingModule, me/lyft/android/ui/splitfare/SplitFareModule, me/lyft/android/ui/gallery/GalleryModule, me/lyft/android/ui/placesearch/PlaceSearchModule
    };
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.MainScreensContainer", "members/me.lyft.android.ui.DialogScreensContainer", "members/me.lyft.android.ui.MenuView", "members/me.lyft.android.ui.InviteMenuItem", "members/me.lyft.android.ui.WebBrowserView", "members/me.lyft.android.controls.BackButtonToolbar", "members/me.lyft.android.controls.CameraToolbar", "members/me.lyft.android.controls.MenuButtonToolbar", "members/me.lyft.android.ui.ride.RideView", "members/me.lyft.android.ui.FullscreenPhotoView", 
        "members/me.lyft.android.ui.WarningView", "members/me.lyft.android.ui.PassengerPhotoView", "members/me.lyft.android.ui.PassengerMyPhotoView", "members/me.lyft.android.ui.UserImageView", "members/me.lyft.android.ui.driver.RideProgressPassengerItem", "members/me.lyft.android.ui.passenger.DriverPhotoView", "members/me.lyft.android.ui.ride.AcceptTermsView", "members/me.lyft.android.ui.DriverModeToggleView", "members/me.lyft.android.ui.dialogs.AlertDialogView", "members/me.lyft.android.ui.dialogs.DialogButton", 
        "members/me.lyft.android.ui.dialogs.ToastView", "members/me.lyft.android.ui.dialogs.DialogContainerView", "members/me.lyft.android.ui.dialogs.CallConfirmationDialogView", "members/me.lyft.android.ui.dialogs.UpdateAppDialogView", "members/me.lyft.android.notifications.InAppNotificationDialogView", "members/me.lyft.android.ui.dialogs.DatePickerDialogView", "members/me.lyft.android.ui.dialogs.MockLocationsWarningDialogView", "members/me.lyft.android.ui.dialogs.PaymentDialogView", "members/me.lyft.android.ui.dialogs.InsuranceExpiringDialogView", "members/me.lyft.android.infrastructure.appboy.CustomAppboyInAppDialog"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (MainActivityModule)obj);
    }

    public void getBindings(BindingsGroup bindingsgroup, MainActivityModule mainactivitymodule)
    {
        class ProvideProgressControllerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final MainActivityModule module;

            public volatile Object get()
            {
                return get();
            }

            public IProgressController get()
            {
                return module.provideProgressController();
            }

            public ProvideProgressControllerProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.ui.IProgressController", true, "me.lyft.android.ui.MainActivityModule", "provideProgressController");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.ui.IProgressController", new ProvideProgressControllerProvidesAdapter(mainactivitymodule));
        class ProvideUserModeSwitchFacadeProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding driverDocumentsProvider;
            private Binding driverDocumentsService;
            private Binding locationSettingsService;
            private Binding lyftPreferences;
            private final MainActivityModule module;
            private Binding viewErrorHandler;

            public void attach(Linker linker)
            {
                driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                locationSettingsService = linker.requestBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public UserModeSwitchFacade get()
            {
                return module.provideUserModeSwitchFacade((IDriverDocumentsProvider)driverDocumentsProvider.get(), (IDriverDocumentsService)driverDocumentsService.get(), (ILocationSettingsService)locationSettingsService.get(), (IViewErrorHandler)viewErrorHandler.get(), (ILyftPreferences)lyftPreferences.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(driverDocumentsProvider);
                set.add(driverDocumentsService);
                set.add(locationSettingsService);
                set.add(viewErrorHandler);
                set.add(lyftPreferences);
            }

            public ProvideUserModeSwitchFacadeProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.facades.UserModeSwitchFacade", true, "me.lyft.android.ui.MainActivityModule", "provideUserModeSwitchFacade");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.facades.UserModeSwitchFacade", new ProvideUserModeSwitchFacadeProvidesAdapter(mainactivitymodule));
        class ProvideSlideControllerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final MainActivityModule module;

            public volatile Object get()
            {
                return get();
            }

            public SlideMenuController get()
            {
                return module.provideSlideController();
            }

            public ProvideSlideControllerProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.ui.SlideMenuController", true, "me.lyft.android.ui.MainActivityModule", "provideSlideController");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.ui.SlideMenuController", new ProvideSlideControllerProvidesAdapter(mainactivitymodule));
        class ProvideMapViewProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final MainActivityModule module;

            public volatile Object get()
            {
                return get();
            }

            public LyftMapView get()
            {
                return module.provideMapView();
            }

            public ProvideMapViewProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.map.lyft.LyftMapView", true, "me.lyft.android.ui.MainActivityModule", "provideMapView");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.map.lyft.LyftMapView", new ProvideMapViewProvidesAdapter(mainactivitymodule));
        class ProvideTopContactsProviderProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding contentResolver;
            private final MainActivityModule module;
            private Binding userProvider;

            public void attach(Linker linker)
            {
                contentResolver = linker.requestBinding("android.content.ContentResolver", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public TopContactsProvider get()
            {
                return module.provideTopContactsProvider((ContentResolver)contentResolver.get(), (IUserProvider)userProvider.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(contentResolver);
                set.add(userProvider);
            }

            public ProvideTopContactsProviderProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.providers.TopContactsProvider", false, "me.lyft.android.ui.MainActivityModule", "provideTopContactsProvider");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.providers.TopContactsProvider", new ProvideTopContactsProviderProvidesAdapter(mainactivitymodule));
        class ProvideHeatmapServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding defaultErrorHandler;
            private Binding locationService;
            private Binding lyftApi;
            private final MainActivityModule module;

            public void attach(Linker linker)
            {
                lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public HeatMapService get()
            {
                return module.provideHeatmapService((ILyftApi)lyftApi.get(), (ILocationService)locationService.get(), (IDefaultErrorHandler)defaultErrorHandler.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApi);
                set.add(locationService);
                set.add(defaultErrorHandler);
            }

            public ProvideHeatmapServiceProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.services.HeatMapService", true, "me.lyft.android.ui.MainActivityModule", "provideHeatmapService");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.services.HeatMapService", new ProvideHeatmapServiceProvidesAdapter(mainactivitymodule));
        class ProvideProfileServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding api;
            private Binding facebookService;
            private final MainActivityModule module;
            private Binding profilePhotoFileRecipient;
            private Binding s3Api;
            private Binding userSession;

            public void attach(Linker linker)
            {
                userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                s3Api = linker.requestBinding("me.lyft.android.infrastructure.s3.IS3Api", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                api = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                profilePhotoFileRecipient = linker.requestBinding("me.lyft.android.application.profile.IProfilePhotoFileRecipient", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                facebookService = linker.requestBinding("me.lyft.android.infrastructure.facebook.IFacebookService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IProfileService get()
            {
                return module.provideProfileService((IUserSession)userSession.get(), (IS3Api)s3Api.get(), (ILyftApi)api.get(), (IProfilePhotoFileRecipient)profilePhotoFileRecipient.get(), (IFacebookService)facebookService.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(userSession);
                set.add(s3Api);
                set.add(api);
                set.add(profilePhotoFileRecipient);
                set.add(facebookService);
            }

            public ProvideProfileServiceProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.application.profile.IProfileService", false, "me.lyft.android.ui.MainActivityModule", "provideProfileService");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.application.profile.IProfileService", new ProvideProfileServiceProvidesAdapter(mainactivitymodule));
        class ProvideProfileProviderProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final MainActivityModule module;
            private Binding userSession;

            public void attach(Linker linker)
            {
                userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IProfileProvider get()
            {
                return module.provideProfileProvider((IUserSession)userSession.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(userSession);
            }

            public ProvideProfileProviderProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.application.profile.IProfileProvider", false, "me.lyft.android.ui.MainActivityModule", "provideProfileProvider");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.application.profile.IProfileProvider", new ProvideProfileProviderProvidesAdapter(mainactivitymodule));
        class ProvideDriverStatsProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApi;
            private final MainActivityModule module;

            public void attach(Linker linker)
            {
                lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IDriverStatsProvider get()
            {
                return module.provideDriverStats((ILyftApi)lyftApi.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApi);
            }

            public ProvideDriverStatsProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.application.driver.IDriverStatsProvider", false, "me.lyft.android.ui.MainActivityModule", "provideDriverStats");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.application.driver.IDriverStatsProvider", new ProvideDriverStatsProvidesAdapter(mainactivitymodule));
        class ProvideMapMarkerManagerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private final MainActivityModule module;

            public volatile Object get()
            {
                return get();
            }

            public MarkerBank get()
            {
                return module.provideMapMarkerManager();
            }

            public ProvideMapMarkerManagerProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.map.lyft.MarkerBank", true, "me.lyft.android.ui.MainActivityModule", "provideMapMarkerManager");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.map.lyft.MarkerBank", new ProvideMapMarkerManagerProvidesAdapter(mainactivitymodule));
        class ProvideMarkerClickManagerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding markerBank;
            private final MainActivityModule module;

            public void attach(Linker linker)
            {
                markerBank = linker.requestBinding("me.lyft.android.map.lyft.MarkerBank", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public MarkerClickManager get()
            {
                return module.provideMarkerClickManager((MarkerBank)markerBank.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(markerBank);
            }

            public ProvideMarkerClickManagerProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.map.lyft.MarkerClickManager", true, "me.lyft.android.ui.MainActivityModule", "provideMarkerClickManager");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.map.lyft.MarkerClickManager", new ProvideMarkerClickManagerProvidesAdapter(mainactivitymodule));
        class ProvideMapOwnerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding mapView;
            private Binding markerBank;
            private Binding markerClickManager;
            private final MainActivityModule module;

            public void attach(Linker linker)
            {
                mapView = linker.requestBinding("me.lyft.android.map.lyft.LyftMapView", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                markerBank = linker.requestBinding("me.lyft.android.map.lyft.MarkerBank", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                markerClickManager = linker.requestBinding("me.lyft.android.map.lyft.MarkerClickManager", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public MapOwner get()
            {
                return module.provideMapOwner((LyftMapView)mapView.get(), (MarkerBank)markerBank.get(), (MarkerClickManager)markerClickManager.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(mapView);
                set.add(markerBank);
                set.add(markerClickManager);
            }

            public ProvideMapOwnerProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.map.lyft.MapOwner", true, "me.lyft.android.ui.MainActivityModule", "provideMapOwner");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.map.lyft.MapOwner", new ProvideMapOwnerProvidesAdapter(mainactivitymodule));
        class ProvideTrainingRideServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApi;
            private final MainActivityModule module;

            public void attach(Linker linker)
            {
                lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public ITrainingRideService get()
            {
                return module.provideTrainingRideService((ILyftApi)lyftApi.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApi);
            }

            public ProvideTrainingRideServiceProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.application.settings.ITrainingRideService", false, "me.lyft.android.ui.MainActivityModule", "provideTrainingRideService");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.application.settings.ITrainingRideService", new ProvideTrainingRideServiceProvidesAdapter(mainactivitymodule));
        class ProvidePassengerHistoryServiceProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding lyftApi;
            private final MainActivityModule module;
            private Binding userProvider;

            public void attach(Linker linker)
            {
                lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IPassengerRideHistoryService get()
            {
                return module.providePassengerHistoryService((ILyftApi)lyftApi.get(), (IUserProvider)userProvider.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(lyftApi);
                set.add(userProvider);
            }

            public ProvidePassengerHistoryServiceProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.application.ridehistory.IPassengerRideHistoryService", true, "me.lyft.android.ui.MainActivityModule", "providePassengerHistoryService");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.application.ridehistory.IPassengerRideHistoryService", new ProvidePassengerHistoryServiceProvidesAdapter(mainactivitymodule));
        class ProvideViewErrorHandlerProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding defaultErrorHandler;
            private Binding dialogFlow;
            private final MainActivityModule module;
            private Binding resources;
            private Binding userProvider;

            public void attach(Linker linker)
            {
                defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                resources = linker.requestBinding("android.content.res.Resources", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IViewErrorHandler get()
            {
                return module.provideViewErrorHandler((IDefaultErrorHandler)defaultErrorHandler.get(), (DialogFlow)dialogFlow.get(), (Resources)resources.get(), (IUserProvider)userProvider.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(defaultErrorHandler);
                set.add(dialogFlow);
                set.add(resources);
                set.add(userProvider);
            }

            public ProvideViewErrorHandlerProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.ui.IViewErrorHandler", false, "me.lyft.android.ui.MainActivityModule", "provideViewErrorHandler");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.ui.IViewErrorHandler", new ProvideViewErrorHandlerProvidesAdapter(mainactivitymodule));
        class ProvideRideViewProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding assetLoadingService;
            private Binding constantsProvider;
            private Binding defaultErrorHandler;
            private Binding geoService;
            private Binding locationService;
            private Binding mapOwner;
            private final MainActivityModule module;
            private Binding passengerRideProvider;
            private Binding routeProvider;
            private Binding shortcutService;

            public void attach(Linker linker)
            {
                mapOwner = linker.requestBinding("me.lyft.android.map.lyft.MapOwner", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                assetLoadingService = linker.requestBinding("me.lyft.android.infrastructure.assets.IAssetLoadingService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                shortcutService = linker.requestBinding("me.lyft.android.application.shortcuts.IShortcutService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
                constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public RideMap get()
            {
                return module.provideRideView((MapOwner)mapOwner.get(), (IAssetLoadingService)assetLoadingService.get(), (IDriverRideProvider)routeProvider.get(), (IPassengerRideProvider)passengerRideProvider.get(), (IGeoService)geoService.get(), (ILocationService)locationService.get(), (IDefaultErrorHandler)defaultErrorHandler.get(), (IShortcutService)shortcutService.get(), (IConstantsProvider)constantsProvider.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(mapOwner);
                set.add(assetLoadingService);
                set.add(routeProvider);
                set.add(passengerRideProvider);
                set.add(geoService);
                set.add(locationService);
                set.add(defaultErrorHandler);
                set.add(shortcutService);
                set.add(constantsProvider);
            }

            public ProvideRideViewProvidesAdapter(MainActivityModule mainactivitymodule)
            {
                super("me.lyft.android.ui.ride.RideMap", true, "me.lyft.android.ui.MainActivityModule", "provideRideView");
                module = mainactivitymodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.ui.ride.RideMap", new ProvideRideViewProvidesAdapter(mainactivitymodule));
    }


    public ProvideRideViewProvidesAdapter()
    {
        super(me/lyft/android/ui/MainActivityModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, true);
    }
}
