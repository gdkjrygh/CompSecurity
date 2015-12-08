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
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.application.polling.ILocationUpdateService;
import me.lyft.android.application.polling.IPollingService;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appForegroundDetector;
    private Binding driverDocumentsService;
    private Binding locationService;
    private Binding lyftPreferences;
    private final ApplicationServicesModule module;
    private Binding pollingRequestService;

    public void attach(Linker linker)
    {
        pollingRequestService = linker.requestBinding("me.lyft.android.application.polling.ILocationUpdateService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        driverDocumentsService = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPollingService get()
    {
        return module.providePollingService((ILocationUpdateService)pollingRequestService.get(), (ILocationService)locationService.get(), (ILyftPreferences)lyftPreferences.get(), (IDriverDocumentsService)driverDocumentsService.get(), (IAppForegroundDetector)appForegroundDetector.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(pollingRequestService);
        set.add(locationService);
        set.add(lyftPreferences);
        set.add(driverDocumentsService);
        set.add(appForegroundDetector);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.polling.IPollingService", true, "me.lyft.android.application.ApplicationServicesModule", "providePollingService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
