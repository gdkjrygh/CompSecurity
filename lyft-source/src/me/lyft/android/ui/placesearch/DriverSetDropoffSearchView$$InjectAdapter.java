// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            DriverSetDropoffSearchView, IPlaceSearchPresenter

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding driverRouteService;
    private Binding navigator;
    private Binding placeSearchPresenter;
    private Binding progressController;
    private Binding supertype;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/placesearch/DriverSetDropoffSearchView, getClass().getClassLoader());
        driverRouteService = linker.requestBinding("me.lyft.android.application.ride.IDriverRouteService", me/lyft/android/ui/placesearch/DriverSetDropoffSearchView, getClass().getClassLoader());
        placeSearchPresenter = linker.requestBinding("me.lyft.android.ui.placesearch.IPlaceSearchPresenter", me/lyft/android/ui/placesearch/DriverSetDropoffSearchView, getClass().getClassLoader());
        navigator = linker.requestBinding("me.lyft.android.utils.Navigator", me/lyft/android/ui/placesearch/DriverSetDropoffSearchView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/placesearch/DriverSetDropoffSearchView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/placesearch/DriverSetDropoffSearchView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.placesearch.PlaceSearchView", me/lyft/android/ui/placesearch/DriverSetDropoffSearchView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userSession);
        set1.add(driverRouteService);
        set1.add(placeSearchPresenter);
        set1.add(navigator);
        set1.add(appFlow);
        set1.add(progressController);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverSetDropoffSearchView)obj);
    }

    public void injectMembers(DriverSetDropoffSearchView driversetdropoffsearchview)
    {
        driversetdropoffsearchview.userSession = (IUserSession)userSession.get();
        driversetdropoffsearchview.driverRouteService = (IDriverRouteService)driverRouteService.get();
        driversetdropoffsearchview.placeSearchPresenter = (IPlaceSearchPresenter)placeSearchPresenter.get();
        driversetdropoffsearchview.navigator = (Navigator)navigator.get();
        driversetdropoffsearchview.appFlow = (AppFlow)appFlow.get();
        driversetdropoffsearchview.progressController = (IProgressController)progressController.get();
        supertype.injectMembers(driversetdropoffsearchview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.placesearch.DriverSetDropoffSearchView", false, me/lyft/android/ui/placesearch/DriverSetDropoffSearchView);
    }
}
