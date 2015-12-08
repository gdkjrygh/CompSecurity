// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.bl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            tr, vd

public abstract class tq extends p
{

    protected final tr a;
    private final Object b = new Object();
    private final CountDownLatch c = new CountDownLatch(1);
    private final ArrayList d = new ArrayList();
    private s e;
    private volatile r f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private av j;
    private Integer k;
    private volatile vd l;

    protected tq(Looper looper)
    {
        a = new tr(looper);
    }

    public static void b(r r)
    {
        if (!(r instanceof q))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((q)r).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("BasePendingResult", (new StringBuilder("Unable to release ")).append(r).toString(), runtimeexception);
        return;
    }

    private void c(r r)
    {
        f = r;
        j = null;
        c.countDown();
        r = f;
        if (e != null)
        {
            a.removeMessages(2);
            if (!h)
            {
                a.a(e, h());
            }
        }
        for (r = d.iterator(); r.hasNext(); r.next()) { }
        d.clear();
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

    private r h()
    {
        boolean flag = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        r r;
        if (g)
        {
            flag = false;
        }
        bl.a(flag, "Result has already been consumed.");
        bl.a(e(), "Result is not ready.");
        r = f;
        f = null;
        e = null;
        g = true;
        d();
        return r;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract r a(Status status);

    public final r a(TimeUnit timeunit)
    {
        boolean flag1 = true;
        boolean flag;
        if (1L <= 0L || Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "Result has already been consumed.");
        if (l == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        bl.a(flag, "Cannot await if then() has been called.");
        try
        {
            if (!c.await(1L, timeunit))
            {
                c(Status.d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            c(Status.b);
        }
        bl.a(e(), "Result is not ready.");
        return h();
    }

    public final Integer a()
    {
        return k;
    }

    public final void a(r r)
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
                b(r);
            }
            return;
        }
        boolean flag;
        if (!e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        bl.a(flag, "Result has already been consumed");
        c(r);
        obj;
        JVM INSTR monitorexit ;
        return;
        r;
        obj;
        JVM INSTR monitorexit ;
        throw r;
    }

    public final void a(s s)
    {
        boolean flag;
        boolean flag1 = true;
        Object obj;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "Result has already been consumed.");
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        bl.a(flag, "Cannot set callbacks if then() has been called.");
        if (!g())
        {
            break MISSING_BLOCK_LABEL_51;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!e())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        a.a(s, h());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        e = s;
          goto _L1
    }

    public final void c(Status status)
    {
        synchronized (b)
        {
            if (!e())
            {
                a(a(status));
                i = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    protected void d()
    {
    }

    public final boolean e()
    {
        return c.getCount() == 0L;
    }

    public final void f()
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
}
