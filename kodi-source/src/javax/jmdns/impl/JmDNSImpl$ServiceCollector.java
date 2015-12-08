// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

// Referenced classes of package javax.jmdns.impl:
//            JmDNSImpl

private static class _needToWaitForInfos
    implements ServiceListener
{

    private final ConcurrentMap _events = new ConcurrentHashMap();
    private final ConcurrentMap _infos = new ConcurrentHashMap();
    private volatile boolean _needToWaitForInfos;
    private final String _type;

    public ServiceInfo[] list(long l)
    {
        if (!_infos.isEmpty() && _events.isEmpty() && !_needToWaitForInfos) goto _L2; else goto _L1
_L1:
        int i;
        long l1 = l / 200L;
        l = l1;
        if (l1 < 1L)
        {
            l = 1L;
        }
        i = 0;
_L6:
        if ((long)i >= l) goto _L2; else goto _L3
_L3:
        try
        {
            Thread.sleep(200L);
        }
        catch (InterruptedException interruptedexception) { }
        if (!_events.isEmpty() || _infos.isEmpty() || _needToWaitForInfos) goto _L4; else goto _L2
_L2:
        _needToWaitForInfos = false;
        return (ServiceInfo[])_infos.values().toArray(new ServiceInfo[_infos.size()]);
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void serviceAdded(ServiceEvent serviceevent)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = serviceevent.getInfo();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((ServiceInfo) (obj)).hasData()) goto _L2; else goto _L3
_L3:
        _infos.put(serviceevent.getName(), obj);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = ((ServiceInfo) (obj)).getSubtype();
_L5:
        obj = ((JmDNSImpl)serviceevent.getDNS()).resolveServiceInfo(serviceevent.getType(), serviceevent.getName(), ((String) (obj)), true);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        _infos.put(serviceevent.getName(), obj);
          goto _L4
        serviceevent;
        this;
        JVM INSTR monitorexit ;
        throw serviceevent;
        obj = "";
          goto _L5
        _events.put(serviceevent.getName(), serviceevent);
          goto _L4
    }

    public void serviceRemoved(ServiceEvent serviceevent)
    {
        this;
        JVM INSTR monitorenter ;
        _infos.remove(serviceevent.getName());
        _events.remove(serviceevent.getName());
        this;
        JVM INSTR monitorexit ;
        return;
        serviceevent;
        this;
        JVM INSTR monitorexit ;
        throw serviceevent;
    }

    public void serviceResolved(ServiceEvent serviceevent)
    {
        this;
        JVM INSTR monitorenter ;
        _infos.put(serviceevent.getName(), serviceevent.getInfo());
        _events.remove(serviceevent.getName());
        this;
        JVM INSTR monitorexit ;
        return;
        serviceevent;
        this;
        JVM INSTR monitorexit ;
        throw serviceevent;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("\n\tType: ");
        stringbuffer.append(_type);
        if (_infos.isEmpty())
        {
            stringbuffer.append("\n\tNo services collected.");
        } else
        {
            stringbuffer.append("\n\tServices");
            Iterator iterator = _infos.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                stringbuffer.append("\n\t\tService: ");
                stringbuffer.append(s);
                stringbuffer.append(": ");
                stringbuffer.append(_infos.get(s));
            }
        }
        if (_events.isEmpty())
        {
            stringbuffer.append("\n\tNo event queued.");
        } else
        {
            stringbuffer.append("\n\tEvents");
            Iterator iterator1 = _events.keySet().iterator();
            while (iterator1.hasNext()) 
            {
                String s1 = (String)iterator1.next();
                stringbuffer.append("\n\t\tEvent: ");
                stringbuffer.append(s1);
                stringbuffer.append(": ");
                stringbuffer.append(_events.get(s1));
            }
        }
        return stringbuffer.toString();
    }

    public (String s)
    {
        _type = s;
        _needToWaitForInfos = true;
    }
}
