// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.app.ActivityManager;
import android.os.Debug;

public class MemoryReporter
{

    private static final String LOG_TAG = "MEM";
    public static final android.app.ActivityManager.MemoryInfo MEMORY_INFO = new android.app.ActivityManager.MemoryInfo();
    private final ActivityManager activityManager;

    public MemoryReporter(ActivityManager activitymanager)
    {
        activityManager = activitymanager;
    }

    private long bytesToKb(long l)
    {
        return l / 1024L;
    }

    private long bytesToMb(long l)
    {
        return l / 1024L / 1024L;
    }

    private void getAndLogLargeMemoryClass()
    {
        logLargeClass(activityManager.getLargeMemoryClass());
    }

    protected void logAvailableSystemMemory(long l)
    {
    }

    protected void logClass(int i)
    {
        (new StringBuilder("memory class (our limit): ")).append(i).append("MB");
    }

    protected void logDalvikHeapStats(long l, long l1, long l2)
    {
        (new StringBuilder("dalvik heap free / current max / hard max in kb: ")).append(l).append("/").append(l1).append("/").append(l2);
    }

    protected void logLargeClass(long l)
    {
        (new StringBuilder("large memory class: ")).append(l).append("MB");
    }

    protected void logLowSystemMemoryState(boolean flag)
    {
    }

    protected void logMaximum(long l)
    {
        (new StringBuilder("max memory from runtime: ")).append(l).append("MB");
    }

    protected void logNativeHeapStats(long l, long l1)
    {
        (new StringBuilder("native heap free / total in kb: ")).append(l).append("/").append(l1);
    }

    protected void logThreshold(long l)
    {
        (new StringBuilder("low memory threshold: ")).append(l).append("MB");
    }

    protected void logTrim(String s)
    {
    }

    public void reportMemoryTrim(int i)
    {
        logTrim((new StringBuilder("Trim memory received with level ")).append(i).toString());
    }

    public void reportOomStats()
    {
        Runtime runtime = Runtime.getRuntime();
        logDalvikHeapStats(bytesToKb(runtime.freeMemory()), bytesToKb(runtime.totalMemory()), bytesToKb(runtime.maxMemory()));
        logNativeHeapStats(bytesToKb(Debug.getNativeHeapFreeSize()), bytesToKb(Debug.getNativeHeapSize()));
        activityManager.getMemoryInfo(MEMORY_INFO);
        logAvailableSystemMemory(MEMORY_INFO.availMem / 1024L / 1024L);
        logLowSystemMemoryState(MEMORY_INFO.lowMemory);
    }

    public void reportSystemMemoryStats()
    {
        logClass(activityManager.getMemoryClass());
        getAndLogLargeMemoryClass();
        activityManager.getMemoryInfo(MEMORY_INFO);
        logThreshold(bytesToMb(MEMORY_INFO.threshold));
    }

}
