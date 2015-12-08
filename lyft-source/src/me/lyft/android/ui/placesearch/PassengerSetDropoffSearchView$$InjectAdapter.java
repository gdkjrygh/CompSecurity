// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PassengerSetDropoffSearchView, IPlaceSearchPresenter

public final class Q extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding passengerRideProvider;
    private Binding passengerRideService;
    private Binding placeSearchPresenter;
    private Binding progressController;
    private Binding supertype;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/placesearch/PassengerSetDropoffSearchView, getClass().getClassLoader());
        passengerRideService = linker.requestBinding("me.lyft.android.application.ride.IPassengerRideService", me/lyft/android/ui/placesearch/PassengerSetDropoffSearchView, getClass().getClassLoader());
        placeSearchPresenter = linker.requestBinding("me.lyft.android.ui.placesearch.IPlaceSearchPresenter", me/lyft/android/ui/placesearch/PassengerSetDropoffSearchView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/placesearch/PassengerSetDropoffSearchView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/placesearch/PassengerSetDropoffSearchView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/placesearch/PassengerSetDropoffSearchView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.placesearch.PlaceSearchView", me/lyft/android/ui/placesearch/PassengerSetDropoffSearchView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(passengerRideProvider);
        set1.add(passengerRideService);
        set1.add(placeSearchPresenter);
        set1.add(progressController);
        set1.add(appFlow);
        set1.add(viewErrorHandler);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerSetDropoffSearchView)obj);
    }

    public void injectMembers(PassengerSetDropoffSearchView passengersetdropoffsearchview)
    {
        passengersetdropoffsearchview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengersetdropoffsearchview.passengerRideService = (IPassengerRideService)passengerRideService.get();
        passengersetdropoffsearchview.placeSearchPresenter = (IPlaceSearchPresenter)placeSearchPresenter.get();
        passengersetdropoffsearchview.progressController = (IProgressController)progressController.get();
        passengersetdropoffsearchview.appFlow = (AppFlow)appFlow.get();
        passengersetdropoffsearchview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        supertype.injectMembers(passengersetdropoffsearchview);
    }

    public Q()
    {
        super(null, "members/me.lyft.android.ui.placesearch.PassengerSetDropoffSearchView", false, me/lyft/android/ui/placesearch/PassengerSetDropoffSearchView);
    }
}
