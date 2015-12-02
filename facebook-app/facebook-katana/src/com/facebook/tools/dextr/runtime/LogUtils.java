// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime;

import com.facebook.loom.logger.Logger;

public class LogUtils
{

    public LogUtils()
    {
    }

    public static int a(int i)
    {
        return Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_APPLICATION_START, i);
    }

    public static void a(int i, int j)
    {
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.UI_INPUT_END, i, j);
    }

    public static void b(int i, int j)
    {
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_APPLICATION_END, i, j);
    }

    public static void c(int i, int j)
    {
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_ACTIVITY_END, i, j);
    }

    public static void d(int i, int j)
    {
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_SERVICE_END, i, j);
    }

    public static void e(int i, int j)
    {
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_BROADCAST_RECEIVER_END, i, j);
    }

    public static void f(int i, int j)
    {
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_FRAGMENT_END, i, j);
    }

    public static void g(int i, int j)
    {
        Logger.a(2, com.facebook.loom.logger.LogEntry.EntryType.LIFECYCLE_VIEW_END, i, j);
    }
}
