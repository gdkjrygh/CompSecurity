// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

final class lqm extends ltm
{

    private static final Object a = new Object();
    private static lqm n;
    private Context b;
    private lrs c;
    private volatile lrp d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private lrt j;
    private Handler k;
    private lsg l;
    private boolean m;

    private lqm()
    {
        e = 0x1b7740;
        f = true;
        g = false;
        h = true;
        i = true;
        j = new lqn(this);
        m = false;
    }

    public static lqm a()
    {
        if (n == null)
        {
            n = new lqm();
        }
        return n;
    }

    static boolean a(lqm lqm1)
    {
        return lqm1.h;
    }

    static int b(lqm lqm1)
    {
        return lqm1.e;
    }

    static boolean c(lqm lqm1)
    {
        return lqm1.m;
    }

    static Handler d(lqm lqm1)
    {
        return lqm1.k;
    }

    static Object e()
    {
        return a;
    }

    static lrs e(lqm lqm1)
    {
        return lqm1.c;
    }

    final void a(Context context, lrp lrp1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = b;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = context.getApplicationContext();
        if (d == null)
        {
            d = lrp1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(m, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (m != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = h;
        if (flag2 != flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag && flag1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (e > 0)
        {
            k.removeMessages(1, a);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (e > 0)
        {
            k.sendMessageDelayed(k.obtainMessage(1, a), e);
        }
        StringBuilder stringbuilder = new StringBuilder("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        lqh.d(stringbuilder.append(((String) (obj))).toString());
        m = flag;
        h = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    final lrs b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (b == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        c = new lsl(j, b);
        lrs lrs;
        if (k == null)
        {
            k = new Handler(b.getMainLooper(), new lqo(this));
            if (e > 0)
            {
                k.sendMessageDelayed(k.obtainMessage(1, a), e);
            }
        }
        g = true;
        if (f)
        {
            c();
            f = false;
        }
        if (l == null && i)
        {
            l = new lsg(this);
            lsg lsg1 = l;
            Context context = b;
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(lsg1, intentfilter);
            intentfilter = new IntentFilter();
            intentfilter.addAction("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context.getPackageName());
            context.registerReceiver(lsg1, intentfilter);
        }
        lrs = c;
        this;
        JVM INSTR monitorexit ;
        return lrs;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (g) goto _L2; else goto _L1
_L1:
        lqh.d("Dispatch call queued. Dispatch will run once initialization is complete.");
        f = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d.a(new lqp(this));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (!m && h && e > 0)
        {
            k.removeMessages(1, a);
            k.sendMessage(k.obtainMessage(1, a));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
