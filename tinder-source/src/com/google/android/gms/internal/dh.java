// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.internal:
//            dr

public abstract class dh extends d
{
    public static final class a extends Handler
    {

        public final void a(g g1, f f1)
        {
            sendMessage(obtainMessage(1, new Pair(g1, f1)));
        }

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("BasePendingResult", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
                return;

            case 1: // '\001'
                Object obj = (Pair)message.obj;
                message = (g)((Pair) (obj)).first;
                obj = (f)((Pair) (obj)).second;
                try
                {
                    message.a(((f) (obj)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    dh.b(((f) (obj)));
                }
                throw message;

            case 2: // '\002'
                ((dh)message.obj).b(Status.d);
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


    private final Object a = new Object();
    protected final a b;
    private final CountDownLatch c = new CountDownLatch(1);
    private final ArrayList d = new ArrayList();
    private g e;
    private volatile f f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private p j;
    private Integer k;
    private volatile dr l;

    protected dh(Looper looper)
    {
        b = new a(looper);
    }

    public static void b(f f1)
    {
        if (!(f1 instanceof e))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((e)f1).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("BasePendingResult", (new StringBuilder("Unable to release ")).append(f1).toString(), runtimeexception);
        return;
    }

    private void c(f f1)
    {
        f = f1;
        j = null;
        c.countDown();
        f1 = f;
        if (e != null)
        {
            b.removeMessages(2);
            if (!h)
            {
                b.a(e, h());
            }
        }
        for (f1 = d.iterator(); f1.hasNext(); f1.next()) { }
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

    private f h()
    {
        boolean flag = true;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        f f1;
        if (g)
        {
            flag = false;
        }
        u.a(flag, "Result has already been consumed.");
        u.a(e(), "Result is not ready.");
        f1 = f;
        f = null;
        e = null;
        g = true;
        d();
        return f1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Integer a()
    {
        return k;
    }

    public final void a(f f1)
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
                b(f1);
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
        u.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        u.a(flag, "Result has already been consumed");
        c(f1);
        obj;
        JVM INSTR monitorexit ;
        return;
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
    }

    public final void a(g g1)
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
        u.a(flag, "Result has already been consumed.");
        obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        u.a(flag, "Cannot set callbacks if then() has been called.");
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
        b.a(g1, h());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        g1;
        obj;
        JVM INSTR monitorexit ;
        throw g1;
        e = g1;
          goto _L1
    }

    public final void b(Status status)
    {
        synchronized (a)
        {
            if (!e())
            {
                a(c(status));
                i = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    public abstract f c(Status status);

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
        c(c(Status.e));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
