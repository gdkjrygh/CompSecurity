// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.utils.Telephony;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCallConfirmationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding passengerRideProvider;
    private Binding supertype;
    private Binding telephony;

    public void attach(Linker linker)
    {
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerCallConfirmationDialogView, getClass().getClassLoader());
        telephony = linker.requestBinding("me.lyft.android.utils.Telephony", me/lyft/android/ui/passenger/PassengerCallConfirmationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/PassengerCallConfirmationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(passengerRideProvider);
        set1.add(telephony);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerCallConfirmationDialogView)obj);
    }

    public void injectMembers(PassengerCallConfirmationDialogView passengercallconfirmationdialogview)
    {
        passengercallconfirmationdialogview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengercallconfirmationdialogview.telephony = (Telephony)telephony.get();
        supertype.injectMembers(passengercallconfirmationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerCallConfirmationDialogView", false, me/lyft/android/ui/passenger/PassengerCallConfirmationDialogView);
    }
}
