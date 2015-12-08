// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core;

import fs.ch.qos.logback.core.filter.Filter;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.spi.FilterAttachableImpl;
import fs.ch.qos.logback.core.spi.FilterReply;
import fs.ch.qos.logback.core.status.WarnStatus;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core:
//            Appender

public abstract class AppenderBase extends ContextAwareBase
    implements Appender
{

    static final int ALLOWED_REPEATS = 5;
    private int exceptionCount;
    private FilterAttachableImpl fai;
    private boolean guard;
    protected String name;
    protected boolean started;
    private int statusRepeatCount;

    public AppenderBase()
    {
        started = false;
        guard = false;
        fai = new FilterAttachableImpl();
        statusRepeatCount = 0;
        exceptionCount = 0;
    }

    public void addFilter(Filter filter)
    {
        fai.addFilter(filter);
    }

    protected abstract void append(Object obj);

    public void clearAllFilters()
    {
        fai.clearAllFilters();
    }

    public void doAppend(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = guard;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i;
        guard = true;
        if (started)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        i = statusRepeatCount;
        statusRepeatCount = i + 1;
        if (i >= 5)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        addStatus(new WarnStatus((new StringBuilder()).append("Attempted to append to non started appender [").append(name).append("].").toString(), this));
        guard = false;
          goto _L1
        obj;
        throw obj;
        FilterReply filterreply;
        FilterReply filterreply1;
        filterreply = getFilterChainDecision(obj);
        filterreply1 = FilterReply.DENY;
        if (filterreply != filterreply1)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        guard = false;
          goto _L1
        append(obj);
        guard = false;
          goto _L1
        obj;
        i = exceptionCount;
        exceptionCount = i + 1;
        if (i >= 5)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        addError((new StringBuilder()).append("Appender [").append(name).append("] failed to append.").toString(), ((Throwable) (obj)));
        guard = false;
          goto _L1
        obj;
        guard = false;
        throw obj;
    }

    public List getCopyOfAttachedFiltersList()
    {
        return fai.getCopyOfAttachedFiltersList();
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
