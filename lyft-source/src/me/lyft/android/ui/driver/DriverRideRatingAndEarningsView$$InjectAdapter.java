// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideRatingAndEarningsView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding driverRouteService;
    private Binding imageLoader;
    private Binding progressController;
    private Binding ratingSession;
    private Binding routeProvider;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/driver/DriverRideRatingAndEarningsView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverRideRatingAndEarningsView, getClass().getClassLoader());
        ratingSession = linker.requestBinding("me.lyft.android.application.ride.IRatingSession", me/lyft/android/ui/driver/DriverRideRatingAndEarningsView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/driver/DriverRideRatingAndEarningsView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/DriverRideRatingAndEarningsView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/DriverRideRatingAndEarningsView, getClass().getClassLoader());
        driverRouteService = linker.requestBinding("me.lyft.android.application.ride.IDriverRouteService", me/lyft/android/ui/driver/DriverRideRatingAndEarningsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(imageLoader);
        set1.add(dialogFlow);
        set1.add(ratingSession);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(routeProvider);
        set1.add(driverRouteService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverRideRatingAndEarningsView)obj);
    }

    public void injectMembers(DriverRideRatingAndEarningsView driverrideratingandearningsview)
    {
        driverrideratingandearningsview.imageLoader = (ImageLoader)imageLoader.get();
        driverrideratingandearningsview.dialogFlow = (DialogFlow)dialogFlow.get();
        driverrideratingandearningsview.ratingSession = (IRatingSession)ratingSession.get();
        driverrideratingandearningsview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        driverrideratingandearningsview.progressController = (IProgressController)progressController.get();
        driverrideratingandearningsview.routeProvider = (IDriverRideProvider)routeProvider.get();
        driverrideratingandearningsview.driverRouteService = (IDriverRouteService)driverRouteService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverRideRatingAndEarningsView", false, me/lyft/android/ui/driver/DriverRideRatingAndEarningsView);
    }
}
