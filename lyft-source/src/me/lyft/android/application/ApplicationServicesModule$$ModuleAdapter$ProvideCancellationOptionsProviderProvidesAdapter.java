// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ride.ICancellationOptionsProvider;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IConstantsProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private final ApplicationServicesModule module;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ICancellationOptionsProvider get()
    {
        return module.provideCancellationOptionsProvider((IConstantsProvider)constantsProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(constantsProvider);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.ICancellationOptionsProvider", true, "me.lyft.android.application.ApplicationServicesModule", "provideCancellationOptionsProvider");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
