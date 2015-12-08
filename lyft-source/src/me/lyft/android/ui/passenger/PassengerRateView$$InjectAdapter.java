// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRateView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding checkoutSession;
    private Binding etaAnalyticService;
    private Binding expenseNoteSession;
    private Binding imageLoader;
    private Binding passengerRideProvider;
    private Binding ratingSession;

    public void attach(Linker linker)
    {
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/ui/passenger/PassengerRateView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerRateView, getClass().getClassLoader());
        ratingSession = linker.requestBinding("me.lyft.android.application.ride.IRatingSession", me/lyft/android/ui/passenger/PassengerRateView, getClass().getClassLoader());
        expenseNoteSession = linker.requestBinding("me.lyft.android.application.ride.IExpenseNoteSession", me/lyft/android/ui/passenger/PassengerRateView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/passenger/PassengerRateView, getClass().getClassLoader());
        etaAnalyticService = linker.requestBinding("me.lyft.android.application.geo.IEtaAnalyticService", me/lyft/android/ui/passenger/PassengerRateView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerRateView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(checkoutSession);
        set1.add(passengerRideProvider);
        set1.add(ratingSession);
        set1.add(expenseNoteSession);
        set1.add(imageLoader);
        set1.add(etaAnalyticService);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerRateView)obj);
    }

    public void injectMembers(PassengerRateView passengerrateview)
    {
        passengerrateview.checkoutSession = (ICheckoutSession)checkoutSession.get();
        passengerrateview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengerrateview.ratingSession = (IRatingSession)ratingSession.get();
        passengerrateview.expenseNoteSession = (IExpenseNoteSession)expenseNoteSession.get();
        passengerrateview.imageLoader = (ImageLoader)imageLoader.get();
        passengerrateview.etaAnalyticService = (IEtaAnalyticService)etaAnalyticService.get();
        passengerrateview.appFlow = (AppFlow)appFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerRateView", false, me/lyft/android/ui/passenger/PassengerRateView);
    }
}
