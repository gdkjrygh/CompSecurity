// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class jyz
    implements jyt
{

    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public volatile jyw c;
    public volatile boolean d;
    public kcg e;
    private jza f;
    private final CountDownLatch g = new CountDownLatch(1);
    private jyx h;
    private boolean i;
    private boolean j;

    public jyz(Looper looper)
    {
        f = new jza(looper);
    }

    static void b(jyw jyw)
    {
        if (!(jyw instanceof jyv))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((jyv)jyw).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("AbstractPendingResult", (new StringBuilder("Unable to release ")).append(jyw).toString(), runtimeexception);
        return;
    }

    private void c(jyw jyw)
    {
        c = jyw;
        e = null;
        g.countDown();
        jyw = c;
        if (h != null)
        {
            f.removeMessages(2);
            if (!i)
            {
                f.a(h, h());
            }
        }
        for (jyw = b.iterator(); jyw.hasNext(); ((jyu)jyw.next()).a()) { }
        b.clear();
    }

    private boolean g()
    {
        boolean flag;
        synchronized (a)
        {
            flag = i;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private jyw h()
    {
        boolean flag = true;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        jyw jyw;
        if (d)
        {
            flag = false;
        }
        b.a(flag, "Result has already been consumed.");
        b.a(c(), "Result is not ready.");
        jyw = c;
        c = null;
        h = null;
        d = true;
        d();
        return jyw;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final jyw a()
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
        b.a(flag, "await must not be called on the UI thread");
        if (!d)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b.a(flag, "Result has already been consumed");
        try
        {
            g.await();
        }
        catch (InterruptedException interruptedexception)
        {
            b(Status.b);
        }
        b.a(c(), "Result is not ready.");
        return h();
    }

    public final jyw a(long l, TimeUnit timeunit)
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
        b.a(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!d)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b.a(flag, "Result has already been consumed.");
        try
        {
            if (!g.await(l, timeunit))
            {
                b(Status.d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            b(Status.b);
        }
        b.a(c(), "Result is not ready.");
        return h();
    }

    public abstract jyw a(Status status);

    public final void a(jyu jyu1)
    {
        Object obj;
        jyw jyw;
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Result has already been consumed.");
        obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!c())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        jyw = c;
        jyu1.a();
_L2:
        return;
        b.add(jyu1);
        if (true) goto _L2; else goto _L1
_L1:
        jyu1;
        obj;
        JVM INSTR monitorexit ;
        throw jyu1;
    }

    public final void a(jyw jyw)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (a)
            {
                if (!j && !i)
                {
                    break label0;
                }
                b(jyw);
            }
            return;
        }
        boolean flag;
        if (!c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Results have already been set");
        if (!d)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b.a(flag, "Result has already been consumed");
        c(jyw);
        obj;
        JVM INSTR monitorexit ;
        return;
        jyw;
        obj;
        JVM INSTR monitorexit ;
        throw jyw;
    }

    public final void a(jyx jyx)
    {
label0:
        {
            boolean flag;
            if (!d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "Result has already been consumed.");
            synchronized (a)
            {
                if (!g())
                {
                    break label0;
                }
            }
            return;
        }
        if (!c())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        f.a(jyx, h());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        jyx;
        obj;
        JVM INSTR monitorexit ;
        throw jyx;
        h = jyx;
          goto _L1
    }

    public final void b()
    {
label0:
        {
            synchronized (a)
            {
                if (!i && !d)
                {
                    break label0;
                }
            }
            return;
        }
        kcg kcg1 = e;
        if (kcg1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            e.a();
        }
        catch (RemoteException remoteexception) { }
        b(c);
        h = null;
        i = true;
        c(a(Status.e));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(Status status)
    {
        synchronized (a)
        {
            if (!c())
            {
                a(a(status));
                j = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    public final boolean c()
    {
        return g.getCount() == 0L;
    }

    protected void d()
    {
    }
}
