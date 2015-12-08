// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.Calendar;

public class ics
{

    public final mmv a;
    public final NotificationManager b;
    private icr c;

    ics(Context context, mmv mmv1, icr icr1)
    {
        a = mmv1;
        c = icr1;
        b = (NotificationManager)context.getSystemService("notification");
    }

    public void a(int i, cn cn1)
    {
        Object obj = c;
        long l = ((icr) (obj)).b.a();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        int j = calendar.get(11);
        boolean flag;
        boolean flag1;
        byte byte0;
        boolean flag2;
        boolean flag4;
        if ((long)j < ((icr) (obj)).d || (long)j > ((icr) (obj)).c)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (((icr) (obj)).g.a())
        {
            noy.a("current hour", Integer.valueOf(j));
            noy.a("pmQuietHourStart", Long.valueOf(((icr) (obj)).c));
            noy.a("amQuietHourEnd", Long.valueOf(((icr) (obj)).d));
            noy.a("result", Boolean.valueOf(flag2));
        }
        if (flag2)
        {
            flag4 = false;
        } else
        {
            if (l - ((icr) (obj)).a() > icr.a)
            {
                ((icr) (obj)).a(-1);
            }
            long l1 = ((icr) (obj)).a() + Math.min(icr.a, Math.round((double)((icr) (obj)).f * Math.pow(2D, ((icr) (obj)).b())));
            boolean flag3;
            if (l > l1 || l1 == 0L)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            flag4 = flag3;
            if (((icr) (obj)).g.a())
            {
                noy.a("current time", Long.valueOf(l));
                noy.a("next allowed time", Long.valueOf(l1));
                noy.a("num notifications", Integer.valueOf(((icr) (obj)).b()));
                noy.a("last notification time", Long.valueOf(((icr) (obj)).a()));
                noy.a("time remaining", Long.valueOf(l1 - l));
                noy.a("quietPeriodDurationMillis", Long.valueOf(((icr) (obj)).f));
                noy.a("can alert", Boolean.valueOf(flag3));
                flag4 = flag3;
            }
        }
        if (!flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = false;
        byte0 = 4;
        if (c(i) && !flag1)
        {
            flag = true;
            byte0 = 6;
        } else
        {
            cn1.v.vibrate = null;
        }
        obj = b(i);
        if ("no_ringtone".equals(obj))
        {
            cn1.a(null);
        } else
        if (!flag1)
        {
            flag = true;
            if (obj != null)
            {
                cn1.a(Uri.parse(((String) (obj))));
            } else
            {
                cn1.a(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI);
            }
        }
        cn1.b(byte0);
        if (flag)
        {
            cn1 = c;
            l = ((icr) (cn1)).b.a();
            ((icr) (cn1)).e.edit().putLong("com.google.android.apps.photos.settings.notifications.NotificationThrottler.last_notification_time", l).commit();
            cn1.a(cn1.b() + 1);
        }
    }

    public final void a(int i, String s)
    {
        a.b(i).h("com.google.android.apps.photos.settings.notifications").c("tone", s).d();
    }

    public final boolean a(int i)
    {
        return a.a(i).d("com.google.android.apps.photos.settings.notifications").a("enabled", true);
    }

    public final String b(int i)
    {
        return a.a(i).d("com.google.android.apps.photos.settings.notifications").a("tone", null);
    }

    public final boolean c(int i)
    {
        return a.a(i).d("com.google.android.apps.photos.settings.notifications").a("vibration", false);
    }
}
