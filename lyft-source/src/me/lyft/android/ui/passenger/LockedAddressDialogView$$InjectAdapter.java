// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.passenger:
//            LockedAddressDialogView

public final class I extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding passengerRideProvider;
    private Binding supertype;

    public void attach(Linker linker)
    {
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/LockedAddressDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/LockedAddressDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/LockedAddressDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(passengerRideProvider);
        set1.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((LockedAddressDialogView)obj);
    }

    public void injectMembers(LockedAddressDialogView lockedaddressdialogview)
    {
        lockedaddressdialogview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        lockedaddressdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        supertype.injectMembers(lockedaddressdialogview);
    }

    public I()
    {
        super(null, "members/me.lyft.android.ui.passenger.LockedAddressDialogView", false, me/lyft/android/ui/passenger/LockedAddressDialogView);
    }
}
