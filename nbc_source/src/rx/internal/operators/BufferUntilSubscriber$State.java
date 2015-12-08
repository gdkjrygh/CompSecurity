// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.Observer;

// Referenced classes of package rx.internal.operators:
//            BufferUntilSubscriber, NotificationLite

static final class emitting
{

    static final AtomicReferenceFieldUpdater OBSERVER_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/internal/operators/BufferUntilSubscriber$State, rx/Observer, "observerRef");
    final ConcurrentLinkedQueue buffer = new ConcurrentLinkedQueue();
    boolean emitting;
    Object guard;
    final NotificationLite nl = NotificationLite.instance();
    volatile Observer observerRef;

    boolean casObserverRef(Observer observer, Observer observer1)
    {
        return OBSERVER_UPDATER.compareAndSet(this, observer, observer1);
    }


    dater()
    {
        observerRef = null;
        guard = new Object();
        emitting = false;
    }
}
