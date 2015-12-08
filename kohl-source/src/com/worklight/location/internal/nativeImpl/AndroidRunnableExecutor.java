// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import android.os.Handler;
import android.os.Looper;
import com.worklight.location.internal.IRunnableExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public class AndroidRunnableExecutor
    implements IRunnableExecutor
{

    private volatile Handler handler;
    private Thread t;

    public AndroidRunnableExecutor()
    {
        init();
    }

    private void init()
    {
        this;
        JVM INSTR monitorenter ;
        if (t == null) goto _L2; else goto _L1
_L1:
        boolean flag = t.isAlive();
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        handler = null;
        t = new Thread(new Runnable() {

            final AndroidRunnableExecutor this$0;

            public void run()
            {
                Looper.prepare();
                handler = new Handler();
                Looper.loop();
            }

            
            {
                this$0 = AndroidRunnableExecutor.this;
                super();
            }
        });
        t.setDaemon(true);
        t.start();
        while (handler == null) 
        {
            Thread.yield();
        }
        if (true) goto _L3; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void execute(final Runnable r)
    {
        this;
        JVM INSTR monitorenter ;
        final AtomicBoolean ran;
        init();
        ran = new AtomicBoolean();
        handler.post(new Runnable() {

            final AndroidRunnableExecutor this$0;
            final Runnable val$r;
            final AtomicBoolean val$ran;

            public void run()
            {
                r.run();
                synchronized (AndroidRunnableExecutor.this)
                {
                    ran.set(true);
                    notifyAll();
                }
                return;
                exception;
                androidrunnableexecutor;
                JVM INSTR monitorexit ;
                throw exception;
                Exception exception1;
                exception1;
                synchronized (AndroidRunnableExecutor.this)
                {
                    ran.set(true);
                    notifyAll();
                }
                throw exception1;
                exception2;
                androidrunnableexecutor1;
                JVM INSTR monitorexit ;
                throw exception2;
            }

            
            {
                this$0 = AndroidRunnableExecutor.this;
                r = runnable;
                ran = atomicboolean;
                super();
            }
        });
_L1:
        boolean flag = ran.get();
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        wait();
          goto _L1
        r;
        flag = Thread.interrupted();
        if (!flag) goto _L1; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        r;
        throw r;
    }

    public void execute(Runnable runnable, long l)
    {
        init();
        handler.postDelayed(runnable, l);
    }


/*
    static Handler access$002(AndroidRunnableExecutor androidrunnableexecutor, Handler handler1)
    {
        androidrunnableexecutor.handler = handler1;
        return handler1;
    }

*/
}
