// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            TitleBar

class q extends com.facebook.base.broadcast.q
{

    final TitleBar a;

    q(TitleBar titlebar, Context context, IntentFilter intentfilter)
    {
        a = titlebar;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if ("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED".equals(intent.getAction()))
        {
            a.invalidate();
        } else
        {
            if ("com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED".equals(intent.getAction()) || "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE".equals(intent.getAction()) || "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE".equals(intent.getAction()))
            {
                TitleBar.a(a);
                return;
            }
            if ("com.facebook.orca.fbwebrtc.CALL_STATUS_AND_DURATION_UPDATE".equals(intent.getAction()))
            {
                TitleBar.b(a);
                return;
            }
        }
    }
}
