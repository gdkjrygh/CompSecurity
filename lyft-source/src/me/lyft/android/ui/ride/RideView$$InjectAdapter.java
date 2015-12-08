// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideView, RideMap

public final class  extends Binding
    implements MembersInjector
{

    private Binding activityController;
    private Binding appFlow;
    private Binding constantsProvider;
    private Binding destinySession;
    private Binding dialogFlow;
    private Binding passengerRideProvider;
    private Binding preferences;
    private Binding rideMap;
    private Binding routeProvider;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        destinySession = linker.requestBinding("me.lyft.android.application.ride.IDestinySession", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/ride/RideView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(userProvider);
        set1.add(passengerRideProvider);
        set1.add(routeProvider);
        set1.add(rideMap);
        set1.add(destinySession);
        set1.add(activityController);
        set1.add(preferences);
        set1.add(constantsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((RideView)obj);
    }

    public void injectMembers(RideView rideview)
    {
        rideview.appFlow = (AppFlow)appFlow.get();
        rideview.dialogFlow = (DialogFlow)dialogFlow.get();
        rideview.userProvider = (IUserProvider)userProvider.get();
        rideview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        rideview.routeProvider = (IDriverRideProvider)routeProvider.get();
        rideview.rideMap = (RideMap)rideMap.get();
        rideview.destinySession = (IDestinySession)destinySession.get();
        rideview.activityController = (ActivityController)activityController.get();
        rideview.preferences = (ILyftPreferences)preferences.get();
        rideview.constantsProvider = (IConstantsProvider)constantsProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.ride.RideView", false, me/lyft/android/ui/ride/RideView);
    }
}
