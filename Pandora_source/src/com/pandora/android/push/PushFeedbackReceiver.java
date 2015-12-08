// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.push;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

// Referenced classes of package com.pandora.android.push:
//            PushNotificationProcessor, a

public class PushFeedbackReceiver extends WakefulBroadcastReceiver
{

    public PushFeedbackReceiver()
    {
    }

    private void a(Context context, String s, String s1)
    {
        a(context, PushNotificationProcessor.a(context, s, s1));
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"com.pandora.android.push.PushFeedbackReceiver.ACTION_CLICKED".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        context.startActivity((Intent)intent.getParcelableExtra("EXTRA_DESTINATION_INTENT"));
        com.pandora.android.push.a.a().a(intent.getStringExtra("EXTRA_PUSH_NOTIFICATION_ID"), p.cx.x.a.a, p.cx.x.b.a);
_L4:
        if (intent.hasExtra("EXTRA_PUSH_NOTIFICATION_KEY"))
        {
            a(context, intent.getStringExtra("EXTRA_PUSH_NOTIFICATION_ID"), intent.getStringExtra("EXTRA_PUSH_NOTIFICATION_KEY"));
        }
        return;
_L2:
        if ("com.pandora.android.push.PushFeedbackReceiver.ACTION_REMOVED".equals(intent.getAction()))
        {
            com.pandora.android.push.a.a().a(intent.getStringExtra("EXTRA_PUSH_NOTIFICATION_ID"), p.cx.x.a.b, p.cx.x.b.a);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
