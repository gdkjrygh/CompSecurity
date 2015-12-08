// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.hh;
import com.google.android.gms.internal.hn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, PendingResult, Status, 
//            ResultCallback

public class com.google.android.gms.common.api.a
{
    public static abstract class a
        implements PendingResult, d
    {

        private final Object Dm;
        private c Dn;
        private final ArrayList Do;
        private ResultCallback Dp;
        private volatile Result Dq;
        private volatile boolean Dr;
        private boolean Ds;
        private boolean Dt;
        private hh Du;
        private final CountDownLatch kI;

        static void a(a a1)
        {
            a1.eA();
        }

        private void c(Result result)
        {
            Dq = result;
            Du = null;
            kI.countDown();
            result = Dq.getStatus();
            if (Dp != null)
            {
                Dn.eC();
                if (!Ds)
                {
                    Dn.a(Dp, ex());
                }
            }
            for (Iterator iterator = Do.iterator(); iterator.hasNext(); ((PendingResult.a)iterator.next()).n(result)) { }
            Do.clear();
        }

        private void eA()
        {
            synchronized (Dm)
            {
                if (!isReady())
                {
                    b(c(Status.En));
                    Dt = true;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Result ex()
        {
            Object obj = Dm;
            obj;
            JVM INSTR monitorenter ;
            Result result;
            Exception exception;
            boolean flag;
            if (!Dr)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.a(flag, "Result has already been consumed.");
            hn.a(isReady(), "Result is not ready.");
            result = Dq;
            ey();
            obj;
            JVM INSTR monitorexit ;
            return result;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private void ez()
        {
            synchronized (Dm)
            {
                if (!isReady())
                {
                    b(c(Status.El));
                    Dt = true;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(PendingResult.a a1)
        {
            Object obj;
            boolean flag;
            if (!Dr)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.a(flag, "Result has already been consumed.");
            obj = Dm;
            obj;
            JVM INSTR monitorenter ;
            if (!isReady())
            {
                break MISSING_BLOCK_LABEL_47;
            }
            a1.n(Dq.getStatus());
_L2:
            return;
            Do.add(a1);
            if (true) goto _L2; else goto _L1
_L1:
            a1;
            obj;
            JVM INSTR monitorexit ;
            throw a1;
        }

        protected void a(c c1)
        {
            Dn = c1;
        }

        protected final void a(hh hh1)
        {
            synchronized (Dm)
            {
                Du = hh1;
            }
            return;
            hh1;
            obj;
            JVM INSTR monitorexit ;
            throw hh1;
        }

        public void a(Object obj)
        {
            b((Result)obj);
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
            hn.a(flag, "await must not be called on the UI thread");
            if (!Dr)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            hn.a(flag, "Result has already been consumed");
            try
            {
                kI.await();
            }
            catch (InterruptedException interruptedexception)
            {
                ez();
            }
            hn.a(isReady(), "Result is not ready.");
            return ex();
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
            hn.a(flag, "await must not be called on the UI thread when time is greater than zero.");
            if (!Dr)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            hn.a(flag, "Result has already been consumed.");
            try
            {
                if (!kI.await(l, timeunit))
                {
                    eA();
                }
            }
            // Misplaced declaration of an exception variable
            catch (TimeUnit timeunit)
            {
                ez();
            }
            hn.a(isReady(), "Result is not ready.");
            return ex();
        }

        public final void b(Result result)
        {
            boolean flag1;
label0:
            {
                flag1 = true;
                synchronized (Dm)
                {
                    if (!Dt && !Ds)
                    {
                        break label0;
                    }
                    com.google.android.gms.common.api.a.a(result);
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
            hn.a(flag, "Results have already been set");
            if (!Dr)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            hn.a(flag, "Result has already been consumed");
            c(result);
            obj;
            JVM INSTR monitorexit ;
            return;
            result;
            obj;
            JVM INSTR monitorexit ;
            throw result;
        }

        protected abstract Result c(Status status);

        public void cancel()
        {
label0:
            {
                synchronized (Dm)
                {
                    if (!Ds && !Dr)
                    {
                        break label0;
                    }
                }
                return;
            }
            hh hh1 = Du;
            if (hh1 == null)
            {
                break MISSING_BLOCK_LABEL_42;
            }
            try
            {
                Du.cancel();
            }
            catch (RemoteException remoteexception) { }
            com.google.android.gms.common.api.a.a(Dq);
            Dp = null;
            Ds = true;
            c(c(Status.Eo));
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void ey()
        {
            Dr = true;
            Dq = null;
            Dp = null;
        }

        public boolean isCanceled()
        {
            boolean flag;
            synchronized (Dm)
            {
                flag = Ds;
            }
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final boolean isReady()
        {
            return kI.getCount() == 0L;
        }

        public final void setResultCallback(ResultCallback resultcallback)
        {
label0:
            {
                boolean flag;
                if (!Dr)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                hn.a(flag, "Result has already been consumed.");
                synchronized (Dm)
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
            Dn.a(resultcallback, ex());
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            resultcallback;
            obj;
            JVM INSTR monitorexit ;
            throw resultcallback;
            Dp = resultcallback;
              goto _L1
        }

        public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
        {
label0:
            {
                boolean flag;
                if (!Dr)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                hn.a(flag, "Result has already been consumed.");
                synchronized (Dm)
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
                break MISSING_BLOCK_LABEL_66;
            }
            Dn.a(resultcallback, ex());
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            resultcallback;
            obj;
            JVM INSTR monitorexit ;
            throw resultcallback;
            Dp = resultcallback;
            Dn.a(this, timeunit.toMillis(l));
              goto _L1
        }

        a()
        {
            Dm = new Object();
            kI = new CountDownLatch(1);
            Do = new ArrayList();
        }

        public a(Looper looper)
        {
            Dm = new Object();
            kI = new CountDownLatch(1);
            Do = new ArrayList();
            Dn = new c(looper);
        }

        public a(c c1)
        {
            Dm = new Object();
            kI = new CountDownLatch(1);
            Do = new ArrayList();
            Dn = c1;
        }
    }

    public static abstract class b extends a
        implements c.c
    {

        private final Api.c Dk;
        private c.a Dv;

        private void a(RemoteException remoteexception)
        {
            m(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected abstract void a(Api.a a1)
            throws RemoteException;

        public void a(c.a a1)
        {
            Dv = a1;
        }

        public final void b(Api.a a1)
            throws DeadObjectException
        {
            a(new c(a1.getLooper()));
            try
            {
                a(a1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Api.a a1)
            {
                a(a1);
                throw a1;
            }
            // Misplaced declaration of an exception variable
            catch (Api.a a1)
            {
                a(a1);
            }
        }

        public int eB()
        {
            return 0;
        }

        public final Api.c ew()
        {
            return Dk;
        }

        protected void ey()
        {
            super.ey();
            if (Dv != null)
            {
                Dv.b(this);
                Dv = null;
            }
        }

        public final void m(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.b(flag, "Failed result must not be success");
            b(c(status));
        }

        protected b(Api.c c1)
        {
            Dk = (Api.c)hn.f(c1);
        }
    }

    public static class c extends Handler
    {

        public void a(ResultCallback resultcallback, Result result)
        {
            sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
        }

        public void a(a a1, long l)
        {
            sendMessageDelayed(obtainMessage(2, a1), l);
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
                com.google.android.gms.common.api.a.a(result);
            }
            throw resultcallback;
        }

        public void eC()
        {
            removeMessages(2);
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("GoogleApi", "Don't know how to handle this message.");
                return;

            case 1: // '\001'
                message = (Pair)message.obj;
                b((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
                return;

            case 2: // '\002'
                a.a((a)message.obj);
                break;
            }
        }

        public c()
        {
            this(Looper.getMainLooper());
        }

        public c(Looper looper)
        {
            super(looper);
        }
    }

    public static interface d
    {

        public abstract void a(Object obj);
    }


    static void a(Result result)
    {
        if (!(result instanceof Releasable))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((Releasable)result).release();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("GoogleApi", (new StringBuilder()).append("Unable to release ").append(result).toString(), runtimeexception);
        return;
    }
}
