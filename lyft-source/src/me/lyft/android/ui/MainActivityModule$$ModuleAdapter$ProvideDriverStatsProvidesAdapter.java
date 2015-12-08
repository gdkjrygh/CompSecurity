// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.driver.IDriverStatsProvider;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftApi;
    private final MainActivityModule module;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IDriverStatsProvider get()
    {
        return module.provideDriverStats((ILyftApi)lyftApi.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.application.driver.IDriverStatsProvider", false, "me.lyft.android.ui.MainActivityModule", "provideDriverStats");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
