// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            bt, cm, cr, el, 
//            eg, ee, bg, az, 
//            bh, bf, ci

public final class bs
{

    private static final String a;
    private final Object b = new Object();
    private final ee c;
    private final az d;
    private final Context e;
    private final AlarmManager f;
    private final int g;
    private final String h;
    private final eg i;
    private volatile cm j;
    private volatile boolean k;

    public bs(ee ee1, az az1, Context context, AlarmManager alarmmanager, int l, eg eg1)
    {
        k = false;
        c = ee1;
        d = az1;
        e = context;
        f = alarmmanager;
        g = l;
        i = eg1;
        ee1 = new bt(this);
        h = (new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_SESSION_SHOULD_SEAL").toString();
        context.registerReceiver(ee1, new IntentFilter(h));
    }

    static Object a(bs bs1)
    {
        return bs1.b;
    }

    static void b(bs bs1)
    {
        bs1.h();
    }

    static az c(bs bs1)
    {
        return bs1.d;
    }

    static String f()
    {
        return a;
    }

    private boolean g()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        cm cm1;
        h();
        if (j != null && !j.c())
        {
            break MISSING_BLOCK_LABEL_128;
        }
        cm1 = j;
        cm cm2 = new cm(cr.a(), el.b());
        i.a(true);
        AppboyLogger.i(a, (new StringBuilder("New session created with ID: ")).append(cm2.d).toString());
        j = cm2;
        if (cm1 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if (cm1.g())
        {
            String.format("Clearing completely dispatched sealed session %s", new Object[] {
                cm1.d
            });
            c.b(cm1);
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        if (j.a() == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        j.a(null);
        return true;
        Exception exception;
        exception;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    private void h()
    {
        synchronized (b)
        {
            if (j == null && !k)
            {
                j = c.a();
                if (j != null)
                {
                    String.format("Restored session from offline storage: %s", new Object[] {
                        j.d.toString()
                    });
                }
            }
            k = true;
            if (j != null && j.a() != null && !j.c() && (j.a().doubleValue() + (double)(long)g) * 1000D <= (double)el.c())
            {
                AppboyLogger.i(a, String.format("Session [%s] being sealed because its end time is over the grace period.", new Object[] {
                    j.d
                }));
                e();
            }
        }
    }

    public final cm a()
    {
        Object obj1;
        synchronized (b)
        {
            if (g())
            {
                c.a(j);
            }
            obj1 = new Intent(h);
            ((Intent) (obj1)).putExtra("session_id", j.toString());
            obj1 = PendingIntent.getBroadcast(e, 0, ((Intent) (obj1)), 0x40000000);
            f.cancel(((PendingIntent) (obj1)));
            d.a(bg.a, bo/app/bg);
            obj1 = j;
        }
        return ((cm) (obj1));
    }

    public final cm a(ci ci)
    {
label0:
        {
            synchronized (b)
            {
                h();
                if (j == null)
                {
                    break label0;
                }
                j.a(ci);
                c.a(j, ci);
                ci = j;
            }
            return ci;
        }
        cm cm1 = c.b();
        if (cm1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        cm1.a(ci);
        c.a(cm1, ci);
        obj;
        JVM INSTR monitorexit ;
        return cm1;
        ci;
        throw ci;
        AppboyLogger.i(a, "Ignored event because no session exists.");
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    public final cm b()
    {
        Object obj1;
        synchronized (b)
        {
            g();
            j.a(Double.valueOf(el.b()));
            c.a(j);
            obj1 = new Intent(h);
            ((Intent) (obj1)).putExtra("session_id", j.toString());
            obj1 = PendingIntent.getBroadcast(e, 0, ((Intent) (obj1)), 0x40000000);
            f.set(2, SystemClock.elapsedRealtime() + (long)(g * 1000), ((PendingIntent) (obj1)));
            d.a(bh.a, bo/app/bh);
            obj1 = j;
        }
        return ((cm) (obj1));
    }

    public final cr c()
    {
label0:
        {
            synchronized (b)
            {
                h();
                if (j != null)
                {
                    break label0;
                }
            }
            return null;
        }
        cr cr1 = j.d;
        obj;
        JVM INSTR monitorexit ;
        return cr1;
        exception;
        throw exception;
    }

    public final boolean d()
    {
label0:
        {
            synchronized (b)
            {
                if (j != null)
                {
                    break label0;
                }
            }
            return false;
        }
        boolean flag = j.c();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        throw exception;
    }

    public final void e()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        cm cm1;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        cm1 = j;
        synchronized (cm1.i)
        {
            cm1.h = true;
            cm1.a(Double.valueOf(el.b()));
        }
        c.a(j);
        d.a(new bf(j), bo/app/bf);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/bs.getName()
        });
    }
}
