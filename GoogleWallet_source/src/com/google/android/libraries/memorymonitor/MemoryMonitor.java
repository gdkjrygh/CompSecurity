// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.memorymonitor;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.libraries.memorymonitor:
//            AndroidMemorySnapshot, JavaMemorySnapshot

public class MemoryMonitor
{
    public static interface AndroidMemoryListener
    {

        public abstract void onSnapshot(AndroidMemorySnapshot androidmemorysnapshot);
    }

    final class MemoryMonitorRunnable
        implements Runnable
    {

        final MemoryMonitor this$0;
        int wakeUpCount;

        public final void run()
        {
            wakeUpCount = wakeUpCount + 1;
            MemoryMonitor memorymonitor = MemoryMonitor.this;
            memorymonitor;
            JVM INSTR monitorenter ;
            if (!javaMemoryListeners.isEmpty())
            {
                new JavaMemorySnapshot();
                for (Iterator iterator = javaMemoryListeners.iterator(); iterator.hasNext(); iterator.next()) { }
            }
            break MISSING_BLOCK_LABEL_77;
            Exception exception;
            exception;
            memorymonitor;
            JVM INSTR monitorexit ;
            throw exception;
            if (androidMemoryListeners.isEmpty() || wakeUpCount < 4)
            {
                break MISSING_BLOCK_LABEL_153;
            }
            AndroidMemorySnapshot androidmemorysnapshot = new AndroidMemorySnapshot();
            for (Iterator iterator1 = androidMemoryListeners.iterator(); iterator1.hasNext(); ((AndroidMemoryListener)iterator1.next()).onSnapshot(androidmemorysnapshot)) { }
            wakeUpCount = 0;
            memorymonitor;
            JVM INSTR monitorexit ;
        }

        private MemoryMonitorRunnable()
        {
            this$0 = MemoryMonitor.this;
            super();
            wakeUpCount = 0;
        }

    }


    public static final String TAG = com/google/android/libraries/memorymonitor/MemoryMonitor.getSimpleName();
    private final Set androidMemoryListeners;
    private final Set javaMemoryListeners;
    private final MemoryMonitorRunnable memoryMonitorRunnable;
    private ScheduledExecutorService scheduledExecutorService;
    private final ThreadFactory threadFactory;

    public MemoryMonitor()
    {
        this(null);
    }

    private MemoryMonitor(ThreadFactory threadfactory)
    {
        memoryMonitorRunnable = new MemoryMonitorRunnable();
        javaMemoryListeners = new HashSet();
        androidMemoryListeners = new HashSet();
        threadFactory = threadfactory;
    }

    private void startMonitoringIfNecessary()
    {
        this;
        JVM INSTR monitorenter ;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) goto _L2; else goto _L1
_L1:
        ScheduledExecutorService scheduledexecutorservice;
        if (threadFactory != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        scheduledexecutorservice = Executors.newScheduledThreadPool(1);
_L3:
        scheduledExecutorService = scheduledexecutorservice;
_L2:
        scheduledExecutorService.scheduleAtFixedRate(memoryMonitorRunnable, 0L, 750L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return;
        scheduledexecutorservice = Executors.newScheduledThreadPool(1, threadFactory);
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }

    private void stopMonitoringIfNoMoreListeners()
    {
        this;
        JVM INSTR monitorenter ;
        if (scheduledExecutorService != null && javaMemoryListeners.isEmpty() && androidMemoryListeners.isEmpty())
        {
            scheduledExecutorService.shutdownNow();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void addListener(AndroidMemoryListener androidmemorylistener)
    {
        this;
        JVM INSTR monitorenter ;
        startMonitoringIfNecessary();
        androidMemoryListeners.add(androidmemorylistener);
        this;
        JVM INSTR monitorexit ;
        return;
        androidmemorylistener;
        throw androidmemorylistener;
    }

    public final void removeListener(AndroidMemoryListener androidmemorylistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (androidMemoryListeners.remove(androidmemorylistener)) goto _L2; else goto _L1
_L1:
        String s = TAG;
        androidmemorylistener = String.valueOf(androidmemorylistener);
        Log.e(s, (new StringBuilder(String.valueOf(androidmemorylistener).length() + 42)).append("Attempted to remove non-present listener: ").append(androidmemorylistener).toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        stopMonitoringIfNoMoreListeners();
        if (true) goto _L4; else goto _L3
_L3:
        androidmemorylistener;
        throw androidmemorylistener;
    }



}
