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
import me.lyft.android.application.settings.ISettingsService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding userSession;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ISettingsService get()
    {
        return module.providePhoneVerificationService((ILyftApi)lyftApi.get(), (IUserSession)userSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(userSession);
    }

    public y(ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.settings.ISettingsService", true, "me.lyft.android.application.ApplicationServicesModule", "providePhoneVerificationService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
