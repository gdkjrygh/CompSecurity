// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.infrastructure.assets.IAssetPackagingService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftApplication;
    private final InfrastructureServicesModule module;
    private Binding okHttpClient;
    private Binding preferences;

    public void attach(Linker linker)
    {
        lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IAssetPackagingService get()
    {
        return module.provideAssetPackagingService((LyftApplication)lyftApplication.get(), (ILyftPreferences)preferences.get(), (OkHttpClient)okHttpClient.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApplication);
        set.add(preferences);
        set.add(okHttpClient);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.assets.IAssetPackagingService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideAssetPackagingService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
