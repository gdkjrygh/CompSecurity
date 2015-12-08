// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.threading;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.util.threading:
//            FitbitHandlerThread

public abstract class c
{

    private final FitbitHandlerThread.ThreadName a;
    private BroadcastReceiver b = new BroadcastReceiver() {

        final c a;

        public void onReceive(Context context, Intent intent)
        {
            if (!c.a(a) && !c.b(a))
            {
                return;
            }
            if (c.c(a) == null)
            {
                a.a(intent);
                return;
            } else
            {
                FitbitHandlerThread.a(c.c(a), new Runnable(this, intent) {

                    final Intent a;
                    final _cls1 b;

                    public void run()
                    {
                        b.a.a(a);
                    }

            
            {
                b = _pcls1;
                a = intent;
                super();
            }
                });
                return;
            }
        }

            
            {
                a = c.this;
                super();
            }
    };
    private volatile boolean c;
    private volatile boolean d;

    public c()
    {
        this(null);
    }

    public c(FitbitHandlerThread.ThreadName threadname)
    {
        c = false;
        d = false;
        a = threadname;
    }

    static boolean a(c c1)
    {
        return c1.c;
    }

    static boolean b(c c1)
    {
        return c1.d;
    }

    static FitbitHandlerThread.ThreadName c(c c1)
    {
        return c1.a;
    }

    protected abstract void a(Intent intent);

    public void a(IntentFilter intentfilter)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            c = true;
            z.a(b, intentfilter);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        intentfilter;
        throw intentfilter;
    }

    public void b(IntentFilter intentfilter)
    {
        this;
        JVM INSTR monitorenter ;
        if (!d)
        {
            d = true;
            z.b(b, intentfilter);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        intentfilter;
        throw intentfilter;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            c = false;
            z.a(b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            d = false;
            z.b(b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
