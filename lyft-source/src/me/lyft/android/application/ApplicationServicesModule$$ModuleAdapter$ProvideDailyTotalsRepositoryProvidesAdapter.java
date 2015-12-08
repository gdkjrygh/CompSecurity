// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;
import me.lyft.android.application.driver.IDailyTotalsRepository;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationServicesModule module;

    public volatile Object get()
    {
        return get();
    }

    public IDailyTotalsRepository get()
    {
        return module.provideDailyTotalsRepository();
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.driver.IDailyTotalsRepository", true, "me.lyft.android.application.ApplicationServicesModule", "provideDailyTotalsRepository");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
