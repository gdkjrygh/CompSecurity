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
import me.lyft.android.infrastructure.assets.IAssetLoadingService;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding device;
    private Binding imageLoader;
    private Binding lyftApplication;
    private final InfrastructureServicesModule module;

    public void attach(Linker linker)
    {
        lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IAssetLoadingService get()
    {
        return module.provideLoadingService((LyftApplication)lyftApplication.get(), (IDevice)device.get(), (ImageLoader)imageLoader.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApplication);
        set.add(device);
        set.add(imageLoader);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.assets.IAssetLoadingService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideLoadingService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
