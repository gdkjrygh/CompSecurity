// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import com.skype.Account;
import com.skype.AccountImpl;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import javax.inject.Provider;

public class AccountProvider
    implements Provider
{

    private Account account;
    private Provider libProvider;
    private Provider mapProvider;

    public AccountProvider(Provider provider, Provider provider1)
    {
        libProvider = provider;
        mapProvider = provider1;
    }

    public Account get()
    {
        if (account == null)
        {
            account = getDefault();
        }
        return account;
    }

    public Account get(String s)
    {
        reset();
        account = new AccountImpl();
        ((SkyLib)libProvider.get()).getAccount(s, account);
        ((ObjectIdMap)mapProvider.get()).a();
        ((ObjectIdMap)mapProvider.get()).b(account);
        ((ObjectIdMap)mapProvider.get()).a(account);
        return account;
    }

    public volatile Object get()
    {
        return get();
    }

    public Account getDefault()
    {
        return get(((SkyLib)libProvider.get()).getDefaultAccountName());
    }

    public void reset()
    {
        if (account != null)
        {
            account.unlink();
            account = null;
        }
    }
}
