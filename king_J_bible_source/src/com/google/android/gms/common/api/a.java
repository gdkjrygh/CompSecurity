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
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.fq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, Result, Releasable, Status, 
//            ResultCallback

public class com.google.android.gms.common.api.a
{
    public static abstract class a
        implements PendingResult, d
    {

        private final Object AB;
        private c AC;
        private final CountDownLatch AD;
        private final ArrayList AE;
        private ResultCallback AF;
        private volatile Result AG;
        private volatile boolean AH;
        private boolean AI;
        private boolean AJ;
        private fk AK;

        static void a(a a1)
        {
            a1.ee();
        }

        private void b(Result result)
        {
            AG = result;
            AK = null;
            AD.countDown();
            result = AG.getStatus();
            if (AF != null)
            {
                AC.eg();
                if (!AI)
                {
                    AC.a(AF, eb());
                }
            }
            for (Iterator iterator = AE.iterator(); iterator.hasNext(); ((PendingResult.a)iterator.next()).l(result)) { }
            AE.clear();
        }

        private void c(Result result)
        {
            if (!(result instanceof Releasable))
            {
                break MISSING_BLOCK_LABEL_16;
            }
            ((Releasable)result).release();
            return;
            result;
            Log.w("AbstractPendingResult", (new StringBuilder()).append("Unable to release ").append(this).toString(), result);
            return;
        }

        private Result eb()
        {
            Object obj = AB;
            obj;
            JVM INSTR monitorenter ;
            Result result;
            Exception exception;
            boolean flag;
            if (!AH)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.a(flag, "Result has already been consumed.");
            fq.a(isReady(), "Result is not ready.");
            result = AG;
            ec();
            obj;
            JVM INSTR monitorexit ;
            return result;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private void ed()
        {
            synchronized (AB)
            {
                if (!isReady())
                {
                    a(d(Status.Bw));
                    AJ = true;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private void ee()
        {
            synchronized (AB)
            {
                if (!isReady())
                {
                    a(d(Status.By));
                    AJ = true;
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
            if (!AH)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.a(flag, "Result has already been consumed.");
            obj = AB;
            obj;
            JVM INSTR monitorenter ;
            if (!isReady())
            {
                break MISSING_BLOCK_LABEL_47;
            }
            a1.l(AG.getStatus());
_L2:
            return;
            AE.add(a1);
            if (true) goto _L2; else goto _L1
_L1:
            a1;
            obj;
            JVM INSTR monitorexit ;
            throw a1;
        }

        public final void a(Result result)
        {
            boolean flag1;
label0:
            {
                flag1 = true;
                synchronized (AB)
                {
                    if (!AJ && !AI)
                    {
                        break label0;
                    }
                    c(result);
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
            fq.a(flag, "Results have already been set");
            if (!AH)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            fq.a(flag, "Result has already been consumed");
            b(result);
            obj;
            JVM INSTR monitorexit ;
            return;
            result;
            obj;
            JVM INSTR monitorexit ;
            throw result;
        }

        protected void a(c c1)
        {
            AC = c1;
        }

        protected final void a(fk fk1)
        {
            synchronized (AB)
            {
                AK = fk1;
            }
            return;
            fk1;
            obj;
            JVM INSTR monitorexit ;
            throw fk1;
        }

        public final Result await()
        {
label0:
            {
                boolean flag1 = false;
                boolean flag;
                if (!AH)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                fq.a(flag, "Result has already been consumed");
                if (!isReady())
                {
                    flag = flag1;
                    if (Looper.myLooper() == Looper.getMainLooper())
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            fq.a(flag, "await must not be called on the UI thread");
            try
            {
                AD.await();
            }
            catch (InterruptedException interruptedexception)
            {
                ed();
            }
            fq.a(isReady(), "Result is not ready.");
            return eb();
        }

        public final Result await(long l, TimeUnit timeunit)
        {
label0:
            {
                boolean flag1 = false;
                boolean flag;
                if (!AH)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                fq.a(flag, "Result has already been consumed.");
                if (!isReady())
                {
                    flag = flag1;
                    if (Looper.myLooper() == Looper.getMainLooper())
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            fq.a(flag, "await must not be called on the UI thread");
            try
            {
                if (!AD.await(l, timeunit))
                {
                    ee();
                }
            }
            // Misplaced declaration of an exception variable
            catch (TimeUnit timeunit)
            {
                ed();
            }
            fq.a(isReady(), "Result is not ready.");
            return eb();
        }

        public void b(Object obj)
        {
            a((Result)obj);
        }

        public void cancel()
        {
label0:
            {
                synchronized (AB)
                {
                    if (!AI)
                    {
                        break label0;
                    }
                }
                return;
            }
            fk fk1 = AK;
            if (fk1 == null)
            {
                break MISSING_BLOCK_LABEL_35;
            }
            try
            {
                AK.cancel();
            }
            catch (RemoteException remoteexception) { }
            c(AG);
            AF = null;
            AI = true;
            b(d(Status.Bz));
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected abstract Result d(Status status);

        protected void ec()
        {
            AH = true;
            AG = null;
            AF = null;
        }

        public boolean isCanceled()
        {
            boolean flag;
            synchronized (AB)
            {
                flag = AI;
            }
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final boolean isReady()
        {
            return AD.getCount() == 0L;
        }

        public final void setResultCallback(ResultCallback resultcallback)
        {
label0:
            {
                boolean flag;
                if (!AH)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                fq.a(flag, "Result has already been consumed.");
                synchronized (AB)
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
            AC.a(resultcallback, eb());
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            resultcallback;
            obj;
            JVM INSTR monitorexit ;
            throw resultcallback;
            AF = resultcallback;
              goto _L1
        }

        public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
        {
label0:
            {
                boolean flag;
                if (!AH)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                fq.a(flag, "Result has already been consumed.");
                synchronized (AB)
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
            AC.a(resultcallback, eb());
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            resultcallback;
            obj;
            JVM INSTR monitorexit ;
            throw resultcallback;
            AF = resultcallback;
            AC.a(this, timeunit.toMillis(l));
              goto _L1
        }

        a()
        {
            AB = new Object();
            AD = new CountDownLatch(1);
            AE = new ArrayList();
        }

        public a(Looper looper)
        {
            AB = new Object();
            AD = new CountDownLatch(1);
            AE = new ArrayList();
            AC = new c(looper);
        }

        public a(c c1)
        {
            AB = new Object();
            AD = new CountDownLatch(1);
            AE = new ArrayList();
            AC = c1;
        }
    }

    public static abstract class b extends a
        implements b.c
    {

        private b.a AL;
        private final Api.c Az;

        private void a(RemoteException remoteexception)
        {
            k(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected abstract void a(Api.a a1)
            throws RemoteException;

        public void a(b.a a1)
        {
            AL = a1;
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

        public final Api.c ea()
        {
            return Az;
        }

        protected void ec()
        {
            super.ec();
            if (AL != null)
            {
                AL.b(this);
                AL = null;
            }
        }

        public int ef()
        {
            return 0;
        }

        public final void k(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.b(flag, "Failed result must not be success");
            a(d(status));
        }

        protected b(Api.c c1)
        {
            Az = (Api.c)fq.f(c1);
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
            resultcallback.onResult(result);
        }

        public void eg()
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

        public abstract void b(Object obj);
    }

}
