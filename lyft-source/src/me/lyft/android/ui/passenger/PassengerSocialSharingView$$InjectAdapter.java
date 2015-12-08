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
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerSocialSharingView

public final class  extends Binding
    implements MembersInjector
{

    private Binding activityController;
    private Binding appFlow;
    private Binding bus;
    private Binding constantsProvider;
    private Binding device;
    private Binding dialogFlow;
    private Binding preferences;
    private Binding rideRequestSession;
    private Binding supertype;
    private Binding userSession;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/PassengerSocialSharingView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(preferences);
        set1.add(device);
        set1.add(userSession);
        set1.add(constantsProvider);
        set1.add(rideRequestSession);
        set1.add(bus);
        set1.add(dialogFlow);
        set1.add(appFlow);
        set1.add(activityController);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerSocialSharingView)obj);
    }

    public void injectMembers(PassengerSocialSharingView passengersocialsharingview)
    {
        passengersocialsharingview.preferences = (ILyftPreferences)preferences.get();
        passengersocialsharingview.device = (IDevice)device.get();
        passengersocialsharingview.userSession = (IUserSession)userSession.get();
        passengersocialsharingview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        passengersocialsharingview.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        passengersocialsharingview.bus = (MessageBus)bus.get();
        passengersocialsharingview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengersocialsharingview.appFlow = (AppFlow)appFlow.get();
        passengersocialsharingview.activityController = (ActivityController)activityController.get();
        supertype.injectMembers(passengersocialsharingview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerSocialSharingView", false, me/lyft/android/ui/passenger/PassengerSocialSharingView);
    }
}
