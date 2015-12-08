// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Notification;
import rx.Subscriber;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

// Referenced classes of package rx.internal.operators:
//            BackpressureUtils

class child extends Subscriber
{

    private static final AtomicLongFieldUpdater REQUESTED = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OperatorMaterialize$ParentSubscriber, "requested");
    private boolean busy;
    private final Subscriber child;
    private boolean missed;
    private volatile long requested;
    private volatile Notification terminalNotification;

    private void decrementRequested()
    {
        long l;
        do
        {
            l = requested;
            if (l == 0x7fffffffffffffffL)
            {
                return;
            }
        } while (!REQUESTED.compareAndSet(this, l, l - 1L));
    }

    private void drain()
    {
        this;
        JVM INSTR monitorenter ;
        if (!busy)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        missed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
_L2:
        if (child.isUnsubscribed())
        {
            break; /* Loop/switch isn't completed */
        }
        Notification notification = terminalNotification;
        if (notification != null && requested > 0L)
        {
            terminalNotification = null;
            child.onNext(notification);
            if (!child.isUnsubscribed())
            {
                child.onCompleted();
                return;
            }
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_83;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorenter ;
        if (missed)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        busy = false;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onCompleted()
    {
        terminalNotification = Notification.createOnCompleted();
        drain();
    }

    public void onError(Throwable throwable)
    {
        terminalNotification = Notification.createOnError(throwable);
        RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
        drain();
    }

    public void onNext(Object obj)
    {
        child.onNext(Notification.createOnNext(obj));
        decrementRequested();
    }

    public void onStart()
    {
        request(0L);
    }

    void requestMore(long l)
    {
        BackpressureUtils.getAndAddRequest(REQUESTED, this, l);
        request(l);
        drain();
    }


    (Subscriber subscriber)
    {
        busy = false;
        missed = false;
        child = subscriber;
    }
}
