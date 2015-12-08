// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.onboarding.OnboardActivity;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthenticatorService

public static class accountOperations extends AbstractAccountAuthenticator
{

    private final AccountOperations accountOperations;
    private final Context context;
    private final Handler handler = new Handler();

    public Bundle addAccount(AccountAuthenticatorResponse accountauthenticatorresponse, String s, String s1, String as[], Bundle bundle)
        throws NetworkErrorException
    {
        s1 = new Bundle();
        if (AccountManager.get(context).getAccountsByType(s).length == 0)
        {
            s = new Intent(context, com/soundcloud/android/onboarding/OnboardActivity);
            s.addFlags(0x4000000);
            s.putExtra("accountAuthenticatorResponse", accountauthenticatorresponse);
            s1.putParcelable("intent", s);
            return s1;
        } else
        {
            s1.putInt("errorCode", 0);
            s1.putString("errorMessage", context.getString(0x7f070060));
            class _cls1
                implements Runnable
            {

                final AuthenticatorService.SoundCloudAuthenticator this$0;

                public void run()
                {
                    AndroidUtils.showToast(context, 0x7f070060, new Object[0]);
                }

            _cls1()
            {
                this$0 = AuthenticatorService.SoundCloudAuthenticator.this;
                super();
            }
            }

            handler.post(new _cls1());
            return s1;
        }
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
        accountauthenticatorresponse = super.getAccountRemovalAllowed(accountauthenticatorresponse, account);
        if (accountauthenticatorresponse != null && accountauthenticatorresponse.containsKey("booleanResult") && !accountauthenticatorresponse.containsKey("intent") && accountauthenticatorresponse.getBoolean("booleanResult"))
        {
            DefaultSubscriber.fireAndForget(accountOperations.purgeUserData());
        }
        return accountauthenticatorresponse;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String s, Bundle bundle)
        throws NetworkErrorException
    {
        return null;
    }

    public String getAuthTokenLabel(String s)
    {
        return null;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String as[])
        throws NetworkErrorException
    {
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountauthenticatorresponse, Account account, String s, Bundle bundle)
        throws NetworkErrorException
    {
        return null;
    }


    public _cls1(Context context1, AccountOperations accountoperations)
    {
        super(context1);
        context = context1;
        accountOperations = accountoperations;
    }
}
