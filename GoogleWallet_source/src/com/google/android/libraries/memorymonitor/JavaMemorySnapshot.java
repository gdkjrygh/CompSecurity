// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.memorymonitor;


public class JavaMemorySnapshot
{

    private static final Runtime RUNTIME = Runtime.getRuntime();
    public final long dalvikHeapAllocatedB;
    public final long dalvikHeapSizeB;
    public final long dalvikMaxHeapSizeB;

    public JavaMemorySnapshot()
    {
        dalvikHeapSizeB = RUNTIME.totalMemory();
        dalvikMaxHeapSizeB = RUNTIME.maxMemory();
        dalvikHeapAllocatedB = dalvikHeapSizeB - RUNTIME.freeMemory();
    }

    JavaMemorySnapshot(long l, long l1, long l2)
    {
        dalvikHeapAllocatedB = l;
        dalvikHeapSizeB = l1;
        dalvikMaxHeapSizeB = l2;
    }

    public String toString()
    {
        long l = dalvikHeapAllocatedB;
        long l1 = dalvikHeapSizeB;
        long l2 = dalvikMaxHeapSizeB;
        return (new StringBuilder(123)).append("dalvikHeapAllocatedB: ").append(l).append(", dalvikHeapSizeB: ").append(l1).append(", dalvikMaxHeapSizeB: ").append(l2).toString();
    }

}
