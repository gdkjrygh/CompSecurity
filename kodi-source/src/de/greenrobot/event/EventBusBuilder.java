// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

}
