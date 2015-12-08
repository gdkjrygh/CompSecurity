// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleService

public final class ScheduleService_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider gsonProvider;
    private final Provider urlProvider;

    public ScheduleService_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        clientProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        gsonProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            urlProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ScheduleService_Factory(provider, provider1, provider2);
    }

    public ScheduleService get()
    {
        return new ScheduleService((OkHttpClient)clientProvider.get(), (Gson)gsonProvider.get(), (String)urlProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/schedule/ScheduleService_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
