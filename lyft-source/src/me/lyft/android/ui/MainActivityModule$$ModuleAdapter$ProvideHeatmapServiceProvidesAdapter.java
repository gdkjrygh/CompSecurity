// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.services.HeatMapService;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding defaultErrorHandler;
    private Binding locationService;
    private Binding lyftApi;
    private final MainActivityModule module;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public HeatMapService get()
    {
        return module.provideHeatmapService((ILyftApi)lyftApi.get(), (ILocationService)locationService.get(), (IDefaultErrorHandler)defaultErrorHandler.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(locationService);
        set.add(defaultErrorHandler);
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.services.HeatMapService", true, "me.lyft.android.ui.MainActivityModule", "provideHeatmapService");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
