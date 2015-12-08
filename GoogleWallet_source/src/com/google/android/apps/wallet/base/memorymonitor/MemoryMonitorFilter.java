// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.memorymonitor;

import android.app.Activity;
import android.view.ViewStub;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.libraries.memorymonitor.MemoryMonitor;
import com.google.android.libraries.memorymonitor.MemoryMonitorView;
import dagger.Lazy;
import java.util.concurrent.atomic.AtomicBoolean;

public class MemoryMonitorFilter extends ActivityFilter
{

    private final Activity activity;
    private final AtomicBoolean isMemoryMonitorEnabled;
    private final Lazy memoryMonitor;

    MemoryMonitorFilter(Activity activity1, Lazy lazy, AtomicBoolean atomicboolean)
    {
        activity = activity1;
        memoryMonitor = lazy;
        isMemoryMonitorEnabled = atomicboolean;
    }

    private void disableMemoryMonitor()
    {
        MemoryMonitorView memorymonitorview = (MemoryMonitorView)activity.findViewById(com.google.android.apps.walletnfcrel.R.id.memorymonitor_widget);
        if (memorymonitorview == null)
        {
            return;
        } else
        {
            memorymonitorview.turnMemoryMonitorOff();
            return;
        }
    }

    private void enableMemoryMonitor()
    {
        MemoryMonitorView memorymonitorview = getInflatedMemoryMonitorView();
        memorymonitorview.setMemoryMonitor((MemoryMonitor)memoryMonitor.get());
        memorymonitorview.turnMemoryMonitorOn();
    }

    private MemoryMonitorView getInflatedMemoryMonitorView()
    {
        ViewStub viewstub = (ViewStub)activity.findViewById(com.google.android.apps.walletnfcrel.R.id.memorymonitor_stub);
        if (viewstub != null)
        {
            return (MemoryMonitorView)viewstub.inflate();
        } else
        {
            return (MemoryMonitorView)activity.findViewById(com.google.android.apps.walletnfcrel.R.id.memorymonitor_widget);
        }
    }

    private void refresh()
    {
        if (isMemoryMonitorEnabled.get())
        {
            enableMemoryMonitor();
            return;
        } else
        {
            disableMemoryMonitor();
            return;
        }
    }

    protected final void onDestroy()
    {
        disableMemoryMonitor();
    }

    protected final void onResume()
    {
        refresh();
    }
}
