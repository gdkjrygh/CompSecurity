// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.res.Resources;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.errorhandling.IDefaultErrorHandler;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule, IViewErrorHandler

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding defaultErrorHandler;
    private Binding dialogFlow;
    private final MainActivityModule module;
    private Binding resources;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        resources = linker.requestBinding("android.content.res.Resources", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IViewErrorHandler get()
    {
        return module.provideViewErrorHandler((IDefaultErrorHandler)defaultErrorHandler.get(), (DialogFlow)dialogFlow.get(), (Resources)resources.get(), (IUserProvider)userProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(defaultErrorHandler);
        set.add(dialogFlow);
        set.add(resources);
        set.add(userProvider);
    }

    public a(MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.ui.IViewErrorHandler", false, "me.lyft.android.ui.MainActivityModule", "provideViewErrorHandler");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
