// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import com.facebook.debug.tracer.Tracer;
import com.facebook.loom.logger.Logger;

public class TracerDetour
{

    public TracerDetour()
    {
    }

    public static void a(int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_POP, i);
        Tracer.a();
    }

    public static void a(long l, int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_POP, i);
        Tracer.a(l);
    }

    public static void a(String s, int i)
    {
        Tracer.a(s);
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_PUSH, i);
    }

    public static void a(String s, Object obj, int i)
    {
        Tracer.a(s, obj);
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_PUSH, i);
    }

    public static void a(String s, Object aobj[], int i)
    {
        Tracer.a(s, aobj);
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_PUSH, i);
    }

    public static long b(int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_POP, i);
        return Tracer.b();
    }
}
