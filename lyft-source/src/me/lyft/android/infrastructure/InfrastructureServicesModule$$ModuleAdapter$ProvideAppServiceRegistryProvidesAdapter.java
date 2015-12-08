// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.polling.IBackgroundLocationAppProcess;
import me.lyft.android.application.polling.IPollingAppProcess;
import me.lyft.android.infrastructure.service.AppProcessRegistry;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding backgroundLocationSupervisor;
    private final InfrastructureServicesModule module;
    private Binding pollingSupervisor;

    public void attach(Linker linker)
    {
        pollingSupervisor = linker.requestBinding("me.lyft.android.application.polling.IPollingAppProcess", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        backgroundLocationSupervisor = linker.requestBinding("me.lyft.android.application.polling.IBackgroundLocationAppProcess", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public AppProcessRegistry get()
    {
        return module.provideAppServiceRegistry((IPollingAppProcess)pollingSupervisor.get(), (IBackgroundLocationAppProcess)backgroundLocationSupervisor.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(pollingSupervisor);
        set.add(backgroundLocationSupervisor);
    }

    public y(InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.service.AppProcessRegistry", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideAppServiceRegistry");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
