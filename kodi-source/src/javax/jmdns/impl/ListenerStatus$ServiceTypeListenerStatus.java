// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceTypeListener;

// Referenced classes of package javax.jmdns.impl:
//            ListenerStatus

public static class  extends ListenerStatus
{

    private static Logger logger = Logger.getLogger(javax/jmdns/impl/ListenerStatus$ServiceTypeListenerStatus.getName());
    private final ConcurrentMap _addedTypes;

    void serviceTypeAdded(ServiceEvent serviceevent)
    {
        if (_addedTypes.putIfAbsent(serviceevent.getType(), serviceevent.getType()) == null)
        {
            ((ServiceTypeListener)getListener()).serviceTypeAdded(serviceevent);
            return;
        } else
        {
            logger.finest((new StringBuilder()).append("Service Type Added called for a service type already added: ").append(serviceevent).toString());
            return;
        }
    }

    void subTypeForServiceTypeAdded(ServiceEvent serviceevent)
    {
        if (_addedTypes.putIfAbsent(serviceevent.getType(), serviceevent.getType()) == null)
        {
            ((ServiceTypeListener)getListener()).subTypeForServiceTypeAdded(serviceevent);
            return;
        } else
        {
            logger.finest((new StringBuilder()).append("Service Sub Type Added called for a service sub type already added: ").append(serviceevent).toString());
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(2048);
        stringbuilder.append("[Status for ");
        stringbuilder.append(((ServiceTypeListener)getListener()).toString());
        if (_addedTypes.isEmpty())
        {
            stringbuilder.append(" no type event ");
        } else
        {
            stringbuilder.append(" (");
            String s;
            for (Iterator iterator = _addedTypes.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append(s).append(", ").toString()))
            {
                s = (String)iterator.next();
            }

            stringbuilder.append(") ");
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

}
