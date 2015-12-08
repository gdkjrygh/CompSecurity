// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks.resolver;

import java.io.IOException;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.tasks.DNSTask;

public abstract class DNSResolverTask extends DNSTask
{

    private static Logger logger = Logger.getLogger(javax/jmdns/impl/tasks/resolver/DNSResolverTask.getName());
    protected int _count;

    public DNSResolverTask(JmDNSImpl jmdnsimpl)
    {
        super(jmdnsimpl);
        _count = 0;
    }

    protected abstract DNSOutgoing addAnswers(DNSOutgoing dnsoutgoing)
        throws IOException;

    protected abstract DNSOutgoing addQuestions(DNSOutgoing dnsoutgoing)
        throws IOException;

    protected abstract String description();

    public void run()
    {
        DNSOutgoing dnsoutgoing;
        DNSOutgoing dnsoutgoing1;
        int i;
        try
        {
            if (getDns().isCanceling() || getDns().isCanceled())
            {
                cancel();
                return;
            }
        }
        catch (Throwable throwable)
        {
            logger.log(Level.WARNING, (new StringBuilder()).append(getName()).append(".run() exception ").toString(), throwable);
            getDns().recover();
            return;
        }
        i = _count;
        _count = i + 1;
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        if (logger.isLoggable(Level.FINER))
        {
            logger.finer((new StringBuilder()).append(getName()).append(".run() JmDNS ").append(description()).toString());
        }
        dnsoutgoing1 = addQuestions(new DNSOutgoing(0));
        dnsoutgoing = dnsoutgoing1;
        if (getDns().isAnnounced())
        {
            dnsoutgoing = addAnswers(dnsoutgoing1);
        }
        if (!dnsoutgoing.isEmpty())
        {
            getDns().send(dnsoutgoing);
            return;
        }
        break MISSING_BLOCK_LABEL_183;
        cancel();
    }

    public void start(Timer timer)
    {
        if (!getDns().isCanceling() && !getDns().isCanceled())
        {
            timer.schedule(this, 225L, 225L);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" count: ").append(_count).toString();
    }

}
