// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import roboguice.event.eventListener.ObserverMethodListener;

// Referenced classes of package roboguice.event:
//            EventListener

public class EventManager
{

    protected Context context;
    protected Map registrations;

    public EventManager()
    {
        registrations = new HashMap();
    }

    public void destroy()
    {
        for (Iterator iterator = registrations.entrySet().iterator(); iterator.hasNext(); ((Set)((java.util.Map.Entry)iterator.next()).getValue()).clear()) { }
        registrations.clear();
    }

    public void fire(Object obj)
    {
        Set set;
        set = (Set)registrations.get(obj.getClass());
        if (set == null)
        {
            return;
        }
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ((EventListener)iterator.next()).onEvent(obj)) { }
        break MISSING_BLOCK_LABEL_63;
        obj;
        set;
        JVM INSTR monitorexit ;
        throw obj;
        set;
        JVM INSTR monitorexit ;
    }

    public void registerObserver(Class class1, EventListener eventlistener)
    {
        Set set1 = (Set)registrations.get(class1);
        Set set = set1;
        if (set1 == null)
        {
            set = Collections.synchronizedSet(new LinkedHashSet());
            registrations.put(class1, set);
        }
        set.add(eventlistener);
    }

    public void registerObserver(Object obj, Method method, Class class1)
    {
        registerObserver(class1, ((EventListener) (new ObserverMethodListener(obj, method))));
    }

    public void unregisterObserver(Class class1, EventListener eventlistener)
    {
        class1 = (Set)registrations.get(class1);
        if (class1 == null)
        {
            return;
        }
        class1;
        JVM INSTR monitorenter ;
        Iterator iterator = class1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if ((EventListener)iterator.next() != eventlistener)
            {
                continue;
            }
            iterator.remove();
            break;
        } while (true);
        class1;
        JVM INSTR monitorexit ;
        return;
        eventlistener;
        class1;
        JVM INSTR monitorexit ;
        throw eventlistener;
    }

    public void unregisterObserver(Object obj, Class class1)
    {
        class1 = (Set)registrations.get(class1);
        if (class1 == null)
        {
            return;
        }
        class1;
        JVM INSTR monitorenter ;
        Iterator iterator = class1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            EventListener eventlistener = (EventListener)iterator.next();
            if (!(eventlistener instanceof ObserverMethodListener) || ((ObserverMethodListener)eventlistener).getInstance() != obj)
            {
                continue;
            }
            iterator.remove();
            break;
        } while (true);
        class1;
        JVM INSTR monitorexit ;
        return;
        obj;
        class1;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
