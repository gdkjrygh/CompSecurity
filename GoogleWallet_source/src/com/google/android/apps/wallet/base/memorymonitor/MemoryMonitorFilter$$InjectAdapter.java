// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.memorymonitor;

import android.app.Activity;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.base.memorymonitor:
//            MemoryMonitorFilter

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding isMemoryMonitorEnabled;
    private Binding memoryMonitor;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/base/memorymonitor/MemoryMonitorFilter, getClass().getClassLoader());
        memoryMonitor = linker.requestBinding("dagger.Lazy<com.google.android.libraries.memorymonitor.MemoryMonitor>", com/google/android/apps/wallet/base/memorymonitor/MemoryMonitorFilter, getClass().getClassLoader());
        isMemoryMonitorEnabled = linker.requestBinding("@com.google.android.apps.wallet.base.memorymonitor.BindingAnnotations$IsMemoryMonitorEnabled()/java.util.concurrent.atomic.AtomicBoolean", com/google/android/apps/wallet/base/memorymonitor/MemoryMonitorFilter, getClass().getClassLoader());
    }

    public final MemoryMonitorFilter get()
    {
        return new MemoryMonitorFilter((Activity)activity.get(), (Lazy)memoryMonitor.get(), (AtomicBoolean)isMemoryMonitorEnabled.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(memoryMonitor);
        set.add(isMemoryMonitorEnabled);
    }

    public ()
    {
        super("com.google.android.apps.wallet.base.memorymonitor.MemoryMonitorFilter", "members/com.google.android.apps.wallet.base.memorymonitor.MemoryMonitorFilter", true, com/google/android/apps/wallet/base/memorymonitor/MemoryMonitorFilter);
    }
}
