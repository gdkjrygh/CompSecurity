// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            e, f, g, Status, 
//            h

public abstract class j
    implements e
{
    public static final class a extends Handler
    {

        public final void a(h h1, g g1)
        {
            sendMessage(obtainMessage(1, new Pair(h1, g1)));
        }

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
                return;

            case 1: // '\001'
                Object obj = (Pair)message.obj;
                message = (h)((Pair) (obj)).first;
                obj = (g)((Pair) (obj)).second;
                try
                {
                    message.onResult(((g) (obj)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    j.b(((g) (obj)));
                }
                throw message;

            case 2: // '\002'
                ((j)message.obj).b(Status.d);
                return;
            }
        }

        public a()
        {
            this(Looper.getMainLooper());
        }

        public a(Looper looper)
        {
            super(looper);
        }
    }


    protected final a a;
    private final Object b = new Object();
    private final CountDownLatch c = new CountDownLatch(1);
    private final ArrayList d = new ArrayList();
    private h e;
    private volatile g f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private s j;

    protected j(Looper looper)
    {
        a = new a(looper);
    }

    static void b(g g1)
    {
        if (!(g1 instanceof f))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((f)g1).a();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("AbstractPendingResult", (new StringBuilder("Unable to release ")).append(g1).toString(), runtimeexception);
        return;
    }

    private void c(g g1)
    {
        f = g1;
        j = null;
        c.countDown();
        f.getStatus();
        if (e != null)
        {
            a.removeMessages(2);
            if (!h)
            {
                a.a(e, f());
            }
        }
        for (g1 = d.iterator(); g1.hasNext(); g1.next()) { }
        d.clear();
    }

    private boolean d()
    {
        return c.getCount() == 0L;
    }

    private boolean e()
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

    private g f()
    {
        boolean flag = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        g g1;
        if (g)
        {
            flag = false;
        }
        y.a(flag, "Result has already been consumed.");
        y.a(d(), "Result is not ready.");
        g1 = f;
        f = null;
        e = null;
        g = true;
        b();
        return g1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract g a(Status status);

    public final g a(TimeUnit timeunit)
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
        y.a(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        y.a(flag, "Result has already been consumed.");
        try
        {
            if (!c.await(1L, timeunit))
            {
                b(Status.d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            b(Status.b);
        }
        y.a(d(), "Result is not ready.");
        return f();
    }

    public final void a()
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

    public final void a(g g1)
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
                b(g1);
            }
            return;
        }
        boolean flag;
        if (!d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        y.a(flag, "Result has already been consumed");
        c(g1);
        obj;
        JVM INSTR monitorexit ;
        return;
        g1;
        obj;
        JVM INSTR monitorexit ;
        throw g1;
    }

    public final void a(h h1)
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
            y.a(flag, "Result has already been consumed.");
            synchronized (b)
            {
                if (!e())
                {
                    break label0;
                }
            }
            return;
        }
        if (!d())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        a.a(h1, f());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        h1;
        obj;
        JVM INSTR monitorexit ;
        throw h1;
        e = h1;
          goto _L1
    }

    protected void b()
    {
    }

    public final void b(Status status)
    {
        synchronized (b)
        {
            if (!d())
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
}
