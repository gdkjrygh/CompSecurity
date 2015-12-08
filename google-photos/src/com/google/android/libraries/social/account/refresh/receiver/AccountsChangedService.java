// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.account.refresh.receiver;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import mnj;
import moo;
import olm;

// Referenced classes of package com.google.android.libraries.social.account.refresh.receiver:
//            AccountsChangedReceiver

public final class AccountsChangedService extends IntentService
{

    public AccountsChangedService()
    {
        super("AccountsChangedService");
    }

    protected final void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        ((moo)olm.a(this, moo)).a();
_L2:
        AccountsChangedReceiver.a(intent);
        return;
        Object obj;
        obj;
        if (!Log.isLoggable("AccountsChangedService", 5)) goto _L2; else goto _L1
_L1:
        Log.w("AccountsChangedService", "Failed to refresh accounts", ((Throwable) (obj)));
          goto _L2
        obj;
        AccountsChangedReceiver.a(intent);
        throw obj;
    }
}
