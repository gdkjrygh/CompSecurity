// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ridehistory.IPassengerRideHistoryService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryListView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding passengerHistoryService;
    private Binding progressController;
    private Binding slideMenuController;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/ridehistory/PassengerRideHistoryListView, getClass().getClassLoader());
        passengerHistoryService = linker.requestBinding("me.lyft.android.application.ridehistory.IPassengerRideHistoryService", me/lyft/android/ui/ridehistory/PassengerRideHistoryListView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/ridehistory/PassengerRideHistoryListView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/ridehistory/PassengerRideHistoryListView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/ridehistory/PassengerRideHistoryListView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(passengerHistoryService);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRideHistoryListView)obj);
    }

    public void injectMembers(PassengerRideHistoryListView passengerridehistorylistview)
    {
        passengerridehistorylistview.appFlow = (AppFlow)appFlow.get();
        passengerridehistorylistview.passengerHistoryService = (IPassengerRideHistoryService)passengerHistoryService.get();
        passengerridehistorylistview.progressController = (IProgressController)progressController.get();
        passengerridehistorylistview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        passengerridehistorylistview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.ridehistory.PassengerRideHistoryListView", false, me/lyft/android/ui/ridehistory/PassengerRideHistoryListView);
    }
}
