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
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftApplication;
    private final InfrastructureServicesModule module;

    public void attach(Linker linker)
    {
        lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ILocationSettingsService get()
    {
        return module.provideILocationSettingsService((LyftApplication)lyftApplication.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApplication);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.locationsettings.ILocationSettingsService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideILocationSettingsService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
