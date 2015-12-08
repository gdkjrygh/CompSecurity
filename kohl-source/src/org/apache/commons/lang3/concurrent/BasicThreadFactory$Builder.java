// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ThreadFactory;
import org.apache.commons.lang3.builder.Builder;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            BasicThreadFactory

public static class 
    implements Builder
{

    private Boolean daemonFlag;
    private dler exceptionHandler;
    private String namingPattern;
    private Integer priority;
    private ThreadFactory wrappedFactory;

    public volatile Object build()
    {
        return build();
    }

    public BasicThreadFactory build()
    {
        BasicThreadFactory basicthreadfactory = new BasicThreadFactory(this, null);
        reset();
        return basicthreadfactory;
    }

    public reset daemon(boolean flag)
    {
        daemonFlag = Boolean.valueOf(flag);
        return this;
    }

    public daemonFlag namingPattern(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("Naming pattern must not be null!");
        } else
        {
            namingPattern = s;
            return this;
        }
    }

    public namingPattern priority(int i)
    {
        priority = Integer.valueOf(i);
        return this;
    }

    public void reset()
    {
        wrappedFactory = null;
        exceptionHandler = null;
        namingPattern = null;
        priority = null;
        daemonFlag = null;
    }

    public daemonFlag uncaughtExceptionHandler(dler dler)
    {
        if (dler == null)
        {
            throw new NullPointerException("Uncaught exception handler must not be null!");
        } else
        {
            exceptionHandler = dler;
            return this;
        }
    }

    public exceptionHandler wrappedFactory(ThreadFactory threadfactory)
    {
        if (threadfactory == null)
        {
            throw new NullPointerException("Wrapped ThreadFactory must not be null!");
        } else
        {
            wrappedFactory = threadfactory;
            return this;
        }
    }






    public ()
    {
    }
}
