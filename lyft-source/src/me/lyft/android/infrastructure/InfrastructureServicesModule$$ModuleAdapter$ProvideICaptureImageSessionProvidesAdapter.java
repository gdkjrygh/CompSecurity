// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.infrastructure.camera.CaptureImageSession;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final InfrastructureServicesModule module;
    private Binding session;

    public void attach(Linker linker)
    {
        session = linker.requestBinding("me.lyft.android.infrastructure.camera.CaptureImageSession", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ICaptureImageSession get()
    {
        return module.provideICaptureImageSession((CaptureImageSession)session.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(session);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.camera.ICaptureImageSession", false, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideICaptureImageSession");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
