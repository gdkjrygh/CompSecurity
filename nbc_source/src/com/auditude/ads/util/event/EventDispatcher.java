// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.event;

import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.util.event:
//            IEventDispatcher, EventListenerHolder, ListenerPriorityComparator, IEventListener

public class EventDispatcher
    implements IEventDispatcher
{

    private HashMap listeners;

    public EventDispatcher()
    {
        listeners = new HashMap();
    }

    private ArrayList getListenersForType(String s)
    {
        return getListenersForType(s, Boolean.valueOf(false));
    }

    private ArrayList getListenersForType(String s, Boolean boolean1)
    {
        if (listeners.containsKey(s))
        {
            return (ArrayList)listeners.get(s);
        }
        if (boolean1.booleanValue())
        {
            boolean1 = new ArrayList();
            listeners.put(s, boolean1);
            return boolean1;
        } else
        {
            return null;
        }
    }

    public void addEventListener(String s, IEventListener ieventlistener)
    {
        addEventListener(s, ieventlistener, 0);
    }

    public void addEventListener(String s, IEventListener ieventlistener, int i)
    {
        if (!StringUtil.isNotNullOrEmpty(s) || ieventlistener == null) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        s = getListenersForType(s, Boolean.valueOf(true));
        iterator = s.iterator();
_L4:
        if (!iterator.hasNext())
        {
            s.add(new EventListenerHolder(ieventlistener, i));
            Collections.sort(s, new ListenerPriorityComparator());
        } else
        {
            EventListenerHolder eventlistenerholder = (EventListenerHolder)iterator.next();
            if (eventlistenerholder.listener != ieventlistener)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (eventlistenerholder.priority != i)
            {
                eventlistenerholder.priority = i;
                Collections.sort(s, new ListenerPriorityComparator());
                return;
            }
        }
_L2:
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void dispatchEvent(String s, Object obj)
    {
        if (!listeners.containsKey(s)) goto _L2; else goto _L1
_L1:
        Object obj1 = getListenersForType(s);
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj1 = ((ArrayList) (obj1)).iterator();
_L6:
        if (((Iterator) (obj1)).hasNext()) goto _L4; else goto _L2
_L2:
        return;
_L4:
        ((EventListenerHolder)((Iterator) (obj1)).next()).invoke(s, obj);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Boolean hasEventListener(String s)
    {
        if (StringUtil.isNotNullOrEmpty(s))
        {
            s = getListenersForType(s);
            if (s != null && s.size() > 0)
            {
                return Boolean.valueOf(true);
            } else
            {
                return Boolean.valueOf(false);
            }
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public void removeEventListener(String s, IEventListener ieventlistener)
    {
        if (!StringUtil.isNotNullOrEmpty(s) || ieventlistener == null) goto _L2; else goto _L1
_L1:
        s = getListenersForType(s);
        if (s == null) goto _L2; else goto _L3
_L3:
        s = s.iterator();
_L6:
        if (s.hasNext()) goto _L4; else goto _L2
_L2:
        return;
_L4:
        if (((EventListenerHolder)s.next()).listener == ieventlistener)
        {
            s.remove();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
