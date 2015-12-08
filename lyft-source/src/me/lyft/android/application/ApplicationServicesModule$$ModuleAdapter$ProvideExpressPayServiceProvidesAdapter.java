// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.application.driver.expresspay.IExpressPayService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding expressPayRepository;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        expressPayRepository = linker.requestBinding("me.lyft.android.application.driver.expresspay.IExpressPayRepository", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IExpressPayService get()
    {
        return module.provideExpressPayService((ILyftApi)lyftApi.get(), (IUserProvider)userProvider.get(), (IExpressPayRepository)expressPayRepository.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(userProvider);
        set.add(expressPayRepository);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.driver.expresspay.IExpressPayService", true, "me.lyft.android.application.ApplicationServicesModule", "provideExpressPayService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
