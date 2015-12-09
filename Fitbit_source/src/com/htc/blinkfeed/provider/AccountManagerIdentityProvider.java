// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.provider;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

// Referenced classes of package com.htc.blinkfeed.provider:
//            IdentityProvider

public class AccountManagerIdentityProvider
    implements IdentityProvider
{

    public String accountType;
    private AccountManager mAccountManager;
    private String mAccountType;
    public Context mContext;

    public AccountManagerIdentityProvider()
    {
    }

    public Account getAccount()
    {
        mAccountManager = AccountManager.get(mContext);
        mAccountType = accountType;
        Account aaccount[] = mAccountManager.getAccountsByType(mAccountType);
        if (aaccount != null && aaccount.length > 0)
        {
            return aaccount[0];
        } else
        {
            return null;
        }
    }

    public String getAuthenticationIntentURI()
    {
        return null;
    }
}
