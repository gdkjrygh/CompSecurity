// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

// Referenced classes of package javax.jmdns.impl:
//            ListenerStatus

public static class  extends ListenerStatus
{

    private static Logger logger = Logger.getLogger(javax/jmdns/impl/ListenerStatus$ServiceListenerStatus.getName());
    private final ConcurrentMap _addedServices = new ConcurrentHashMap(32);

    private static final boolean _sameInfo(ServiceInfo serviceinfo, ServiceInfo serviceinfo1)
    {
_L2:
        return false;
        if (serviceinfo == null || serviceinfo1 == null || !serviceinfo.equals(serviceinfo1)) goto _L2; else goto _L1
_L1:
        serviceinfo = serviceinfo.getTextBytes();
        serviceinfo1 = serviceinfo1.getTextBytes();
        if (serviceinfo.length == serviceinfo1.length)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= serviceinfo.length)
                    {
                        break label1;
                    }
                    if (serviceinfo[i] != serviceinfo1[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L2; else goto _L3
_L3:
        return true;
    }

    void serviceAdded(ServiceEvent serviceevent)
    {
        String s = (new StringBuilder()).append(serviceevent.getName()).append(".").append(serviceevent.getType()).toString();
        if (_addedServices.putIfAbsent(s, serviceevent.getInfo().clone()) == null)
        {
            ((ServiceListener)getListener()).serviceAdded(serviceevent);
            ServiceInfo serviceinfo = serviceevent.getInfo();
            if (serviceinfo != null && serviceinfo.hasData())
            {
                ((ServiceListener)getListener()).serviceResolved(serviceevent);
            }
            return;
        } else
        {
            logger.finer((new StringBuilder()).append("Service Added called for a service already added: ").append(serviceevent).toString());
            return;
        }
    }

    void serviceRemoved(ServiceEvent serviceevent)
    {
        String s = (new StringBuilder()).append(serviceevent.getName()).append(".").append(serviceevent.getType()).toString();
        if (_addedServices.remove(s, _addedServices.get(s)))
        {
            ((ServiceListener)getListener()).serviceRemoved(serviceevent);
            return;
        } else
        {
            logger.finer((new StringBuilder()).append("Service Removed called for a service already removed: ").append(serviceevent).toString());
            return;
        }
    }

    void serviceResolved(ServiceEvent serviceevent)
    {
        this;
        JVM INSTR monitorenter ;
        ServiceInfo serviceinfo = serviceevent.getInfo();
        if (serviceinfo == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        String s;
        ServiceInfo serviceinfo1;
        if (!serviceinfo.hasData())
        {
            break MISSING_BLOCK_LABEL_178;
        }
        s = (new StringBuilder()).append(serviceevent.getName()).append(".").append(serviceevent.getType()).toString();
        serviceinfo1 = (ServiceInfo)_addedServices.get(s);
        if (_sameInfo(serviceinfo, serviceinfo1)) goto _L2; else goto _L1
_L1:
        if (serviceinfo1 != null) goto _L4; else goto _L3
_L3:
        if (_addedServices.putIfAbsent(s, serviceinfo.clone()) == null)
        {
            ((ServiceListener)getListener()).serviceResolved(serviceevent);
        }
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!_addedServices.replace(s, serviceinfo1, serviceinfo.clone())) goto _L6; else goto _L5
_L5:
        ((ServiceListener)getListener()).serviceResolved(serviceevent);
          goto _L6
        serviceevent;
        throw serviceevent;
_L2:
        logger.finer((new StringBuilder()).append("Service Resolved called for a service already resolved: ").append(serviceevent).toString());
          goto _L6
        logger.warning((new StringBuilder()).append("Service Resolved called for an unresolved event: ").append(serviceevent).toString());
          goto _L6
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(2048);
        stringbuilder.append("[Status for ");
        stringbuilder.append(((ServiceListener)getListener()).toString());
        if (_addedServices.isEmpty())
        {
            stringbuilder.append(" no type event ");
        } else
        {
            stringbuilder.append(" (");
            String s;
            for (Iterator iterator = _addedServices.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append(s).append(", ").toString()))
            {
                s = (String)iterator.next();
            }

            stringbuilder.append(") ");
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }


    public (ServiceListener servicelistener, boolean flag)
    {
        super(servicelistener, flag);
    }
}
