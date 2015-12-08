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
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, PendingResult, Status, 
//            ResultCallback

public class BaseImplementation
{
    public static abstract class AbstractPendingResult
        implements b, PendingResult
    {

        private final Object Ir;
        private final ArrayList Is;
        private ResultCallback It;
        private volatile Result Iu;
        private volatile boolean Iv;
        private boolean Iw;
        private boolean Ix;
        private j Iy;
        protected CallbackHandler mHandler;
        private final CountDownLatch mg;

        static void a(AbstractPendingResult abstractpendingresult)
        {
            abstractpendingresult.gi();
        }

        private void c(Result result)
        {
            Iu = result;
            Iy = null;
            mg.countDown();
            result = Iu.getStatus();
            if (It != null)
            {
                mHandler.removeTimeoutMessages();
                if (!Iw)
                {
                    mHandler.sendResultCallback(It, gf());
                }
            }
            for (Iterator iterator = Is.iterator(); iterator.hasNext(); ((PendingResult.a)iterator.next()).n(result)) { }
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

        protected void a(CallbackHandler callbackhandler)
        {
            mHandler = callbackhandler;
        }

        public final void a(PendingResult.a a1)
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
            a1.n(Iu.getStatus());
_L2:
            return;
            Is.add(a1);
            if (true) goto _L2; else goto _L1
_L1:
            a1;
            obj;
            JVM INSTR monitorexit ;
            throw a1;
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
            mHandler.sendResultCallback(resultcallback, gf());
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
            mHandler.sendResultCallback(resultcallback, gf());
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            resultcallback;
            obj;
            JVM INSTR monitorexit ;
            throw resultcallback;
            It = resultcallback;
            mHandler.sendTimeoutResultCallback(this, timeunit.toMillis(l));
              goto _L1
        }

        AbstractPendingResult()
        {
            Ir = new Object();
            mg = new CountDownLatch(1);
            Is = new ArrayList();
        }

        public AbstractPendingResult(Looper looper)
        {
            Ir = new Object();
            mg = new CountDownLatch(1);
            Is = new ArrayList();
            mHandler = new CallbackHandler(looper);
        }

        public AbstractPendingResult(CallbackHandler callbackhandler)
        {
            Ir = new Object();
            mg = new CountDownLatch(1);
            Is = new ArrayList();
            mHandler = callbackhandler;
        }
    }

    public static class CallbackHandler extends Handler
    {

        public static final int CALLBACK_ON_COMPLETE = 1;
        public static final int CALLBACK_ON_TIMEOUT = 2;

        protected void deliverResultCallback(ResultCallback resultcallback, Result result)
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

        public void handleMessage(Message message)
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

        public void removeTimeoutMessages()
        {
            removeMessages(2);
        }

        public void sendResultCallback(ResultCallback resultcallback, Result result)
        {
            sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
        }

        public void sendTimeoutResultCallback(AbstractPendingResult abstractpendingresult, long l)
        {
            sendMessageDelayed(obtainMessage(2, abstractpendingresult), l);
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
        implements b.c
    {

        private final Api.c Ip;
        private b.a Iz;

        private void a(RemoteException remoteexception)
        {
            m(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected abstract void a(Api.a a1)
            throws RemoteException;

        public void a(b.a a1)
        {
            Iz = a1;
        }

        public final void b(Api.a a1)
            throws DeadObjectException
        {
            if (mHandler == null)
            {
                a(new CallbackHandler(a1.getLooper()));
            }
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

        public final Api.c ge()
        {
            return Ip;
        }

        protected void gg()
        {
            super.gg();
            if (Iz != null)
            {
                Iz.b(this);
                Iz = null;
            }
        }

        public int gj()
        {
            return 0;
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
            o.b(flag, "Failed result must not be success");
            b(c(status));
        }

        protected a(Api.c c)
        {
            Ip = (Api.c)o.i(c);
        }
    }

    public static interface b
    {

        public abstract void b(Object obj);
    }


    public BaseImplementation()
    {
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
