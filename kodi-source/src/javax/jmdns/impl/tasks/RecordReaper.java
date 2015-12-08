// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.JmDNSImpl;

// Referenced classes of package javax.jmdns.impl.tasks:
//            DNSTask

public class RecordReaper extends DNSTask
{

    static Logger logger = Logger.getLogger(javax/jmdns/impl/tasks/RecordReaper.getName());

    public RecordReaper(JmDNSImpl jmdnsimpl)
    {
        super(jmdnsimpl);
    }

    public String getName()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("RecordReaper(");
        String s;
        if (getDns() != null)
        {
            s = getDns().getName();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(")").toString();
    }

    public void run()
    {
        if (getDns().isCanceling() || getDns().isCanceled())
        {
            return;
        }
        if (logger.isLoggable(Level.FINEST))
        {
            logger.finest((new StringBuilder()).append(getName()).append(".run() JmDNS reaping cache").toString());
        }
        getDns().cleanCache();
    }

    public void start(Timer timer)
    {
        if (!getDns().isCanceling() && !getDns().isCanceled())
        {
            timer.schedule(this, 10000L, 10000L);
        }
    }

}
