// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.IDailyTotalsRepository;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverDestinyView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding constantsProvider;
    private Binding dailyTotalsRepository;
    private Binding defaultErrorHandler;
    private Binding destinyService;
    private Binding destinySession;
    private Binding dialogFlow;
    private Binding locationService;
    private Binding preferences;
    private Binding rideMap;
    private Binding slideMenuController;
    private Binding userModeSwitchFacade;

    public void attach(Linker linker)
    {
        userModeSwitchFacade = linker.requestBinding("me.lyft.android.facades.UserModeSwitchFacade", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        destinyService = linker.requestBinding("me.lyft.android.application.ride.IDestinyService", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        destinySession = linker.requestBinding("me.lyft.android.application.ride.IDestinySession", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
        dailyTotalsRepository = linker.requestBinding("me.lyft.android.application.driver.IDailyTotalsRepository", me/lyft/android/ui/driver/DriverDestinyView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userModeSwitchFacade);
        set1.add(constantsProvider);
        set1.add(preferences);
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(rideMap);
        set1.add(locationService);
        set1.add(slideMenuController);
        set1.add(defaultErrorHandler);
        set1.add(destinyService);
        set1.add(destinySession);
        set1.add(dailyTotalsRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverDestinyView)obj);
    }

    public void injectMembers(DriverDestinyView driverdestinyview)
    {
        driverdestinyview.userModeSwitchFacade = (UserModeSwitchFacade)userModeSwitchFacade.get();
        driverdestinyview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        driverdestinyview.preferences = (ILyftPreferences)preferences.get();
        driverdestinyview.appFlow = (AppFlow)appFlow.get();
        driverdestinyview.dialogFlow = (DialogFlow)dialogFlow.get();
        driverdestinyview.bus = (MessageBus)bus.get();
        driverdestinyview.rideMap = (RideMap)rideMap.get();
        driverdestinyview.locationService = (ILocationService)locationService.get();
        driverdestinyview.slideMenuController = (SlideMenuController)slideMenuController.get();
        driverdestinyview.defaultErrorHandler = (IDefaultErrorHandler)defaultErrorHandler.get();
        driverdestinyview.destinyService = (IDestinyService)destinyService.get();
        driverdestinyview.destinySession = (IDestinySession)destinySession.get();
        driverdestinyview.dailyTotalsRepository = (IDailyTotalsRepository)dailyTotalsRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverDestinyView", false, me/lyft/android/ui/driver/DriverDestinyView);
    }
}
