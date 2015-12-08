// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.passenger:
//            StandbyConfirmationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding passengerRideProvider;
    private Binding passengerRideService;
    private Binding progressController;
    private Binding supertype;

    public void attach(Linker linker)
    {
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/StandbyConfirmationDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/StandbyConfirmationDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/StandbyConfirmationDialogView, getClass().getClassLoader());
        passengerRideService = linker.requestBinding("me.lyft.android.application.ride.IPassengerRideService", me/lyft/android/ui/passenger/StandbyConfirmationDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/passenger/StandbyConfirmationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/StandbyConfirmationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(passengerRideProvider);
        set1.add(bus);
        set1.add(dialogFlow);
        set1.add(passengerRideService);
        set1.add(progressController);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((StandbyConfirmationDialogView)obj);
    }

    public void injectMembers(StandbyConfirmationDialogView standbyconfirmationdialogview)
    {
        standbyconfirmationdialogview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        standbyconfirmationdialogview.bus = (MessageBus)bus.get();
        standbyconfirmationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        standbyconfirmationdialogview.passengerRideService = (IPassengerRideService)passengerRideService.get();
        standbyconfirmationdialogview.progressController = (IProgressController)progressController.get();
        supertype.injectMembers(standbyconfirmationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.StandbyConfirmationDialogView", false, me/lyft/android/ui/passenger/StandbyConfirmationDialogView);
    }
}
