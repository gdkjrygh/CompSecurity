// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger:
//            ConfirmPickupLocationDialogView

public final class Q extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding rideRequestSession;
    private Binding supertype;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(rideRequestSession);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ConfirmPickupLocationDialogView)obj);
    }

    public void injectMembers(ConfirmPickupLocationDialogView confirmpickuplocationdialogview)
    {
        confirmpickuplocationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        confirmpickuplocationdialogview.bus = (MessageBus)bus.get();
        confirmpickuplocationdialogview.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        supertype.injectMembers(confirmpickuplocationdialogview);
    }

    public Q()
    {
        super(null, "members/me.lyft.android.ui.passenger.ConfirmPickupLocationDialogView", false, me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView);
    }
}
