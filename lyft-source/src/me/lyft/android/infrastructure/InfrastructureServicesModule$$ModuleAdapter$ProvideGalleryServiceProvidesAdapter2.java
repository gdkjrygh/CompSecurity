// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.infrastructure.camera.ICaptureImage;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding captureImage;
    private final InfrastructureServicesModule module;

    public void attach(Linker linker)
    {
        captureImage = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImage", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPhotoPickerService get()
    {
        return module.provideGalleryService((ICaptureImage)captureImage.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(captureImage);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.photo.IPhotoPickerService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGalleryService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
