// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.ICancellationOptionsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCancellationConfirmationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding cancellationOptionsProvider;
    private Binding dialogFlow;
    private Binding driverRouteService;
    private Binding progressController;
    private Binding routeProvider;
    private Binding supertype;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView, getClass().getClassLoader());
        cancellationOptionsProvider = linker.requestBinding("me.lyft.android.application.ride.ICancellationOptionsProvider", me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView, getClass().getClassLoader());
        driverRouteService = linker.requestBinding("me.lyft.android.application.ride.IDriverRouteService", me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(routeProvider);
        set1.add(cancellationOptionsProvider);
        set1.add(bus);
        set1.add(progressController);
        set1.add(driverRouteService);
        set1.add(viewErrorHandler);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverCancellationConfirmationDialogView)obj);
    }

    public void injectMembers(DriverCancellationConfirmationDialogView drivercancellationconfirmationdialogview)
    {
        drivercancellationconfirmationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        drivercancellationconfirmationdialogview.routeProvider = (IDriverRideProvider)routeProvider.get();
        drivercancellationconfirmationdialogview.cancellationOptionsProvider = (ICancellationOptionsProvider)cancellationOptionsProvider.get();
        drivercancellationconfirmationdialogview.bus = (MessageBus)bus.get();
        drivercancellationconfirmationdialogview.progressController = (IProgressController)progressController.get();
        drivercancellationconfirmationdialogview.driverRouteService = (IDriverRouteService)driverRouteService.get();
        drivercancellationconfirmationdialogview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        supertype.injectMembers(drivercancellationconfirmationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverCancellationConfirmationDialogView", false, me/lyft/android/ui/driver/DriverCancellationConfirmationDialogView);
    }
}
