// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

// Referenced classes of package com.google.analytics.tracking.android:
//            bd, v, aq, GAUsage, 
//            j, az, w, t, 
//            h, i

public final class u
    implements bd
{

    private static final Object a = new Object();
    private static u m;
    private Context b;
    private h c;
    private volatile j d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private i i;
    private Handler j;
    private t k;
    private boolean l;

    private u()
    {
        e = 1800;
        f = true;
        g = true;
        h = true;
        i = new v(this);
        l = false;
    }

    public static u a()
    {
        if (m == null)
        {
            m = new u();
        }
        return m;
    }

    static boolean a(u u1)
    {
        return u1.g;
    }

    static int b(u u1)
    {
        return u1.e;
    }

    static boolean c(u u1)
    {
        return u1.l;
    }

    static Handler d(u u1)
    {
        return u1.j;
    }

    static Object d()
    {
        return a;
    }

    public final void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (j != null) goto _L2; else goto _L1
_L1:
        aq.f("Need to call initialize() and be in fallback mode to start dispatch.");
        e = i1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        GAUsage.a().a(GAUsage.Field.SET_DISPATCH_PERIOD);
        if (!l && g && e > 0)
        {
            j.removeMessages(1, a);
        }
        e = i1;
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!l && g)
        {
            j.sendMessageDelayed(j.obtainMessage(1, a), i1 * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void a(Context context, j j1)
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
            d = j1;
            if (f)
            {
                j1.a();
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(l, flag);
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
        if (l != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = g;
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
            j.removeMessages(1, a);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (e > 0)
        {
            j.sendMessageDelayed(j.obtainMessage(1, a), e * 1000);
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
        aq.d(stringbuilder.append(((String) (obj))).toString());
        l = flag;
        g = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    final h b()
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
        c = new az(i, b);
        h h1;
        if (j == null)
        {
            j = new Handler(b.getMainLooper(), new w(this));
            if (e > 0)
            {
                j.sendMessageDelayed(j.obtainMessage(1, a), e * 1000);
            }
        }
        if (k == null && h)
        {
            k = new t(this);
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            b.registerReceiver(k, intentfilter);
        }
        h1 = c;
        this;
        JVM INSTR monitorexit ;
        return h1;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null) goto _L2; else goto _L1
_L1:
        aq.f("dispatch call queued.  Need to call GAServiceManager.getInstance().initialize().");
        f = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        GAUsage.a().a(GAUsage.Field.DISPATCH);
        d.a();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
