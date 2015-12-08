// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public abstract class clw extends bra
{

    private final Object a = new Object();
    private clx b;
    private final CountDownLatch c = new CountDownLatch(1);
    private final ArrayList d = new ArrayList();
    private brd e;
    private volatile brc f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private volatile cmy j;

    protected clw(Looper looper)
    {
        b = new clx(looper);
    }

    private boolean a()
    {
        return c.getCount() == 0L;
    }

    public static void b(brc brc)
    {
        if (!(brc instanceof brb))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((brb)brc).a();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("BasePendingResult", (new StringBuilder("Unable to release ")).append(brc).toString(), runtimeexception);
        return;
    }

    private void c(brc brc)
    {
        f = brc;
        c.countDown();
        brc = f;
        if (e != null)
        {
            b.removeMessages(2);
            if (!h)
            {
                b.a(e, h());
            }
        }
        for (brc = d.iterator(); brc.hasNext(); brc.next()) { }
        d.clear();
    }

    private boolean g()
    {
        boolean flag;
        synchronized (a)
        {
            flag = h;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private brc h()
    {
        boolean flag = true;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        brc brc;
        if (g)
        {
            flag = false;
        }
        btl.a(flag, "Result has already been consumed.");
        btl.a(a(), "Result is not ready.");
        brc = f;
        f = null;
        e = null;
        g = true;
        e();
        return brc;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract brc a(Status status);

    public final void a(brc brc)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (a)
            {
                if (!i && !h)
                {
                    break label0;
                }
                b(brc);
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
        btl.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        btl.a(flag, "Result has already been consumed");
        c(brc);
        obj;
        JVM INSTR monitorexit ;
        return;
        brc;
        obj;
        JVM INSTR monitorexit ;
        throw brc;
    }

    public final void a(brd brd)
    {
label0:
        {
            boolean flag = true;
            if (g)
            {
                flag = false;
            }
            btl.a(flag, "Result has already been consumed.");
            synchronized (a)
            {
                cmy cmy = j;
                btl.a(true, "Cannot set callbacks if then() has been called.");
                if (!g())
                {
                    break label0;
                }
            }
            return;
        }
        if (!a())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        b.a(brd, h());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        brd;
        obj;
        JVM INSTR monitorexit ;
        throw brd;
        e = brd;
          goto _L1
    }

    public final brc b()
    {
        boolean flag1 = false;
        cmy cmy;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag, "await must not be called on the UI thread");
        flag = flag1;
        if (!g)
        {
            flag = true;
        }
        btl.a(flag, "Result has already been consumed");
        cmy = j;
        btl.a(true, "Cannot await if then() has been called.");
        try
        {
            c.await();
        }
        catch (InterruptedException interruptedexception)
        {
            d(Status.a);
        }
        btl.a(a(), "Result is not ready.");
        return h();
    }

    public final Integer c()
    {
        return null;
    }

    public final void d(Status status)
    {
        synchronized (a)
        {
            if (!a())
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

    protected void e()
    {
    }

    public final void f()
    {
label0:
        {
            synchronized (a)
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
        c(a(Status.d));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
