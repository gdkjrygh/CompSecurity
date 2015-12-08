// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.camera.CaptureImageSession;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appFlow;
    private final InfrastructureServicesModule module;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public CaptureImageSession get()
    {
        return module.provideCaptureImageSession((AppFlow)appFlow.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(appFlow);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.camera.CaptureImageSession", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideCaptureImageSession");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
