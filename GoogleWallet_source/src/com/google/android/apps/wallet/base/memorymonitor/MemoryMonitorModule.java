// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.memorymonitor;

import com.google.android.libraries.memorymonitor.MemoryMonitor;
import java.util.concurrent.atomic.AtomicBoolean;

public class MemoryMonitorModule
{

    public MemoryMonitorModule()
    {
    }

    static AtomicBoolean getIsMemoryMonitorEnbabled()
    {
        return new AtomicBoolean(false);
    }

    static MemoryMonitor getMemoryMonitor()
    {
        return new MemoryMonitor();
    }
}
