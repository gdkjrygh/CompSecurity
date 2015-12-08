// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.PowerManager;
import java.io.PrintWriter;
import java.io.StringWriter;

// Referenced classes of package com.quantcast.measurement.service:
//            QCMeasurement, QCLog

class QCEventHandler extends HandlerThread
{
    private static class CatchAllRunnable
        implements Runnable
    {

        final Runnable m_delegate;

        public void run()
        {
            try
            {
                m_delegate.run();
                return;
            }
            catch (Throwable throwable)
            {
                Object obj = new StringWriter();
                throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
                obj = ((StringWriter) (obj)).toString();
                QCMeasurement.INSTANCE.logSDKError("android-sdk-catchall", throwable.toString(), ((String) (obj)));
                QCLog.e(QCEventHandler.TAG, (new StringBuilder()).append("Catchall exception - ").append(((String) (obj))).toString());
                return;
            }
        }

        public CatchAllRunnable(Runnable runnable)
        {
            m_delegate = runnable;
        }
    }


    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCEventHandler);
    private Handler m_Handler;
    private android.os.PowerManager.WakeLock m_wakelock;

    public QCEventHandler()
    {
        super("com.quantcast.event.handler");
    }

    protected void onLooperPrepared()
    {
        super.onLooperPrepared();
        m_Handler = new Handler();
        Looper.myQueue().addIdleHandler(new android.os.MessageQueue.IdleHandler() {

            final QCEventHandler this$0;

            public boolean queueIdle()
            {
                if (m_wakelock != null)
                {
                    m_wakelock.release();
                }
                return true;
            }

            
            {
                this$0 = QCEventHandler.this;
                super();
            }
        });
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean post(Runnable runnable)
    {
        if (m_Handler != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
_L5:
        Handler handler = m_Handler;
        if (handler != null) goto _L4; else goto _L3
_L3:
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L5; else goto _L4
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        boolean flag = m_Handler.post(new CatchAllRunnable(runnable));
        if (m_wakelock != null && flag)
        {
            m_wakelock.acquire();
        }
        return flag;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public void setContext(Context context)
    {
        while (m_wakelock != null || context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") != 0) 
        {
            return;
        }
        m_wakelock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "com.quantcast.event.wakelock");
        m_wakelock.setReferenceCounted(false);
    }



}
