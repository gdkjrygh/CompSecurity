// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.app.ActivityManager;
import com.a.a.a;

// Referenced classes of package com.soundcloud.android.utils:
//            MemoryReporter

public class CrashlyticsMemoryReporter extends MemoryReporter
{

    public CrashlyticsMemoryReporter(ActivityManager activitymanager)
    {
        super(activitymanager);
    }

    protected void logAvailableSystemMemory(long l)
    {
        super.logAvailableSystemMemory(l);
        a.a("available system memory (MB)", l);
    }

    protected void logClass(int i)
    {
        super.logClass(i);
        a.a("memory class (MB)", i);
    }

    protected void logDalvikHeapStats(long l, long l1, long l2)
    {
        super.logDalvikHeapStats(l, l1, l2);
        a.a("dalvik heap free / current max / hard max in kb", (new StringBuilder()).append(l).append("/").append(l1).append("/").append(l2).toString());
    }

    protected void logLargeClass(long l)
    {
        super.logLargeClass(l);
        a.a("large memory class (MB)", l);
    }

    protected void logLowSystemMemoryState(boolean flag)
    {
        super.logLowSystemMemoryState(flag);
        a.a("low system memory state", flag);
    }

    protected void logMaximum(long l)
    {
        super.logMaximum(l);
        a.a("max memory reported by JVM (MB)", l);
    }

    protected void logNativeHeapStats(long l, long l1)
    {
        super.logNativeHeapStats(l, l1);
        a.a("native heap free / total in kb", (new StringBuilder()).append(l).append("/").append(l1).toString());
    }

    protected void logThreshold(long l)
    {
        super.logThreshold(l);
        a.a("low memory threshold (MB)", l);
    }

    protected void logTrim(String s)
    {
        super.logTrim(s);
        a.a(s);
    }
}
