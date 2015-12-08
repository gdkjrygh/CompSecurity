// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.fordsync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.activity.PandoraIntent;

// Referenced classes of package com.pandora.android.fordsync:
//            a

class  extends BroadcastReceiver
{

    final a a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context != null)
        {
            if (context.equals(PandoraIntent.a("show_page")))
            {
                com.pandora.android.fordsync.a.a(a, "ACTION_SHOW_TAB");
                return;
            }
            if (context.equals(PandoraIntent.a("show_set_account")))
            {
                com.pandora.android.fordsync.a.b(a, "ACTION_SHOW_SET_ACCOUNT - unexpectedly received");
                a.e();
                return;
            }
            if (context.equals(PandoraIntent.a("fordsync_connection_detected")))
            {
                com.pandora.android.fordsync.a.c(a, "ACTION_FORDSYNC_CONNECTION_DETECTED");
                a.t();
                return;
            }
        }
    }

    oraIntent(a a1)
    {
        a = a1;
        super();
    }
}
