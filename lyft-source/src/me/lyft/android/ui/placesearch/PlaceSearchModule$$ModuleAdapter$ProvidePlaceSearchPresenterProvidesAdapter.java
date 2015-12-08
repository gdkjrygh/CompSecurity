// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.res.Resources;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.application.topdestinations.ITopDestinationProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.placesearch.IPlaceSearchService;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchModule, IPlaceSearchPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding googlePlaceService;
    private Binding locationService;
    private final PlaceSearchModule module;
    private Binding placeSearchService;
    private Binding resources;
    private Binding shortcutService;
    private Binding topDestinationProvider;

    public void attach(Linker linker)
    {
        googlePlaceService = linker.requestBinding("me.lyft.android.infrastructure.googleplaces.IGooglePlaceService", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
        shortcutService = linker.requestBinding("me.lyft.android.application.shortcuts.IShortcutService", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
        topDestinationProvider = linker.requestBinding("me.lyft.android.application.topdestinations.ITopDestinationProvider", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
        placeSearchService = linker.requestBinding("me.lyft.android.infrastructure.placesearch.IPlaceSearchService", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
        resources = linker.requestBinding("android.content.res.Resources", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/placesearch/PlaceSearchModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPlaceSearchPresenter get()
    {
        return module.providePlaceSearchPresenter((IGooglePlaceService)googlePlaceService.get(), (ILocationService)locationService.get(), (IShortcutService)shortcutService.get(), (ITopDestinationProvider)topDestinationProvider.get(), (IPlaceSearchService)placeSearchService.get(), (AppFlow)appFlow.get(), (Resources)resources.get(), (IConstantsProvider)constantsProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(googlePlaceService);
        set.add(locationService);
        set.add(shortcutService);
        set.add(topDestinationProvider);
        set.add(placeSearchService);
        set.add(appFlow);
        set.add(resources);
        set.add(constantsProvider);
    }

    public (PlaceSearchModule placesearchmodule)
    {
        super("me.lyft.android.ui.placesearch.IPlaceSearchPresenter", false, "me.lyft.android.ui.placesearch.PlaceSearchModule", "providePlaceSearchPresenter");
        module = placesearchmodule;
        setLibrary(false);
    }
}
