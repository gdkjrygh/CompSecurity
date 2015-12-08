// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx.eventbus;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx.P;
import rx.Y;
import rx.b.a;
import rx.b.b;
import rx.f.i;
import rx.g.m;

// Referenced classes of package com.soundcloud.rx.eventbus:
//            EventBus, DefaultEventBus, Queue

public class TestEventBus
    implements EventBus
{

    private final EventBus eventBus = new DefaultEventBus(i.a());
    private final Map observedQueues = new HashMap();
    private final Map subscriptions = new HashMap();

    public TestEventBus()
    {
    }

    private void assertAllUnsubscribed(Collection collection)
    {
        Y y;
        for (collection = collection.iterator(); collection.hasNext(); assertTrue((new StringBuilder("Expected to be unsubscribed from all queues, but found ")).append(y).toString(), y.isUnsubscribed()))
        {
            y = (Y)collection.next();
        }

    }

    private void assertFalse(String s, boolean flag)
    {
        if (flag)
        {
            throw new AssertionError(s);
        } else
        {
            return;
        }
    }

    private void assertTrue(String s, boolean flag)
    {
        if (!flag)
        {
            throw new AssertionError(s);
        } else
        {
            return;
        }
    }

    private List internalEventsOn(Queue queue1)
    {
        LinkedList linkedlist = new LinkedList();
        if (observedQueues.containsKey(queue1))
        {
            for (queue1 = ((Set)observedQueues.get(queue1)).iterator(); queue1.hasNext();)
            {
                Iterator iterator = Collections.unmodifiableList(((rx.d.i)queue1.next()).a).iterator();
                while (iterator.hasNext()) 
                {
                    linkedlist.add(iterator.next());
                }
            }

        }
        return linkedlist;
    }

    private void monitorQueue(Queue queue1)
    {
        if (!observedQueues.containsKey(queue1))
        {
            rx.d.i j = new rx.d.i();
            eventBus.subscribe(queue1, j);
            Set set = (Set)observedQueues.get(queue1);
            Object obj = set;
            if (set == null)
            {
                obj = new HashSet();
                observedQueues.put(queue1, obj);
            }
            ((Set) (obj)).add(j);
        }
    }

    public List eventsOn(Queue queue1)
    {
        return internalEventsOn(queue1);
    }

    public Object firstEventOn(Queue queue1)
    {
        List list = eventsOn(queue1);
        assertFalse((new StringBuilder("Attempted to access first event on queue ")).append(queue1).append(", but no events fired").toString(), list.isEmpty());
        return list.get(0);
    }

    public Object firstEventOn(Queue queue1, Class class1)
    {
        List list = eventsOn(queue1);
        assertFalse((new StringBuilder("Attempted to access first event on queue ")).append(queue1).append(", but no events fired").toString(), list.isEmpty());
        queue1 = ((Queue) (list.get(0)));
        assertTrue((new StringBuilder("Expect event of ")).append(class1).toString(), class1.isAssignableFrom(queue1.getClass()));
        return queue1;
    }

    public Object lastEventOn(Queue queue1)
    {
        List list = eventsOn(queue1);
        assertFalse((new StringBuilder("Attempted to access last event on queue ")).append(queue1).append(", but no events fired").toString(), list.isEmpty());
        return list.get(list.size() - 1);
    }

    public Object lastEventOn(Queue queue1, Class class1)
    {
        List list = eventsOn(queue1);
        assertFalse((new StringBuilder("Attempted to access last event on queue ")).append(queue1).append(", but no events fired").toString(), list.isEmpty());
        queue1 = ((Queue) (list.get(list.size() - 1)));
        assertTrue((new StringBuilder("Expect event of ")).append(class1).toString(), class1.isAssignableFrom(queue1.getClass()));
        return queue1;
    }

    public void publish(Queue queue1, Object obj)
    {
        monitorQueue(queue1);
        eventBus.publish(queue1, obj);
    }

    public a publishAction0(final Queue queue, final Object event)
    {
        return new _cls1();
    }

    public b publishAction1(final Queue queue, final Object event)
    {
        return new _cls2();
    }

    public m queue(Queue queue1)
    {
        monitorQueue(queue1);
        return eventBus.queue(queue1);
    }

    public Y subscribe(Queue queue1, P p)
    {
        Y y = eventBus.subscribe(queue1, p);
        Set set = (Set)subscriptions.get(queue1);
        p = set;
        if (set == null)
        {
            p = new HashSet();
            subscriptions.put(queue1, p);
        }
        p.add(y);
        return y;
    }

    public Y subscribeImmediate(Queue queue1, P p)
    {
        return subscribe(queue1, p);
    }

    public void verifyNoEventsOn(Queue queue1)
    {
        List list = eventsOn(queue1);
        assertTrue((new StringBuilder("Expected no events on queue ")).append(queue1).append(", but found these events:\n").append(list).toString(), list.isEmpty());
    }

    public void verifyUnsubscribed()
    {
        Object obj = subscriptions.values();
        assertFalse("Expected to be unsubscribed from all queues, but was never subscribed to any", ((Collection) (obj)).isEmpty());
        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); assertAllUnsubscribed((Collection)((Iterator) (obj)).next())) { }
    }

    public void verifyUnsubscribed(Queue queue1)
    {
        Set set = (Set)subscriptions.get(queue1);
        queue1 = (new StringBuilder("Expected to be unsubscribed from queue ")).append(queue1).append(", but was never subscribed").toString();
        boolean flag;
        if (set == null || set.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertFalse(queue1, flag);
        assertAllUnsubscribed(set);
    }

    private class _cls1
        implements a
    {

        final TestEventBus this$0;
        final Object val$event;
        final Queue val$queue;

        public void call()
        {
            publish(queue, event);
        }

        _cls1()
        {
            this$0 = TestEventBus.this;
            queue = queue1;
            event = obj;
            super();
        }
    }


    private class _cls2
        implements b
    {

        final TestEventBus this$0;
        final Object val$event;
        final Queue val$queue;

        public void call(Object obj)
        {
            publish(queue, event);
        }

        _cls2()
        {
            this$0 = TestEventBus.this;
            queue = queue1;
            event = obj;
            super();
        }
    }

}
