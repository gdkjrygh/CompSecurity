// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public final class ckb
{

    public Handler a;
    public int b;
    public final Object c = new Object();
    private HandlerThread d;

    public ckb()
    {
        d = null;
        a = null;
        b = 0;
    }

    public final Looper a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (b != 0)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (d != null) goto _L2; else goto _L1
_L1:
        bka.d("Starting the looper thread.");
        d = new HandlerThread("LooperProvider");
        d.start();
        a = new Handler(d.getLooper());
        bka.d("Looper thread started.");
_L3:
        Looper looper;
        b = b + 1;
        looper = d.getLooper();
        return looper;
_L2:
        bka.d("Resuming the looper thread");
        c.notifyAll();
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        btl.a(d, "Invalid state: mHandlerThread should already been initialized.");
          goto _L3
    }

    // Unreferenced inner class ckb$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private ckb a;

        public final void run()
        {
            Object obj = a.c;
            obj;
            JVM INSTR monitorenter ;
            bka.d("Suspending the looper thread");
_L1:
            int i = a.b;
            if (i != 0)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            a.c.wait();
            bka.d("Looper thread resumed");
              goto _L1
            Object obj1;
            obj1;
            bka.d("Looper thread interrupted.");
              goto _L1
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
            obj;
            JVM INSTR monitorexit ;
        }

            public 
            {
                a = ckb.this;
                super();
            }
    }

}
