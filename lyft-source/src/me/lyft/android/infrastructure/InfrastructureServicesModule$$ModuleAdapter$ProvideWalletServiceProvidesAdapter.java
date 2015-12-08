// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import me.lyft.android.infrastructure.wallet.IWalletService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding googleApiProvider;
    private final InfrastructureServicesModule module;
    private Binding preferences;

    public void attach(Linker linker)
    {
        googleApiProvider = linker.requestBinding("me.lyft.android.infrastructure.googleplay.IGoogleApiProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IWalletService get()
    {
        return module.provideWalletService((IGoogleApiProvider)googleApiProvider.get(), (ILyftPreferences)preferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(googleApiProvider);
        set.add(preferences);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.wallet.IWalletService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideWalletService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
