// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding googleApiProvider;
    private final InfrastructureServicesModule module;

    public void attach(Linker linker)
    {
        googleApiProvider = linker.requestBinding("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IGooglePlaceService get()
    {
        return module.provideGooglePlaceService((IGoogleApiProvider)googleApiProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(googleApiProvider);
    }

    public y(InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.googleplaces.IGooglePlaceService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGooglePlaceService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
