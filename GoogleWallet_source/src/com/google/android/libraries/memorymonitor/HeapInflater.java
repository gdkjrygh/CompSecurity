// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.memorymonitor;

import java.util.Stack;

public final class HeapInflater
{

    private static final Runtime RUNTIME = Runtime.getRuntime();
    private long bytesPadded;
    private final long maxHeapSizeBytes = Runtime.getRuntime().maxMemory();
    private final Stack paddingBlocks = new Stack();

    public HeapInflater()
    {
    }

    public static float getCurrentHeapUtilization()
    {
        return (float)(RUNTIME.totalMemory() - RUNTIME.freeMemory()) / (float)RUNTIME.maxMemory();
    }

    public final long getBytesPadded()
    {
        return bytesPadded;
    }

    public final void setHeapUtilization(float f)
    {
        float f1 = getCurrentHeapUtilization();
        long l;
        for (l = bytesPadded + (long)((f - f1) * (float)maxHeapSizeBytes); bytesPadded > l && !paddingBlocks.isEmpty(); bytesPadded = bytesPadded - (long)((byte[])paddingBlocks.pop()).length) { }
        int i;
        for (; bytesPadded < l; bytesPadded = bytesPadded + (long)i)
        {
            i = (int)Math.min(l - bytesPadded, 0x100000L);
            paddingBlocks.push(new byte[i]);
        }

    }

}
