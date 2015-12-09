// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import android.os.Handler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            Subscribe, HandlerRegistration, RegistrationCallback, MethodEventHandler, 
//            EventHandler

public class EventBus
{
    static final class MethodWrapper
    {

        private final Class eventType;
        private final Method method;



        private MethodWrapper(Class class1, Method method1)
        {
            eventType = class1;
            method = method1;
        }

    }


    public static final Object DEFAULT_EVENT_ID = new Object();
    private static final String TAG = com/google/android/apps/wallet/eventbus/EventBus.getSimpleName();
    private static final Map subscriberMethodCache = Maps.newHashMap();
    private final Map eventRegistrationCallbacksByEvent = Maps.newHashMap();
    private final Handler handler;
    private final SetMultimap handlersByOwner = HashMultimap.create();
    private final SetMultimap handlersByType = HashMultimap.create();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public EventBus(Handler handler1)
    {
        handler = handler1;
    }

    private static Class getEventType(Method method)
    {
        boolean flag = true;
        if (method.getParameterTypes().length != 1)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Event handler methods can only take a single event argument.");
        return method.getParameterTypes()[0];
    }

    private static List getSubscriberMethods(Class class1)
    {
        boolean flag = true;
        Map map = subscriberMethodCache;
        map;
        JVM INSTR monitorenter ;
        Object obj = (List)subscriberMethodCache.get(class1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        map;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        Method amethod[];
        int j;
        obj = Lists.newArrayList();
        amethod = class1.getDeclaredMethods();
        j = amethod.length;
        int i = 0;
_L2:
        Method method;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        method = amethod[i];
        if (method.isAnnotationPresent(com/google/android/apps/wallet/eventbus/Subscribe))
        {
            ((List) (obj)).add(new MethodWrapper(getEventType(method), method));
        }
        break MISSING_BLOCK_LABEL_141;
        if (((List) (obj)).isEmpty())
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Class %s does not contain any methods annotated with @Subscribe", new Object[] {
            class1.getSimpleName()
        });
        subscriberMethodCache.put(class1, obj);
        map;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void processRegistration(final HandlerRegistration handlerRegistration)
    {
        lock.readLock().lock();
        final RegistrationCallback callback = (RegistrationCallback)eventRegistrationCallbacksByEvent.get(handlerRegistration.getEventType());
        lock.readLock().unlock();
        if (callback != null)
        {
            handler.post(new Runnable() {

                final EventBus this$0;
                final RegistrationCallback val$callback;
                final HandlerRegistration val$handlerRegistration;

                public final void run()
                {
                    callback.handleRegistration(handlerRegistration.getEventId());
                }

            
            {
                this$0 = EventBus.this;
                callback = registrationcallback;
                handlerRegistration = handlerregistration;
                super();
            }
            });
        }
        return;
        handlerRegistration;
        lock.readLock().unlock();
        throw handlerRegistration;
    }

    private HandlerRegistration registerInternal(Object obj, Class class1, Object obj1, EventHandler eventhandler)
    {
        obj1 = new HandlerRegistration(obj, class1, obj1, eventhandler);
        lock.writeLock().lock();
        handlersByType.put(class1, obj1);
        handlersByOwner.put(obj, obj1);
        lock.writeLock().unlock();
        processRegistration(((HandlerRegistration) (obj1)));
        return ((HandlerRegistration) (obj1));
        obj;
        lock.writeLock().unlock();
        throw obj;
    }

    private void unregister(Collection collection)
    {
        HandlerRegistration handlerregistration;
        for (collection = collection.iterator(); collection.hasNext(); handlersByOwner.remove(handlerregistration.getTarget(), handlerregistration))
        {
            handlerregistration = (HandlerRegistration)collection.next();
            Class class1 = handlerregistration.getEventType();
            handlersByType.remove(class1, handlerregistration);
        }

    }

    public final void post(Object obj)
    {
        post(DEFAULT_EVENT_ID, obj);
    }

    public final void post(final Object eventId, final Object event)
    {
        eventId = new Runnable() {

            final EventBus this$0;
            final Object val$event;
            final Object val$eventId;

            public final void run()
            {
                lock.readLock().lock();
                Object obj = ImmutableList.copyOf(handlersByType.get(event.getClass()));
                lock.readLock().unlock();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    HandlerRegistration handlerregistration = (HandlerRegistration)((Iterator) (obj)).next();
                    Object obj1 = handlerregistration.getEventId();
                    if (obj1.equals(eventId) || obj1.equals(EventBus.DEFAULT_EVENT_ID))
                    {
                        handlerregistration.getEventHandler().handleEvent(event);
                    }
                } while (true);
                break MISSING_BLOCK_LABEL_145;
                Exception exception;
                exception;
                lock.readLock().unlock();
                throw exception;
            }

            
            {
                this$0 = EventBus.this;
                event = obj;
                eventId = obj1;
                super();
            }
        };
        handler.post(((Runnable) (eventId)));
    }

    public final HandlerRegistration register(Object obj, Class class1, EventHandler eventhandler)
    {
        return register(obj, class1, DEFAULT_EVENT_ID, eventhandler);
    }

    public final HandlerRegistration register(Object obj, Class class1, Object obj1, EventHandler eventhandler)
    {
        return registerInternal(obj, class1, obj1, eventhandler);
    }

    public final void register(Object obj)
    {
        register(obj, obj.getClass());
    }

    public final void register(Object obj, Class class1)
    {
        Preconditions.checkArgument(class1.isAssignableFrom(obj.getClass()), "clazz must be a superclass of target");
        lock.writeLock().lock();
        MethodWrapper methodwrapper;
        for (class1 = getSubscriberMethods(class1).iterator(); class1.hasNext(); registerInternal(obj, methodwrapper.eventType, DEFAULT_EVENT_ID, new MethodEventHandler(obj, methodwrapper.method)))
        {
            methodwrapper = (MethodWrapper)class1.next();
        }

        break MISSING_BLOCK_LABEL_101;
        obj;
        lock.writeLock().unlock();
        throw obj;
        lock.writeLock().unlock();
        return;
    }

    public final void registerEventProducer(final Class eventIds, final RegistrationCallback callback)
    {
        lock.writeLock().lock();
        Object obj = (RegistrationCallback)eventRegistrationCallbacksByEvent.put(eventIds, callback);
        lock.writeLock().unlock();
        boolean flag;
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Can't register multiple event producers for event type: %s", new Object[] {
            eventIds.getName()
        });
        lock.readLock().lock();
        obj = ImmutableSet.copyOf(handlersByType.get(eventIds));
        lock.readLock().unlock();
        if (((Set) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_257;
        }
        WLog.dfmt(TAG, "Subscriber %s registered before producer for event type %s, posting callback now", new Object[] {
            ((HandlerRegistration)Iterables.getFirst(((Iterable) (obj)), null)).getTarget().getClass().getSimpleName(), eventIds
        });
        eventIds = Sets.newHashSet();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); eventIds.add(((HandlerRegistration)((Iterator) (obj)).next()).getEventId())) { }
        break MISSING_BLOCK_LABEL_239;
        eventIds;
        lock.writeLock().unlock();
        throw eventIds;
        eventIds;
        lock.readLock().unlock();
        throw eventIds;
        handler.post(new Runnable() {

            final EventBus this$0;
            final RegistrationCallback val$callback;
            final Set val$eventIds;

            public final void run()
            {
                Object obj1;
                for (Iterator iterator = eventIds.iterator(); iterator.hasNext(); callback.handleRegistration(obj1))
                {
                    obj1 = iterator.next();
                }

            }

            
            {
                this$0 = EventBus.this;
                eventIds = set;
                callback = registrationcallback;
                super();
            }
        });
    }

    public final transient void unregister(HandlerRegistration ahandlerregistration[])
    {
        ahandlerregistration = Arrays.asList(ahandlerregistration);
        lock.writeLock().lock();
        unregister(((Collection) (ahandlerregistration)));
        lock.writeLock().unlock();
        return;
        ahandlerregistration;
        lock.writeLock().unlock();
        throw ahandlerregistration;
    }

    public final void unregisterAll(Object obj)
    {
        lock.writeLock().lock();
        unregister(ImmutableSet.copyOf(handlersByOwner.get(obj)));
        lock.writeLock().unlock();
        return;
        obj;
        lock.writeLock().unlock();
        throw obj;
    }



}
