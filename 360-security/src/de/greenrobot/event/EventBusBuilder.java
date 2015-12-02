// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package de.greenrobot.event:
//            EventBus, EventBusException

public class EventBusBuilder
{

    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = Executors.newCachedThreadPool();
    boolean eventInheritance;
    ExecutorService executorService;
    boolean logNoSubscriberMessages;
    boolean logSubscriberExceptions;
    boolean sendNoSubscriberEvent;
    boolean sendSubscriberExceptionEvent;
    List skipMethodVerificationForClasses;
    boolean throwSubscriberException;

    EventBusBuilder()
    {
        logSubscriberExceptions = true;
        logNoSubscriberMessages = true;
        sendSubscriberExceptionEvent = true;
        sendNoSubscriberEvent = true;
        eventInheritance = true;
        executorService = DEFAULT_EXECUTOR_SERVICE;
    }

    public EventBus build()
    {
        return new EventBus(this);
    }

    public EventBusBuilder eventInheritance(boolean flag)
    {
        eventInheritance = flag;
        return this;
    }

    public EventBusBuilder executorService(ExecutorService executorservice)
    {
        executorService = executorservice;
        return this;
    }

    public EventBus installDefaultEventBus()
    {
        de/greenrobot/event/EventBus;
        JVM INSTR monitorenter ;
        if (EventBus.defaultInstance != null)
        {
            throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        de/greenrobot/event/EventBus;
        JVM INSTR monitorexit ;
        throw exception;
        EventBus eventbus;
        EventBus.defaultInstance = build();
        eventbus = EventBus.defaultInstance;
        de/greenrobot/event/EventBus;
        JVM INSTR monitorexit ;
        return eventbus;
    }

    public EventBusBuilder logNoSubscriberMessages(boolean flag)
    {
        logNoSubscriberMessages = flag;
        return this;
    }

    public EventBusBuilder logSubscriberExceptions(boolean flag)
    {
        logSubscriberExceptions = flag;
        return this;
    }

    public EventBusBuilder sendNoSubscriberEvent(boolean flag)
    {
        sendNoSubscriberEvent = flag;
        return this;
    }

    public EventBusBuilder sendSubscriberExceptionEvent(boolean flag)
    {
        sendSubscriberExceptionEvent = flag;
        return this;
    }

    public EventBusBuilder skipMethodVerificationFor(Class class1)
    {
        if (skipMethodVerificationForClasses == null)
        {
            skipMethodVerificationForClasses = new ArrayList();
        }
        skipMethodVerificationForClasses.add(class1);
        return this;
    }

    public EventBusBuilder throwSubscriberException(boolean flag)
    {
        throwSubscriberException = flag;
        return this;
    }

}
