// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.assets.IAssetLoadingService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.map.lyft.MapOwner;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding assetLoadingService;
    private Binding constantsProvider;
    private Binding defaultErrorHandler;
    private Binding geoService;
    private Binding locationService;
    private Binding mapOwner;
    private final MainActivityModule module;
    private Binding passengerRideProvider;
    private Binding routeProvider;
    private Binding shortcutService;

    public void attach(Linker linker)
    {
        mapOwner = linker.requestBinding("me.lyft.android.map.lyft.MapOwner", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        assetLoadingService = linker.requestBinding("me.lyft.android.infrastructure.assets.IAssetLoadingService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        shortcutService = linker.requestBinding("me.lyft.android.application.shortcuts.IShortcutService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public RideMap get()
    {
        return module.provideRideView((MapOwner)mapOwner.get(), (IAssetLoadingService)assetLoadingService.get(), (IDriverRideProvider)routeProvider.get(), (IPassengerRideProvider)passengerRideProvider.get(), (IGeoService)geoService.get(), (ILocationService)locationService.get(), (IDefaultErrorHandler)defaultErrorHandler.get(), (IShortcutService)shortcutService.get(), (IConstantsProvider)constantsProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(mapOwner);
        set.add(assetLoadingService);
        set.add(routeProvider);
        set.add(passengerRideProvider);
        set.add(geoService);
        set.add(locationService);
        set.add(defaultErrorHandler);
        set.add(shortcutService);
        set.add(constantsProvider);
    }

    public Y(MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.ui.ride.RideMap", true, "me.lyft.android.ui.MainActivityModule", "provideRideView");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
