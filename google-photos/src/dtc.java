// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.analytics.alive.AliveLogReceiver;

final class dtc
{

    final Context a;
    final lvz b;
    final AlarmManager c;
    private final lzn d;
    private final noz e;

    dtc(Context context)
    {
        a = context;
        d = (lzn)olm.a(context, lzn);
        b = (lvz)olm.a(context, lvz);
        c = (AlarmManager)context.getSystemService("alarm");
        e = noz.a(context, 3, "AliveLogger", new String[0]);
    }

    boolean a()
    {
        return d.a(a) == 0;
    }

    boolean b()
    {
        boolean flag = false;
        if (PendingIntent.getBroadcast(a, 0, c(), 0x20000000) != null)
        {
            flag = true;
        }
        return flag;
    }

    Intent c()
    {
        Intent intent = new Intent(a, com/google/android/apps/photos/analytics/alive/AliveLogReceiver);
        intent.setAction("com.google.android.apps.photos.alivelog.DAILY_LOG");
        return intent;
    }
}
