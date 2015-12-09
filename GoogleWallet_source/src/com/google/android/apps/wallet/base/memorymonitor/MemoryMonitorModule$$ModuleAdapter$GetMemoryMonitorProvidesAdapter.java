// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.memorymonitor;

import com.google.android.libraries.memorymonitor.MemoryMonitor;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.base.memorymonitor:
//            MemoryMonitorModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final MemoryMonitorModule module;

    public final MemoryMonitor get()
    {
        MemoryMonitorModule memorymonitormodule = module;
        return MemoryMonitorModule.getMemoryMonitor();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (MemoryMonitorModule memorymonitormodule)
    {
        super("com.google.android.libraries.memorymonitor.MemoryMonitor", true, "com.google.android.apps.wallet.base.memorymonitor.MemoryMonitorModule", "getMemoryMonitor");
        module = memorymonitormodule;
        setLibrary(true);
    }
}
