// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.Intent;
import com.pandora.android.activity.AlarmRingerActivity;
import com.pandora.android.provider.b;
import p.cw.c;
import p.cx.p;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            AlarmClockReceiver, d, e

class b
    implements Runnable
{

    final Context a;
    final int b;
    final AlarmClockReceiver c;

    public void run()
    {
        com.pandora.android.util.d.a();
        com.pandora.android.util.d.a(a);
        b.a.b().z().a();
        Intent intent = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        a.sendBroadcast(intent);
        intent = new Intent(a, com/pandora/android/activity/AlarmRingerActivity);
        intent.putExtra("intent_alarm_id", b);
        intent.setFlags(0x10040000);
        a.startActivity(intent);
        p.df.a.a("AlarmClockReceiver", "Starting AlarmRingerActivity");
        com.pandora.android.util.e.a(a).a(a, b);
    }

    ty(AlarmClockReceiver alarmclockreceiver, Context context, int i)
    {
        c = alarmclockreceiver;
        a = context;
        b = i;
        super();
    }
}
