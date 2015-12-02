// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime;

import com.facebook.loom.core.TraceControl;
import com.facebook.loom.logger.Logger;

public class DextrTraceDetour
{

    public DextrTraceDetour()
    {
    }

    public static void start(int i)
    {
        TraceControl tracecontrol = TraceControl.a();
        if (tracecontrol == null)
        {
            return;
        } else
        {
            tracecontrol.a(4, 1, null);
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_START, i);
            return;
        }
    }

    public static void stop(int i)
    {
        TraceControl tracecontrol = TraceControl.a();
        if (tracecontrol == null)
        {
            return;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_STOP, i);
            tracecontrol.a(4, null);
            return;
        }
    }

    public static void syncTestClock()
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.TEST_CLOCK_SYNC_START, 0xfaceb00c);
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.TEST_CLOCK_SYNC_END, 0xfaceb00c);
    }
}
