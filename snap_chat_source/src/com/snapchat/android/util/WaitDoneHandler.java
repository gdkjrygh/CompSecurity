// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.os.Handler;
import android.os.Looper;
import com.snapchat.android.Timber;

public class WaitDoneHandler extends Handler
{

    private static final String TAG = "WaitDoneHandler";

    public WaitDoneHandler(Looper looper)
    {
        super(looper);
    }

    public boolean waitDone()
    {
        final Object waitDoneLock = new Object();
        Runnable runnable = new Runnable() {

            final WaitDoneHandler this$0;
            final Object val$waitDoneLock;

            public final void run()
            {
                synchronized (waitDoneLock)
                {
                    waitDoneLock.notifyAll();
                }
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = WaitDoneHandler.this;
                waitDoneLock = obj;
                super();
            }
        };
        waitDoneLock;
        JVM INSTR monitorenter ;
        post(runnable);
        waitDoneLock.wait();
        waitDoneLock;
        JVM INSTR monitorexit ;
        return true;
        Object obj;
        obj;
        Timber.a("WaitDoneHandler", "waitDone interrupted", new Object[0]);
        waitDoneLock;
        JVM INSTR monitorexit ;
        return false;
        obj;
        waitDoneLock;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
