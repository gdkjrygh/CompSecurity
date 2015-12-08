// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.profile.IProfilePhotoFileRecipient;
import me.lyft.android.infrastructure.profile.ProfilePhotoLoader;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final InfrastructureServicesModule module;
    private Binding myProfilePhotoLoader;

    public void attach(Linker linker)
    {
        myProfilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.ProfilePhotoLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IProfilePhotoFileRecipient get()
    {
        return module.provideProfilePhotoFileRecipient((ProfilePhotoLoader)myProfilePhotoLoader.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(myProfilePhotoLoader);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.application.profile.IProfilePhotoFileRecipient", false, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideProfilePhotoFileRecipient");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
