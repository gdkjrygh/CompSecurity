// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.account:
//            LoginAccountsChangedService

public class LoginAccountsChangedReceiver extends BroadcastReceiver
{

    private static final String TAG = com/google/android/apps/wallet/account/LoginAccountsChangedReceiver.getSimpleName();

    public LoginAccountsChangedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        WLog.v(TAG, "Received LoginAccountsChanged");
        context.startService(LoginAccountsChangedService.createIntent(context));
    }

}
