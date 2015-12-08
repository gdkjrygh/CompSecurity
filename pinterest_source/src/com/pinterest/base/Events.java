// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.os.Handler;
import de.greenrobot.event.EventBus;
import de.greenrobot.event.EventBusBuilder;
import de.greenrobot.event.EventBusException;

public class Events
{

    private static final EventBus _eventBus = EventBus.builder().throwSubscriberException(true).build();

    public Events()
    {
    }

    public static Object getStickyEvent(Class class1)
    {
        return _eventBus.getStickyEvent(class1);
    }

    public static void post(Object obj)
    {
        if (obj == null)
        {
            return;
        } else
        {
            _eventBus.post(obj);
            return;
        }
    }

    public static void postDelayed(final Object event, long l)
    {
        if (event == null)
        {
            return;
        } else
        {
            (new Handler()).postDelayed(new _cls1(), l);
            return;
        }
    }

    public static void postSticky(Object obj)
    {
        if (obj == null)
        {
            return;
        } else
        {
            _eventBus.postSticky(obj);
            return;
        }
    }

    public static void postStickyDelayed(final Object event, long l)
    {
        if (event == null)
        {
            return;
        } else
        {
            (new Handler()).postDelayed(new _cls2(), l);
            return;
        }
    }

    public static transient void register(EventsSubscriber eventssubscriber, Class class1, Class aclass[])
    {
        if (eventssubscriber == null)
        {
            return;
        }
        try
        {
            _eventBus.register(eventssubscriber, class1, aclass);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EventsSubscriber eventssubscriber)
        {
            return;
        }
    }

    public static void register(Object obj)
    {
        if (obj == null)
        {
            return;
        }
        try
        {
            _eventBus.register(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
    }

    public static transient void registerSticky(EventsSubscriber eventssubscriber, Class class1, Class aclass[])
    {
        if (eventssubscriber == null)
        {
            return;
        }
        try
        {
            _eventBus.registerSticky(eventssubscriber, class1, aclass);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EventsSubscriber eventssubscriber)
        {
            return;
        }
    }

    public static void removeStickyEvent(Object obj)
    {
        if (obj != null)
        {
            _eventBus.removeStickyEvent(obj);
        }
    }

    public static void unregister(EventsSubscriber eventssubscriber)
    {
        if (eventssubscriber == null)
        {
            return;
        }
        try
        {
            _eventBus.unregister(eventssubscriber);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EventsSubscriber eventssubscriber)
        {
            return;
        }
    }

    public static transient void unregister(EventsSubscriber eventssubscriber, Class aclass[])
    {
        if (eventssubscriber == null)
        {
            return;
        }
        try
        {
            _eventBus.unregister(eventssubscriber, aclass);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EventsSubscriber eventssubscriber)
        {
            return;
        }
    }



    private class _cls1
        implements Runnable
    {

        final Object val$event;

        public final void run()
        {
            Events._eventBus.post(event);
        }

        _cls1()
        {
            event = obj;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final Object val$event;

        public final void run()
        {
            Events._eventBus.postSticky(event);
        }

        _cls2()
        {
            event = obj;
            super();
        }
    }

}
