// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import com.skype.android.event.EventBus;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.skype.android.inject:
//            ProxyFactory, Proxy, ProxyEventListener, EventThread, 
//            LifecycleState

public class EventSubscriberBinder
{

    private EventBus eventBus;
    private Proxy proxy;

    public EventSubscriberBinder(EventBus eventbus, Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null receiver");
        }
        if (eventbus == null)
        {
            throw new IllegalArgumentException("null eventBus");
        } else
        {
            eventBus = eventbus;
            proxy = ProxyFactory.get(obj);
            return;
        }
    }

    public void bind()
    {
        if (proxy != null)
        {
            ProxyEventListener proxyeventlistener;
            android.os.Looper looper;
            for (Iterator iterator = proxy.getListeners().iterator(); iterator.hasNext(); eventBus.a(looper, proxyeventlistener.getEventClass(), proxyeventlistener))
            {
                proxyeventlistener = (ProxyEventListener)iterator.next();
                looper = proxyeventlistener.getEventThread().getLooper();
            }

        }
    }

    public void bind(LifecycleState lifecyclestate)
    {
        if (proxy != null)
        {
            Iterator iterator = proxy.getListeners().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ProxyEventListener proxyeventlistener = (ProxyEventListener)iterator.next();
                if (lifecyclestate == null || proxyeventlistener.getLifecycle() == lifecyclestate)
                {
                    android.os.Looper looper = proxyeventlistener.getEventThread().getLooper();
                    eventBus.a(looper, proxyeventlistener.getEventClass(), proxyeventlistener);
                }
            } while (true);
        }
    }

    public void unbind()
    {
        if (proxy != null)
        {
            ProxyEventListener proxyeventlistener;
            android.os.Looper looper;
            for (Iterator iterator = proxy.getListeners().iterator(); iterator.hasNext(); eventBus.b(looper, proxyeventlistener.getEventClass(), proxyeventlistener))
            {
                proxyeventlistener = (ProxyEventListener)iterator.next();
                looper = proxyeventlistener.getEventThread().getLooper();
            }

        }
    }

    public void unbind(LifecycleState lifecyclestate)
    {
        if (proxy != null)
        {
            Iterator iterator = proxy.getListeners().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ProxyEventListener proxyeventlistener = (ProxyEventListener)iterator.next();
                if (lifecyclestate == null || proxyeventlistener.getLifecycle() == lifecyclestate)
                {
                    android.os.Looper looper = proxyeventlistener.getEventThread().getLooper();
                    eventBus.b(looper, proxyeventlistener.getEventClass(), proxyeventlistener);
                }
            } while (true);
        }
    }
}
