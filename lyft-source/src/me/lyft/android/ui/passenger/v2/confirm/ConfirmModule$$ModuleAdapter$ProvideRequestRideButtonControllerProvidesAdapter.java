// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IRideRequestService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            ConfirmModule, RequestRideButtonPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding bus;
    private Binding chargeAccountsProvider;
    private Binding displayManager;
    private Binding locationSettingsService;
    private final ConfirmModule module;
    private Binding progressController;
    private Binding requestRidePresenterV2;
    private Binding rideMap;
    private Binding rideRequestService;
    private Binding rideRequestSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        rideRequestService = linker.requestBinding("me.lyft.android.application.ride.IRideRequestService", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        locationSettingsService = linker.requestBinding("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        displayManager = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        requestRidePresenterV2 = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/v2/confirm/ConfirmModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public RequestRideButtonPresenter get()
    {
        return module.provideRequestRideButtonController((IRideRequestService)rideRequestService.get(), (IProgressController)progressController.get(), (IViewErrorHandler)viewErrorHandler.get(), (IChargeAccountsProvider)chargeAccountsProvider.get(), (ILocationSettingsService)locationSettingsService.get(), (RideMap)rideMap.get(), (MessageBus)bus.get(), (PassengerRequestRideRouter)displayManager.get(), (PassengerRequestRidePresenterV2)requestRidePresenterV2.get(), (IRideRequestSession)rideRequestSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(rideRequestService);
        set.add(progressController);
        set.add(viewErrorHandler);
        set.add(chargeAccountsProvider);
        set.add(locationSettingsService);
        set.add(rideMap);
        set.add(bus);
        set.add(displayManager);
        set.add(requestRidePresenterV2);
        set.add(rideRequestSession);
    }

    public (ConfirmModule confirmmodule)
    {
        super("me.lyft.android.ui.passenger.v2.confirm.RequestRideButtonPresenter", true, "me.lyft.android.ui.passenger.v2.confirm.ConfirmModule", "provideRequestRideButtonController");
        module = confirmmodule;
        setLibrary(false);
    }
}
