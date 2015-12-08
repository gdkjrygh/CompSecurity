// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PrimeTimeRequestRideDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding requestRideTypeProvider;
    private Binding rideRequestSession;
    private Binding supertype;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(constantsProvider);
        set1.add(requestRideTypeProvider);
        set1.add(rideRequestSession);
        set1.add(bus);
        set1.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PrimeTimeRequestRideDialogView)obj);
    }

    public void injectMembers(PrimeTimeRequestRideDialogView primetimerequestridedialogview)
    {
        primetimerequestridedialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        primetimerequestridedialogview.requestRideTypeProvider = (IRequestRideTypeProvider)requestRideTypeProvider.get();
        primetimerequestridedialogview.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        primetimerequestridedialogview.bus = (MessageBus)bus.get();
        primetimerequestridedialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        supertype.injectMembers(primetimerequestridedialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView", false, me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView);
    }
}
