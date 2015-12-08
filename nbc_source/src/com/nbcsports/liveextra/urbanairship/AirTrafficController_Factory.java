// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.urbanairship;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.urbanairship:
//            AirTrafficController

public final class AirTrafficController_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider applicationProvider;
    private final Provider preferencesProvider;

    public AirTrafficController_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        applicationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            preferencesProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new AirTrafficController_Factory(provider, provider1);
    }

    public AirTrafficController get()
    {
        return new AirTrafficController((Application)applicationProvider.get(), (SharedPreferences)preferencesProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/urbanairship/AirTrafficController_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
