// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks.state;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Timer;
import java.util.logging.Logger;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.HostInfo;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSState;

// Referenced classes of package javax.jmdns.impl.tasks.state:
//            DNSStateTask

public class Canceler extends DNSStateTask
{

    static Logger logger = Logger.getLogger(javax/jmdns/impl/tasks/state/Canceler.getName());

    public Canceler(JmDNSImpl jmdnsimpl)
    {
        super(jmdnsimpl, 0);
        setTaskState(DNSState.CANCELING_1);
        associate(DNSState.CANCELING_1);
    }

    protected void advanceTask()
    {
        setTaskState(getTaskState().advance());
        if (!getTaskState().isCanceling())
        {
            cancel();
        }
    }

    protected DNSOutgoing buildOutgoingForDNS(DNSOutgoing dnsoutgoing)
        throws IOException
    {
        for (Iterator iterator = getDns().getLocalHost().answers(true, getTTL()).iterator(); iterator.hasNext();)
        {
            dnsoutgoing = addAnswer(dnsoutgoing, null, (DNSRecord)iterator.next());
        }

        return dnsoutgoing;
    }

    protected DNSOutgoing buildOutgoingForInfo(ServiceInfoImpl serviceinfoimpl, DNSOutgoing dnsoutgoing)
        throws IOException
    {
        for (serviceinfoimpl = serviceinfoimpl.answers(true, getTTL(), getDns().getLocalHost()).iterator(); serviceinfoimpl.hasNext();)
        {
            dnsoutgoing = addAnswer(dnsoutgoing, null, (DNSRecord)serviceinfoimpl.next());
        }

        return dnsoutgoing;
    }

    public boolean cancel()
    {
        removeAssociation();
        return super.cancel();
    }

    protected boolean checkRunCondition()
    {
        return true;
    }

    protected DNSOutgoing createOugoing()
    {
        return new DNSOutgoing(33792);
    }

    public String getName()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Canceler(");
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
        return "canceling";
    }

    protected void recoverTask(Throwable throwable)
    {
        getDns().recover();
    }

    public void start(Timer timer)
    {
        timer.schedule(this, 0L, 1000L);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" state: ").append(getTaskState()).toString();
    }

}
