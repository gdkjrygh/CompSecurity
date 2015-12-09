// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.kh;
import com.google.android.gms.internal.kn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, BaseImplementation, Result, Status, 
//            ResultCallback

public static abstract class 
    implements , PendingResult
{

    private final Object Sd = new Object();
    private final ArrayList Se = new ArrayList();
    private ResultCallback Sf;
    private volatile Result Sg;
    private volatile boolean Sh;
    private boolean Si;
    private boolean Sj;
    private kh Sk;
    protected final Sf mHandler;
    private final CountDownLatch mu = new CountDownLatch(1);

    static void a( )
    {
        .hZ();
    }

    private void c(Result result)
    {
        Sg = result;
        Sk = null;
        mu.countDown();
        Sg.getStatus();
        if (Sf != null)
        {
            mHandler.TimeoutMessages();
            if (!Si)
            {
                mHandler.sultCallback(Sf, hW());
            }
        }
        for (result = Se.iterator(); result.hasNext(); result.next()) { }
        Se.clear();
    }

    private Result hW()
    {
        Object obj = Sd;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        Exception exception;
        boolean flag;
        if (!Sh)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.a(flag, "Result has already been consumed.");
        kn.a(isReady(), "Result is not ready.");
        result = Sg;
        hX();
        obj;
        JVM INSTR monitorexit ;
        return result;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void hY()
    {
        synchronized (Sd)
        {
            if (!isReady())
            {
                b(b(Status.Ti));
                Sj = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void hZ()
    {
        synchronized (Sd)
        {
            if (!isReady())
            {
                b(b(Status.Tk));
                Sj = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean isCanceled()
    {
        boolean flag;
        synchronized (Sd)
        {
            flag = Si;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean isReady()
    {
        return mu.getCount() == 0L;
    }

    protected final void a(kh kh1)
    {
        synchronized (Sd)
        {
            Sk = kh1;
        }
        return;
        kh1;
        obj;
        JVM INSTR monitorexit ;
        throw kh1;
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
        kn.a(flag, "await must not be called on the UI thread");
        if (!Sh)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        kn.a(flag, "Result has already been consumed");
        try
        {
            mu.await();
        }
        catch (InterruptedException interruptedexception)
        {
            hY();
        }
        kn.a(isReady(), "Result is not ready.");
        return hW();
    }

    protected abstract Result b(Status status);

    public final void b(Result result)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (Sd)
            {
                if (!Sj && !Si)
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
        kn.a(flag, "Results have already been set");
        if (!Sh)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        kn.a(flag, "Result has already been consumed");
        c(result);
        obj;
        JVM INSTR monitorexit ;
        return;
        result;
        obj;
        JVM INSTR monitorexit ;
        throw result;
    }

    public final void cancel()
    {
label0:
        {
            synchronized (Sd)
            {
                if (!Si && !Sh)
                {
                    break label0;
                }
            }
            return;
        }
        kh kh1 = Sk;
        if (kh1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            Sk.cancel();
        }
        catch (RemoteException remoteexception) { }
        BaseImplementation.a(Sg);
        Sf = null;
        Si = true;
        c(b(Status.Tl));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d(Object obj)
    {
        b((Result)obj);
    }

    protected void hX()
    {
        Sh = true;
        Sg = null;
        Sf = null;
    }

    public final void setResultCallback(ResultCallback resultcallback)
    {
label0:
        {
            boolean flag;
            if (!Sh)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kn.a(flag, "Result has already been consumed.");
            synchronized (Sd)
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
        mHandler.sultCallback(resultcallback, hW());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        Sf = resultcallback;
          goto _L1
    }

    protected (Looper looper)
    {
        mHandler = new (looper);
    }
}
