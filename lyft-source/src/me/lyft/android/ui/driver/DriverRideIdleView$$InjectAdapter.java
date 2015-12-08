// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.IDailyTotalsRepository;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.services.HeatMapService;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

public final class A extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding constantsProvider;
    private Binding dailyTotalsRepository;
    private Binding dialogFlow;
    private Binding heatMapService;
    private Binding requestRideTypeProvider;
    private Binding rideMap;
    private Binding slideMenuController;

    public void attach(Linker linker)
    {
        heatMapService = linker.requestBinding("me.lyft.android.services.HeatMapService", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
        dailyTotalsRepository = linker.requestBinding("me.lyft.android.application.driver.IDailyTotalsRepository", me/lyft/android/ui/driver/DriverRideIdleView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(heatMapService);
        set1.add(constantsProvider);
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(rideMap);
        set1.add(slideMenuController);
        set1.add(requestRideTypeProvider);
        set1.add(dailyTotalsRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverRideIdleView)obj);
    }

    public void injectMembers(DriverRideIdleView driverrideidleview)
    {
        driverrideidleview.heatMapService = (HeatMapService)heatMapService.get();
        driverrideidleview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        driverrideidleview.appFlow = (AppFlow)appFlow.get();
        driverrideidleview.dialogFlow = (DialogFlow)dialogFlow.get();
        driverrideidleview.bus = (MessageBus)bus.get();
        driverrideidleview.rideMap = (RideMap)rideMap.get();
        driverrideidleview.slideMenuController = (SlideMenuController)slideMenuController.get();
        driverrideidleview.requestRideTypeProvider = (IRequestRideTypeProvider)requestRideTypeProvider.get();
        driverrideidleview.dailyTotalsRepository = (IDailyTotalsRepository)dailyTotalsRepository.get();
    }

    public A()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverRideIdleView", false, me/lyft/android/ui/driver/DriverRideIdleView);
    }
}
