// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiCacheStore;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.api.remote:
//            SendApi

public final class SendApi_Factory
    implements Factory
{

    static final boolean a;
    private final MembersInjector b;
    private final Provider c;

    private SendApi_Factory(MembersInjector membersinjector, Provider provider)
    {
        if (!a && membersinjector == null)
        {
            throw new AssertionError();
        }
        b = membersinjector;
        if (!a && provider == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider;
            return;
        }
    }

    public static Factory a(MembersInjector membersinjector, Provider provider)
    {
        return new SendApi_Factory(membersinjector, provider);
    }

    public final Object get()
    {
        SendApi sendapi = new SendApi((ApiCacheStore)c.get());
        b.injectMembers(sendapi);
        return sendapi;
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/api/remote/SendApi_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
