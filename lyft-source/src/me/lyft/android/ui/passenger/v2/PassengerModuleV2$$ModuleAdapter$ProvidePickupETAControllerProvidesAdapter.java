// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerModuleV2, PickupETAPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding bus;
    private Binding geoService;
    private final PassengerModuleV2 module;
    private Binding rideRequestSession;
    private Binding systemRepository;

    public void attach(Linker linker)
    {
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        systemRepository = linker.requestBinding("me.lyft.android.application.system.ILyftSystemRepository", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/v2/PassengerModuleV2, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public PickupETAPresenter get()
    {
        return module.providePickupETAController((MessageBus)bus.get(), (IGeoService)geoService.get(), (ILyftSystemRepository)systemRepository.get(), (IRideRequestSession)rideRequestSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(bus);
        set.add(geoService);
        set.add(systemRepository);
        set.add(rideRequestSession);
    }

    public (PassengerModuleV2 passengermodulev2)
    {
        super("me.lyft.android.ui.passenger.v2.PickupETAPresenter", false, "me.lyft.android.ui.passenger.v2.PassengerModuleV2", "providePickupETAController");
        module = passengermodulev2;
        setLibrary(true);
    }
}
