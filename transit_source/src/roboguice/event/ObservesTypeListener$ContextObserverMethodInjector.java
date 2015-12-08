// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event;

import com.google.inject.Provider;
import com.google.inject.spi.InjectionListener;
import java.lang.reflect.Method;
import roboguice.event.eventListener.ObserverMethodListener;
import roboguice.event.eventListener.factory.EventListenerThreadingDecorator;

// Referenced classes of package roboguice.event:
//            ObservesTypeListener, EventManager, EventThread

public static class threadType
    implements InjectionListener
{

    protected Class event;
    protected Provider eventManagerProvider;
    protected Method method;
    protected EventListenerThreadingDecorator observerThreadingDecorator;
    protected EventThread threadType;

    public void afterInjection(Object obj)
    {
        ((EventManager)eventManagerProvider.get()).registerObserver(event, observerThreadingDecorator.decorate(threadType, new ObserverMethodListener(obj, method)));
    }

    public or(Provider provider, EventListenerThreadingDecorator eventlistenerthreadingdecorator, Method method1, Class class1, EventThread eventthread)
    {
        observerThreadingDecorator = eventlistenerthreadingdecorator;
        eventManagerProvider = provider;
        method = method1;
        event = class1;
        threadType = eventthread;
    }
}
