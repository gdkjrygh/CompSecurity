// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.service.AppProcessRegistry;

// Referenced classes of package me.lyft.android.services:
//            AppService

public final class gistry extends Binding
    implements MembersInjector, Provider
{

    private Binding appProcessRegistry;
    private Binding defaultErrorHandler;
    private Binding supertype;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appProcessRegistry = linker.requestBinding("me.lyft.android.infrastructure.service.AppProcessRegistry", me/lyft/android/services/AppService, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/services/AppService, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/services/AppService, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.services.LyftService", me/lyft/android/services/AppService, getClass().getClassLoader(), false, true);
    }

    public volatile Object get()
    {
        return get();
    }

    public AppService get()
    {
        AppService appservice = new AppService();
        injectMembers(appservice);
        return appservice;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appProcessRegistry);
        set1.add(userProvider);
        set1.add(defaultErrorHandler);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AppService)obj);
    }

    public void injectMembers(AppService appservice)
    {
        appservice.appProcessRegistry = (AppProcessRegistry)appProcessRegistry.get();
        appservice.userProvider = (IUserProvider)userProvider.get();
        appservice.defaultErrorHandler = (IDefaultErrorHandler)defaultErrorHandler.get();
        supertype.injectMembers(appservice);
    }

    public gistry()
    {
        super("me.lyft.android.services.AppService", "members/me.lyft.android.services.AppService", false, me/lyft/android/services/AppService);
    }
}
