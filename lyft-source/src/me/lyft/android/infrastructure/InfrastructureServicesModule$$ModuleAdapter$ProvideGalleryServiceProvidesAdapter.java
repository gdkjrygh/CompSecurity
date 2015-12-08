// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.infrastructure.gallery.IGalleryService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding captureImageSession;
    private final InfrastructureServicesModule module;

    public void attach(Linker linker)
    {
        captureImageSession = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImageSession", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IGalleryService get()
    {
        return module.provideGalleryService((ICaptureImageSession)captureImageSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(captureImageSession);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.gallery.IGalleryService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGalleryService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
