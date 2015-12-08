// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.ICancellationOptionsProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCancelRideDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding cancellationOptionsProvider;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding passengerRideProvider;
    private Binding passengerRideService;
    private Binding progressController;
    private Binding supertype;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PassengerCancelRideDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerCancelRideDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/passenger/PassengerCancelRideDialogView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/passenger/PassengerCancelRideDialogView, getClass().getClassLoader());
        passengerRideService = linker.requestBinding("me.lyft.android.application.ride.IPassengerRideService", me/lyft/android/ui/passenger/PassengerCancelRideDialogView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerCancelRideDialogView, getClass().getClassLoader());
        cancellationOptionsProvider = linker.requestBinding("me.lyft.android.application.ride.ICancellationOptionsProvider", me/lyft/android/ui/passenger/PassengerCancelRideDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/PassengerCancelRideDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(constantsProvider);
        set1.add(dialogFlow);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(passengerRideService);
        set1.add(passengerRideProvider);
        set1.add(cancellationOptionsProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerCancelRideDialogView)obj);
    }

    public void injectMembers(PassengerCancelRideDialogView passengercancelridedialogview)
    {
        passengercancelridedialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        passengercancelridedialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengercancelridedialogview.progressController = (IProgressController)progressController.get();
        passengercancelridedialogview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        passengercancelridedialogview.passengerRideService = (IPassengerRideService)passengerRideService.get();
        passengercancelridedialogview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengercancelridedialogview.cancellationOptionsProvider = (ICancellationOptionsProvider)cancellationOptionsProvider.get();
        supertype.injectMembers(passengercancelridedialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerCancelRideDialogView", false, me/lyft/android/ui/passenger/PassengerCancelRideDialogView);
    }
}
