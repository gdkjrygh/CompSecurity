// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.memorymonitor;

import dagger.internal.ProvidesBinding;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.base.memorymonitor:
//            MemoryMonitorModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final MemoryMonitorModule module;

    public final volatile Object get()
    {
        return get();
    }

    public final AtomicBoolean get()
    {
        MemoryMonitorModule memorymonitormodule = module;
        return MemoryMonitorModule.getIsMemoryMonitorEnbabled();
    }

    public (MemoryMonitorModule memorymonitormodule)
    {
        super("@com.google.android.apps.wallet.base.memorymonitor.BindingAnnotations$IsMemoryMonitorEnabled()/java.util.concurrent.atomic.AtomicBoolean", true, "com.google.android.apps.wallet.base.memorymonitor.MemoryMonitorModule", "getIsMemoryMonitorEnbabled");
        module = memorymonitormodule;
        setLibrary(true);
    }
}
