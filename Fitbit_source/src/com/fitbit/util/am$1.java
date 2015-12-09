// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.util:
//            am

class castReceiver extends BroadcastReceiver
{

    final am a;

    public void onReceive(Context context, Intent intent)
    {
        if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(intent.getAction()))
        {
            a.a(context, false);
        }
    }

    t(am am1)
    {
        a = am1;
        super();
    }
}
