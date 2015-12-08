// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver:
//            LastRideExitDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding driverRouteService;
    private Binding progressController;
    private Binding supertype;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/LastRideExitDialogView, getClass().getClassLoader());
        driverRouteService = linker.requestBinding("me.lyft.android.application.ride.IDriverRouteService", me/lyft/android/ui/driver/LastRideExitDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/LastRideExitDialogView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/driver/LastRideExitDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/driver/LastRideExitDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(progressController);
        set1.add(driverRouteService);
        set1.add(dialogFlow);
        set1.add(viewErrorHandler);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((LastRideExitDialogView)obj);
    }

    public void injectMembers(LastRideExitDialogView lastrideexitdialogview)
    {
        lastrideexitdialogview.progressController = (IProgressController)progressController.get();
        lastrideexitdialogview.driverRouteService = (IDriverRouteService)driverRouteService.get();
        lastrideexitdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        lastrideexitdialogview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        supertype.injectMembers(lastrideexitdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.LastRideExitDialogView", false, me/lyft/android/ui/driver/LastRideExitDialogView);
    }
}
