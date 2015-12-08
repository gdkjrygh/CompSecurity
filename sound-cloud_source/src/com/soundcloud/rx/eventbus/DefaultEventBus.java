// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx.eventbus;

import java.util.HashMap;
import java.util.Map;
import rx.P;
import rx.R;
import rx.Y;
import rx.b;
import rx.b.a;
import rx.g.m;

// Referenced classes of package com.soundcloud.rx.eventbus:
//            EventBus, Queue, EventSubject

public class DefaultEventBus
    implements EventBus
{

    private final R defaultScheduler;
    private final Map queues = new HashMap();

    public DefaultEventBus(R r)
    {
        defaultScheduler = r;
    }

    public void publish(Queue queue1, Object obj)
    {
        queue(queue1).onNext(obj);
    }

    public a publishAction0(final Queue queue, final Object event)
    {
        return new _cls1();
    }

    public rx.b.b publishAction1(final Queue queue, final Object event)
    {
        return new _cls2();
    }

    public m queue(Queue queue1)
    {
        m m1 = (m)queues.get(Integer.valueOf(queue1.id));
        Object obj = m1;
        if (m1 == null)
        {
            if (queue1.replayLast)
            {
                obj = EventSubject.replaying(queue1.defaultEvent, queue1.onError);
            } else
            {
                obj = EventSubject.create(queue1.onError);
            }
            queues.put(Integer.valueOf(queue1.id), obj);
        }
        return ((m) (obj));
    }

    public Y subscribe(Queue queue1, P p)
    {
        return queue(queue1).observeOn(defaultScheduler).subscribe(p);
    }

    public Y subscribeImmediate(Queue queue1, P p)
    {
        return queue(queue1).subscribe(p);
    }

    private class _cls1
        implements a
    {

        final DefaultEventBus this$0;
        final Object val$event;
        final Queue val$queue;

        public void call()
        {
            publish(queue, event);
        }

        _cls1()
        {
            this$0 = DefaultEventBus.this;
            queue = queue1;
            event = obj;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final DefaultEventBus this$0;
        final Object val$event;
        final Queue val$queue;

        public void call(Object obj)
        {
            publish(queue, event);
        }

        _cls2()
        {
            this$0 = DefaultEventBus.this;
            queue = queue1;
            event = obj;
            super();
        }
    }

}
