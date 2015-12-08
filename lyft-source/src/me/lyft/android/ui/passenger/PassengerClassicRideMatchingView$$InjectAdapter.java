// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideMatchingView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding passengerRideProvider;
    private Binding preferences;
    private Binding rideMap;
    private Binding slideMenuController;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PassengerClassicRideMatchingView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PassengerClassicRideMatchingView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerClassicRideMatchingView, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/PassengerClassicRideMatchingView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerClassicRideMatchingView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/PassengerClassicRideMatchingView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerClassicRideMatchingView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/passenger/PassengerClassicRideMatchingView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userSession);
        set1.add(constantsProvider);
        set1.add(passengerRideProvider);
        set1.add(preferences);
        set1.add(dialogFlow);
        set1.add(rideMap);
        set1.add(appFlow);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerClassicRideMatchingView)obj);
    }

    public void injectMembers(PassengerClassicRideMatchingView passengerclassicridematchingview)
    {
        passengerclassicridematchingview.userSession = (IUserSession)userSession.get();
        passengerclassicridematchingview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        passengerclassicridematchingview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengerclassicridematchingview.preferences = (ILyftPreferences)preferences.get();
        passengerclassicridematchingview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengerclassicridematchingview.rideMap = (RideMap)rideMap.get();
        passengerclassicridematchingview.appFlow = (AppFlow)appFlow.get();
        passengerclassicridematchingview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerClassicRideMatchingView", false, me/lyft/android/ui/passenger/PassengerClassicRideMatchingView);
    }
}
