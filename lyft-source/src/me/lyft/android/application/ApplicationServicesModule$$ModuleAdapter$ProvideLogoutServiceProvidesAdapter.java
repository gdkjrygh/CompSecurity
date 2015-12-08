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
import me.lyft.android.IUserSession;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.persistence.ISimpleStorage;
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider, ILogoutService

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding driverDocumentsStorage;
    private Binding facebookService;
    private Binding lyftApi;
    private Binding lyftApplication;
    private final ApplicationServicesModule module;
    private Binding preferences;
    private Binding rideRequestSession;
    private Binding simpleStorage;
    private Binding userProvider;
    private Binding userSession;

    public void attach(Linker linker)
    {
        lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        facebookService = linker.requestBinding("me.lyft.android.infrastructure.facebook.IFacebookService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        driverDocumentsStorage = linker.requestBinding("me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        simpleStorage = linker.requestBinding("me.lyft.android.persistence.ISimpleStorage", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ILogoutService get()
    {
        return module.provideLogoutService((LyftApplication)lyftApplication.get(), (IUserSession)userSession.get(), (IRideRequestSession)rideRequestSession.get(), (ILyftApi)lyftApi.get(), (ILyftPreferences)preferences.get(), (IFacebookService)facebookService.get(), (IDriverDocumentsStorage)driverDocumentsStorage.get(), (ISimpleStorage)simpleStorage.get(), (IUserProvider)userProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApplication);
        set.add(userSession);
        set.add(rideRequestSession);
        set.add(lyftApi);
        set.add(preferences);
        set.add(facebookService);
        set.add(driverDocumentsStorage);
        set.add(simpleStorage);
        set.add(userProvider);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ILogoutService", true, "me.lyft.android.application.ApplicationServicesModule", "provideLogoutService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
