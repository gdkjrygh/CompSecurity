// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.ridehistory.IPassengerRideHistoryService;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryDetailedView

public final class  extends Binding
    implements MembersInjector
{

    private Binding imageLoader;
    private Binding lyftPreferences;
    private Binding passengerRideHistoryService;
    private Binding progressController;
    private Binding signUrlService;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        passengerRideHistoryService = linker.requestBinding("me.lyft.android.application.ridehistory.IPassengerRideHistoryService", me/lyft/android/ui/ridehistory/PassengerRideHistoryDetailedView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/ridehistory/PassengerRideHistoryDetailedView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/ridehistory/PassengerRideHistoryDetailedView, getClass().getClassLoader());
        signUrlService = linker.requestBinding("me.lyft.android.application.settings.ISignUrlService", me/lyft/android/ui/ridehistory/PassengerRideHistoryDetailedView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/ridehistory/PassengerRideHistoryDetailedView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/ridehistory/PassengerRideHistoryDetailedView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(passengerRideHistoryService);
        set1.add(imageLoader);
        set1.add(progressController);
        set1.add(signUrlService);
        set1.add(viewErrorHandler);
        set1.add(lyftPreferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRideHistoryDetailedView)obj);
    }

    public void injectMembers(PassengerRideHistoryDetailedView passengerridehistorydetailedview)
    {
        passengerridehistorydetailedview.passengerRideHistoryService = (IPassengerRideHistoryService)passengerRideHistoryService.get();
        passengerridehistorydetailedview.imageLoader = (ImageLoader)imageLoader.get();
        passengerridehistorydetailedview.progressController = (IProgressController)progressController.get();
        passengerridehistorydetailedview.signUrlService = (ISignUrlService)signUrlService.get();
        passengerridehistorydetailedview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        passengerridehistorydetailedview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.ridehistory.PassengerRideHistoryDetailedView", false, me/lyft/android/ui/ridehistory/PassengerRideHistoryDetailedView);
    }
}
