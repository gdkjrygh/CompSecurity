// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Bundle;

public class AccountAuthenticator extends AbstractAccountAuthenticator
{

    private Context context;

    public AccountAuthenticator(Context context1)
    {
        super(context1);
        context = context1;
    }

    public Bundle addAccount(AccountAuthenticatorResponse accountauthenticatorresponse, String s, String s1, String as[], Bundle bundle)
        throws NetworkErrorException
    {
        accountauthenticatorresponse = new Bundle();
        accountauthenticatorresponse.putInt("errorCode", 1);
        accountauthenticatorresponse.putString("errorMessage", "Not supported");
        return accountauthenticatorresponse;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, Bundle bundle)
        throws NetworkErrorException
    {
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountauthenticatorresponse, String s)
    {
        return null;
    }

    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountauthenticatorresponse, Account account)
        throws NetworkErrorException
    {
        accountauthenticatorresponse = new Bundle();
        accountauthenticatorresponse.putBoolean("booleanResult", true);
        return accountauthenticatorresponse;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String s, Bundle bundle)
        throws NetworkErrorException
    {
        return null;
    }

    public String getAuthTokenLabel(String s)
    {
        return context.getString(0x7f0801a9);
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String as[])
        throws NetworkErrorException
    {
        accountauthenticatorresponse = new Bundle();
        accountauthenticatorresponse.putBoolean("booleanResult", false);
        return accountauthenticatorresponse;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String s, Bundle bundle)
        throws NetworkErrorException
    {
        accountauthenticatorresponse = new Bundle();
        accountauthenticatorresponse.putInt("errorCode", 1);
        accountauthenticatorresponse.putString("errorMessage", "Not supported");
        return accountauthenticatorresponse;
    }
}
