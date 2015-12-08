// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.polling.ILocationUpdateService;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.appboy.IAppboyService;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerModuleV2, PassengerRequestRideRouter, PassengerRequestRidePresenterV2

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appboyService;
    private Binding defaultErrorHandler;
    private Binding displayManager;
    private Binding inAppNotificationService;
    private Binding locationUpdateService;
    private final PassengerModuleV2 module;
    private Binding preferences;
    private Binding requestRideTypeProvider;
    private Binding rideMap;
    private Binding rideRequestSession;
    private Binding slideMenuController;
    private Binding splitFareRequestRepository;
    private Binding userModeSwitchFacade;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        locationUpdateService = linker.requestBinding("me.lyft.android.application.polling.ILocationUpdateService", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        splitFareRequestRepository = linker.requestBinding("me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        appboyService = linker.requestBinding("me.lyft.android.infrastructure.appboy.IAppboyService", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        inAppNotificationService = linker.requestBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        userModeSwitchFacade = linker.requestBinding("me.lyft.android.facades.UserModeSwitchFacade", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        displayManager = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public PassengerRequestRidePresenterV2 get()
    {
        return module.providePassengerRequestRidePresenterV2((SlideMenuController)slideMenuController.get(), (IRideRequestSession)rideRequestSession.get(), (RideMap)rideMap.get(), (ILocationUpdateService)locationUpdateService.get(), (IDefaultErrorHandler)defaultErrorHandler.get(), (IRequestRideTypeProvider)requestRideTypeProvider.get(), (ISplitFareRequestRepository)splitFareRequestRepository.get(), (IUserProvider)userProvider.get(), (ILyftPreferences)preferences.get(), (IAppboyService)appboyService.get(), (InAppNotificationService)inAppNotificationService.get(), (UserModeSwitchFacade)userModeSwitchFacade.get(), (PassengerRequestRideRouter)displayManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(slideMenuController);
        set.add(rideRequestSession);
        set.add(rideMap);
        set.add(locationUpdateService);
        set.add(defaultErrorHandler);
        set.add(requestRideTypeProvider);
        set.add(splitFareRequestRepository);
        set.add(userProvider);
        set.add(preferences);
        set.add(appboyService);
        set.add(inAppNotificationService);
        set.add(userModeSwitchFacade);
        set.add(displayManager);
    }

    public (PassengerModuleV2 passengermodulev2)
    {
        super("me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2", true, "me.lyft.android.ui.passenger.v2.PassengerModuleV2", "providePassengerRequestRidePresenterV2");
        module = passengermodulev2;
        setLibrary(true);
    }
}
