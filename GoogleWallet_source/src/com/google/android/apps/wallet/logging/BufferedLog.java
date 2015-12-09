// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.logging;

import com.google.common.base.Joiner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

// Referenced classes of package com.google.android.apps.wallet.logging:
//            WLog

public final class BufferedLog
{

    private final int bufferCapacity;
    private final SimpleDateFormat dateFormat;
    private final LinkedList logBuffer = new LinkedList();
    private final String tag;

    public BufferedLog(String s, int i, String s1)
    {
        tag = s;
        bufferCapacity = i;
        dateFormat = new SimpleDateFormat(s1);
    }

    private void addToBuffer(String s)
    {
        this;
        JVM INSTR monitorenter ;
        for (; logBuffer.size() >= bufferCapacity; logBuffer.remove()) { }
        break MISSING_BLOCK_LABEL_32;
        s;
        throw s;
        LinkedList linkedlist = logBuffer;
        String s1 = getCurrentTimeStamp();
        linkedlist.add((new StringBuilder(String.valueOf(s1).length() + 3 + String.valueOf(s).length())).append(s1).append(" : ").append(s).toString());
        this;
        JVM INSTR monitorexit ;
    }

    private String getCurrentTimeStamp()
    {
        return dateFormat.format(new Date(System.currentTimeMillis()));
    }

    private transient void logfmt(WLog.LogPriority logpriority, Throwable throwable, String s, Object aobj[])
    {
        s = String.format(s, aobj);
        if (throwable == null)
        {
            throwable = s;
        } else
        {
            throwable = WLog.getStackTraceString(throwable);
            throwable = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(throwable).length())).append(s).append("\n").append(throwable).toString();
        }
        WLog.log(logpriority, tag, throwable);
        addToBuffer(throwable);
    }

    public final String getRecentMessages()
    {
        this;
        JVM INSTR monitorenter ;
        String s = Joiner.on("\n").join(logBuffer);
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public final void log(WLog.LogPriority logpriority, String s)
    {
        log(logpriority, s, null);
    }

    public final void log(WLog.LogPriority logpriority, String s, Throwable throwable)
    {
        if (throwable != null)
        {
            throwable = WLog.getStackTraceString(throwable);
            s = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(throwable).length())).append(s).append("\n").append(throwable).toString();
        }
        if (logpriority != null)
        {
            WLog.log(logpriority, tag, s);
        }
        addToBuffer(s);
    }

    public final void log(String s)
    {
        log(null, s, null);
    }

    public final void log(String s, Throwable throwable)
    {
        log(null, s, throwable);
    }

    public final transient void logfmt(WLog.LogPriority logpriority, String s, Object aobj[])
    {
        logfmt(logpriority, null, s, aobj);
    }
}
