// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.polling.ILocationUpdateService;
import me.lyft.android.application.ride.IHotspotRepository;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.appboy.IAppboyService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.landing.LandingFlow;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding appboyService;
    private Binding bus;
    private Binding chargeAccountsProvider;
    private Binding constantsProvider;
    private Binding defaultErrorHandler;
    private Binding dialogFlow;
    private Binding etaAnalyticService;
    private Binding geoService;
    private Binding hotspotRepository;
    private Binding inAppNotificationService;
    private Binding landingFlow;
    private Binding locationService;
    private Binding locationSettingsService;
    private Binding locationUpdateService;
    private Binding lyftSystemRepository;
    private Binding preferences;
    private Binding progressController;
    private Binding requestRideTypeProvider;
    private Binding rideMap;
    private Binding rideRequestService;
    private Binding rideRequestSession;
    private Binding slideMenuController;
    private Binding splitFareRequestRepository;
    private Binding splitFareStateRepository;
    private Binding userModeSwitchFacade;
    private Binding userProvider;
    private Binding userSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        locationUpdateService = linker.requestBinding("me.lyft.android.application.polling.ILocationUpdateService", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        userModeSwitchFacade = linker.requestBinding("me.lyft.android.facades.UserModeSwitchFacade", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        hotspotRepository = linker.requestBinding("me.lyft.android.application.ride.IHotspotRepository", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        rideRequestService = linker.requestBinding("me.lyft.android.application.ride.IRideRequestService", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        lyftSystemRepository = linker.requestBinding("me.lyft.android.application.system.ILyftSystemRepository", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        splitFareRequestRepository = linker.requestBinding("me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        splitFareStateRepository = linker.requestBinding("me.lyft.android.application.splitfare.ISplitFareStateRepository", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        appboyService = linker.requestBinding("me.lyft.android.infrastructure.appboy.IAppboyService", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        etaAnalyticService = linker.requestBinding("me.lyft.android.application.geo.IEtaAnalyticService", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        locationSettingsService = linker.requestBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
        inAppNotificationService = linker.requestBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", me/lyft/android/ui/passenger/PassengerRequestRideView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(locationUpdateService);
        set1.add(appFlow);
        set1.add(landingFlow);
        set1.add(progressController);
        set1.add(dialogFlow);
        set1.add(userModeSwitchFacade);
        set1.add(userSession);
        set1.add(userProvider);
        set1.add(constantsProvider);
        set1.add(chargeAccountsProvider);
        set1.add(preferences);
        set1.add(rideMap);
        set1.add(bus);
        set1.add(geoService);
        set1.add(viewErrorHandler);
        set1.add(defaultErrorHandler);
        set1.add(slideMenuController);
        set1.add(locationService);
        set1.add(rideRequestSession);
        set1.add(hotspotRepository);
        set1.add(requestRideTypeProvider);
        set1.add(rideRequestService);
        set1.add(lyftSystemRepository);
        set1.add(splitFareRequestRepository);
        set1.add(splitFareStateRepository);
        set1.add(appboyService);
        set1.add(etaAnalyticService);
        set1.add(locationSettingsService);
        set1.add(inAppNotificationService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRequestRideView)obj);
    }

    public void injectMembers(PassengerRequestRideView passengerrequestrideview)
    {
        passengerrequestrideview.locationUpdateService = (ILocationUpdateService)locationUpdateService.get();
        passengerrequestrideview.appFlow = (AppFlow)appFlow.get();
        passengerrequestrideview.landingFlow = (LandingFlow)landingFlow.get();
        passengerrequestrideview.progressController = (IProgressController)progressController.get();
        passengerrequestrideview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengerrequestrideview.userModeSwitchFacade = (UserModeSwitchFacade)userModeSwitchFacade.get();
        passengerrequestrideview.userSession = (IUserSession)userSession.get();
        passengerrequestrideview.userProvider = (IUserProvider)userProvider.get();
        passengerrequestrideview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        passengerrequestrideview.chargeAccountsProvider = (IChargeAccountsProvider)chargeAccountsProvider.get();
        passengerrequestrideview.preferences = (ILyftPreferences)preferences.get();
        passengerrequestrideview.rideMap = (RideMap)rideMap.get();
        passengerrequestrideview.bus = (MessageBus)bus.get();
        passengerrequestrideview.geoService = (IGeoService)geoService.get();
        passengerrequestrideview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        passengerrequestrideview.defaultErrorHandler = (IDefaultErrorHandler)defaultErrorHandler.get();
        passengerrequestrideview.slideMenuController = (SlideMenuController)slideMenuController.get();
        passengerrequestrideview.locationService = (ILocationService)locationService.get();
        passengerrequestrideview.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        passengerrequestrideview.hotspotRepository = (IHotspotRepository)hotspotRepository.get();
        passengerrequestrideview.requestRideTypeProvider = (IRequestRideTypeProvider)requestRideTypeProvider.get();
        passengerrequestrideview.rideRequestService = (IRideRequestService)rideRequestService.get();
        passengerrequestrideview.lyftSystemRepository = (ILyftSystemRepository)lyftSystemRepository.get();
        passengerrequestrideview.splitFareRequestRepository = (ISplitFareRequestRepository)splitFareRequestRepository.get();
        passengerrequestrideview.splitFareStateRepository = (ISplitFareStateRepository)splitFareStateRepository.get();
        passengerrequestrideview.appboyService = (IAppboyService)appboyService.get();
        passengerrequestrideview.etaAnalyticService = (IEtaAnalyticService)etaAnalyticService.get();
        passengerrequestrideview.locationSettingsService = (ILocationSettingsService)locationSettingsService.get();
        passengerrequestrideview.inAppNotificationService = (InAppNotificationService)inAppNotificationService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerRequestRideView", false, me/lyft/android/ui/passenger/PassengerRequestRideView);
    }
}
