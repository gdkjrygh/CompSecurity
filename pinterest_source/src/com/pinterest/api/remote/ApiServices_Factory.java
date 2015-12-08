// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.api.remote:
//            ApiServices, ConfigurationApi, SendApi

public final class ApiServices_Factory
    implements Factory
{

    static final boolean a;
    private final Provider b;
    private final Provider c;

    private ApiServices_Factory(Provider provider, Provider provider1)
    {
        if (!a && provider == null)
        {
            throw new AssertionError();
        }
        b = provider;
        if (!a && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider1;
            return;
        }
    }

    public static Factory a(Provider provider, Provider provider1)
    {
        return new ApiServices_Factory(provider, provider1);
    }

    public final Object get()
    {
        return new ApiServices((ConfigurationApi)b.get(), (SendApi)c.get());
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/api/remote/ApiServices_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
