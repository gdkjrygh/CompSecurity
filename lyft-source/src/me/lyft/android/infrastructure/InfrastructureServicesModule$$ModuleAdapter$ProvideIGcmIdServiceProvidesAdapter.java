// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.infrastructure.gcm.GcmIdService;
import me.lyft.android.infrastructure.gcm.IGcmIdService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding gcmIdService;
    private final InfrastructureServicesModule module;

    public void attach(Linker linker)
    {
        gcmIdService = linker.requestBinding("me.lyft.android.infrastructure.gcm.GcmIdService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IGcmIdService get()
    {
        return module.provideIGcmIdService((GcmIdService)gcmIdService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(gcmIdService);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.gcm.IGcmIdService", false, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideIGcmIdService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
