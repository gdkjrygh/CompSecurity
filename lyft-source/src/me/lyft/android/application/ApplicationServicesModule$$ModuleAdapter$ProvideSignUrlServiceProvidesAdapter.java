// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftApi;
    private final ApplicationServicesModule module;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ISignUrlService get()
    {
        return module.provideSignUrlService((ILyftApi)lyftApi.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.settings.ISignUrlService", true, "me.lyft.android.application.ApplicationServicesModule", "provideSignUrlService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
