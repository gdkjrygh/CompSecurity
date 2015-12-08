// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core;

import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.spi.FilterAttachableImpl;
import fs.ch.qos.logback.core.spi.FilterReply;
import fs.ch.qos.logback.core.status.WarnStatus;

// Referenced classes of package fs.ch.qos.logback.core:
//            Appender

public abstract class UnsynchronizedAppenderBase extends ContextAwareBase
    implements Appender
{

    private int exceptionCount;
    private FilterAttachableImpl fai;
    private ThreadLocal guard;
    protected String name;
    protected boolean started;
    private int statusRepeatCount;

    public UnsynchronizedAppenderBase()
    {
        started = false;
        guard = new ThreadLocal();
        fai = new FilterAttachableImpl();
        statusRepeatCount = 0;
        exceptionCount = 0;
    }

    protected abstract void append(Object obj);

    public void doAppend(Object obj)
    {
        if (Boolean.TRUE.equals(guard.get()))
        {
            return;
        }
        int i;
        guard.set(Boolean.TRUE);
        if (started)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        i = statusRepeatCount;
        statusRepeatCount = i + 1;
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        addStatus(new WarnStatus((new StringBuilder()).append("Attempted to append to non started appender [").append(name).append("].").toString(), this));
        guard.set(Boolean.FALSE);
        return;
        FilterReply filterreply;
        FilterReply filterreply1;
        filterreply = getFilterChainDecision(obj);
        filterreply1 = FilterReply.DENY;
        if (filterreply == filterreply1)
        {
            guard.set(Boolean.FALSE);
            return;
        }
        append(obj);
        guard.set(Boolean.FALSE);
        return;
        obj;
        i = exceptionCount;
        exceptionCount = i + 1;
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        addError((new StringBuilder()).append("Appender [").append(name).append("] failed to append.").toString(), ((Throwable) (obj)));
        guard.set(Boolean.FALSE);
        return;
        obj;
        guard.set(Boolean.FALSE);
        throw obj;
    }

    public FilterReply getFilterChainDecision(Object obj)
    {
        return fai.getFilterChainDecision(obj);
    }

    public String getName()
    {
        return name;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void start()
    {
        started = true;
    }

    public void stop()
    {
        started = false;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("[").append(name).append("]").toString();
    }
}
