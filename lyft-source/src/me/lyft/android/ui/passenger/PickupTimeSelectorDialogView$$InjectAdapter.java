// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PickupTimeSelectorDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding preRideInfoRepository;
    private Binding rideRequestSession;
    private Binding supertype;

    public void attach(Linker linker)
    {
        preRideInfoRepository = linker.requestBinding("me.lyft.android.application.ride.IPreRideInfoRepository", me/lyft/android/ui/passenger/PickupTimeSelectorDialogView, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/PickupTimeSelectorDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PickupTimeSelectorDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/PickupTimeSelectorDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(preRideInfoRepository);
        set1.add(rideRequestSession);
        set1.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PickupTimeSelectorDialogView)obj);
    }

    public void injectMembers(PickupTimeSelectorDialogView pickuptimeselectordialogview)
    {
        pickuptimeselectordialogview.preRideInfoRepository = (IPreRideInfoRepository)preRideInfoRepository.get();
        pickuptimeselectordialogview.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        pickuptimeselectordialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        supertype.injectMembers(pickuptimeselectordialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PickupTimeSelectorDialogView", false, me/lyft/android/ui/passenger/PickupTimeSelectorDialogView);
    }
}
