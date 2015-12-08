// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android:
//            AppModule, IUserSession, IAppStateHandler

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/AppModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IAppStateHandler get()
    {
        return module.provideAppStateHandler((IUserSession)userSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userSession);
    }

    public (AppModule appmodule)
    {
        super("me.lyft.android.IAppStateHandler", true, "me.lyft.android.AppModule", "provideAppStateHandler");
        module = appmodule;
        setLibrary(true);
    }
}
