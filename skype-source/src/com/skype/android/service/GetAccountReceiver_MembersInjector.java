// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.LoginManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.service:
//            GetAccountReceiver

public final class GetAccountReceiver_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider loginManagerProvider;

    public GetAccountReceiver_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            loginManagerProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new GetAccountReceiver_MembersInjector(provider, provider1);
    }

    public static void injectAccountProvider(GetAccountReceiver getaccountreceiver, Provider provider)
    {
        getaccountreceiver.accountProvider = (AccountProvider)provider.get();
    }

    public static void injectLoginManager(GetAccountReceiver getaccountreceiver, Provider provider)
    {
        getaccountreceiver.loginManager = (LoginManager)provider.get();
    }

    public final void injectMembers(GetAccountReceiver getaccountreceiver)
    {
        if (getaccountreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            getaccountreceiver.accountProvider = (AccountProvider)accountProvider.get();
            getaccountreceiver.loginManager = (LoginManager)loginManagerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((GetAccountReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/service/GetAccountReceiver_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
