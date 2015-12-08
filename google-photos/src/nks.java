// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.social.mediamonitor.MediaMonitor;
import com.google.android.libraries.social.mediamonitor.MediaMonitorIntentService;

public class nks
{

    public volatile boolean a;
    private final Context b;
    private final muz c;
    private boolean d;

    public nks(Context context, muz muz1)
    {
        b = context;
        c = muz1;
    }

    public final void a(Intent intent)
    {
        boolean flag = "com.google.android.libraries.social.mediamonitor.FORCE_RESCAN".equals(intent.getAction());
        if ("com.google.android.libraries.social.mediamonitor.FIRE_ALARM".equals(intent.getAction()))
        {
            d = false;
        }
        a(flag);
    }

    final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!d || flag) goto _L2; else goto _L1
_L1:
        if (!Log.isLoggable("MediaMonitor", 2));
_L5:
        olm.b(b, nkr);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!a || flag) goto _L4; else goto _L3
_L3:
        AlarmManager alarmmanager = (AlarmManager)b.getSystemService("alarm");
        PendingIntent pendingintent = PendingIntent.getBroadcast(b, 1, new Intent("com.google.android.libraries.social.mediamonitor.FIRE_ALARM"), 0x10000000);
        alarmmanager.cancel(pendingintent);
        alarmmanager.set(0, c.a() + 200L, pendingintent);
        d = true;
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L4:
        if (a && !flag) goto _L5; else goto _L6
_L6:
        a = true;
        MediaMonitor.a(b, new Intent(b, com/google/android/libraries/social/mediamonitor/MediaMonitorIntentService));
          goto _L5
    }
}
