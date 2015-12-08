// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.kit.data.PreferencesManager;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.api.remote:
//            ConfigurationApi

public final class ConfigurationApi_Factory
    implements Factory
{

    static final boolean a;
    private final Provider b;

    private ConfigurationApi_Factory(Provider provider)
    {
        if (!a && provider == null)
        {
            throw new AssertionError();
        } else
        {
            b = provider;
            return;
        }
    }

    public static Factory a(Provider provider)
    {
        return new ConfigurationApi_Factory(provider);
    }

    public final Object get()
    {
        return new ConfigurationApi((PreferencesManager)b.get());
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/api/remote/ConfigurationApi_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
