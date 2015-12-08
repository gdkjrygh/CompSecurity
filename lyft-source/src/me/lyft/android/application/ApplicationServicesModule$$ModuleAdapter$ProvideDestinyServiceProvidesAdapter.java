// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IConstantsProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private Binding destinySession;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        destinySession = linker.requestBinding("me.lyft.android.application.ride.IDestinySession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IDestinyService get()
    {
        return module.provideDestinyService((IUserSession)userSession.get(), (ILyftApi)lyftApi.get(), (IDestinySession)destinySession.get(), (IConstantsProvider)constantsProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userSession);
        set.add(lyftApi);
        set.add(destinySession);
        set.add(constantsProvider);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IDestinyService", true, "me.lyft.android.application.ApplicationServicesModule", "provideDestinyService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
