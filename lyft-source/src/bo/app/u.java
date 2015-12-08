// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            ap, v, w, x, 
//            er, be, aa, ac, 
//            am, t, r

public final class u
{

    private static final String a;
    private final Context b;
    private final r c;
    private final ac d;
    private final AlarmManager e;
    private final t f;
    private final BroadcastReceiver g;
    private final BroadcastReceiver h;
    private final BroadcastReceiver i;
    private final String j;
    private final PendingIntent k;
    private int l;
    private long m;
    private volatile boolean n;

    public u(Context context, be be1, r r, ac ac1, AlarmManager alarmmanager, t t1)
    {
        n = false;
        b = context;
        c = r;
        d = ac1;
        e = alarmmanager;
        f = t1;
        l = ap.b;
        m = -1L;
        j = (new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_DISPATCH_ALARM_EXPIRED").toString();
        context = new Intent(j);
        k = PendingIntent.getBroadcast(b, 0, context, 0x8000000);
        g = new v(this, be1);
        h = new w(this, be1);
        i = new x(this, be1);
        context = a;
    }

    static int a(u u1, int i1)
    {
        u1.l = i1;
        return i1;
    }

    static r a(u u1)
    {
        return u1.c;
    }

    private void a(long l1)
    {
        if (e == null)
        {
            String s = a;
            return;
        }
        if (m <= 0L)
        {
            String s1 = a;
            e();
            return;
        } else
        {
            long l2 = er.c();
            long l3 = m;
            e.setInexactRepeating(1, l2 + l1, l3, k);
            return;
        }
    }

    static void a(be be1, Throwable throwable)
    {
        try
        {
            be1.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (be be1)
        {
            AppboyLogger.e(a, "Failed to log throwable.", be1);
        }
    }

    static ac b(u u1)
    {
        return u1.d;
    }

    static String d()
    {
        return a;
    }

    private void e()
    {
        e.cancel(k);
    }

    public final boolean a()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (!n) goto _L2; else goto _L1
_L1:
        String s = a;
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentfilter.addAction("android.intent.action.BATTERY_LOW");
        intentfilter.addAction("android.intent.action.BATTERY_OKAY");
        IntentFilter intentfilter1 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        IntentFilter intentfilter2 = new IntentFilter(j);
        b.registerReceiver(g, intentfilter);
        b.registerReceiver(h, intentfilter1);
        b.registerReceiver(i, intentfilter2);
        a(3000L);
        n = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean b()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (n) goto _L2; else goto _L1
_L1:
        String s = a;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e();
        b.unregisterReceiver(g);
        b.unregisterReceiver(h);
        b.unregisterReceiver(i);
        n = false;
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void c()
    {
        long l1 = m;
        aa.a[d.a().ordinal()];
        JVM INSTR tableswitch 1 4: default 52
    //                   1 138
    //                   2 148
    //                   3 171
    //                   4 171;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        m = f.getIntValue("com_appboy_data_flush_interval_good_network", 30) * 1000;
_L6:
        if (l == ap.b)
        {
            m = -1L;
        }
        if (l1 != m)
        {
            a(m);
            String s = a;
            String.format("Dispatch state has changed from %d to %d.", new Object[] {
                Long.valueOf(l1), Long.valueOf(m)
            });
        }
        return;
_L2:
        m = -1L;
        continue; /* Loop/switch isn't completed */
_L3:
        m = f.getIntValue("com_appboy_data_flush_interval_bad_network", 60) * 1000;
        continue; /* Loop/switch isn't completed */
_L4:
        m = f.getIntValue("com_appboy_data_flush_interval_great_network", 10) * 1000;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/u.getName()
        });
    }
}
