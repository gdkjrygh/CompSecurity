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
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, PendingResult, Status, 
//            ResultCallback, GoogleApiClient

public class BaseImplementation
{
    public static abstract class AbstractPendingResult
        implements b, PendingResult
    {

        private final Object Jp;
        private final ArrayList Jq;
        private ResultCallback Jr;
        private volatile Result Js;
        private volatile boolean Jt;
        private boolean Ju;
        private boolean Jv;
        private jr Jw;
        protected final CallbackHandler mHandler;
        private final CountDownLatch mr;

        static void a(AbstractPendingResult abstractpendingresult)
        {
            abstractpendingresult.gD();
        }

        private void c(Result result)
        {
            Js = result;
            Jw = null;
            mr.countDown();
            result = Js.getStatus();
            if (Jr != null)
            {
                mHandler.removeTimeoutMessages();
                if (!Ju)
                {
                    mHandler.sendResultCallback(Jr, gA());
                }
            }
            for (Iterator iterator = Jq.iterator(); iterator.hasNext(); ((PendingResult.a)iterator.next()).m(result)) { }
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

        public final void a(PendingResult.a a1)
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
            a1.m(Js.getStatus());
_L2:
            return;
            Jq.add(a1);
            if (true) goto _L2; else goto _L1
_L1:
            a1;
            obj;
            JVM INSTR monitorexit ;
            throw a1;
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
            mHandler.sendResultCallback(resultcallback, gA());
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
            mHandler.sendResultCallback(resultcallback, gA());
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            resultcallback;
            obj;
            JVM INSTR monitorexit ;
            throw resultcallback;
            Jr = resultcallback;
            mHandler.sendTimeoutResultCallback(this, timeunit.toMillis(l));
              goto _L1
        }

        protected AbstractPendingResult(Looper looper)
        {
            Jp = new Object();
            mr = new CountDownLatch(1);
            Jq = new ArrayList();
            mHandler = new CallbackHandler(looper);
        }

        protected AbstractPendingResult(CallbackHandler callbackhandler)
        {
            Jp = new Object();
            mr = new CountDownLatch(1);
            Jq = new ArrayList();
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
        implements c.d
    {

        private final Api.c Jn;
        private final GoogleApiClient Jx;
        private c.b Jy;

        private void a(RemoteException remoteexception)
        {
            l(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected abstract void a(Api.a a1)
            throws RemoteException;

        public void a(c.b b1)
        {
            Jy = b1;
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
                a(a1);
                throw a1;
            }
            // Misplaced declaration of an exception variable
            catch (Api.a a1)
            {
                a(a1);
            }
        }

        protected void gB()
        {
            super.gB();
            if (Jy != null)
            {
                Jy.b(this);
                Jy = null;
            }
        }

        public final a gE()
        {
            jx.b(Jx, "GoogleApiClient was not set.");
            Jx.b(this);
            return this;
        }

        public int gF()
        {
            return 0;
        }

        public final Api.c gz()
        {
            return Jn;
        }

        public final void l(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Failed result must not be success");
            b(c(status));
        }

        protected a(Api.c c, GoogleApiClient googleapiclient)
        {
            super(googleapiclient.getLooper());
            Jn = (Api.c)jx.i(c);
            Jx = googleapiclient;
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
