// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.infrastructure.driverdefense.DriverDefenseStarterService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftPreferences;
    private final InfrastructureServicesModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public DriverDefenseStarterService get()
    {
        return module.provideDriverDefenseStarterService((IUserProvider)userProvider.get(), (ILyftPreferences)lyftPreferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userProvider);
        set.add(lyftPreferences);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.driverdefense.DriverDefenseStarterService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideDriverDefenseStarterService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
