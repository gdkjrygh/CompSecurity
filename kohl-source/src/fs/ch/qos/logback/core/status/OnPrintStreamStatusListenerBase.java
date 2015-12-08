// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.util.StatusPrinter;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.status:
//            StatusListener, StatusManager, Status

abstract class OnPrintStreamStatusListenerBase extends ContextAwareBase
    implements LifeCycle, StatusListener
{

    boolean isStarted;
    long retrospective;

    OnPrintStreamStatusListenerBase()
    {
        isStarted = false;
        retrospective = 300L;
    }

    private void print(Status status)
    {
        StringBuilder stringbuilder = new StringBuilder();
        StatusPrinter.buildStr(stringbuilder, "", status);
        getPrintStream().print(stringbuilder);
    }

    private void retrospectivePrint()
    {
        if (context != null)
        {
            long l = System.currentTimeMillis();
            Iterator iterator = context.getStatusManager().getCopyOfStatusList().iterator();
            while (iterator.hasNext()) 
            {
                Status status = (Status)iterator.next();
                if (l - status.getDate().longValue() < retrospective)
                {
                    print(status);
                }
            }
        }
    }

    public void addStatusEvent(Status status)
    {
        if (!isStarted)
        {
            return;
        } else
        {
            print(status);
            return;
        }
    }

    protected abstract PrintStream getPrintStream();

    public boolean isStarted()
    {
        return isStarted;
    }

    public void start()
    {
        isStarted = true;
        if (retrospective > 0L)
        {
            retrospectivePrint();
        }
    }

    public void stop()
    {
        isStarted = false;
    }
}
