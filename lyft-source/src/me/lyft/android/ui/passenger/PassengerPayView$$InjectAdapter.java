// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerPayView

public final class ry extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding checkoutSession;
    private Binding dialogFlow;
    private Binding expenseNoteSession;
    private Binding imageLoader;
    private Binding passengerRideProvider;
    private Binding slideMenuController;
    private Binding splitFareStateRepository;
    private Binding userProvider;
    private Binding userSession;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        splitFareStateRepository = linker.requestBinding("me.lyft.android.application.splitfare.ISplitFareStateRepository", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        expenseNoteSession = linker.requestBinding("me.lyft.android.application.ride.IExpenseNoteSession", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/passenger/PassengerPayView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(imageLoader);
        set1.add(passengerRideProvider);
        set1.add(splitFareStateRepository);
        set1.add(userSession);
        set1.add(checkoutSession);
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(userProvider);
        set1.add(expenseNoteSession);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerPayView)obj);
    }

    public void injectMembers(PassengerPayView passengerpayview)
    {
        passengerpayview.imageLoader = (ImageLoader)imageLoader.get();
        passengerpayview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengerpayview.splitFareStateRepository = (ISplitFareStateRepository)splitFareStateRepository.get();
        passengerpayview.userSession = (IUserSession)userSession.get();
        passengerpayview.checkoutSession = (ICheckoutSession)checkoutSession.get();
        passengerpayview.appFlow = (AppFlow)appFlow.get();
        passengerpayview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengerpayview.bus = (MessageBus)bus.get();
        passengerpayview.userProvider = (IUserProvider)userProvider.get();
        passengerpayview.expenseNoteSession = (IExpenseNoteSession)expenseNoteSession.get();
        passengerpayview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public ry()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerPayView", false, me/lyft/android/ui/passenger/PassengerPayView);
    }
}
