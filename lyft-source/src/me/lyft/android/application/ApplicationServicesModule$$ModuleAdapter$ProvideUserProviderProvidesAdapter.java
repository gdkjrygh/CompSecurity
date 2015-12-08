// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationServicesModule module;

    public volatile Object get()
    {
        return get();
    }

    public IUserProvider get()
    {
        return module.provideUserProvider();
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.IUserProvider", true, "me.lyft.android.application.ApplicationServicesModule", "provideUserProvider");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
