// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideExpenseNoteView

public final class  extends Binding
    implements MembersInjector
{

    private Binding checkoutSession;
    private Binding expenseNoteSession;
    private Binding passengerRideProvider;

    public void attach(Linker linker)
    {
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/ui/passenger/PassengerRideExpenseNoteView, getClass().getClassLoader());
        expenseNoteSession = linker.requestBinding("me.lyft.android.application.ride.IExpenseNoteSession", me/lyft/android/ui/passenger/PassengerRideExpenseNoteView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerRideExpenseNoteView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(checkoutSession);
        set1.add(expenseNoteSession);
        set1.add(passengerRideProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRideExpenseNoteView)obj);
    }

    public void injectMembers(PassengerRideExpenseNoteView passengerrideexpensenoteview)
    {
        passengerrideexpensenoteview.checkoutSession = (ICheckoutSession)checkoutSession.get();
        passengerrideexpensenoteview.expenseNoteSession = (IExpenseNoteSession)expenseNoteSession.get();
        passengerrideexpensenoteview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerRideExpenseNoteView", false, me/lyft/android/ui/passenger/PassengerRideExpenseNoteView);
    }
}
