// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, BaseImplementation, Result, Status, 
//            ResultCallback

public static abstract class mHandler
    implements mHandler, PendingResult
{

    private final Object Ir;
    private final ArrayList Is;
    private ResultCallback It;
    private volatile Result Iu;
    private volatile boolean Iv;
    private boolean Iw;
    private boolean Ix;
    private j Iy;
    protected meoutResultCallback mHandler;
    private final CountDownLatch mg;

    static void a(mHandler mhandler)
    {
        mhandler.gi();
    }

    private void c(Result result)
    {
        Iu = result;
        Iy = null;
        mg.countDown();
        result = Iu.getStatus();
        if (It != null)
        {
            mHandler.TimeoutMessages();
            if (!Iw)
            {
                mHandler.sultCallback(It, gf());
            }
        }
        for (Iterator iterator = Is.iterator(); iterator.hasNext(); ((Is)iterator.next()).Is(result)) { }
        Is.clear();
    }

    private Result gf()
    {
        Object obj = Ir;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        Exception exception;
        boolean flag;
        if (!Iv)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Result has already been consumed.");
        o.a(isReady(), "Result is not ready.");
        result = Iu;
        gg();
        obj;
        JVM INSTR monitorexit ;
        return result;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void gh()
    {
        synchronized (Ir)
        {
            if (!isReady())
            {
                b(c(Status.Jw));
                Ix = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void gi()
    {
        synchronized (Ir)
        {
            if (!isReady())
            {
                b(c(Status.Jy));
                Ix = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(Ix ix)
    {
        mHandler = ix;
    }

    public final void a(mHandler mhandler)
    {
        Object obj;
        boolean flag;
        if (!Iv)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Result has already been consumed.");
        obj = Ir;
        obj;
        JVM INSTR monitorenter ;
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        mhandler.isReady(Iu.getStatus());
_L2:
        return;
        Is.add(mhandler);
        if (true) goto _L2; else goto _L1
_L1:
        mhandler;
        obj;
        JVM INSTR monitorexit ;
        throw mhandler;
    }

    protected final void a(j j1)
    {
        synchronized (Ir)
        {
            Iy = j1;
        }
        return;
        j1;
        obj;
        JVM INSTR monitorexit ;
        throw j1;
    }

    public final Result await()
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
        o.a(flag, "await must not be called on the UI thread");
        if (!Iv)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "Result has already been consumed");
        try
        {
            mg.await();
        }
        catch (InterruptedException interruptedexception)
        {
            gh();
        }
        o.a(isReady(), "Result is not ready.");
        return gf();
    }

    public final Result await(long l, TimeUnit timeunit)
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
        o.a(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!Iv)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "Result has already been consumed.");
        try
        {
            if (!mg.await(l, timeunit))
            {
                gi();
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            gh();
        }
        o.a(isReady(), "Result is not ready.");
        return gf();
    }

    public final void b(Result result)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (Ir)
            {
                if (!Ix && !Iw)
                {
                    break label0;
                }
                BaseImplementation.a(result);
            }
            return;
        }
        boolean flag;
        if (!isReady())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Results have already been set");
        if (!Iv)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "Result has already been consumed");
        c(result);
        obj;
        JVM INSTR monitorexit ;
        return;
        result;
        obj;
        JVM INSTR monitorexit ;
        throw result;
    }

    public volatile void b(Object obj)
    {
        b((Result)obj);
    }

    protected abstract Result c(Status status);

    public void cancel()
    {
label0:
        {
            synchronized (Ir)
            {
                if (!Iw && !Iv)
                {
                    break label0;
                }
            }
            return;
        }
        j j1 = Iy;
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            Iy.cancel();
        }
        catch (RemoteException remoteexception) { }
        BaseImplementation.a(Iu);
        It = null;
        Iw = true;
        c(c(Status.Jz));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void gg()
    {
        Iv = true;
        Iu = null;
        It = null;
    }

    public boolean isCanceled()
    {
        boolean flag;
        synchronized (Ir)
        {
            flag = Iw;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isReady()
    {
        return mg.getCount() == 0L;
    }

    public final void setResultCallback(ResultCallback resultcallback)
    {
label0:
        {
            boolean flag;
            if (!Iv)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Result has already been consumed.");
            synchronized (Ir)
            {
                if (!isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        mHandler.sultCallback(resultcallback, gf());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        It = resultcallback;
          goto _L1
    }

    public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
    {
label0:
        {
            boolean flag1 = true;
            boolean flag;
            if (!Iv)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Result has already been consumed.");
            if (mHandler != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            o.a(flag, "CallbackHandler has not been set before calling setResultCallback.");
            synchronized (Ir)
            {
                if (!isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        mHandler.sultCallback(resultcallback, gf());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        It = resultcallback;
        mHandler.meoutResultCallback(this, timeunit.toMillis(l));
          goto _L1
    }

    ()
    {
        Ir = new Object();
        mg = new CountDownLatch(1);
        Is = new ArrayList();
    }

    public Is(Looper looper)
    {
        Ir = new Object();
        mg = new CountDownLatch(1);
        Is = new ArrayList();
        mHandler = new (looper);
    }

    public ( )
    {
        Ir = new Object();
        mg = new CountDownLatch(1);
        Is = new ArrayList();
        mHandler = ;
    }
}
