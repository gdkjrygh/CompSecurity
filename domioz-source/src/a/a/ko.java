// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appboy.f;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            n, kp, kq, kr, 
//            dj, aa, b, d, 
//            l, kn, kl

public final class ko
{

    private static final String a;
    private final Context b;
    private final kl c;
    private final d d;
    private final AlarmManager e;
    private final kn f;
    private final BroadcastReceiver g;
    private final BroadcastReceiver h;
    private final BroadcastReceiver i;
    private final String j;
    private final PendingIntent k;
    private int l;
    private long m;
    private volatile boolean n;

    public ko(Context context, aa aa1, kl kl, d d1, AlarmManager alarmmanager, kn kn1)
    {
        n = false;
        b = context;
        c = kl;
        d = d1;
        e = alarmmanager;
        f = kn1;
        l = n.b;
        m = -1L;
        j = (new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_DISPATCH_ALARM_EXPIRED").toString();
        context = new Intent(j);
        k = PendingIntent.getBroadcast(b, 0, context, 0x8000000);
        g = new kp(this, aa1);
        h = new kq(this, aa1);
        i = new kr(this, aa1);
    }

    static int a(ko ko1, int i1)
    {
        ko1.l = i1;
        return i1;
    }

    static kl a(ko ko1)
    {
        return ko1.c;
    }

    private void a(long l1)
    {
        if (e == null)
        {
            return;
        }
        if (m <= 0L)
        {
            e();
            return;
        } else
        {
            long l2 = dj.c();
            long l3 = m;
            e.setInexactRepeating(1, l2 + l1, l3, k);
            return;
        }
    }

    static void a(aa aa1, Throwable throwable)
    {
        try
        {
            aa1.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            com.appboy.f.a.c(a, "Failed to log throwable.", aa1);
        }
    }

    static d b(ko ko1)
    {
        return ko1.d;
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
        boolean flag1 = n;
        if (!flag1) goto _L2; else goto _L1
_L1:
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
        boolean flag1 = n;
        if (flag1) goto _L2; else goto _L1
_L1:
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
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void c()
    {
        long l1 = m;
        a.a.b.a[d.a().ordinal()];
        JVM INSTR tableswitch 1 4: default 52
    //                   1 134
    //                   2 144
    //                   3 167
    //                   4 167;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        m = f.a("com_appboy_data_flush_interval_good_network", 30) * 1000;
_L6:
        if (l == n.b)
        {
            m = -1L;
        }
        if (l1 != m)
        {
            a(m);
            String.format("Dispatch state has changed from %d to %d.", new Object[] {
                Long.valueOf(l1), Long.valueOf(m)
            });
        }
        return;
_L2:
        m = -1L;
        continue; /* Loop/switch isn't completed */
_L3:
        m = f.a("com_appboy_data_flush_interval_bad_network", 60) * 1000;
        continue; /* Loop/switch isn't completed */
_L4:
        m = f.a("com_appboy_data_flush_interval_great_network", 10) * 1000;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/ko.getName()
        });
    }
}
