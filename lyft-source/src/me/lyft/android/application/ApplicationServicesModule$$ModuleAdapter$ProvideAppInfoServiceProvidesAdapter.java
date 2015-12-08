// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.features.IFeatureFlagsManager;
import me.lyft.android.infrastructure.assets.IAssetPackagingService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IConstantsProvider, IAppInfoService

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding assetPackagingService;
    private Binding constantsProvider;
    private Binding featureFlagsManager;
    private Binding locationService;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding preferences;

    public void attach(Linker linker)
    {
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        assetPackagingService = linker.requestBinding("me.lyft.android.infrastructure.assets.IAssetPackagingService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        featureFlagsManager = linker.requestBinding("me.lyft.android.features.IFeatureFlagsManager", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IAppInfoService get()
    {
        return module.provideAppInfoService((ILocationService)locationService.get(), (ILyftApi)lyftApi.get(), (IConstantsProvider)constantsProvider.get(), (IAssetPackagingService)assetPackagingService.get(), (IFeatureFlagsManager)featureFlagsManager.get(), (ILyftPreferences)preferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(locationService);
        set.add(lyftApi);
        set.add(constantsProvider);
        set.add(assetPackagingService);
        set.add(featureFlagsManager);
        set.add(preferences);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.IAppInfoService", true, "me.lyft.android.application.ApplicationServicesModule", "provideAppInfoService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
