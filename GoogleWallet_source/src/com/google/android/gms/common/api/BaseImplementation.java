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
import com.google.android.gms.internal.kh;
import com.google.android.gms.internal.kn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, PendingResult, Status, 
//            ResultCallback, GoogleApiClient

public final class BaseImplementation
{
    public static abstract class AbstractPendingResult
        implements b, PendingResult
    {

        private final Object Sd = new Object();
        private final ArrayList Se = new ArrayList();
        private ResultCallback Sf;
        private volatile Result Sg;
        private volatile boolean Sh;
        private boolean Si;
        private boolean Sj;
        private kh Sk;
        protected final CallbackHandler mHandler;
        private final CountDownLatch mu = new CountDownLatch(1);

        static void a(AbstractPendingResult abstractpendingresult)
        {
            abstractpendingresult.hZ();
        }

        private void c(Result result)
        {
            Sg = result;
            Sk = null;
            mu.countDown();
            Sg.getStatus();
            if (Sf != null)
            {
                mHandler.removeTimeoutMessages();
                if (!Si)
                {
                    mHandler.sendResultCallback(Sf, hW());
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
            mHandler.sendResultCallback(resultcallback, hW());
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

        protected AbstractPendingResult(Looper looper)
        {
            mHandler = new CallbackHandler(looper);
        }
    }

    public static final class CallbackHandler extends Handler
    {

        public static final int CALLBACK_ON_COMPLETE = 1;
        public static final int CALLBACK_ON_TIMEOUT = 2;

        private static void deliverResultCallback(ResultCallback resultcallback, Result result)
        {
            try
            {
                resultcallback.onResult(result);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ResultCallback resultcallback)
            {
                BaseImplementation.a(result);
            }
            throw resultcallback;
        }

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("GoogleApi", "Don't know how to handle this message.");
                return;

            case 1: // '\001'
                message = (Pair)message.obj;
                deliverResultCallback((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
                return;

            case 2: // '\002'
                AbstractPendingResult.a((AbstractPendingResult)message.obj);
                break;
            }
        }

        public final void removeTimeoutMessages()
        {
            removeMessages(2);
        }

        public final void sendResultCallback(ResultCallback resultcallback, Result result)
        {
            sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
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

    public static abstract class a extends AbstractPendingResult
        implements c.d
    {

        private final Api.c Sb;
        private final GoogleApiClient Sl;
        private c.b Sm;

        private void c(RemoteException remoteexception)
        {
            r(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected abstract void a(Api.a a1)
            throws RemoteException;

        public final void a(c.b b1)
        {
            Sm = b1;
        }

        public final void b(Api.a a1)
            throws DeadObjectException
        {
            try
            {
                a(a1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Api.a a1)
            {
                c(a1);
                throw a1;
            }
            // Misplaced declaration of an exception variable
            catch (Api.a a1)
            {
                c(a1);
            }
        }

        public final Api.c hV()
        {
            return Sb;
        }

        protected final void hX()
        {
            super.hX();
            if (Sm != null)
            {
                Sm.b(this);
                Sm = null;
            }
        }

        public final int ib()
        {
            return 0;
        }

        public final void r(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kn.b(flag, "Failed result must not be success");
            b(b(status));
        }

        protected a(Api.c c1, GoogleApiClient googleapiclient)
        {
            super(googleapiclient.getLooper());
            Sb = (Api.c)kn.k(c1);
            Sl = googleapiclient;
        }
    }

    public static interface b
    {

        public abstract void d(Object obj);
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
        Log.w("GoogleApi", (new StringBuilder("Unable to release ")).append(result).toString(), runtimeexception);
        return;
    }
}
