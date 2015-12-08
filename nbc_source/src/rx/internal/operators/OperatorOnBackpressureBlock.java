// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import rx.Subscriber;
import rx.internal.util.BackpressureDrainManager;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

public class OperatorOnBackpressureBlock
    implements rx.Observable.Operator
{
    static final class BlockingSubscriber extends Subscriber
        implements rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
    {

        final Subscriber child;
        final BackpressureDrainManager manager = new BackpressureDrainManager(this);
        final NotificationLite nl = NotificationLite.instance();
        final BlockingQueue queue;

        public boolean accept(Object obj)
        {
            return nl.accept(child, obj);
        }

        public void complete(Throwable throwable)
        {
            if (throwable != null)
            {
                child.onError(throwable);
                return;
            } else
            {
                child.onCompleted();
                return;
            }
        }

        void init()
        {
            child.add(this);
            child.setProducer(manager);
        }

        public void onCompleted()
        {
            manager.terminateAndDrain();
        }

        public void onError(Throwable throwable)
        {
            manager.terminateAndDrain(throwable);
        }

        public void onNext(Object obj)
        {
            queue.put(nl.next(obj));
            manager.drain();
_L1:
            return;
            obj;
            if (!isUnsubscribed())
            {
                onError(((Throwable) (obj)));
                return;
            }
              goto _L1
        }

        public Object peek()
        {
            return queue.peek();
        }

        public Object poll()
        {
            return queue.poll();
        }

        public BlockingSubscriber(int i, Subscriber subscriber)
        {
            queue = new ArrayBlockingQueue(i);
            child = subscriber;
        }
    }


    final int max;

    public OperatorOnBackpressureBlock(int i)
    {
        max = i;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        subscriber = new BlockingSubscriber(max, subscriber);
        subscriber.init();
        return subscriber;
    }
}
