// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.appboy.f;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            av, bn, bs, dj, 
//            df, dd, ai, aa, 
//            aj, ah, bj

public final class au
{

    private static final String a;
    private final Object b = new Object();
    private final dd c;
    private final aa d;
    private final Context e;
    private final AlarmManager f;
    private final int g;
    private final String h;
    private final df i;
    private volatile bn j;
    private volatile boolean k;

    public au(dd dd1, aa aa1, Context context, AlarmManager alarmmanager, int l, df df1)
    {
        k = false;
        c = dd1;
        d = aa1;
        e = context;
        f = alarmmanager;
        g = l;
        i = df1;
        dd1 = new av(this);
        h = (new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_SESSION_SHOULD_SEAL").toString();
        context.registerReceiver(dd1, new IntentFilter(h));
    }

    static Object a(au au1)
    {
        return au1.b;
    }

    static void b(au au1)
    {
        au1.g();
    }

    static aa c(au au1)
    {
        return au1.d;
    }

    static String e()
    {
        return a;
    }

    private boolean f()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        bn bn1;
        g();
        if (j != null && !j.c())
        {
            break MISSING_BLOCK_LABEL_128;
        }
        bn1 = j;
        bn bn2 = new bn(bs.b(), dj.b());
        i.a(true);
        com.appboy.f.a.b(a, (new StringBuilder("New session created with ID: ")).append(bn2.d).toString());
        j = bn2;
        if (bn1 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if (bn1.g())
        {
            String.format("Clearing completely dispatched sealed session %s", new Object[] {
                bn1.d
            });
            c.b(bn1);
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

    private void g()
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
            if (j != null && j.a() != null && !j.c() && (j.a().doubleValue() + (double)(long)g) * 1000D <= (double)dj.c())
            {
                com.appboy.f.a.b(a, String.format("Session [%s] being sealed because its end time is over the grace period.", new Object[] {
                    j.d
                }));
                d();
            }
        }
    }

    public final bn a()
    {
        Object obj1;
        synchronized (b)
        {
            if (f())
            {
                c.a(j);
            }
            obj1 = new Intent(h);
            ((Intent) (obj1)).putExtra("session_id", j.toString());
            obj1 = PendingIntent.getBroadcast(e, 0, ((Intent) (obj1)), 0x40000000);
            f.cancel(((PendingIntent) (obj1)));
            d.a(a.a.ai.a, a/a/ai);
            obj1 = j;
        }
        return ((bn) (obj1));
    }

    public final bn a(bj bj)
    {
label0:
        {
            synchronized (b)
            {
                g();
                if (j == null)
                {
                    break label0;
                }
                j.a(bj);
                c.a(j, bj);
                bj = j;
            }
            return bj;
        }
        bn bn1 = c.b();
        if (bn1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        bn1.a(bj);
        c.a(bn1, bj);
        obj;
        JVM INSTR monitorexit ;
        return bn1;
        bj;
        throw bj;
        com.appboy.f.a.b(a, "Ignored event because no session exists.");
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    public final bn b()
    {
        Object obj1;
        synchronized (b)
        {
            f();
            j.a(Double.valueOf(dj.b()));
            c.a(j);
            obj1 = new Intent(h);
            ((Intent) (obj1)).putExtra("session_id", j.toString());
            obj1 = PendingIntent.getBroadcast(e, 0, ((Intent) (obj1)), 0x40000000);
            f.set(2, SystemClock.elapsedRealtime() + (long)(g * 1000), ((PendingIntent) (obj1)));
            d.a(a.a.aj.a, a/a/aj);
            obj1 = j;
        }
        return ((bn) (obj1));
    }

    public final bs c()
    {
label0:
        {
            synchronized (b)
            {
                g();
                if (j != null)
                {
                    break label0;
                }
            }
            return null;
        }
        bs bs1 = j.d;
        obj;
        JVM INSTR monitorexit ;
        return bs1;
        exception;
        throw exception;
    }

    public final void d()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        bn bn1;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        bn1 = j;
        synchronized (bn1.i)
        {
            bn1.h = true;
            bn1.a(Double.valueOf(dj.b()));
        }
        c.a(j);
        d.a(new ah(j), a/a/ah);
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
            f.a, a/a/au.getName()
        });
    }
}
