// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import com.facebook.loom.logger.Logger;

public class RunnableWrapper
    implements Runnable
{

    private Runnable a;
    private int b;
    private int c;

    RunnableWrapper(Runnable runnable, int i, int j)
    {
        a = runnable;
        c = i;
        b = j;
    }

    public void run()
    {
        int i = Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.CALL_START, b, c);
        a.run();
        Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.CALL_END, b, i);
        return;
        Exception exception;
        exception;
        Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.CALL_END, b, i);
        throw exception;
    }
}
