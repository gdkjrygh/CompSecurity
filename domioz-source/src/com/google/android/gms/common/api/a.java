// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.api:
//            s, b, t, Status, 
//            v, u

public abstract class a
    implements s
{

    protected final com.google.android.gms.common.api.b a;
    private final Object b = new Object();
    private final CountDownLatch c = new CountDownLatch(1);
    private final ArrayList d = new ArrayList();
    private v e;
    private volatile u f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private b j;

    protected a(Looper looper)
    {
        a = new com.google.android.gms.common.api.b(looper);
    }

    static void b(u u)
    {
        if (!(u instanceof t))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((t)u).a();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("AbstractPendingResult", (new StringBuilder("Unable to release ")).append(u).toString(), runtimeexception);
        return;
    }

    private void c(u u)
    {
        f = u;
        j = null;
        c.countDown();
        u = f;
        if (e != null)
        {
            a.removeMessages(2);
            if (!h)
            {
                a.a(e, h());
            }
        }
        for (u = d.iterator(); u.hasNext(); u.next()) { }
        d.clear();
    }

    private boolean f()
    {
        return c.getCount() == 0L;
    }

    private boolean g()
    {
        boolean flag;
        synchronized (b)
        {
            flag = h;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private u h()
    {
        boolean flag = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        u u;
        if (g)
        {
            flag = false;
        }
        ap.a(flag, "Result has already been consumed.");
        ap.a(f(), "Result is not ready.");
        u = f;
        f = null;
        e = null;
        g = true;
        c();
        return u;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final u a()
    {
        boolean flag1 = true;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag, "await must not be called on the UI thread");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ap.a(flag, "Result has already been consumed");
        try
        {
            c.await();
        }
        catch (InterruptedException interruptedexception)
        {
            synchronized (b)
            {
                if (!f())
                {
                    a(a(com.google.android.gms.common.api.Status.b));
                    i = true;
                }
            }
        }
        ap.a(f(), "Result is not ready.");
        return h();
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract u a(Status status);

    public final void a(u u)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (b)
            {
                if (!i && !h)
                {
                    break label0;
                }
                b(u);
            }
            return;
        }
        boolean flag;
        if (!f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ap.a(flag, "Result has already been consumed");
        c(u);
        obj;
        JVM INSTR monitorexit ;
        return;
        u;
        obj;
        JVM INSTR monitorexit ;
        throw u;
    }

    public final void a(v v)
    {
label0:
        {
            boolean flag;
            if (!g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ap.a(flag, "Result has already been consumed.");
            synchronized (b)
            {
                if (!g())
                {
                    break label0;
                }
            }
            return;
        }
        if (!f())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        a.a(v, h());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        v;
        obj;
        JVM INSTR monitorexit ;
        throw v;
        e = v;
          goto _L1
    }

    public final void b()
    {
label0:
        {
            synchronized (b)
            {
                if (!h && !g)
                {
                    break label0;
                }
            }
            return;
        }
        b(f);
        e = null;
        h = true;
        c(a(Status.e));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void c()
    {
    }

    final void d()
    {
        synchronized (b)
        {
            if (!f())
            {
                a(a(Status.d));
                i = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
