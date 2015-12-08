// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import com.skype.android.event.EventFilter;
import com.skype.android.event.EventListener;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.skype.android.inject:
//            Proxy, EventThread, LifecycleState

public abstract class ProxyEventListener
    implements EventFilter, EventListener
{

    private Class eventClass;
    private EventThread eventThread;
    private LifecycleState lifecycleState;
    private Proxy proxy;

    public ProxyEventListener(Proxy proxy1, Class class1, LifecycleState lifecyclestate, EventThread eventthread)
    {
        EventThread eventthread1 = eventthread;
        if (eventthread == null)
        {
            if (proxy1.isVisualElement())
            {
                eventthread1 = EventThread.MAIN;
            } else
            {
                eventthread1 = EventThread.BACKGROUND;
            }
        }
        proxy = proxy1;
        lifecycleState = lifecyclestate;
        eventThread = eventthread1;
        eventClass = class1;
    }

    public boolean accept(Object obj)
    {
label0:
        {
            Object obj1 = proxy.getFilters(obj.getClass());
            if (obj1 == null)
            {
                break label0;
            }
            obj1 = ((Set) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break label0;
                }
            } while (((EventFilter)((Iterator) (obj1)).next()).accept(obj));
            return false;
        }
        return true;
    }

    Class getEventClass()
    {
        return eventClass;
    }

    EventThread getEventThread()
    {
        return eventThread;
    }

    public EventFilter getFilter()
    {
        return this;
    }

    LifecycleState getLifecycle()
    {
label0:
        {
            LifecycleState lifecyclestate1 = lifecycleState;
            LifecycleState lifecyclestate = lifecyclestate1;
            if (lifecyclestate1 == null)
            {
                lifecyclestate = proxy.getDefaultLifecycleState();
            }
            lifecyclestate1 = lifecyclestate;
            if (lifecyclestate == null)
            {
                if (!proxy.isVisualElement())
                {
                    break label0;
                }
                lifecyclestate1 = LifecycleState.RESUMED;
            }
            return lifecyclestate1;
        }
        return LifecycleState.CREATED;
    }

    public abstract void onEvent(Object obj);
}
