// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, Releasable, Result, Status, 
//            ResultCallback

public abstract class AbstractPendingResult
    implements PendingResult
{

    protected final CallbackHandler a;
    private final Object b = new Object();
    private final CountDownLatch c = new CountDownLatch(1);
    private final ArrayList d = new ArrayList();
    private ResultCallback e;
    private volatile Result f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private ICancelToken j;

    protected AbstractPendingResult(Looper looper)
    {
        a = new CallbackHandler(looper);
    }

    static void b(Result result)
    {
        if (!(result instanceof Releasable))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((Releasable)result).f_();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("AbstractPendingResult", (new StringBuilder()).append("Unable to release ").append(result).toString(), runtimeexception);
        return;
    }

    private void c(Result result)
    {
        f = result;
        j = null;
        c.countDown();
        result = f.a();
        if (e != null)
        {
            a.a();
            if (!h)
            {
                a.a(e, h());
            }
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((PendingResult.BatchCallback)iterator.next()).a(result)) { }
        d.clear();
    }

    private Result h()
    {
        boolean flag = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        if (g)
        {
            flag = false;
        }
        zzu.a(flag, "Result has already been consumed.");
        zzu.a(a(), "Result is not ready.");
        result = f;
        f = null;
        e = null;
        g = true;
        e();
        return result;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Result result)
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
                b(result);
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
        zzu.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.a(flag, "Result has already been consumed");
        c(result);
        obj;
        JVM INSTR monitorexit ;
        return;
        result;
        obj;
        JVM INSTR monitorexit ;
        throw result;
    }

    public final void a(ResultCallback resultcallback)
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
            zzu.a(flag, "Result has already been consumed.");
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
        a.a(resultcallback, h());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        e = resultcallback;
          goto _L1
    }

    public final void a(Status status)
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

    public final boolean a()
    {
        return c.getCount() == 0L;
    }

    public final Result b()
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
        zzu.a(flag, "await must not be called on the UI thread");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.a(flag, "Result has already been consumed");
        try
        {
            c.await();
        }
        catch (InterruptedException interruptedexception)
        {
            a(Status.b);
        }
        zzu.a(a(), "Result is not ready.");
        return h();
    }

    protected abstract Result b(Status status);

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
        ICancelToken icanceltoken = j;
        if (icanceltoken == null)
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
    }

    private class CallbackHandler extends Handler
    {

        public void a()
        {
            removeMessages(2);
        }

        public void a(ResultCallback resultcallback, Result result)
        {
            sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
        }

        protected void b(ResultCallback resultcallback, Result result)
        {
            try
            {
                resultcallback.onResult(result);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ResultCallback resultcallback)
            {
                AbstractPendingResult.b(result);
            }
            throw resultcallback;
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
                b((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
                return;

            case 2: // '\002'
                ((AbstractPendingResult)message.obj).a(Status.d);
                break;
            }
        }

        public CallbackHandler()
        {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper)
        {
            super(looper);
        }
    }

}
