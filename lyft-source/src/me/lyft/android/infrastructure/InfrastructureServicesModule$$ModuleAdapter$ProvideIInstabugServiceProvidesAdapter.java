// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.infrastructure.instabug.IInstabugService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final InfrastructureServicesModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IInstabugService get()
    {
        return module.provideIInstabugService((LyftApplication)application.get(), (IUserProvider)userProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(userProvider);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.instabug.IInstabugService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideIInstabugService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
