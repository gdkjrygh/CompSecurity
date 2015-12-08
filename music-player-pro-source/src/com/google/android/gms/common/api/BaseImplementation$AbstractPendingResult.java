// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.jx;
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

    private final Object Jp;
    private final ArrayList Jq;
    private ResultCallback Jr;
    private volatile Result Js;
    private volatile boolean Jt;
    private boolean Ju;
    private boolean Jv;
    private jr Jw;
    protected final meoutResultCallback mHandler;
    private final CountDownLatch mr;

    static void a(mHandler mhandler)
    {
        mhandler.gD();
    }

    private void c(Result result)
    {
        Js = result;
        Jw = null;
        mr.countDown();
        result = Js.getStatus();
        if (Jr != null)
        {
            mHandler.TimeoutMessages();
            if (!Ju)
            {
                mHandler.sultCallback(Jr, gA());
            }
        }
        for (Iterator iterator = Jq.iterator(); iterator.hasNext(); ((Jq)iterator.next()).Jq(result)) { }
        Jq.clear();
    }

    private Result gA()
    {
        Object obj = Jp;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        Exception exception;
        boolean flag;
        if (!Jt)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Result has already been consumed.");
        jx.a(isReady(), "Result is not ready.");
        result = Js;
        gB();
        obj;
        JVM INSTR monitorexit ;
        return result;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void gC()
    {
        synchronized (Jp)
        {
            if (!isReady())
            {
                b(c(Status.Kx));
                Jv = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void gD()
    {
        synchronized (Jp)
        {
            if (!isReady())
            {
                b(c(Status.Kz));
                Jv = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Jv jv)
    {
        Object obj;
        boolean flag;
        if (!Jt)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Result has already been consumed.");
        obj = Jp;
        obj;
        JVM INSTR monitorenter ;
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        jv.isReady(Js.getStatus());
_L2:
        return;
        Jq.add(jv);
        if (true) goto _L2; else goto _L1
_L1:
        jv;
        obj;
        JVM INSTR monitorexit ;
        throw jv;
    }

    protected final void a(jr jr1)
    {
        synchronized (Jp)
        {
            Jw = jr1;
        }
        return;
        jr1;
        obj;
        JVM INSTR monitorexit ;
        throw jr1;
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
        jx.a(flag, "await must not be called on the UI thread");
        if (!Jt)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Result has already been consumed");
        try
        {
            mr.await();
        }
        catch (InterruptedException interruptedexception)
        {
            gC();
        }
        jx.a(isReady(), "Result is not ready.");
        return gA();
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
        jx.a(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!Jt)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Result has already been consumed.");
        try
        {
            if (!mr.await(l, timeunit))
            {
                gD();
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            gC();
        }
        jx.a(isReady(), "Result is not ready.");
        return gA();
    }

    public final void b(Result result)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (Jp)
            {
                if (!Jv && !Ju)
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
        jx.a(flag, "Results have already been set");
        if (!Jt)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Result has already been consumed");
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
            synchronized (Jp)
            {
                if (!Ju && !Jt)
                {
                    break label0;
                }
            }
            return;
        }
        jr jr1 = Jw;
        if (jr1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            Jw.cancel();
        }
        catch (RemoteException remoteexception) { }
        BaseImplementation.a(Js);
        Jr = null;
        Ju = true;
        c(c(Status.KA));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void gB()
    {
        Jt = true;
        Js = null;
        Jr = null;
    }

    public boolean isCanceled()
    {
        boolean flag;
        synchronized (Jp)
        {
            flag = Ju;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isReady()
    {
        return mr.getCount() == 0L;
    }

    public final void setResultCallback(ResultCallback resultcallback)
    {
label0:
        {
            boolean flag;
            if (!Jt)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Result has already been consumed.");
            synchronized (Jp)
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
        mHandler.sultCallback(resultcallback, gA());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        Jr = resultcallback;
          goto _L1
    }

    public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
    {
label0:
        {
            boolean flag1 = true;
            boolean flag;
            if (!Jt)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Result has already been consumed.");
            if (mHandler != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.a(flag, "CallbackHandler has not been set before calling setResultCallback.");
            synchronized (Jp)
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
        mHandler.sultCallback(resultcallback, gA());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        Jr = resultcallback;
        mHandler.meoutResultCallback(this, timeunit.toMillis(l));
          goto _L1
    }

    protected (Looper looper)
    {
        Jp = new Object();
        mr = new CountDownLatch(1);
        Jq = new ArrayList();
        mHandler = new (looper);
    }

    protected ( )
    {
        Jp = new Object();
        mr = new CountDownLatch(1);
        Jq = new ArrayList();
        mHandler = ;
    }
}
