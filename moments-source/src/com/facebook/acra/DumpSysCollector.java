// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import java.util.Locale;

class DumpSysCollector
{

    DumpSysCollector()
    {
    }

    protected static String collectLargerMemoryInfo(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            StringBuilder stringbuilder = new StringBuilder();
            context = (ActivityManager)context.getSystemService("activity");
            stringbuilder.append((new StringBuilder("Large heap size =")).append(context.getLargeMemoryClass()).toString());
            return stringbuilder.toString();
        } else
        {
            return "";
        }
    }

    protected static String collectMemInfo(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        context = (ActivityManager)context.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        context.getMemoryInfo(memoryinfo);
        android.os.Debug.MemoryInfo memoryinfo1 = new android.os.Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryinfo1);
        int i = context.getMemoryClass();
        int j = (int)(100F * ((float)(memoryinfo1.nativePrivateDirty + memoryinfo1.dalvikPrivateDirty) / ((float)i * 1024F)));
        int k = (int)((float)(memoryinfo1.nativePrivateDirty * 100) / ((float)i * 1024F));
        int l = (int)((float)((memoryinfo1.nativePrivateDirty + memoryinfo1.dalvikPrivateDirty + memoryinfo1.otherPrivateDirty) * 100) / ((float)i * 1024F));
        int i1 = (int)((float)(memoryinfo1.otherPrivateDirty * 100) / ((float)i * 1024F));
        stringbuilder.append(String.format(Locale.US, "percent dalvik+native / native / d+n+other / other %d / %d / %d / %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1)
        }));
        stringbuilder.append((new StringBuilder("avail/thresh/low? ")).append(memoryinfo.availMem).append("/").append(memoryinfo.threshold).append("/").append(memoryinfo.lowMemory).append("/(").append((int)((float)(100L * memoryinfo.threshold) / (float)memoryinfo.availMem)).append("%) memclass=").append(i).toString());
        stringbuilder.append("DebugMemInfo(kB): Private / Proportional / Shared");
        stringbuilder.append(String.format(Locale.US, "          dalvik: %7d / %7d / %7d", new Object[] {
            Integer.valueOf(memoryinfo1.dalvikPrivateDirty), Integer.valueOf(memoryinfo1.dalvikPss), Integer.valueOf(memoryinfo1.dalvikSharedDirty)
        }));
        stringbuilder.append(String.format(Locale.US, "          native: %7d / %7d / %7d", new Object[] {
            Integer.valueOf(memoryinfo1.nativePrivateDirty), Integer.valueOf(memoryinfo1.nativePss), Integer.valueOf(memoryinfo1.nativeSharedDirty)
        }));
        stringbuilder.append(String.format(Locale.US, "           other: %7d / %7d / %7d", new Object[] {
            Integer.valueOf(memoryinfo1.otherPrivateDirty), Integer.valueOf(memoryinfo1.otherPss), Integer.valueOf(memoryinfo1.otherSharedDirty)
        }));
        stringbuilder.append(String.format(Locale.US, "GC: %d GCs, %d freed, %d free count", new Object[] {
            Integer.valueOf(Debug.getGlobalGcInvocationCount()), Integer.valueOf(Debug.getGlobalFreedSize()), Integer.valueOf(Debug.getGlobalFreedCount())
        }));
        stringbuilder.append(String.format(Locale.US, "Native Heap: size/allocated/free %7d / %7d / %7d", new Object[] {
            Long.valueOf(Debug.getNativeHeapSize()), Long.valueOf(Debug.getNativeHeapAllocatedSize()), Long.valueOf(Debug.getNativeHeapFreeSize())
        }));
        stringbuilder.append(String.format(Locale.US, "Threads: alloc count/alloc size/ext ac/ext as %7d / %7d / %7d / %7d", new Object[] {
            Integer.valueOf(Debug.getThreadAllocCount()), Integer.valueOf(Debug.getThreadAllocSize()), Integer.valueOf(Debug.getThreadExternalAllocCount()), Integer.valueOf(Debug.getThreadExternalAllocSize())
        }));
        context = Runtime.getRuntime();
        stringbuilder.append(String.format(Locale.US, "Java Heap: size/allocated/free %7d / %7d / %7d", new Object[] {
            Long.valueOf(context.maxMemory()), Long.valueOf(context.totalMemory() - context.freeMemory()), Long.valueOf(context.freeMemory())
        }));
        return stringbuilder.toString();
    }
}
