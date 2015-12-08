// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.map.lyft.LyftMapView;
import me.lyft.android.map.lyft.MapOwner;
import me.lyft.android.map.lyft.MarkerBank;
import me.lyft.android.map.lyft.MarkerClickManager;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding mapView;
    private Binding markerBank;
    private Binding markerClickManager;
    private final MainActivityModule module;

    public void attach(Linker linker)
    {
        mapView = linker.requestBinding("me.lyft.android.map.lyft.LyftMapView", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        markerBank = linker.requestBinding("me.lyft.android.map.lyft.MarkerBank", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        markerClickManager = linker.requestBinding("me.lyft.android.map.lyft.MarkerClickManager", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public MapOwner get()
    {
        return module.provideMapOwner((LyftMapView)mapView.get(), (MarkerBank)markerBank.get(), (MarkerClickManager)markerClickManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(mapView);
        set.add(markerBank);
        set.add(markerClickManager);
    }

    public Y(MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.map.lyft.MapOwner", true, "me.lyft.android.ui.MainActivityModule", "provideMapOwner");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
