// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.pandora.android.activity.AlarmRingerActivity;
import com.pandora.android.provider.b;
import p.cw.c;
import p.cx.p;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            d, e

public class AlarmClockReceiver extends BroadcastReceiver
{

    public AlarmClockReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        a.a("AlarmClockReceiver", "Received alarm clock intent!");
        int i = intent.getIntExtra("intent_alarm_id", -1);
        if (i == -1)
        {
            a.a("AlarmClockReceiver", "ALARM - AlarmReceiver failed to parse the alarm from the intent");
            return;
        }
        context = new Runnable(context, i) {

            final Context a;
            final int b;
            final AlarmClockReceiver c;

            public void run()
            {
                com.pandora.android.util.d.a();
                com.pandora.android.util.d.a(a);
                b.a.b().z().a();
                Intent intent1 = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                a.sendBroadcast(intent1);
                intent1 = new Intent(a, com/pandora/android/activity/AlarmRingerActivity);
                intent1.putExtra("intent_alarm_id", b);
                intent1.setFlags(0x10040000);
                a.startActivity(intent1);
                p.df.a.a("AlarmClockReceiver", "Starting AlarmRingerActivity");
                com.pandora.android.util.e.a(a).a(a, b);
            }

            
            {
                c = AlarmClockReceiver.this;
                a = context;
                b = i;
                super();
            }
        };
        if (b.a.c().i())
        {
            intent = new Handler();
            b.a.c().f();
            intent.postDelayed(context, 5000L);
            return;
        } else
        {
            context.run();
            return;
        }
    }
}
