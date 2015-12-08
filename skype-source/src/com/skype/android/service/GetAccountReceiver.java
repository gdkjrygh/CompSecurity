// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.skype.Account;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.LoginManager;

public class GetAccountReceiver extends SkypeBroadcastReceiver
{

    public static final String ACTION_GET_ACCOUNT = "com.skype.ACTION_GET_ACCOUNT";
    public static final String EXTRA_LOGGED_IN = "loggedIn";
    public static final String EXTRA_SKYPE_NAME = "skypeName";
    AccountProvider accountProvider;
    LoginManager loginManager;

    public GetAccountReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        getComponent(context).inject(this);
        if ("com.skype.ACTION_GET_ACCOUNT".equals(intent.getAction()) && isOrderedBroadcast())
        {
            context = new Bundle();
            if (loginManager.isLoggedOut())
            {
                context.putBoolean("loggedIn", false);
            } else
            {
                context.putBoolean("loggedIn", true);
                context.putString("skypeName", accountProvider.get().getSkypenameProp());
            }
            setResult(-1, null, context);
        }
    }
}
