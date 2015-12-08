// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.map.lyft.MarkerBank;
import me.lyft.android.map.lyft.MarkerClickManager;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding markerBank;
    private final MainActivityModule module;

    public void attach(Linker linker)
    {
        markerBank = linker.requestBinding("me.lyft.android.map.lyft.MarkerBank", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public MarkerClickManager get()
    {
        return module.provideMarkerClickManager((MarkerBank)markerBank.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(markerBank);
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.map.lyft.MarkerClickManager", true, "me.lyft.android.ui.MainActivityModule", "provideMarkerClickManager");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
