// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.infrastructure.competition.InstallTrackerService;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private Binding device;
    private final InfrastructureServicesModule module;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public InstallTrackerService get()
    {
        return module.provideInstallTrackerService((IConstantsProvider)constantsProvider.get(), (IDevice)device.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(constantsProvider);
        set.add(device);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.competition.InstallTrackerService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideInstallTrackerService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
