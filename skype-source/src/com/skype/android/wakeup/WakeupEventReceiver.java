// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.wakeup:
//            BackgroundLogger, WakeupPeriod, OnWakeupEvent

public class WakeupEventReceiver extends BroadcastReceiver
{

    private static final Logger a;
    private static android.os.PowerManager.WakeLock b;

    public WakeupEventReceiver()
    {
    }

    private static PendingIntent a(Context context, String s, int i, int j)
    {
        Intent intent = new Intent(context, com/skype/android/wakeup/WakeupEventReceiver);
        intent.setAction(s);
        intent.putExtra("com.skype.awake.time", i);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            intent.addFlags(0x10000000);
        }
        return PendingIntent.getBroadcast(context, 0, intent, j);
    }

    public static void a(Context context, String s)
    {
        ((AlarmManager)context.getSystemService("alarm")).cancel(a(context, s, 0, 0));
        a.info((new StringBuilder("alarm cancelled: ")).append(s).toString());
    }

    public static void a(Context context, String s, WakeupPeriod wakeupperiod)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        context = a(context, s, wakeupperiod.c(), 0x10000000);
        long l = SystemClock.elapsedRealtime() + wakeupperiod.b();
        if (wakeupperiod.d())
        {
            alarmmanager.setInexactRepeating(2, l, wakeupperiod.a(), context);
            a.info((new StringBuilder("alarm scheduled repeating every ")).append(wakeupperiod.a()).append(" ms").toString());
            return;
        } else
        {
            alarmmanager.set(2, l, context);
            a.info((new StringBuilder("alarm scheduled in ")).append(wakeupperiod.b()).append(" ms").toString());
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        int i;
        BackgroundLogger.a();
        context = context.getApplicationContext();
        i = intent.getIntExtra("com.skype.awake.time", 0);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        context = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "WakeupEventReceiver");
        b = context;
        context.setReferenceCounted(true);
        b.acquire(i);
        a.info((new StringBuilder("wake lock acquired for ")).append(i).toString());
        EventBusInstance.a().a(new OnWakeupEvent(intent));
_L1:
        return;
        context;
        if (b != null && b.isHeld())
        {
            b.release();
            a.info("wake lock released");
            return;
        }
          goto _L1
    }

    static 
    {
        a = BackgroundLogger.a;
    }
}
