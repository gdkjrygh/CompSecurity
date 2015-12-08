// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks.state;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Timer;
import java.util.logging.Logger;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSQuestion;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.HostInfo;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;

// Referenced classes of package javax.jmdns.impl.tasks.state:
//            DNSStateTask

public class Prober extends DNSStateTask
{

    static Logger logger = Logger.getLogger(javax/jmdns/impl/tasks/state/Prober.getName());

    public Prober(JmDNSImpl jmdnsimpl)
    {
        super(jmdnsimpl, defaultTTL());
        setTaskState(DNSState.PROBING_1);
        associate(DNSState.PROBING_1);
    }

    protected void advanceTask()
    {
        setTaskState(getTaskState().advance());
        if (!getTaskState().isProbing())
        {
            cancel();
            getDns().startAnnouncer();
        }
    }

    protected DNSOutgoing buildOutgoingForDNS(DNSOutgoing dnsoutgoing)
        throws IOException
    {
        dnsoutgoing.addQuestion(DNSQuestion.newQuestion(getDns().getLocalHost().getName(), DNSRecordType.TYPE_ANY, DNSRecordClass.CLASS_IN, false));
        for (Iterator iterator = getDns().getLocalHost().answers(false, getTTL()).iterator(); iterator.hasNext();)
        {
            dnsoutgoing = addAuthoritativeAnswer(dnsoutgoing, (DNSRecord)iterator.next());
        }

        return dnsoutgoing;
    }

    protected DNSOutgoing buildOutgoingForInfo(ServiceInfoImpl serviceinfoimpl, DNSOutgoing dnsoutgoing)
        throws IOException
    {
        return addAuthoritativeAnswer(addQuestion(dnsoutgoing, DNSQuestion.newQuestion(serviceinfoimpl.getQualifiedName(), DNSRecordType.TYPE_ANY, DNSRecordClass.CLASS_IN, false)), new javax.jmdns.impl.DNSRecord.Service(serviceinfoimpl.getQualifiedName(), DNSRecordClass.CLASS_IN, false, getTTL(), serviceinfoimpl.getPriority(), serviceinfoimpl.getWeight(), serviceinfoimpl.getPort(), getDns().getLocalHost().getName()));
    }

    public boolean cancel()
    {
        removeAssociation();
        return super.cancel();
    }

    protected boolean checkRunCondition()
    {
        return !getDns().isCanceling() && !getDns().isCanceled();
    }

    protected DNSOutgoing createOugoing()
    {
        return new DNSOutgoing(0);
    }

    public String getName()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Prober(");
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

    public String getTaskDescription()
    {
        return "probing";
    }

    protected void recoverTask(Throwable throwable)
    {
        getDns().recover();
    }

    public void start(Timer timer)
    {
        long l = System.currentTimeMillis();
        if (l - getDns().getLastThrottleIncrement() < 5000L)
        {
            getDns().setThrottle(getDns().getThrottle() + 1);
        } else
        {
            getDns().setThrottle(1);
        }
        getDns().setLastThrottleIncrement(l);
        if (getDns().isAnnounced() && getDns().getThrottle() < 10)
        {
            timer.schedule(this, JmDNSImpl.getRandom().nextInt(251), 250L);
        } else
        if (!getDns().isCanceling() && !getDns().isCanceled())
        {
            timer.schedule(this, 1000L, 1000L);
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" state: ").append(getTaskState()).toString();
    }

}
