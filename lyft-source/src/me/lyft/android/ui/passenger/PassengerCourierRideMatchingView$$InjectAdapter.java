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
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding passengerRideProvider;
    private Binding preRideInfoRepository;
    private Binding preferences;
    private Binding rideMap;
    private Binding slideMenuController;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
        preRideInfoRepository = linker.requestBinding("me.lyft.android.application.ride.IPreRideInfoRepository", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/passenger/PassengerCourierRideMatchingView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userSession);
        set1.add(constantsProvider);
        set1.add(passengerRideProvider);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(preferences);
        set1.add(rideMap);
        set1.add(preRideInfoRepository);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerCourierRideMatchingView)obj);
    }

    public void injectMembers(PassengerCourierRideMatchingView passengercourierridematchingview)
    {
        passengercourierridematchingview.userSession = (IUserSession)userSession.get();
        passengercourierridematchingview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        passengercourierridematchingview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengercourierridematchingview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengercourierridematchingview.bus = (MessageBus)bus.get();
        passengercourierridematchingview.preferences = (ILyftPreferences)preferences.get();
        passengercourierridematchingview.rideMap = (RideMap)rideMap.get();
        passengercourierridematchingview.preRideInfoRepository = (IPreRideInfoRepository)preRideInfoRepository.get();
        passengercourierridematchingview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerCourierRideMatchingView", false, me/lyft/android/ui/passenger/PassengerCourierRideMatchingView);
    }
}
