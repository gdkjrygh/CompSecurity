// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            WidgetModule, FixedFareWidgetPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final WidgetModule module;
    private Binding passengerRequestRidePresenter;
    private Binding preRideInfoRepository;
    private Binding rideRequestSession;
    private Binding router;

    public void attach(Linker linker)
    {
        preRideInfoRepository = linker.requestBinding("me.lyft.android.application.ride.IPreRideInfoRepository", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
        passengerRequestRidePresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
        router = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public FixedFareWidgetPresenter get()
    {
        return module.provideFixedFareWidgetPresenter((IPreRideInfoRepository)preRideInfoRepository.get(), (IRideRequestSession)rideRequestSession.get(), (PassengerRequestRidePresenterV2)passengerRequestRidePresenter.get(), (PassengerRequestRideRouter)router.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(preRideInfoRepository);
        set.add(rideRequestSession);
        set.add(passengerRequestRidePresenter);
        set.add(router);
    }

    public (WidgetModule widgetmodule)
    {
        super("me.lyft.android.ui.passenger.v2.widgets.FixedFareWidgetPresenter", true, "me.lyft.android.ui.passenger.v2.widgets.WidgetModule", "provideFixedFareWidgetPresenter");
        module = widgetmodule;
        setLibrary(false);
    }
}
