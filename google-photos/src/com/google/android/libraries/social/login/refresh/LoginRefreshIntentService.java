// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.login.refresh;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import mnj;
import ngc;
import ngf;
import olm;

// Referenced classes of package com.google.android.libraries.social.login.refresh:
//            LoginRefreshWakefulBroadcastReceiver

public final class LoginRefreshIntentService extends IntentService
{

    public LoginRefreshIntentService()
    {
        super("LoginRefresh");
    }

    protected final void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        ngc ngc1 = (ngc)olm.a(this, ngc);
        ngf ngf1 = new ngf();
        ngf1.c = true;
        ngf1.a = false;
        ngf1.b = 0L;
        ngc1.a(ngf1.a());
_L2:
        LoginRefreshWakefulBroadcastReceiver.a(intent);
        return;
        Object obj;
        obj;
        if (!Log.isLoggable("LoginRefreshIntentSrvc", 6)) goto _L2; else goto _L1
_L1:
        Log.e("LoginRefreshIntentSrvc", "Failed to refresh accounts", ((Throwable) (obj)));
          goto _L2
        obj;
        LoginRefreshWakefulBroadcastReceiver.a(intent);
        throw obj;
    }
}
