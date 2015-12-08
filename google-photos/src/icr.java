// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.concurrent.TimeUnit;

class icr
{

    static final long a;
    private static final oqe h;
    private static final oqe i = new oqe("photos.debug.qp_start_hour", "21");
    private static final oqe j = new oqe("photos.debug.qp_end_hour", "9");
    final muz b;
    final long c;
    final long d;
    final SharedPreferences e;
    final long f;
    final noz g;

    icr(Context context, muz muz)
    {
        this(context, muz, Long.valueOf(h.a).longValue(), Long.valueOf(i.a).longValue(), Long.valueOf(j.a).longValue());
    }

    private icr(Context context, muz muz, long l, long l1, long l2)
    {
        b = muz;
        f = l;
        c = l1;
        d = l2;
        g = noz.a(context, 3, "Throttler", new String[0]);
        e = PreferenceManager.getDefaultSharedPreferences(context);
    }

    long a()
    {
        return e.getLong("com.google.android.apps.photos.settings.notifications.NotificationThrottler.last_notification_time", 0L);
    }

    void a(int k)
    {
        e.edit().putInt("com.google.android.apps.photos.settings.notifications.NotificationThrottler.num_notifications", k).commit();
    }

    int b()
    {
        return e.getInt("com.google.android.apps.photos.settings.notifications.NotificationThrottler.num_notifications", -1);
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
        h = new oqe("photos.debug.co_duration", String.valueOf(TimeUnit.HOURS.toMillis(1L)));
    }
}
