// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.spi;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.status.ErrorStatus;
import fs.ch.qos.logback.core.status.Status;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.status.WarnStatus;
import java.io.PrintStream;

// Referenced classes of package fs.ch.qos.logback.core.spi:
//            ContextAware

public class ContextAwareImpl
    implements ContextAware
{

    protected Context context;
    private int noContextWarning;
    final Object origin;

    public ContextAwareImpl(Object obj)
    {
        noContextWarning = 0;
        origin = obj;
    }

    public void addError(String s)
    {
        addStatus(new ErrorStatus(s, getOrigin()));
    }

    public void addError(String s, Throwable throwable)
    {
        addStatus(new ErrorStatus(s, getOrigin(), throwable));
    }

    public void addStatus(Status status)
    {
        if (context == null)
        {
            int i = noContextWarning;
            noContextWarning = i + 1;
            if (i == 0)
            {
                System.out.println((new StringBuilder()).append("LOGBACK: No context given for ").append(this).toString());
            }
        } else
        {
            StatusManager statusmanager = context.getStatusManager();
            if (statusmanager != null)
            {
                statusmanager.add(status);
                return;
            }
        }
    }

    public void addWarn(String s, Throwable throwable)
    {
        addStatus(new WarnStatus(s, getOrigin(), throwable));
    }

    protected Object getOrigin()
    {
        return origin;
    }

    public void setContext(Context context1)
    {
        if (context == null)
        {
            context = context1;
        } else
        if (context != context1)
        {
            throw new IllegalStateException("Context has been already set");
        }
    }
}
