// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IAppStateHandler;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding device;
    private Binding gson;
    private Binding handler;
    private final InfrastructureServicesModule module;
    private Binding okHttpClient;
    private Binding preferences;

    public void attach(Linker linker)
    {
        okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        handler = linker.requestBinding("me.lyft.android.IAppStateHandler", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ILyftApi get()
    {
        return module.provideLyftApi((OkHttpClient)okHttpClient.get(), (Gson)gson.get(), (ILyftPreferences)preferences.get(), (IDevice)device.get(), (IAppStateHandler)handler.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(okHttpClient);
        set.add(gson);
        set.add(preferences);
        set.add(device);
        set.add(handler);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.lyft.ILyftApi", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideLyftApi");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
