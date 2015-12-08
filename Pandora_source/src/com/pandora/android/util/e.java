// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.pandora.android.data.AlarmData;
import com.pandora.android.provider.a;
import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import java.util.Calendar;
import p.cw.c;
import p.dd.an;

// Referenced classes of package com.pandora.android.util:
//            AlarmClockReceiver

public class e
{

    private static e a;
    private final AlarmManager b;
    private final a c;

    private e(Context context)
    {
        this(context, com.pandora.android.provider.a.a());
    }

    private e(Context context, a a1)
    {
        b.a.b().b(this);
        b = (AlarmManager)context.getSystemService("alarm");
        c = a1;
    }

    static a a(e e1)
    {
        return e1.c;
    }

    public static e a(Context context)
    {
        if (a == null)
        {
            a = new e(context);
        }
        return a;
    }

    private static void a(AlarmData alarmdata)
    {
        if (alarmdata == null)
        {
            throw new com.pandora.android.data.AlarmData.a("AlarmData cannot be null!");
        } else
        {
            return;
        }
    }

    public static void a(String s, AlarmData alarmdata)
    {
        k k1 = b.a.b().o();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarmdata.h());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        k1.a(s, (int)((alarmdata.h() - calendar.getTimeInMillis()) / 1000L) / 60, alarmdata.i(), alarmdata.n());
    }

    private void b(Context context, AlarmData alarmdata, boolean flag)
    {
        a(alarmdata);
        alarmdata.a(true);
        alarmdata.o();
        c.b(alarmdata);
        h(context, alarmdata);
        if (flag)
        {
            a("enable", alarmdata);
        }
    }

    public static void c(Context context)
    {
        a(context);
    }

    private void d(Context context)
    {
        p.df.a.a("AlarmClock", "Clearing AlarmManager alarms");
        context = i(context, null);
        b.cancel(context);
    }

    private void f(Context context, AlarmData alarmdata)
    {
        d(context);
        alarmdata.b(0L);
        if (alarmdata.g().c())
        {
            p.df.a.a("AlarmClock", "Alarm has a repeat set.");
            b(context, alarmdata, false);
            return;
        } else
        {
            p.df.a.a("AlarmClock", "Alarm does not have a repeat set.");
            a(context, alarmdata, false);
            return;
        }
    }

    private boolean g(Context context, AlarmData alarmdata)
    {
        return c.b(alarmdata) != 0 || c.a(alarmdata) != -1L;
    }

    private void h(Context context, AlarmData alarmdata)
    {
        long l = alarmdata.h();
        if (alarmdata.n())
        {
            p.df.a.a("AlarmClock", "Alarm is a snooze-alarm");
            l = alarmdata.l();
        }
        p.df.a.a("AlarmClock", (new StringBuilder()).append("Registering alarm with AlarmManager. time = ").append(l).toString());
        context = i(context, alarmdata);
        b.set(0, l, context);
    }

    private PendingIntent i(Context context, AlarmData alarmdata)
    {
        Intent intent = new Intent(context, com/pandora/android/util/AlarmClockReceiver);
        if (alarmdata != null)
        {
            intent.putExtra("intent_alarm_id", alarmdata.c());
        }
        return PendingIntent.getBroadcast(context, 0, intent, 0x10000000);
    }

    public void a()
    {
        (new AsyncTask() {

            final e a;

            protected transient AlarmData a(Void avoid[])
            {
                return com.pandora.android.util.e.a(a).d();
            }

            protected void a(AlarmData alarmdata)
            {
                b.a.e().a(new p.bz.b(alarmdata, true));
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((AlarmData)obj);
            }

            
            {
                a = e.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public void a(Context context, int j)
    {
        p.df.a.a("AlarmClock", "Alarm triggered");
        f(context, c.a(j));
    }

    public void a(Context context, AlarmData alarmdata, boolean flag)
    {
        a(alarmdata);
        alarmdata.a(false);
        alarmdata.b(0L);
        c.b(alarmdata);
        d(context);
        if (flag)
        {
            a("disable", alarmdata);
        }
    }

    public boolean a(Context context, AlarmData alarmdata)
    {
        a(alarmdata);
        alarmdata.o();
        boolean flag = g(context, alarmdata);
        if (flag)
        {
            d(context);
            if (alarmdata.d())
            {
                h(context, alarmdata);
                a("set time", alarmdata);
                a("enable", alarmdata);
            }
        }
        return flag;
    }

    public void b(Context context)
    {
        d(context);
        AlarmData alarmdata = c.d();
        if (alarmdata != null && alarmdata.d())
        {
            alarmdata.o();
            h(context, alarmdata);
        }
    }

    public void b(Context context, AlarmData alarmdata)
    {
        b(context, alarmdata, true);
    }

    public void c(Context context, AlarmData alarmdata)
    {
        a(context, alarmdata, true);
    }

    protected Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void d(Context context, AlarmData alarmdata)
    {
        p.df.a.a("AlarmClock", "Alarm dismissed from AlarmSnoozeFragment.");
        f(context, alarmdata);
    }

    public void e(Context context, AlarmData alarmdata)
    {
        p.df.a.a("AlarmClock", "Snoozing alarm!");
        d(context);
        long l = 60000L * (long)alarmdata.k();
        long l1 = System.currentTimeMillis() + l;
        p.df.a.a("AlarmClock", (new StringBuilder()).append("SnoozeLengthMillis: ").append(l).append(" SnoozeTimeEpoch: ").append(l1).toString());
        alarmdata.a(true);
        alarmdata.b(l1);
        c.b(alarmdata);
        h(context, alarmdata);
    }

    public void onSignInState(an an1)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.a.values().length];
                try
                {
                    a[p.cx.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.util._cls2.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            d(b.a.h());
            c.e();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }
}
