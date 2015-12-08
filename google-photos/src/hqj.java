// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.scheduler.LowPriorityBackgroundJobService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class hqj
{

    private static oqe a;
    private static final oqe b = new oqe("debug.scheduler.min_battery", "0.2");
    private final Context c;
    private final hqn d;
    private final muz e;
    private final hfk f;
    private final noz g;
    private int h;

    hqj(Context context, hqn hqn1, muz muz1, hfk hfk1)
    {
        c = context;
        d = hqn1;
        e = muz1;
        f = hfk1;
        g = noz.a(context, 3, "Scheduler", new String[0]);
        h = hqn1.a.getAndIncrement();
        hqn1.a(context, h).a();
    }

    private PendingIntent a(int i)
    {
        Intent intent = new Intent("com.google.android.apps.photos.scheduler.ACTION_ALARM");
        return PendingIntent.getBroadcast(c, 0, intent, i);
    }

    private static String a(long l)
    {
        return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date(l));
    }

    private void a()
    {
        PendingIntent pendingintent = a(0x20000000);
        if (pendingintent != null)
        {
            pendingintent.cancel();
        }
    }

    public final void a(Intent intent)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        String s = intent.getAction();
        if ("com.google.android.apps.photos.scheduler.ACTION_ALARM".equals(s))
        {
            a();
        }
        intent = f.a();
        if (g.a())
        {
            noy.a("action", s);
            noy.a("battery %", Float.valueOf(((hfi) (intent)).a * 100F));
            noy.a("is charging or charged", Boolean.valueOf(((hfi) (intent)).c));
            noy.a("is plugged in", Boolean.valueOf(((hfi) (intent)).b));
            noy.a("is interactive", Boolean.valueOf(((hfi) (intent)).d));
        }
        boolean flag;
        if (((hfi) (intent)).a >= Float.valueOf(b.a).floatValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!((hfi) (intent)).c || !((hfi) (intent)).b || ((hfi) (intent)).d) goto _L2; else goto _L3
_L3:
        flag = true;
_L10:
        if (!flag) goto _L5; else goto _L4
_L4:
        if (!d.a(h).d)
        {
            a();
            h = d.a.getAndIncrement();
            intent = d.a(c, h);
            ((hqo) (intent)).b.acquire(hqo.a);
            intent.d = true;
            intent = new Intent(c, com/google/android/apps/photos/scheduler/LowPriorityBackgroundJobService);
            intent.putExtra("com.google.android.apps.photos.scheduler.id", h);
            c.startService(intent);
        }
_L7:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        if (d.a(h).d)
        {
            hqo hqo1 = d.a(h);
            hqo1.c = true;
            hqo1.d = false;
        }
        if (!((hfi) (intent)).b) goto _L7; else goto _L6
_L6:
        if (a(0x20000000) != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag) goto _L7; else goto _L8
_L8:
        long l = e.a();
        long l1 = l + Long.valueOf(a.a).longValue();
        intent = a(0x10000000);
        ((AlarmManager)c.getSystemService("alarm")).set(0, l1, intent);
        if (g.a())
        {
            noy.a("current time", a(l));
            noy.a("alarm time", a(l1));
        }
          goto _L7
        intent;
        throw intent;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static 
    {
        a = new oqe("debug.scheduler.reschedule", String.valueOf(TimeUnit.MINUTES.toMillis(30L)));
    }
}
