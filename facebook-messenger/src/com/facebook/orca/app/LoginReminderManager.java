// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.b.b;
import com.facebook.base.broadcast.q;
import com.facebook.f.n;
import com.facebook.orca.auth.StartScreenActivity;
import com.facebook.orca.notify.an;
import com.facebook.orca.prefs.o;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import java.util.Calendar;

// Referenced classes of package com.facebook.orca.app:
//            d

public class LoginReminderManager
{

    private static final Class a = com/facebook/orca/app/LoginReminderManager;
    private final ae b = n.a("messenger_logout_notify_android");
    private final Context c;
    private final d d;
    private final b e;
    private final an f;
    private final av g;
    private final AlarmManager h;
    private final NotificationManager i;

    public LoginReminderManager(Context context, b b1, d d1, an an1, av av1)
    {
        c = context;
        e = b1;
        d = d1;
        f = an1;
        g = av1;
        h = (AlarmManager)context.getSystemService("alarm");
        i = (NotificationManager)context.getSystemService("notification");
        b1 = new IntentFilter();
        b1.addAction("com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI");
        b1.addAction("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE");
        b1.addAction("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE");
        (new com.facebook.orca.app.d(this, context, b1)).a();
    }

    private void a(int j)
    {
        Object obj;
        Calendar calendar;
        obj = new Intent(c, com/facebook/orca/app/LoginReminderManager$AlarmBroadcastReceiver);
        ((Intent) (obj)).setAction("com.facebook.orca.app.ACTION_ALARM");
        obj = PendingIntent.getBroadcast(c, 0, ((Intent) (obj)), 0);
        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        j;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 77
    //                   1 147
    //                   2 158
    //                   3 169;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        calendar.add(10, 3);
_L7:
        calendar.set(11, Math.max(Math.min(calendar.get(11), 20), 10));
        h.set(1, calendar.getTimeInMillis(), ((PendingIntent) (obj)));
        obj = d.b();
        ((e) (obj)).a(o.e, j);
        ((e) (obj)).a();
        return;
_L3:
        calendar.add(10, 18);
        continue; /* Loop/switch isn't completed */
_L4:
        calendar.add(10, 36);
        continue; /* Loop/switch isn't completed */
_L5:
        calendar.add(10, 72);
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void a(LoginReminderManager loginremindermanager)
    {
        loginremindermanager.e();
    }

    static void b(LoginReminderManager loginremindermanager)
    {
        loginremindermanager.f();
    }

    private void d()
    {
        e e1 = d.b();
        e1.a(o.e, -1);
        e1.a();
    }

    private void e()
    {
        if (!e.b())
        {
            Notification notification = new Notification(f.e(), c.getResources().getString(com.facebook.o.notifications_login_reminder_description), System.currentTimeMillis());
            Object obj = new Intent(c, com/facebook/orca/app/LoginReminderManager$NotificationBroadcastReceiver);
            ((Intent) (obj)).setAction("com.facebook.orca.app.ACTION_NOTIFICATION_ALARM");
            obj = PendingIntent.getBroadcast(c, 0, ((Intent) (obj)), 0);
            String s = c.getResources().getString(com.facebook.o.app_name);
            String s1 = c.getResources().getString(com.facebook.o.notifications_login_reminder_description);
            notification.setLatestEventInfo(c, s, s1, ((PendingIntent) (obj)));
            i.notify(10002, notification);
            int j = d.a(o.e, 0);
            g.b((new cb("login_reminder_notification_created")).a("trigger_state", j));
            if (j >= 0)
            {
                a(j + 1);
                return;
            }
        }
    }

    private void f()
    {
        Intent intent = new Intent(c, com/facebook/orca/auth/StartScreenActivity);
        intent.addFlags(0x10000000);
        c.startActivity(intent);
        int j = d.a(o.e, 0);
        g.b((new cb("login_reminder_notification_clicked")).a("trigger_state", j - 1));
    }

    public void a()
    {
        if (d.a(b, false))
        {
            a(0);
        }
    }

    public void b()
    {
        if (!e.b())
        {
            if (d.a(b, false) && d.a(o.e, 0) == -1)
            {
                a(0);
            }
            return;
        } else
        {
            d();
            return;
        }
    }

    public void c()
    {
        i.cancel(10002);
        d();
    }

}
