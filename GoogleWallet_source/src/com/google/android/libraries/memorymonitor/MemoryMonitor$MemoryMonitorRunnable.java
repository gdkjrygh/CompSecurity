// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.memorymonitor;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.memorymonitor:
//            MemoryMonitor, JavaMemorySnapshot, AndroidMemorySnapshot

final class <init>
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
        if (!MemoryMonitor.access$100(MemoryMonitor.this).isEmpty())
        {
            new JavaMemorySnapshot();
            for (Iterator iterator = MemoryMonitor.access$100(MemoryMonitor.this).iterator(); iterator.hasNext(); iterator.next()) { }
        }
        break MISSING_BLOCK_LABEL_77;
        Exception exception;
        exception;
        memorymonitor;
        JVM INSTR monitorexit ;
        throw exception;
        if (MemoryMonitor.access$200(MemoryMonitor.this).isEmpty() || wakeUpCount < 4)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        AndroidMemorySnapshot androidmemorysnapshot = new AndroidMemorySnapshot();
        for (Iterator iterator1 = MemoryMonitor.access$200(MemoryMonitor.this).iterator(); iterator1.hasNext(); ((this._cls0)iterator1.next()).onSnapshot(androidmemorysnapshot)) { }
        wakeUpCount = 0;
        memorymonitor;
        JVM INSTR monitorexit ;
    }

    private ()
    {
        this$0 = MemoryMonitor.this;
        super();
        wakeUpCount = 0;
    }

    wakeUpCount(wakeUpCount wakeupcount)
    {
        this();
    }
}
