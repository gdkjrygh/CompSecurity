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
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package de.greenrobot.event:
//            ThreadMode, EventBusBuilder, HandlerPoster, BackgroundPoster, 
//            AsyncPoster, SubscriberMethodFinder, SubscriberExceptionEvent, Subscription, 
//            EventBusException, NoSubscriberEvent, SubscriberMethod, PendingPost

public class EventBus
{
    static interface PostCallback
    {

        public abstract void onPostCompleted(List list);
    }

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


    private static int $SWITCH_TABLE$de$greenrobot$event$ThreadMode[];
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

    static int[] $SWITCH_TABLE$de$greenrobot$event$ThreadMode()
    {
        int ai[] = $SWITCH_TABLE$de$greenrobot$event$ThreadMode;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[ThreadMode.values().length];
        try
        {
            ai[ThreadMode.Async.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[ThreadMode.BackgroundThread.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[ThreadMode.MainThread.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[ThreadMode.PostThread.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$de$greenrobot$event$ThreadMode = ai;
        return ai;
    }

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
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            Class class1 = aclass[i];
            if (!list.contains(class1))
            {
                list.add(class1);
                addInterfaces(list, class1.getInterfaces());
            }
            i++;
        } while (true);
    }

    public static EventBusBuilder builder()
    {
        return new EventBusBuilder();
    }

    private void checkPostStickyEventToSubscription(Subscription subscription, Object obj)
    {
        if (obj != null)
        {
            boolean flag;
            if (Looper.getMainLooper() == Looper.myLooper())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            postToSubscription(subscription, obj, flag);
        }
    }

    public static void clearCaches()
    {
        SubscriberMethodFinder.clearCaches();
        eventTypesCache.clear();
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
                Log.e(TAG, (new StringBuilder("SubscriberExceptionEvent subscriber ")).append(subscription.subscriber.getClass()).append(" threw an exception").toString(), throwable);
                subscription = (SubscriberExceptionEvent)obj;
                Log.e(TAG, (new StringBuilder("Initial event ")).append(((SubscriberExceptionEvent) (subscription)).causingEvent).append(" caused exception in ").append(((SubscriberExceptionEvent) (subscription)).causingSubscriber).toString(), ((SubscriberExceptionEvent) (subscription)).throwable);
            }
        } else
        {
            if (throwSubscriberException)
            {
                throw new EventBusException("Invoking subscriber failed", throwable);
            }
            if (logSubscriberExceptions)
            {
                Log.e(TAG, (new StringBuilder("Could not dispatch event: ")).append(obj.getClass()).append(" to subscribing class ").append(subscription.subscriber.getClass()).toString(), throwable);
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
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = new ArrayList();
        obj = class1;
_L6:
        if (obj != null) goto _L4; else goto _L3
_L3:
        eventTypesCache.put(class1, obj1);
        obj = obj1;
_L2:
        map;
        JVM INSTR monitorexit ;
        return ((List) (obj));
_L4:
        ((List) (obj1)).add(obj);
        addInterfaces(((List) (obj1)), ((Class) (obj)).getInterfaces());
        obj = ((Class) (obj)).getSuperclass();
        if (true) goto _L6; else goto _L5
_L5:
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    private void postSingleEvent(Object obj, PostingThreadState postingthreadstate)
        throws Error
    {
        Class class1;
        List list;
        int i;
        int j;
        boolean flag;
        class1 = obj.getClass();
        if (!eventInheritance)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        list = lookupAllEventTypes(class1);
        j = list.size();
        i = 0;
        flag = false;
_L3:
        if (i < j) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            if (logNoSubscriberMessages)
            {
                Log.d(TAG, (new StringBuilder("No subscribers registered for event ")).append(class1).toString());
            }
            if (sendNoSubscriberEvent && class1 != de/greenrobot/event/NoSubscriberEvent && class1 != de/greenrobot/event/SubscriberExceptionEvent)
            {
                post(new NoSubscriberEvent(this, obj));
            }
        }
        return;
_L2:
        flag |= postSingleEventForEventType(obj, postingthreadstate, (Class)list.get(i));
        i++;
          goto _L3
        flag = postSingleEventForEventType(obj, postingthreadstate, class1);
          goto _L1
    }

    private boolean postSingleEventForEventType(Object obj, PostingThreadState postingthreadstate, Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        class1 = (CopyOnWriteArrayList)subscriptionsByEventType.get(class1);
        this;
        JVM INSTR monitorexit ;
        if (class1 == null || class1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_130;
        }
        class1 = class1.iterator();
_L3:
        if (class1.hasNext()) goto _L2; else goto _L1
_L1:
        return true;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        Subscription subscription;
        subscription = (Subscription)class1.next();
        postingthreadstate.event = obj;
        postingthreadstate.subscription = subscription;
        boolean flag;
        postToSubscription(subscription, obj, postingthreadstate.isMainThread);
        flag = postingthreadstate.canceled;
        postingthreadstate.event = null;
        postingthreadstate.subscription = null;
        postingthreadstate.canceled = false;
        if (!flag) goto _L3; else goto _L1
        obj;
        postingthreadstate.event = null;
        postingthreadstate.subscription = null;
        postingthreadstate.canceled = false;
        throw obj;
        return false;
    }

    private void postToSubscription(Subscription subscription, Object obj, boolean flag)
    {
        switch ($SWITCH_TABLE$de$greenrobot$event$ThreadMode()[subscription.subscriberMethod.threadMode.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown thread mode: ")).append(subscription.subscriberMethod.threadMode).toString());

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
        Iterator iterator = subscriberMethodFinder.findSubscriberMethods(obj.getClass()).iterator();
_L1:
        boolean flag1 = iterator.hasNext();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        subscribe(obj, (SubscriberMethod)iterator.next(), flag, i);
          goto _L1
        obj;
        throw obj;
    }

    private void subscribe(Object obj, SubscriberMethod subscribermethod, boolean flag, int i)
    {
        Object obj1;
        Class class1;
        Subscription subscription;
        class1 = subscribermethod.eventType;
        obj1 = (CopyOnWriteArrayList)subscriptionsByEventType.get(class1);
        subscription = new Subscription(obj, subscribermethod, i);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        subscribermethod = new CopyOnWriteArrayList();
        subscriptionsByEventType.put(class1, subscribermethod);
_L13:
        int j;
        j = subscribermethod.size();
        i = 0;
_L11:
        if (i <= j)
        {
label0:
            {
                if (i != j && subscription.priority <= ((Subscription)subscribermethod.get(i)).priority)
                {
                    break label0;
                }
                subscribermethod.add(i, subscription);
            }
        }
        obj1 = (List)typesBySubscriber.get(obj);
        subscribermethod = ((SubscriberMethod) (obj1));
        if (obj1 == null)
        {
            subscribermethod = new ArrayList();
            typesBySubscriber.put(obj, subscribermethod);
        }
        subscribermethod.add(class1);
        if (!flag) goto _L4; else goto _L3
_L3:
        if (!eventInheritance) goto _L6; else goto _L5
_L5:
        obj = stickyEvents.entrySet().iterator();
_L9:
        if (((Iterator) (obj)).hasNext()) goto _L7; else goto _L4
_L4:
        return;
_L2:
        if (((CopyOnWriteArrayList) (obj1)).contains(subscription))
        {
            throw new EventBusException((new StringBuilder("Subscriber ")).append(obj.getClass()).append(" already registered to event ").append(class1).toString());
        }
        break; /* Loop/switch isn't completed */
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        subscribermethod = (java.util.Map.Entry)((Iterator) (obj)).next();
        if (class1.isAssignableFrom((Class)subscribermethod.getKey()))
        {
            checkPostStickyEventToSubscription(subscription, subscribermethod.getValue());
        }
        if (true) goto _L9; else goto _L8
_L8:
        break; /* Loop/switch isn't completed */
_L6:
        checkPostStickyEventToSubscription(subscription, stickyEvents.get(class1));
        return;
        if (true) goto _L11; else goto _L10
_L10:
        subscribermethod = ((SubscriberMethod) (obj1));
        if (true) goto _L13; else goto _L12
_L12:
    }

    private void unubscribeByEventType(Object obj, Class class1)
    {
        class1 = (List)subscriptionsByEventType.get(class1);
        if (class1 == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = class1.size();
        j = 0;
_L5:
        if (j < i) goto _L3; else goto _L2
_L2:
        return;
_L3:
        Subscription subscription = (Subscription)class1.get(j);
        if (subscription.subscriber == obj)
        {
            subscription.active = false;
            class1.remove(j);
            j--;
            i--;
        }
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void cancelEventDelivery(Object obj)
    {
        PostingThreadState postingthreadstate = (PostingThreadState)currentPostingThreadState.get();
        if (!postingthreadstate.isPosting)
        {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null)
        {
            throw new EventBusException("Event may not be null");
        }
        if (postingthreadstate.event != obj)
        {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (postingthreadstate.subscription.subscriberMethod.threadMode != ThreadMode.PostThread)
        {
            throw new EventBusException(" event handlers may only abort the incoming event");
        } else
        {
            postingthreadstate.canceled = true;
            return;
        }
    }

    ExecutorService getExecutorService()
    {
        return executorService;
    }

    public Object getStickyEvent(Class class1)
    {
        synchronized (stickyEvents)
        {
            class1 = ((Class) (class1.cast(stickyEvents.get(class1))));
        }
        return class1;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public boolean hasSubscriberForEvent(Class class1)
    {
        class1 = lookupAllEventTypes(class1);
        if (class1 == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = class1.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        Object obj = (Class)class1.get(i);
        this;
        JVM INSTR monitorenter ;
        obj = (CopyOnWriteArrayList)subscriptionsByEventType.get(obj);
        this;
        JVM INSTR monitorexit ;
        if (obj != null && !((CopyOnWriteArrayList) (obj)).isEmpty())
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_75;
        class1;
        this;
        JVM INSTR monitorexit ;
        throw class1;
        i++;
        if (true) goto _L5; else goto _L4
_L4:
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

    public boolean isRegistered(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = typesBySubscriber.containsKey(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
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
            break MISSING_BLOCK_LABEL_113;
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
          goto _L1
_L3:
        boolean flag1;
        postSingleEvent(list.remove(0), postingthreadstate);
_L1:
        if (!(flag1 = list.isEmpty())) goto _L3; else goto _L2
_L2:
        postingthreadstate.isPosting = false;
        postingthreadstate.isMainThread = false;
        return;
        obj;
        postingthreadstate.isPosting = false;
        postingthreadstate.isMainThread = false;
        throw obj;
    }

    public void postSticky(Object obj)
    {
        synchronized (stickyEvents)
        {
            stickyEvents.put(obj.getClass(), obj);
        }
        post(obj);
        return;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void register(Object obj)
    {
        register(obj, false, 0);
    }

    public void register(Object obj, int i)
    {
        register(obj, false, i);
    }

    public void registerSticky(Object obj)
    {
        register(obj, true, 0);
    }

    public void registerSticky(Object obj, int i)
    {
        register(obj, true, i);
    }

    public void removeAllStickyEvents()
    {
        synchronized (stickyEvents)
        {
            stickyEvents.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object removeStickyEvent(Class class1)
    {
        synchronized (stickyEvents)
        {
            class1 = ((Class) (class1.cast(stickyEvents.remove(class1))));
        }
        return class1;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public boolean removeStickyEvent(Object obj)
    {
        Map map = stickyEvents;
        map;
        JVM INSTR monitorenter ;
        Class class1 = obj.getClass();
        if (!obj.equals(stickyEvents.get(class1)))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        stickyEvents.remove(class1);
        return true;
        map;
        JVM INSTR monitorexit ;
        return false;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
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
        obj1 = ((List) (obj1)).iterator();
_L3:
        if (((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        typesBySubscriber.remove(obj);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        unubscribeByEventType(obj, (Class)((Iterator) (obj1)).next());
          goto _L3
        obj;
        throw obj;
        Log.w(TAG, (new StringBuilder("Subscriber to unregister was not registered before: ")).append(obj.getClass()).toString());
          goto _L4
    }

}
