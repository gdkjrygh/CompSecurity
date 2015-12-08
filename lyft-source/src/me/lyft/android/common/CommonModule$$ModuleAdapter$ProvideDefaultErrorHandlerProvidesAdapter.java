// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.errorhandling.IDefaultErrorHandler;

// Referenced classes of package me.lyft.android.common:
//            CommonModule, AppFlow, DialogFlow

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding logoutService;
    private final CommonModule module;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/common/CommonModule, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/common/CommonModule, getClass().getClassLoader());
        logoutService = linker.requestBinding("me.lyft.android.application.ILogoutService", me/lyft/android/common/CommonModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IDefaultErrorHandler get()
    {
        return module.provideDefaultErrorHandler((AppFlow)appFlow.get(), (DialogFlow)dialogFlow.get(), (ILogoutService)logoutService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(appFlow);
        set.add(dialogFlow);
        set.add(logoutService);
    }

    public (CommonModule commonmodule)
    {
        super("me.lyft.android.errorhandling.IDefaultErrorHandler", false, "me.lyft.android.common.CommonModule", "provideDefaultErrorHandler");
        module = commonmodule;
        setLibrary(true);
    }
}
