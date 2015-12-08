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
//            bz, cs, cx, er, 
//            em, ek, bm, be, 
//            bn, bl, co

public final class by
{

    private static final String a;
    private final Object b = new Object();
    private final ek c;
    private final be d;
    private final Context e;
    private final AlarmManager f;
    private final int g;
    private final String h;
    private final em i;
    private volatile cs j;
    private volatile boolean k;

    public by(ek ek1, be be1, Context context, AlarmManager alarmmanager, int l, em em1)
    {
        k = false;
        c = ek1;
        d = be1;
        e = context;
        f = alarmmanager;
        g = l;
        i = em1;
        ek1 = new bz(this);
        h = (new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_SESSION_SHOULD_SEAL").toString();
        context.registerReceiver(ek1, new IntentFilter(h));
    }

    static Object a(by by1)
    {
        return by1.b;
    }

    static void b(by by1)
    {
        by1.h();
    }

    static be c(by by1)
    {
        return by1.d;
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
        cs cs1;
        h();
        if (j != null && !j.c())
        {
            break MISSING_BLOCK_LABEL_132;
        }
        cs1 = j;
        cs cs2 = new cs(cx.a(), er.b());
        i.a(true);
        AppboyLogger.i(a, (new StringBuilder("New session created with ID: ")).append(cs2.d).toString());
        j = cs2;
        if (cs1 == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (cs1.g())
        {
            String s = a;
            String.format("Clearing completely dispatched sealed session %s", new Object[] {
                cs1.d
            });
            c.b(cs1);
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        if (j.a() == null)
        {
            break MISSING_BLOCK_LABEL_159;
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
                    String s = a;
                    String.format("Restored session from offline storage: %s", new Object[] {
                        j.d.toString()
                    });
                }
            }
            k = true;
            if (j != null && j.a() != null && !j.c() && (j.a().doubleValue() + (double)(long)g) * 1000D <= (double)er.c())
            {
                AppboyLogger.i(a, String.format("Session [%s] being sealed because its end time is over the grace period.", new Object[] {
                    j.d
                }));
                e();
            }
        }
    }

    public final cs a()
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
            d.a(bm.a, bo/app/bm);
            obj1 = j;
        }
        return ((cs) (obj1));
    }

    public final cs a(co co)
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
                j.a(co);
                c.a(j, co);
                co = j;
            }
            return co;
        }
        cs cs1 = c.b();
        if (cs1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        cs1.a(co);
        c.a(cs1, co);
        obj;
        JVM INSTR monitorexit ;
        return cs1;
        co;
        throw co;
        AppboyLogger.i(a, "Ignored event because no session exists.");
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    public final cs b()
    {
        Object obj1;
        synchronized (b)
        {
            g();
            j.a(Double.valueOf(er.b()));
            c.a(j);
            obj1 = new Intent(h);
            ((Intent) (obj1)).putExtra("session_id", j.toString());
            obj1 = PendingIntent.getBroadcast(e, 0, ((Intent) (obj1)), 0x40000000);
            f.set(2, SystemClock.elapsedRealtime() + (long)(g * 1000), ((PendingIntent) (obj1)));
            d.a(bn.a, bo/app/bn);
            obj1 = j;
        }
        return ((cs) (obj1));
    }

    public final cx c()
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
        cx cx1 = j.d;
        obj;
        JVM INSTR monitorexit ;
        return cx1;
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
        cs cs1;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        cs1 = j;
        synchronized (cs1.i)
        {
            cs1.h = true;
            cs1.a(Double.valueOf(er.b()));
        }
        c.a(j);
        d.a(new bl(j), bo/app/bl);
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/by.getName()
        });
    }
}
