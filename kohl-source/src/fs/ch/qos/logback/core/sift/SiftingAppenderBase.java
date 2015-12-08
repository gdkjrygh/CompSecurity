// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.sift;

import fs.ch.qos.logback.core.Appender;
import fs.ch.qos.logback.core.AppenderBase;
import fs.ch.qos.logback.core.helpers.NOPAppender;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.sift:
//            AppenderTrackerImpl, Discriminator, AppenderTracker, AppenderFactoryBase

public abstract class SiftingAppenderBase extends AppenderBase
{

    AppenderFactoryBase appenderFactory;
    protected AppenderTracker appenderTracker;
    Discriminator discriminator;
    int nopaWarningCount;

    public SiftingAppenderBase()
    {
        appenderTracker = new AppenderTrackerImpl();
        nopaWarningCount = 0;
    }

    protected void append(Object obj)
    {
        if (!isStarted())
        {
            return;
        }
        String s = discriminator.getDiscriminatingValue(obj);
        long l = getTimestamp(obj);
        Appender appender = appenderTracker.get(s, l);
        Object obj1 = appender;
        if (appender != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        try
        {
            appender = appenderFactory.buildAppender(context, s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            addError((new StringBuilder()).append("Failed to build appender for [").append(s).append("]").toString(), ((Throwable) (obj)));
            return;
        }
        obj1 = appender;
        if (appender != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj1 = buildNOPAppender(s);
        appenderTracker.put(s, ((Appender) (obj1)), l);
        appenderTracker.stopStaleAppenders(l);
        ((Appender) (obj1)).doAppend(obj);
        return;
    }

    NOPAppender buildNOPAppender(String s)
    {
        if (nopaWarningCount < 4)
        {
            nopaWarningCount = nopaWarningCount + 1;
            addError((new StringBuilder()).append("Failed to build an appender for discriminating value [").append(s).append("]").toString());
        }
        s = new NOPAppender();
        s.setContext(context);
        s.start();
        return s;
    }

    public String getDiscriminatorKey()
    {
        if (discriminator != null)
        {
            return discriminator.getKey();
        } else
        {
            return null;
        }
    }

    protected abstract long getTimestamp(Object obj);

    public void setAppenderFactory(AppenderFactoryBase appenderfactorybase)
    {
        appenderFactory = appenderfactorybase;
    }

    public void start()
    {
        int i = 0;
        if (discriminator == null)
        {
            addError("Missing discriminator. Aborting");
            i = 1;
        }
        int j = i;
        if (!discriminator.isStarted())
        {
            addError("Discriminator has not started successfully. Aborting");
            j = i + 1;
        }
        if (j == 0)
        {
            super.start();
        }
    }

    public void stop()
    {
        for (Iterator iterator = appenderTracker.valueList().iterator(); iterator.hasNext(); ((Appender)iterator.next()).stop()) { }
    }
}
