// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.squareup.otto:
//            HandlerFinder, ThreadEnforcer, EventProducer, EventHandler, 
//            DeadEvent

public class Bus
{
    static class EventWithHandler
    {

        final Object event;
        final EventHandler handler;

        public EventWithHandler(Object obj, EventHandler eventhandler)
        {
            event = obj;
            handler = eventhandler;
        }
    }


    public static final String DEFAULT_IDENTIFIER = "default";
    private final ThreadEnforcer enforcer;
    private final ThreadLocal eventsToDispatch;
    private final Map flattenHierarchyCache;
    private final HandlerFinder handlerFinder;
    private final ConcurrentMap handlersByType;
    private final String identifier;
    private final ThreadLocal isDispatching;
    private final ConcurrentMap producersByType;

    public Bus()
    {
        this("default");
    }

    public Bus(ThreadEnforcer threadenforcer)
    {
        this(threadenforcer, "default");
    }

    public Bus(ThreadEnforcer threadenforcer, String s)
    {
        this(threadenforcer, s, HandlerFinder.ANNOTATED);
    }

    Bus(ThreadEnforcer threadenforcer, String s, HandlerFinder handlerfinder)
    {
        handlersByType = new ConcurrentHashMap();
        producersByType = new ConcurrentHashMap();
        eventsToDispatch = new ThreadLocal() {

            final Bus this$0;

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            protected ConcurrentLinkedQueue initialValue()
            {
                return new ConcurrentLinkedQueue();
            }

            
            {
                this$0 = Bus.this;
                super();
            }
        };
        isDispatching = new ThreadLocal() {

            final Bus this$0;

            protected Boolean initialValue()
            {
                return Boolean.valueOf(false);
            }

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            
            {
                this$0 = Bus.this;
                super();
            }
        };
        flattenHierarchyCache = new HashMap();
        enforcer = threadenforcer;
        identifier = s;
        handlerFinder = handlerfinder;
    }

    public Bus(String s)
    {
        this(ThreadEnforcer.MAIN, s);
    }

    private void dispatchProducerResultToHandler(EventHandler eventhandler, EventProducer eventproducer)
    {
        Object obj = null;
        Object obj1 = eventproducer.produceEvent();
        eventproducer = ((EventProducer) (obj1));
_L1:
        InvocationTargetException invocationtargetexception;
        if (eventproducer == null)
        {
            return;
        } else
        {
            dispatch(eventproducer, eventhandler);
            return;
        }
        invocationtargetexception;
        throwRuntimeException((new StringBuilder()).append("Producer ").append(eventproducer).append(" threw an exception.").toString(), invocationtargetexception);
        eventproducer = obj;
          goto _L1
    }

    private Set getClassesFor(Class class1)
    {
        LinkedList linkedlist = new LinkedList();
        HashSet hashset = new HashSet();
        linkedlist.add(class1);
        do
        {
            if (linkedlist.isEmpty())
            {
                break;
            }
            class1 = (Class)linkedlist.remove(0);
            hashset.add(class1);
            class1 = class1.getSuperclass();
            if (class1 != null)
            {
                linkedlist.add(class1);
            }
        } while (true);
        return hashset;
    }

    private static void throwRuntimeException(String s, InvocationTargetException invocationtargetexception)
    {
        Throwable throwable = invocationtargetexception.getCause();
        if (throwable != null)
        {
            throw new RuntimeException((new StringBuilder()).append(s).append(": ").append(throwable.getMessage()).toString(), throwable);
        } else
        {
            throw new RuntimeException((new StringBuilder()).append(s).append(": ").append(invocationtargetexception.getMessage()).toString(), invocationtargetexception);
        }
    }

    protected void dispatch(Object obj, EventHandler eventhandler)
    {
        try
        {
            eventhandler.handleEvent(obj);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throwRuntimeException((new StringBuilder()).append("Could not dispatch event: ").append(obj.getClass()).append(" to handler ").append(eventhandler).toString(), invocationtargetexception);
        }
    }

    protected void dispatchQueuedEvents()
    {
        if (((Boolean)isDispatching.get()).booleanValue())
        {
            return;
        }
        isDispatching.set(Boolean.valueOf(true));
_L2:
        EventWithHandler eventwithhandler = (EventWithHandler)((ConcurrentLinkedQueue)eventsToDispatch.get()).poll();
        if (eventwithhandler == null)
        {
            isDispatching.set(Boolean.valueOf(false));
            return;
        }
        if (!eventwithhandler.handler.isValid()) goto _L2; else goto _L1
_L1:
        dispatch(eventwithhandler.event, eventwithhandler.handler);
          goto _L2
        Exception exception;
        exception;
        isDispatching.set(Boolean.valueOf(false));
        throw exception;
    }

    protected void enqueueEvent(Object obj, EventHandler eventhandler)
    {
        ((ConcurrentLinkedQueue)eventsToDispatch.get()).offer(new EventWithHandler(obj, eventhandler));
    }

    Set flattenHierarchy(Class class1)
    {
        Set set1 = (Set)flattenHierarchyCache.get(class1);
        Set set = set1;
        if (set1 == null)
        {
            set = getClassesFor(class1);
            flattenHierarchyCache.put(class1, set);
        }
        return set;
    }

    Set getHandlersForEventType(Class class1)
    {
        return (Set)handlersByType.get(class1);
    }

    EventProducer getProducerForEventType(Class class1)
    {
        return (EventProducer)producersByType.get(class1);
    }

    public void post(Object obj)
    {
        boolean flag;
        if (obj == null)
        {
            throw new NullPointerException("Event to post must not be null.");
        }
        enforcer.enforce(this);
        Object obj1 = flattenHierarchy(obj.getClass());
        flag = false;
        obj1 = ((Set) (obj1)).iterator();
        do
        {
label0:
            {
                Object obj2;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break label0;
                    }
                    obj2 = getHandlersForEventType((Class)((Iterator) (obj1)).next());
                } while (obj2 == null || ((Set) (obj2)).isEmpty());
                boolean flag1 = true;
                obj2 = ((Set) (obj2)).iterator();
                do
                {
                    flag = flag1;
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    enqueueEvent(obj, (EventHandler)((Iterator) (obj2)).next());
                } while (true);
            }
        } while (true);
        if (!flag && !(obj instanceof DeadEvent))
        {
            post(new DeadEvent(this, obj));
        }
        dispatchQueuedEvents();
        return;
    }

    public void register(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Object to register must not be null.");
        }
        enforcer.enforce(this);
        Map map = handlerFinder.findAllProducers(obj);
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj3 = (Class)iterator.next();
            EventProducer eventproducer = (EventProducer)map.get(obj3);
            EventProducer eventproducer1 = (EventProducer)producersByType.putIfAbsent(obj3, eventproducer);
            if (eventproducer1 != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Producer method for type ").append(obj3).append(" found on type ").append(eventproducer.target.getClass()).append(", but already registered by type ").append(eventproducer1.target.getClass()).append(".").toString());
            }
            obj3 = (Set)handlersByType.get(obj3);
            if (obj3 != null && !((Set) (obj3)).isEmpty())
            {
                obj3 = ((Set) (obj3)).iterator();
                while (((Iterator) (obj3)).hasNext()) 
                {
                    dispatchProducerResultToHandler((EventHandler)((Iterator) (obj3)).next(), eventproducer);
                }
            }
        } while (true);
        Map map1 = handlerFinder.findAllSubscribers(obj);
        for (Iterator iterator1 = map1.keySet().iterator(); iterator1.hasNext();)
        {
            Class class1 = (Class)iterator1.next();
            Set set = (Set)handlersByType.get(class1);
            obj = set;
            if (set == null)
            {
                CopyOnWriteArraySet copyonwritearrayset = new CopyOnWriteArraySet();
                Set set1 = (Set)handlersByType.putIfAbsent(class1, copyonwritearrayset);
                obj = set1;
                if (set1 == null)
                {
                    obj = copyonwritearrayset;
                }
            }
            if (!((Set) (obj)).addAll((Set)map1.get(class1)))
            {
                throw new IllegalArgumentException("Object already registered.");
            }
        }

        obj = map1.entrySet().iterator();
_L2:
        Object obj1;
        Object obj2;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_502;
            }
            obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
            obj1 = (EventProducer)producersByType.get(obj1);
        } while (obj1 == null || !((EventProducer) (obj1)).isValid());
        obj2 = ((Set)((java.util.Map.Entry) (obj2)).getValue()).iterator();
_L4:
        if (!((Iterator) (obj2)).hasNext()) goto _L2; else goto _L1
_L1:
        EventHandler eventhandler = (EventHandler)((Iterator) (obj2)).next();
        if (!((EventProducer) (obj1)).isValid()) goto _L2; else goto _L3
_L3:
        if (eventhandler.isValid())
        {
            dispatchProducerResultToHandler(eventhandler, ((EventProducer) (obj1)));
        }
          goto _L4
    }

    public String toString()
    {
        return (new StringBuilder()).append("[Bus \"").append(identifier).append("\"]").toString();
    }

    public void unregister(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Object to unregister must not be null.");
        }
        enforcer.enforce(this);
        Class class1;
        for (Iterator iterator = handlerFinder.findAllProducers(obj).entrySet().iterator(); iterator.hasNext(); ((EventProducer)producersByType.remove(class1)).invalidate())
        {
            Object obj2 = (java.util.Map.Entry)iterator.next();
            class1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
            EventProducer eventproducer = getProducerForEventType(class1);
            obj2 = (EventProducer)((java.util.Map.Entry) (obj2)).getValue();
            if (obj2 == null || !((EventProducer) (obj2)).equals(eventproducer))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Missing event producer for an annotated method. Is ").append(obj.getClass()).append(" registered?").toString());
            }
        }

        Set set;
        Object obj1;
label0:
        for (Iterator iterator1 = handlerFinder.findAllSubscribers(obj).entrySet().iterator(); iterator1.hasNext(); set.removeAll(((Collection) (obj1))))
        {
            obj1 = (java.util.Map.Entry)iterator1.next();
            set = getHandlersForEventType((Class)((java.util.Map.Entry) (obj1)).getKey());
            obj1 = (Collection)((java.util.Map.Entry) (obj1)).getValue();
            if (set == null || !set.containsAll(((Collection) (obj1))))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Missing event handler for an annotated method. Is ").append(obj.getClass()).append(" registered?").toString());
            }
            Iterator iterator2 = set.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    continue label0;
                }
                EventHandler eventhandler = (EventHandler)iterator2.next();
                if (((Collection) (obj1)).contains(eventhandler))
                {
                    eventhandler.invalidate();
                }
            } while (true);
        }

    }
}
