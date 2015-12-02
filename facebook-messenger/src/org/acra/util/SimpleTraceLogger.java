// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleTraceLogger
{

    public static int NO_LIMIT = 0;
    public static final String TAG = "SimpleTraceLogger";
    private Queue mTrace;
    protected final int mTraceCountLimit;

    public SimpleTraceLogger(int i)
    {
        mTraceCountLimit = i;
        clear();
    }

    public void append(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (mTraceCountLimit > NO_LIMIT && mTrace.size() == mTraceCountLimit)
        {
            mTrace.remove();
        }
        mTrace.offer(new TraceLogLine(s, SystemClock.elapsedRealtime()));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public transient void append(String s, Object aobj[])
    {
        append(String.format(s, aobj));
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        mTrace = new LinkedList();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuilder();
        for (Iterator iterator = mTrace.iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(((TraceLogLine)iterator.next()).toString()).append('\n')) { }
        break MISSING_BLOCK_LABEL_59;
        obj;
        throw obj;
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
    }

    static 
    {
        NO_LIMIT = 0;
    }

    private class TraceLogLine
    {

        public final long time;
        public final String trace;

        public String toString()
        {
            return String.format("[%d] %s", new Object[] {
                Long.valueOf(time), trace
            });
        }

        TraceLogLine(String s, long l)
        {
            trace = s;
            time = l;
        }
    }

}
