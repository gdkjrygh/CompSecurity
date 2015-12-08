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
import me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding gson;
    private final InfrastructureServicesModule module;
    private Binding okHttpClient;

    public void attach(Linker linker)
    {
        okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IGoogleGeoApiService get()
    {
        return module.provideGoogleApiService((OkHttpClient)okHttpClient.get(), (Gson)gson.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(okHttpClient);
        set.add(gson);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideGoogleApiService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
