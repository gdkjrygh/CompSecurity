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
import com.appboy.d;
import com.appboy.services.AppboyDataSyncService;

// Referenced classes of package bo.app:
//            ak, ep, t, el, 
//            az, w, y, ah, 
//            r

public final class s
{

    private static final String a;
    private final Context b;
    private final y c;
    private final AlarmManager d;
    private final r e;
    private final BroadcastReceiver f;
    private final PendingIntent g;
    private int h;
    private long i;
    private volatile boolean j;

    public s(Context context, az az1, y y1, AlarmManager alarmmanager, r r1)
    {
        j = false;
        b = context;
        c = y1;
        d = alarmmanager;
        e = r1;
        h = ak.b;
        i = -1L;
        if (!ep.a(b, com/appboy/services/AppboyDataSyncService))
        {
            String.format("Appboy periodic data flushing is not available. Declare <service android:name=\"com.appboy.services.AppboyDataSyncService\"/> in your AndroidManifest.xml to enable Appboy periodic data flushing.", new Object[0]);
        }
        context = (new Intent((new StringBuilder()).append(context.getApplicationContext().getPackageName()).append(".REQUEST_DATA_SYNC").toString())).setClass(context, com/appboy/services/AppboyDataSyncService);
        g = PendingIntent.getService(b, 0, context, 0x8000000);
        f = new t(this, az1);
    }

    static int a(s s1, int k)
    {
        s1.h = k;
        return k;
    }

    static y a(s s1)
    {
        return s1.c;
    }

    private void a(long l)
    {
        if (d == null)
        {
            return;
        }
        if (i <= 0L)
        {
            e();
            return;
        } else
        {
            long l1 = el.c();
            long l2 = i;
            d.setInexactRepeating(1, l1 + l, l2, g);
            return;
        }
    }

    static void a(az az1, Throwable throwable)
    {
        try
        {
            az1.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            return;
        }
    }

    static String d()
    {
        return a;
    }

    private void e()
    {
        d.cancel(g);
    }

    public final boolean a()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = j;
        if (!flag1) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        IntentFilter intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        b.registerReceiver(f, intentfilter);
        a(3000L);
        j = true;
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
        boolean flag1 = j;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e();
        b.unregisterReceiver(f);
        j = false;
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void c()
    {
        long l = i;
        w.a[c.a().ordinal()];
        JVM INSTR tableswitch 1 4: default 52
    //                   1 134
    //                   2 144
    //                   3 167
    //                   4 167;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        i = e.getIntValue("com_appboy_data_flush_interval_good_network", 30) * 1000;
_L6:
        if (h == ak.b)
        {
            i = -1L;
        }
        if (l != i)
        {
            a(i);
            String.format("Dispatch state has changed from %d to %d.", new Object[] {
                Long.valueOf(l), Long.valueOf(i)
            });
        }
        return;
_L2:
        i = -1L;
        continue; /* Loop/switch isn't completed */
_L3:
        i = e.getIntValue("com_appboy_data_flush_interval_bad_network", 60) * 1000;
        continue; /* Loop/switch isn't completed */
_L4:
        i = e.getIntValue("com_appboy_data_flush_interval_great_network", 10) * 1000;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/s.getName()
        });
    }
}
