// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dmz;
import faq;
import far;

// Referenced classes of package com.spotify.mobile.android.spotlets.player:
//            SleepTimerManager

public class SleepTimerBroadcastReceiver extends BroadcastReceiver
{

    public SleepTimerBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = intent.getBooleanExtra("is_active", true);
        dmz.a(far);
        context = far.a(context);
        if (!flag && context.b())
        {
            intent = ((faq) (context)).a;
            Intent intent1 = new Intent(((faq) (context)).c, com/spotify/mobile/android/spotlets/player/SleepTimerManager);
            context.b = PendingIntent.getBroadcast(((faq) (context)).c, 0, intent1, 0x8000000);
            intent.cancel(((faq) (context)).b);
            context.b = null;
            context.a();
            intent = new Intent("sleep_timer_cancelled");
            ((faq) (context)).c.sendBroadcast(intent, "com.spotify.music.permission.INTERNAL_BROADCAST");
        }
    }
}
