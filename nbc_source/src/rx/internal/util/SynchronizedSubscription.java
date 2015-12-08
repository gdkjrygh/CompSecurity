// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Subscription;

public class SynchronizedSubscription
    implements Subscription
{

    private final Subscription s;

    public SynchronizedSubscription(Subscription subscription)
    {
        s = subscription;
    }

    public boolean isUnsubscribed()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = s.isUnsubscribed();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void unsubscribe()
    {
        this;
        JVM INSTR monitorenter ;
        s.unsubscribe();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
