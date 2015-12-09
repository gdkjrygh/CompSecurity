// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

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
        String s = toString(NO_LIMIT);
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new StringBuilder();
        if (i > NO_LIMIT) goto _L2; else goto _L1
_L1:
        i = 0;
_L5:
        Iterator iterator = mTrace.iterator();
        int j = 0;
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        TraceLogLine tracelogline = (TraceLogLine)iterator.next();
        if (j < i)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        ((StringBuilder) (obj)).append(tracelogline.toString()).append('\n');
        break MISSING_BLOCK_LABEL_109;
_L2:
        i = Math.max(mTrace.size() - i, 0);
          goto _L5
_L4:
        obj = ((StringBuilder) (obj)).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        throw exception;
        j++;
          goto _L6
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
