// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.ag;
import com.google.android.gms.internal.am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            i, b, k, Status, 
//            l

public static abstract class a
    implements a, i
{

    protected final e a;
    private final Object b;
    private final CountDownLatch c;
    private final ArrayList d;
    private l e;
    private volatile k f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private ag j;

    static void a(a a1)
    {
        a1.j();
    }

    private void b(k k1)
    {
        f = k1;
        j = null;
        c.countDown();
        k1 = f.a();
        if (e != null)
        {
            a.a();
            if (!h)
            {
                a.a(e, f());
            }
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((d)iterator.next()).a(k1)) { }
        d.clear();
    }

    private k f()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        k k1;
        Exception exception;
        boolean flag;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag, "Result has already been consumed.");
        am.a(a(), "Result is not ready.");
        k1 = f;
        e();
        obj;
        JVM INSTR monitorexit ;
        return k1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void i()
    {
        synchronized (b)
        {
            if (!a())
            {
                a(a(Status.b));
                i = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void j()
    {
        synchronized (b)
        {
            if (!a())
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

    public final k a(long l, TimeUnit timeunit)
    {
        boolean flag1 = true;
        boolean flag;
        if (l <= 0L || Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        am.a(flag, "Result has already been consumed.");
        try
        {
            if (!c.await(l, timeunit))
            {
                j();
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            i();
        }
        am.a(a(), "Result is not ready.");
        return f();
    }

    protected abstract k a(Status status);

    public final void a(us us)
    {
        Object obj;
        boolean flag;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag, "Result has already been consumed.");
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (!a())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        us.a(f.a());
_L2:
        return;
        d.add(us);
        if (true) goto _L2; else goto _L1
_L1:
        us;
        obj;
        JVM INSTR monitorexit ;
        throw us;
    }

    public final void a(k k1)
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
                com.google.android.gms.common.api.b.a(k1);
            }
            return;
        }
        boolean flag;
        if (!a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        am.a(flag, "Result has already been consumed");
        b(k1);
        obj;
        JVM INSTR monitorexit ;
        return;
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public final void a(l l)
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
            am.a(flag, "Result has already been consumed.");
            synchronized (b)
            {
                if (!d())
                {
                    break label0;
                }
            }
            return;
        }
        if (!a())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        a.a(l, f());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        l;
        obj;
        JVM INSTR monitorexit ;
        throw l;
        e = l;
          goto _L1
    }

    public final void a(l l, long l1, TimeUnit timeunit)
    {
label0:
        {
            boolean flag1 = true;
            boolean flag;
            if (!g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.a(flag, "Result has already been consumed.");
            if (a != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            am.a(flag, "CallbackHandler has not been set before calling setResultCallback.");
            synchronized (b)
            {
                if (!d())
                {
                    break label0;
                }
            }
            return;
        }
        if (!a())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        a.a(l, f());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        l;
        obj;
        JVM INSTR monitorexit ;
        throw l;
        e = l;
        a.a(this, timeunit.toMillis(l1));
          goto _L1
    }

    protected final void a(ag ag1)
    {
        synchronized (b)
        {
            j = ag1;
        }
        return;
        ag1;
        obj;
        JVM INSTR monitorexit ;
        throw ag1;
    }

    public volatile void a(Object obj)
    {
        a((k)obj);
    }

    public final boolean a()
    {
        return c.getCount() == 0L;
    }

    public final k b()
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
        am.a(flag, "await must not be called on the UI thread");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        am.a(flag, "Result has already been consumed");
        try
        {
            c.await();
        }
        catch (InterruptedException interruptedexception)
        {
            i();
        }
        am.a(a(), "Result is not ready.");
        return f();
    }

    public void c()
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
        ag ag1 = j;
        if (ag1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            j.a();
        }
        catch (RemoteException remoteexception) { }
        com.google.android.gms.common.api.b.a(f);
        e = null;
        h = true;
        b(a(Status.e));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean d()
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

    protected void e()
    {
        g = true;
        f = null;
        e = null;
    }

    protected us(Looper looper)
    {
        b = new Object();
        c = new CountDownLatch(1);
        d = new ArrayList();
        a = new <init>(looper);
    }

    protected <init>(<init> <init>1)
    {
        b = new Object();
        c = new CountDownLatch(1);
        d = new ArrayList();
        a = <init>1;
    }
}
