// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AnvatoService, AuthService

public final class AnvatoService_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider anvatoApiProvider;
    private final Provider contextProvider;
    private final MembersInjector membersInjector;
    private final Provider passProvider;

    public AnvatoService_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        anvatoApiProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        passProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            contextProvider = provider2;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new AnvatoService_Factory(membersinjector, provider, provider1, provider2);
    }

    public AnvatoService get()
    {
        AnvatoService anvatoservice = new AnvatoService((Anvato.API)anvatoApiProvider.get(), (AuthService)passProvider.get(), (Context)contextProvider.get());
        membersInjector.injectMembers(anvatoservice);
        return anvatoservice;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/tve/AnvatoService_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
