// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Context;
import android.content.Intent;
import java.util.logging.Logger;

public class AccountStatusNotifier
{

    private static final Logger log = Logger.getLogger("AccountStatusNotifier");
    private final Context context;

    public AccountStatusNotifier(Context context1)
    {
        context = context1;
    }

    public void sendLoggedIn(String s)
    {
        Intent intent = new Intent("com.skype.ACTION_ACCOUNT_STATUS");
        intent.putExtra("loggedIn", true);
        intent.putExtra("skypeName", s);
        context.sendBroadcast(intent, "com.skype.permission.ACCOUNT");
        log.info("Broadcast logged in");
    }

    public void sendLoggedOut()
    {
        Intent intent = new Intent("com.skype.ACTION_ACCOUNT_STATUS");
        intent.putExtra("loggedIn", false);
        context.sendBroadcast(intent, "com.skype.permission.ACCOUNT");
        log.info("Broadcast logged out");
    }

}
