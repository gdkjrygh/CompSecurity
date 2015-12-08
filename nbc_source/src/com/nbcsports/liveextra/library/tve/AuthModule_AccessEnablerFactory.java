// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.app.Application;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AuthModule

public final class AuthModule_AccessEnablerFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider applicationProvider;
    private final AuthModule module;

    public AuthModule_AccessEnablerFactory(AuthModule authmodule, Provider provider)
    {
        if (!$assertionsDisabled && authmodule == null)
        {
            throw new AssertionError();
        }
        module = authmodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            applicationProvider = provider;
            return;
        }
    }

    public static Factory create(AuthModule authmodule, Provider provider)
    {
        return new AuthModule_AccessEnablerFactory(authmodule, provider);
    }

    public AccessEnabler get()
    {
        AccessEnabler accessenabler = module.accessEnabler((Application)applicationProvider.get());
        if (accessenabler == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return accessenabler;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/tve/AuthModule_AccessEnablerFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
