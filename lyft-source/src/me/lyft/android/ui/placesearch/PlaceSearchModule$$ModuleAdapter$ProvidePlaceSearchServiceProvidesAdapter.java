// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.placesearch.IPlaceSearchService;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding locationService;
    private Binding lyftApi;
    private final PlaceSearchModule module;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPlaceSearchService get()
    {
        return module.providePlaceSearchService((ILyftApi)lyftApi.get(), (ILocationService)locationService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(locationService);
    }

    public (PlaceSearchModule placesearchmodule)
    {
        super("me.lyft.android.infrastructure.placesearch.IPlaceSearchService", false, "me.lyft.android.ui.placesearch.PlaceSearchModule", "providePlaceSearchService");
        module = placesearchmodule;
        setLibrary(false);
    }
}
