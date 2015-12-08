// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.inject:
//            AccountProvider

public final class AccountProvider_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider libProvider;
    private final Provider mapProvider;

    public AccountProvider_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        libProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new AccountProvider_Factory(provider, provider1);
    }

    public final AccountProvider get()
    {
        return new AccountProvider(libProvider, mapProvider);
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/AccountProvider_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
