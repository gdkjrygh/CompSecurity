// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.infrastructure.location.ILocationService;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding locationService;
    private final ApplicationServicesModule module;

    public void attach(Linker linker)
    {
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IDestinySession get()
    {
        return module.provideDestinySession((ILocationService)locationService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(locationService);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IDestinySession", true, "me.lyft.android.application.ApplicationServicesModule", "provideDestinySession");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
