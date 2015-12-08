// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.geo.IEtaRepository;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IConstantsProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private Binding etaAnalyticService;
    private Binding etaRepository;
    private Binding googleApiService;
    private Binding lyftApi;
    private final ApplicationServicesModule module;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        googleApiService = linker.requestBinding("me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        etaRepository = linker.requestBinding("me.lyft.android.application.geo.IEtaRepository", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        etaAnalyticService = linker.requestBinding("me.lyft.android.application.geo.IEtaAnalyticService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IGeoService get()
    {
        return module.provideGeoService((ILyftApi)lyftApi.get(), (IConstantsProvider)constantsProvider.get(), (IGoogleGeoApiService)googleApiService.get(), (IEtaRepository)etaRepository.get(), (IEtaAnalyticService)etaAnalyticService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(constantsProvider);
        set.add(googleApiService);
        set.add(etaRepository);
        set.add(etaAnalyticService);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.geo.IGeoService", true, "me.lyft.android.application.ApplicationServicesModule", "provideGeoService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
