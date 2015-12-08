// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;

public class CleanupReference extends WeakReference
{
    private static class LazyHolder
    {

        static final Handler sHandler = new Handler(ThreadUtils.getUiThreadLooper()) {

            public void handleMessage(Message message)
            {
                Object obj;
                TraceEvent.begin();
                obj = (CleanupReference)message.obj;
                message.what;
                JVM INSTR tableswitch 1 2: default 36
            //                           1 96
            //                           2 109;
                   goto _L1 _L2 _L3
_L1:
                Log.e("CleanupReference", (new StringBuilder()).append("Bad message=").append(message.what).toString());
_L6:
                message = ((Message) (CleanupReference.sCleanupMonitor));
                message;
                JVM INSTR monitorenter ;
_L4:
                obj = (CleanupReference)CleanupReference.sGcQueue.poll();
                if (obj == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                ((CleanupReference) (obj)).runCleanupTaskInternal();
                  goto _L4
                obj;
                message;
                JVM INSTR monitorexit ;
                throw obj;
_L2:
                CleanupReference.sRefs.add(obj);
                continue; /* Loop/switch isn't completed */
_L3:
                ((CleanupReference) (obj)).runCleanupTaskInternal();
                if (true) goto _L6; else goto _L5
_L5:
                CleanupReference.sCleanupMonitor.notifyAll();
                message;
                JVM INSTR monitorexit ;
                TraceEvent.end();
                return;
            }

        };


        private LazyHolder()
        {
        }
    }


    private static final int ADD_REF = 1;
    private static final boolean DEBUG = false;
    private static final int REMOVE_REF = 2;
    private static final String TAG = "CleanupReference";
    private static Object sCleanupMonitor = new Object();
    private static ReferenceQueue sGcQueue = new ReferenceQueue();
    private static final Thread sReaperThread;
    private static Set sRefs = new HashSet();
    private Runnable mCleanupTask;

    public CleanupReference(Object obj, Runnable runnable)
    {
        super(obj, sGcQueue);
        mCleanupTask = runnable;
        handleOnUiThread(1);
    }

    private void handleOnUiThread(int i)
    {
        Message message = Message.obtain(LazyHolder.sHandler, i, this);
        if (Looper.myLooper() == message.getTarget().getLooper())
        {
            message.getTarget().handleMessage(message);
            message.recycle();
            return;
        } else
        {
            message.sendToTarget();
            return;
        }
    }

    private void runCleanupTaskInternal()
    {
        sRefs.remove(this);
        if (mCleanupTask != null)
        {
            mCleanupTask.run();
            mCleanupTask = null;
        }
        clear();
    }

    public void cleanupNow()
    {
        handleOnUiThread(2);
    }

    static 
    {
        sReaperThread = new Thread("CleanupReference") {

            public void run()
            {
_L2:
                CleanupReference cleanupreference = (CleanupReference)CleanupReference.sGcQueue.remove();
                synchronized (CleanupReference.sCleanupMonitor)
                {
                    Message.obtain(LazyHolder.sHandler, 2, cleanupreference).sendToTarget();
                    CleanupReference.sCleanupMonitor.wait(500L);
                }
                continue; /* Loop/switch isn't completed */
                exception1;
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception1;
                }
                catch (Exception exception)
                {
                    Log.e("CleanupReference", "Queue remove exception:", exception);
                }
                if (true) goto _L2; else goto _L1
_L1:
            }

        };
        sReaperThread.setDaemon(true);
        sReaperThread.start();
    }




}
