// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.tasks.state;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSStatefulObject;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;

public abstract class DNSStateTask extends DNSTask
{

    private static int _defaultTTL = 3600;
    static Logger logger1 = Logger.getLogger(javax/jmdns/impl/tasks/state/DNSStateTask.getName());
    private DNSState _taskState;
    private final int _ttl;

    public DNSStateTask(JmDNSImpl jmdnsimpl, int i)
    {
        super(jmdnsimpl);
        _taskState = null;
        _ttl = i;
    }

    public static int defaultTTL()
    {
        return _defaultTTL;
    }

    protected void advanceObjectsState(List list)
    {
        if (list != null)
        {
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                synchronized ((DNSStatefulObject)iterator.next())
                {
                    list.advanceState(this);
                }
            }

        }
        break MISSING_BLOCK_LABEL_50;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void advanceTask();

    protected void associate(DNSState dnsstate)
    {
        synchronized (getDns())
        {
            getDns().associateWithTask(this, dnsstate);
        }
        for (obj = getDns().getServices().values().iterator(); ((Iterator) (obj)).hasNext(); ((ServiceInfoImpl)(ServiceInfo)((Iterator) (obj)).next()).associateWithTask(this, dnsstate)) { }
        break MISSING_BLOCK_LABEL_70;
        dnsstate;
        obj;
        JVM INSTR monitorexit ;
        throw dnsstate;
    }

    protected abstract DNSOutgoing buildOutgoingForDNS(DNSOutgoing dnsoutgoing)
        throws IOException;

    protected abstract DNSOutgoing buildOutgoingForInfo(ServiceInfoImpl serviceinfoimpl, DNSOutgoing dnsoutgoing)
        throws IOException;

    protected abstract boolean checkRunCondition();

    protected abstract DNSOutgoing createOugoing();

    public int getTTL()
    {
        return _ttl;
    }

    public abstract String getTaskDescription();

    protected DNSState getTaskState()
    {
        return _taskState;
    }

    protected abstract void recoverTask(Throwable throwable);

    protected void removeAssociation()
    {
        synchronized (getDns())
        {
            getDns().removeAssociationWithTask(this);
        }
        for (obj = getDns().getServices().values().iterator(); ((Iterator) (obj)).hasNext(); ((ServiceInfoImpl)(ServiceInfo)((Iterator) (obj)).next()).removeAssociationWithTask(this)) { }
        break MISSING_BLOCK_LABEL_68;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        Object obj1 = createOugoing();
        if (!checkRunCondition())
        {
            cancel();
            return;
        }
        ArrayList arraylist = new ArrayList();
        Object obj2 = getDns();
        obj2;
        JVM INSTR monitorenter ;
        Object obj = obj1;
        if (getDns().isAssociatedWithTask(this, getTaskState()))
        {
            logger1.finer((new StringBuilder()).append(getName()).append(".run() JmDNS ").append(getTaskDescription()).append(" ").append(getDns().getName()).toString());
            arraylist.add(getDns());
            obj = buildOutgoingForDNS(((DNSOutgoing) (obj1)));
        }
        obj2;
        JVM INSTR monitorexit ;
        obj2 = getDns().getServices().values().iterator();
_L1:
        if (!((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_312;
        }
        ServiceInfoImpl serviceinfoimpl = (ServiceInfoImpl)(ServiceInfo)((Iterator) (obj2)).next();
        serviceinfoimpl;
        JVM INSTR monitorenter ;
        obj1 = obj;
        if (serviceinfoimpl.isAssociatedWithTask(this, getTaskState()))
        {
            logger1.fine((new StringBuilder()).append(getName()).append(".run() JmDNS ").append(getTaskDescription()).append(" ").append(serviceinfoimpl.getQualifiedName()).toString());
            arraylist.add(serviceinfoimpl);
            obj1 = buildOutgoingForInfo(serviceinfoimpl, ((DNSOutgoing) (obj)));
        }
        serviceinfoimpl;
        JVM INSTR monitorexit ;
        obj = obj1;
          goto _L1
        obj;
        serviceinfoimpl;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            logger1.log(Level.WARNING, (new StringBuilder()).append(getName()).append(".run() exception ").toString(), ((Throwable) (obj)));
        }
        recoverTask(((Throwable) (obj)));
_L2:
        advanceTask();
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        if (((DNSOutgoing) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_382;
        }
        logger1.finer((new StringBuilder()).append(getName()).append(".run() JmDNS ").append(getTaskDescription()).append(" #").append(getTaskState()).toString());
        getDns().send(((DNSOutgoing) (obj)));
        advanceObjectsState(arraylist);
          goto _L2
        advanceObjectsState(arraylist);
        cancel();
        return;
    }

    protected void setTaskState(DNSState dnsstate)
    {
        _taskState = dnsstate;
    }

}
