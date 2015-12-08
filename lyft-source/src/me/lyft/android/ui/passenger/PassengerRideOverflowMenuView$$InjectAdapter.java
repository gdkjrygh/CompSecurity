// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.sms.ISmsService;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideOverflowMenuView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding fareRepository;
    private Binding passengerRideProvider;
    private Binding passengerRideService;
    private Binding progressController;
    private Binding smsService;
    private Binding splitFareStateRepository;
    private Binding userSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        smsService = linker.requestBinding("me.lyft.android.infrastructure.sms.ISmsService", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        passengerRideService = linker.requestBinding("me.lyft.android.application.ride.IPassengerRideService", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        fareRepository = linker.requestBinding("me.lyft.android.application.ride.IRideFareRepository", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
        splitFareStateRepository = linker.requestBinding("me.lyft.android.application.splitfare.ISplitFareStateRepository", me/lyft/android/ui/passenger/PassengerRideOverflowMenuView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(progressController);
        set1.add(smsService);
        set1.add(viewErrorHandler);
        set1.add(userSession);
        set1.add(passengerRideProvider);
        set1.add(constantsProvider);
        set1.add(passengerRideService);
        set1.add(fareRepository);
        set1.add(splitFareStateRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRideOverflowMenuView)obj);
    }

    public void injectMembers(PassengerRideOverflowMenuView passengerrideoverflowmenuview)
    {
        passengerrideoverflowmenuview.appFlow = (AppFlow)appFlow.get();
        passengerrideoverflowmenuview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengerrideoverflowmenuview.progressController = (IProgressController)progressController.get();
        passengerrideoverflowmenuview.smsService = (ISmsService)smsService.get();
        passengerrideoverflowmenuview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        passengerrideoverflowmenuview.userSession = (IUserSession)userSession.get();
        passengerrideoverflowmenuview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengerrideoverflowmenuview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        passengerrideoverflowmenuview.passengerRideService = (IPassengerRideService)passengerRideService.get();
        passengerrideoverflowmenuview.fareRepository = (IRideFareRepository)fareRepository.get();
        passengerrideoverflowmenuview.splitFareStateRepository = (ISplitFareStateRepository)splitFareStateRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerRideOverflowMenuView", false, me/lyft/android/ui/passenger/PassengerRideOverflowMenuView);
    }
}
