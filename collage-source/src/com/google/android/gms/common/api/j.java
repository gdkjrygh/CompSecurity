// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.z;
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
    public static class a extends Handler
    {

        public void a()
        {
            removeMessages(2);
        }

        public void a(h h1, g g1)
        {
            sendMessage(obtainMessage(1, new Pair(h1, g1)));
        }

        protected void b(h h1, g g1)
        {
            try
            {
                h1.a(g1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (h h1)
            {
                j.b(g1);
            }
            throw h1;
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
                return;

            case 1: // '\001'
                message = (Pair)message.obj;
                b((h)((Pair) (message)).first, (g)((Pair) (message)).second);
                return;

            case 2: // '\002'
                ((j)message.obj).c(Status.d);
                break;
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
        ((f)g1).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("AbstractPendingResult", (new StringBuilder()).append("Unable to release ").append(g1).toString(), runtimeexception);
        return;
    }

    private void c(g g1)
    {
        f = g1;
        j = null;
        c.countDown();
        g1 = f.a();
        if (e != null)
        {
            a.a();
            if (!h)
            {
                a.a(e, g());
            }
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((e.a)iterator.next()).a(g1)) { }
        d.clear();
    }

    private g g()
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
        z.a(flag, "Result has already been consumed.");
        z.a(a(), "Result is not ready.");
        g1 = f;
        f = null;
        e = null;
        g = true;
        d();
        return g1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final g a(long l, TimeUnit timeunit)
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
        z.a(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        z.a(flag, "Result has already been consumed.");
        try
        {
            if (!c.await(l, timeunit))
            {
                c(Status.d);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            c(Status.b);
        }
        z.a(a(), "Result is not ready.");
        return g();
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
        if (!a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        z.a(flag, "Result has already been consumed");
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
            z.a(flag, "Result has already been consumed.");
            synchronized (b)
            {
                if (!c())
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
        a.a(h1, g());
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

    public final boolean a()
    {
        return c.getCount() == 0L;
    }

    protected abstract g b(Status status);

    public void b()
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
        s s1 = j;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            j.a();
        }
        catch (RemoteException remoteexception) { }
        b(f);
        e = null;
        h = true;
        c(b(Status.e));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(Status status)
    {
        synchronized (b)
        {
            if (!a())
            {
                a(b(status));
                i = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    public boolean c()
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

    protected void d()
    {
    }
}
