// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import com.skype.android.inject.LoginManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.service:
//            AccountService

public final class AccountService_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider loginManagerProvider;
    private final Provider skyLibProvider;

    public AccountService_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        loginManagerProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            skyLibProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new AccountService_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAccountProvider(AccountService accountservice, Provider provider)
    {
        accountservice.accountProvider = provider;
    }

    public static void injectLoginManager(AccountService accountservice, Provider provider)
    {
        accountservice.loginManager = (LoginManager)provider.get();
    }

    public static void injectSkyLibProvider(AccountService accountservice, Provider provider)
    {
        accountservice.skyLibProvider = provider;
    }

    public final void injectMembers(AccountService accountservice)
    {
        if (accountservice == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            accountservice.loginManager = (LoginManager)loginManagerProvider.get();
            accountservice.accountProvider = accountProvider;
            accountservice.skyLibProvider = skyLibProvider;
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AccountService)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/service/AccountService_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
