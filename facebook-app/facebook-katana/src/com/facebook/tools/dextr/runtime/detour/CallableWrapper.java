// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import com.facebook.loom.logger.Logger;
import java.util.concurrent.Callable;

public class CallableWrapper
    implements Callable
{

    private Callable a;
    private int b;
    private int c;

    CallableWrapper(Callable callable, int i, int j)
    {
        a = callable;
        c = i;
        b = j;
    }

    public Object call()
    {
        int i = Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.CALL_START, b, c);
        Object obj = a.call();
        Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.CALL_END, b, i);
        return obj;
        Exception exception;
        exception;
        Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.CALL_END, b, i);
        throw exception;
    }
}
