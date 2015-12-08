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
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.ride.RideMap;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.Telephony;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding appForegroundDetector;
    private Binding bus;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding driverRouteService;
    private Binding geoService;
    private Binding imageLoader;
    private Binding locationService;
    private Binding lyftPreferences;
    private Binding navigator;
    private Binding profileFlow;
    private Binding progressController;
    private Binding rideMap;
    private Binding routeProvider;
    private Binding telephony;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        navigator = linker.requestBinding("me.lyft.android.utils.Navigator", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        telephony = linker.requestBinding("me.lyft.android.utils.Telephony", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        profileFlow = linker.requestBinding("me.lyft.android.flows.ProfileFlow", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
        driverRouteService = linker.requestBinding("me.lyft.android.application.ride.IDriverRouteService", me/lyft/android/ui/driver/DriverRideInProgressView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(navigator);
        set1.add(telephony);
        set1.add(progressController);
        set1.add(lyftPreferences);
        set1.add(locationService);
        set1.add(imageLoader);
        set1.add(bus);
        set1.add(dialogFlow);
        set1.add(rideMap);
        set1.add(geoService);
        set1.add(viewErrorHandler);
        set1.add(profileFlow);
        set1.add(appForegroundDetector);
        set1.add(routeProvider);
        set1.add(constantsProvider);
        set1.add(driverRouteService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverRideInProgressView)obj);
    }

    public void injectMembers(DriverRideInProgressView driverrideinprogressview)
    {
        driverrideinprogressview.appFlow = (AppFlow)appFlow.get();
        driverrideinprogressview.navigator = (Navigator)navigator.get();
        driverrideinprogressview.telephony = (Telephony)telephony.get();
        driverrideinprogressview.progressController = (IProgressController)progressController.get();
        driverrideinprogressview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        driverrideinprogressview.locationService = (ILocationService)locationService.get();
        driverrideinprogressview.imageLoader = (ImageLoader)imageLoader.get();
        driverrideinprogressview.bus = (MessageBus)bus.get();
        driverrideinprogressview.dialogFlow = (DialogFlow)dialogFlow.get();
        driverrideinprogressview.rideMap = (RideMap)rideMap.get();
        driverrideinprogressview.geoService = (IGeoService)geoService.get();
        driverrideinprogressview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        driverrideinprogressview.profileFlow = (ProfileFlow)profileFlow.get();
        driverrideinprogressview.appForegroundDetector = (IAppForegroundDetector)appForegroundDetector.get();
        driverrideinprogressview.routeProvider = (IDriverRideProvider)routeProvider.get();
        driverrideinprogressview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        driverrideinprogressview.driverRouteService = (IDriverRouteService)driverRouteService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverRideInProgressView", false, me/lyft/android/ui/driver/DriverRideInProgressView);
    }
}
