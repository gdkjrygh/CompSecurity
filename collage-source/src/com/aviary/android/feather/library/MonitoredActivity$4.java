// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.aviary.android.feather.library:
//            MonitoredActivity

class a extends BroadcastReceiver
{

    final MonitoredActivity a;

    public void onReceive(Context context, Intent intent)
    {
        Log.i("MonitoredActivity", (new StringBuilder()).append("onReceive: ").append(intent).toString());
        if (intent != null && context != null)
        {
            context = intent.getAction();
            if ("aviary.intent.action.KILL".equals(context))
            {
                MonitoredActivity.c(a);
            } else
            if ("aviary.intent.action.ALERT".equals(context))
            {
                MonitoredActivity.a(a, intent);
                return;
            }
        }
    }

    (MonitoredActivity monitoredactivity)
    {
        a = monitoredactivity;
        super();
    }
}
