// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package de.greenrobot.event:
//            EventBusBuilder, HandlerPoster, BackgroundPoster, AsyncPoster, 
//            SubscriberMethodFinder, SubscriberExceptionEvent, Subscription, EventBusException, 
//            NoSubscriberEvent, SubscriberMethod, ThreadMode, PendingPost

public class EventBus
{
    static final class PostingThreadState
    {

        boolean canceled;
        Object event;
        final List eventQueue = new ArrayList();
        boolean isMainThread;
        boolean isPosting;
        Subscription subscription;

        PostingThreadState()
        {
        }
    }


    private static final EventBusBuilder DEFAULT_BUILDER = new EventBusBuilder();
    public static String TAG = "Event";
    static volatile EventBus defaultInstance;
    private static final Map eventTypesCache = new HashMap();
    private final AsyncPoster asyncPoster;
    private final BackgroundPoster backgroundPoster;
    private final ThreadLocal currentPostingThreadState;
    private final boolean eventInheritance;
    private final ExecutorService executorService;
    private final boolean logNoSubscriberMessages;
    private final boolean logSubscriberExceptions;
    private final HandlerPoster mainThreadPoster;
    private final boolean sendNoSubscriberEvent;
    private final boolean sendSubscriberExceptionEvent;
    private final Map stickyEvents;
    private final SubscriberMethodFinder subscriberMethodFinder;
    private final Map subscriptionsByEventType;
    private final boolean throwSubscriberException;
    private final Map typesBySubscriber;

    public EventBus()
    {
        this(DEFAULT_BUILDER);
    }

    EventBus(EventBusBuilder eventbusbuilder)
    {
        currentPostingThreadState = new ThreadLocal() {

            final EventBus this$0;

            protected PostingThreadState initialValue()
            {
                return new PostingThreadState();
            }

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            
            {
                this$0 = EventBus.this;
                super();
            }
        };
        subscriptionsByEventType = new HashMap();
        typesBySubscriber = new HashMap();
        stickyEvents = new ConcurrentHashMap();
        mainThreadPoster = new HandlerPoster(this, Looper.getMainLooper(), 10);
        backgroundPoster = new BackgroundPoster(this);
        asyncPoster = new AsyncPoster(this);
        subscriberMethodFinder = new SubscriberMethodFinder(eventbusbuilder.skipMethodVerificationForClasses);
        logSubscriberExceptions = eventbusbuilder.logSubscriberExceptions;
        logNoSubscriberMessages = eventbusbuilder.logNoSubscriberMessages;
        sendSubscriberExceptionEvent = eventbusbuilder.sendSubscriberExceptionEvent;
        sendNoSubscriberEvent = eventbusbuilder.sendNoSubscriberEvent;
        throwSubscriberException = eventbusbuilder.throwSubscriberException;
        eventInheritance = eventbusbuilder.eventInheritance;
        executorService = eventbusbuilder.executorService;
    }

    static void addInterfaces(List list, Class aclass[])
    {
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = aclass[i];
            if (!list.contains(class1))
            {
                list.add(class1);
                addInterfaces(list, class1.getInterfaces());
            }
        }

    }

    public static EventBus getDefault()
    {
        if (defaultInstance != null) goto _L2; else goto _L1
_L1:
        de/greenrobot/event/EventBus;
        JVM INSTR monitorenter ;
        if (defaultInstance == null)
        {
            defaultInstance = new EventBus();
        }
        de/greenrobot/event/EventBus;
        JVM INSTR monitorexit ;
_L2:
        return defaultInstance;
        Exception exception;
        exception;
        de/greenrobot/event/EventBus;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void handleSubscriberException(Subscription subscription, Object obj, Throwable throwable)
    {
        if (obj instanceof SubscriberExceptionEvent)
        {
            if (logSubscriberExceptions)
            {
                Log.e(TAG, (new StringBuilder()).append("SubscriberExceptionEvent subscriber ").append(subscription.subscriber.getClass()).append(" threw an exception").toString(), throwable);
                subscription = (SubscriberExceptionEvent)obj;
                Log.e(TAG, (new StringBuilder()).append("Initial event ").append(((SubscriberExceptionEvent) (subscription)).causingEvent).append(" caused exception in ").append(((SubscriberExceptionEvent) (subscription)).causingSubscriber).toString(), ((SubscriberExceptionEvent) (subscription)).throwable);
            }
        } else
        {
            if (throwSubscriberException)
            {
                throw new EventBusException("Invoking subscriber failed", throwable);
            }
            if (logSubscriberExceptions)
            {
                Log.e(TAG, (new StringBuilder()).append("Could not dispatch event: ").append(obj.getClass()).append(" to subscribing class ").append(subscription.subscriber.getClass()).toString(), throwable);
            }
            if (sendSubscriberExceptionEvent)
            {
                post(new SubscriberExceptionEvent(this, throwable, obj, subscription.subscriber));
                return;
            }
        }
    }

    private List lookupAllEventTypes(Class class1)
    {
        Map map = eventTypesCache;
        map;
        JVM INSTR monitorenter ;
        Object obj1 = (List)eventTypesCache.get(class1);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj1 = new ArrayList();
        obj = class1;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        ((List) (obj1)).add(obj);
        addInterfaces(((List) (obj1)), ((Class) (obj)).getInterfaces());
        obj = ((Class) (obj)).getSuperclass();
          goto _L1
        eventTypesCache.put(class1, obj1);
        obj = obj1;
        map;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    private void postSingleEvent(Object obj, PostingThreadState postingthreadstate)
        throws Error
    {
        Class class1 = obj.getClass();
        boolean flag = false;
        boolean flag1;
        if (eventInheritance)
        {
            List list = lookupAllEventTypes(class1);
            int j = list.size();
            int i = 0;
            do
            {
                flag1 = flag;
                if (i >= j)
                {
                    break;
                }
                flag |= postSingleEventForEventType(obj, postingthreadstate, (Class)list.get(i));
                i++;
            } while (true);
        } else
        {
            flag1 = postSingleEventForEventType(obj, postingthreadstate, class1);
        }
        if (!flag1)
        {
            if (logNoSubscriberMessages)
            {
                Log.d(TAG, (new StringBuilder()).append("No subscribers registered for event ").append(class1).toString());
            }
            if (sendNoSubscriberEvent && class1 != de/greenrobot/event/NoSubscriberEvent && class1 != de/greenrobot/event/SubscriberExceptionEvent)
            {
                post(new NoSubscriberEvent(this, obj));
            }
        }
    }

    private boolean postSingleEventForEventType(Object obj, PostingThreadState postingthreadstate, Class class1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        class1 = (CopyOnWriteArrayList)subscriptionsByEventType.get(class1);
        this;
        JVM INSTR monitorexit ;
        boolean flag;
        flag = flag1;
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        flag = flag1;
        if (class1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        class1 = class1.iterator();
_L2:
        Subscription subscription;
        if (!class1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        subscription = (Subscription)class1.next();
        postingthreadstate.event = obj;
        postingthreadstate.subscription = subscription;
        postToSubscription(subscription, obj, postingthreadstate.isMainThread);
        flag = postingthreadstate.canceled;
        postingthreadstate.event = null;
        postingthreadstate.subscription = null;
        postingthreadstate.canceled = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = true;
        return flag;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        postingthreadstate.event = null;
        postingthreadstate.subscription = null;
        postingthreadstate.canceled = false;
        throw obj;
    }

    private void postToSubscription(Subscription subscription, Object obj, boolean flag)
    {
        static class _cls2
        {

            static final int $SwitchMap$de$greenrobot$event$ThreadMode[];

            static 
            {
                $SwitchMap$de$greenrobot$event$ThreadMode = new int[ThreadMode.values().length];
                try
                {
                    $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.PostThread.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.MainThread.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.BackgroundThread.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.Async.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.de.greenrobot.event.ThreadMode[subscription.subscriberMethod.threadMode.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown thread mode: ").append(subscription.subscriberMethod.threadMode).toString());

        case 1: // '\001'
            invokeSubscriber(subscription, obj);
            return;

        case 2: // '\002'
            if (flag)
            {
                invokeSubscriber(subscription, obj);
                return;
            } else
            {
                mainThreadPoster.enqueue(subscription, obj);
                return;
            }

        case 3: // '\003'
            if (flag)
            {
                backgroundPoster.enqueue(subscription, obj);
                return;
            } else
            {
                invokeSubscriber(subscription, obj);
                return;
            }

        case 4: // '\004'
            asyncPoster.enqueue(subscription, obj);
            return;
        }
    }

    private void register(Object obj, boolean flag, int i)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = subscriberMethodFinder.findSubscriberMethods(obj.getClass()).iterator(); iterator.hasNext(); subscribe(obj, (SubscriberMethod)iterator.next(), flag, i)) { }
        break MISSING_BLOCK_LABEL_55;
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
    }

    private void subscribe(Object obj, SubscriberMethod subscribermethod, boolean flag, int i)
    {
        Class class1 = subscribermethod.eventType;
        Object obj1 = (CopyOnWriteArrayList)subscriptionsByEventType.get(class1);
        Subscription subscription = new Subscription(obj, subscribermethod, i);
        int j;
        if (obj1 == null)
        {
            subscribermethod = new CopyOnWriteArrayList();
            subscriptionsByEventType.put(class1, subscribermethod);
        } else
        {
            subscribermethod = ((SubscriberMethod) (obj1));
            if (((CopyOnWriteArrayList) (obj1)).contains(subscription))
            {
                throw new EventBusException((new StringBuilder()).append("Subscriber ").append(obj.getClass()).append(" already registered to event ").append(class1).toString());
            }
        }
        j = subscribermethod.size();
        i = 0;
        do
        {
label0:
            {
                if (i <= j)
                {
                    if (i != j && subscription.priority <= ((Subscription)subscribermethod.get(i)).priority)
                    {
                        break label0;
                    }
                    subscribermethod.add(i, subscription);
                }
                obj1 = (List)typesBySubscriber.get(obj);
                subscribermethod = ((SubscriberMethod) (obj1));
                if (obj1 == null)
                {
                    subscribermethod = new ArrayList();
                    typesBySubscriber.put(obj, subscribermethod);
                }
                subscribermethod.add(class1);
                if (flag)
                {
                    synchronized (stickyEvents)
                    {
                        subscribermethod = ((SubscriberMethod) (stickyEvents.get(class1)));
                    }
                    if (subscribermethod != null)
                    {
                        if (Looper.getMainLooper() == Looper.myLooper())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        postToSubscription(subscription, subscribermethod, flag);
                    }
                }
                return;
            }
            i++;
        } while (true);
        subscribermethod;
        obj;
        JVM INSTR monitorexit ;
        throw subscribermethod;
    }

    private void unubscribeByEventType(Object obj, Class class1)
    {
        class1 = (List)subscriptionsByEventType.get(class1);
        if (class1 != null)
        {
            int j = class1.size();
            int k;
            for (int i = 0; i < j; j = k)
            {
                Subscription subscription = (Subscription)class1.get(i);
                int l = i;
                k = j;
                if (subscription.subscriber == obj)
                {
                    subscription.active = false;
                    class1.remove(i);
                    l = i - 1;
                    k = j - 1;
                }
                i = l + 1;
            }

        }
    }

    ExecutorService getExecutorService()
    {
        return executorService;
    }

    void invokeSubscriber(PendingPost pendingpost)
    {
        Object obj = pendingpost.event;
        Subscription subscription = pendingpost.subscription;
        PendingPost.releasePendingPost(pendingpost);
        if (subscription.active)
        {
            invokeSubscriber(subscription, obj);
        }
    }

    void invokeSubscriber(Subscription subscription, Object obj)
    {
        try
        {
            subscription.subscriberMethod.method.invoke(subscription.subscriber, new Object[] {
                obj
            });
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            handleSubscriberException(subscription, obj, invocationtargetexception.getCause());
        }
        // Misplaced declaration of an exception variable
        catch (Subscription subscription)
        {
            throw new IllegalStateException("Unexpected exception", subscription);
        }
    }

    public void post(Object obj)
    {
        PostingThreadState postingthreadstate;
        List list;
        postingthreadstate = (PostingThreadState)currentPostingThreadState.get();
        list = postingthreadstate.eventQueue;
        list.add(obj);
        if (postingthreadstate.isPosting)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        boolean flag;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        postingthreadstate.isMainThread = flag;
        postingthreadstate.isPosting = true;
        if (postingthreadstate.canceled)
        {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        for (; !list.isEmpty(); postSingleEvent(list.remove(0), postingthreadstate)) { }
        break MISSING_BLOCK_LABEL_115;
        obj;
        postingthreadstate.isPosting = false;
        postingthreadstate.isMainThread = false;
        throw obj;
        postingthreadstate.isPosting = false;
        postingthreadstate.isMainThread = false;
    }

    public void register(Object obj)
    {
        register(obj, false, 0);
    }

    public void unregister(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = (List)typesBySubscriber.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); unubscribeByEventType(obj, (Class)((Iterator) (obj1)).next())) { }
        break MISSING_BLOCK_LABEL_58;
        obj;
        throw obj;
        typesBySubscriber.remove(obj);
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Log.w(TAG, (new StringBuilder()).append("Subscriber to unregister was not registered before: ").append(obj.getClass()).toString());
          goto _L1
    }

}
