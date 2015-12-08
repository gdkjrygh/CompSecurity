// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;

import fs.ch.qos.logback.core.Context;
import java.io.PrintStream;

// Referenced classes of package fs.ch.qos.logback.core.status:
//            OnPrintStreamStatusListenerBase, StatusManager, Status

public class OnConsoleStatusListener extends OnPrintStreamStatusListenerBase
{

    public OnConsoleStatusListener()
    {
    }

    public static void addNewInstanceToContext(Context context)
    {
        OnConsoleStatusListener onconsolestatuslistener = new OnConsoleStatusListener();
        onconsolestatuslistener.setContext(context);
        if (context.getStatusManager().addUniquely(onconsolestatuslistener, context))
        {
            onconsolestatuslistener.start();
        }
    }

    public volatile void addStatusEvent(Status status)
    {
        super.addStatusEvent(status);
    }

    protected PrintStream getPrintStream()
    {
        return System.out;
    }

    public volatile boolean isStarted()
    {
        return super.isStarted();
    }

    public volatile void start()
    {
        super.start();
    }

    public volatile void stop()
    {
        super.stop();
    }
}
