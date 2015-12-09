// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.memorymonitor;

import android.view.MotionEvent;
import android.widget.Toast;

// Referenced classes of package com.google.android.libraries.memorymonitor:
//            MemoryMonitorView, AndroidMemorySnapshot, HeapInflater

final class <init> extends android.view.emoryMonitorOnGestureListener
{

    private float heapUsageOnFingerDown;
    private float heapUsageOnFingerUp;
    private float heapUsageWithoutPadding;
    final MemoryMonitorView this$0;
    private Toast toast;

    private void displayExplanatoryToast()
    {
        AndroidMemorySnapshot androidmemorysnapshot = MemoryMonitorView.access$100(MemoryMonitorView.this);
        String s = String.valueOf("Red: Artificially inflated Dalvik heap alloc.\nGreen: Dalvik heap alloc.\nYellow: Native heap alloc\nBlue: Other private dirty (GL RAM)\nBlack line: Dalvik heap size: ");
        long l = MemoryMonitorView.access$300(androidmemorysnapshot.dalvikHeapSizeB);
        long l1 = MemoryMonitorView.access$300(androidmemorysnapshot.dalvikMaxHeapSizeB);
        long l2 = MemoryMonitorView.access$300(MemoryMonitorView.access$400(MemoryMonitorView.this));
        long l3 = MemoryMonitorView.access$500(MemoryMonitorView.this);
        long l4 = MemoryMonitorView.access$600(MemoryMonitorView.this);
        displayToast((new StringBuilder(String.valueOf(s).length() + 255)).append(s).append(l).append("MB\nRed line: Max Dalvik heap memory: ").append(l1).append("MB\nGrey background bounds: large heap size: ").append(l2).append("MB (should be the same as the red line)\n").append("Default heap: ").append(l3).append(" MB; large heap: ").append(l4).append(" MB").toString(), new Object[0]);
    }

    private transient void displayToast(String s, Object aobj[])
    {
        if (toast != null)
        {
            toast.cancel();
        }
        toast = Toast.makeText(getContext(), String.format(s, aobj), 1);
        toast.show();
    }

    private boolean onUp()
    {
        if (heapUsageOnFingerUp != heapUsageOnFingerDown)
        {
            displayToast("Inflating heap utilization to %.2f%% (%.2f MB)", new Object[] {
                Float.valueOf(heapUsageOnFingerUp * 100F), Float.valueOf(heapUsageOnFingerUp * MemoryMonitorView.access$800())
            });
            MemoryMonitorView.access$700(MemoryMonitorView.this).setHeapUtilization(heapUsageOnFingerUp);
            return true;
        } else
        {
            displayExplanatoryToast();
            return true;
        }
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        heapUsageOnFingerDown = HeapInflater.getCurrentHeapUtilization();
        heapUsageOnFingerUp = heapUsageOnFingerDown;
        heapUsageWithoutPadding = heapUsageOnFingerDown - (float)MemoryMonitorView.access$300(MemoryMonitorView.access$700(MemoryMonitorView.this).getBytesPadded()) / MemoryMonitorView.access$800();
        return true;
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        heapUsageOnFingerUp = heapUsageOnFingerUp + f1 / MemoryMonitorView.access$900(MemoryMonitorView.this);
        heapUsageOnFingerUp = Math.max(heapUsageWithoutPadding, Math.min(heapUsageOnFingerUp, 1.0F));
        displayToast("Target heap usage: %.2f%% (%.2f MB)", new Object[] {
            Float.valueOf(heapUsageOnFingerUp * 100F), Float.valueOf(heapUsageOnFingerUp * MemoryMonitorView.access$800())
        });
        return true;
    }


    private a()
    {
        this$0 = MemoryMonitorView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
