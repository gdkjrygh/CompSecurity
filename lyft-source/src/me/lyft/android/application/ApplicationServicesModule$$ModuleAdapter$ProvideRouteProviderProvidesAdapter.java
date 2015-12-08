// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.ride.IDriverRideProvider;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationServicesModule module;
    private Binding preferences;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IDriverRideProvider get()
    {
        return module.provideRouteProvider((ILyftPreferences)preferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(preferences);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IDriverRideProvider", true, "me.lyft.android.application.ApplicationServicesModule", "provideRouteProvider");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
