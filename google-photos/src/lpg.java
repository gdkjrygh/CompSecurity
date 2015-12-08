// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Process;

public final class lpg
{

    private static Object j = new Object();
    private static lpg k;
    volatile jnx a;
    private volatile long b;
    private volatile long c;
    private volatile boolean d;
    private volatile long e;
    private final Context f;
    private final kdh g;
    private final Thread h;
    private lpj i;

    private lpg(Context context)
    {
        this(context, null, kdj.c());
    }

    private lpg(Context context, lpj lpj1, kdh kdh1)
    {
        b = 0xdbba0L;
        c = 30000L;
        d = false;
        i = new lph(this);
        g = kdh1;
        if (context != null)
        {
            f = context.getApplicationContext();
        } else
        {
            f = context;
        }
        h = new Thread(new lpi(this));
    }

    static Context a(lpg lpg1)
    {
        return lpg1.f;
    }

    public static lpg a(Context context)
    {
        if (k == null)
        {
            synchronized (j)
            {
                if (k == null)
                {
                    context = new lpg(context);
                    k = context;
                    ((lpg) (context)).h.start();
                }
            }
        }
        return k;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void b(lpg lpg1)
    {
        Process.setThreadPriority(10);
        do
        {
            boolean flag = lpg1.d;
            try
            {
                lpg1.a = lpg1.i.a();
                Thread.sleep(lpg1.b);
            }
            catch (InterruptedException interruptedexception)
            {
                lqh.c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        } while (true);
    }

    void a()
    {
        if (g.a() - e < c)
        {
            return;
        } else
        {
            h.interrupt();
            e = g.a();
            return;
        }
    }

}
