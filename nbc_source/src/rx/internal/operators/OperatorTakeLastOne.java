// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Producer;
import rx.Subscriber;

public class OperatorTakeLastOne
    implements rx.Observable.Operator
{
    private static class Holder
    {

        static final OperatorTakeLastOne INSTANCE = new OperatorTakeLastOne();


        private Holder()
        {
        }
    }

    private static class ParentSubscriber extends Subscriber
    {

        private static final Object ABSENT = new Object();
        private static final int NOT_REQUESTED_COMPLETED = 1;
        private static final int NOT_REQUESTED_NOT_COMPLETED = 0;
        private static final int REQUESTED_COMPLETED = 3;
        private static final int REQUESTED_NOT_COMPLETED = 2;
        private final Subscriber child;
        private Object last;
        private final AtomicInteger state = new AtomicInteger(0);

        private void emit()
        {
            if (!isUnsubscribed()) goto _L2; else goto _L1
_L1:
            last = null;
_L4:
            return;
_L2:
            Object obj = last;
            last = null;
            if (obj == ABSENT)
            {
                continue; /* Loop/switch isn't completed */
            }
            try
            {
                child.onNext(obj);
            }
            catch (Throwable throwable)
            {
                child.onError(throwable);
                return;
            }
            if (isUnsubscribed()) goto _L4; else goto _L3
_L3:
            child.onCompleted();
            return;
        }

        public void onCompleted()
        {
            if (last != ABSENT) goto _L2; else goto _L1
_L1:
            child.onCompleted();
_L4:
            return;
_L2:
            int i;
            do
            {
                i = state.get();
                if (i != 0)
                {
                    continue; /* Loop/switch isn't completed */
                }
            } while (!state.compareAndSet(0, 1));
            return;
            if (i != 2) goto _L4; else goto _L3
_L3:
            if (state.compareAndSet(2, 3))
            {
                emit();
                return;
            }
              goto _L2
            if (true) goto _L4; else goto _L5
_L5:
        }

        public void onError(Throwable throwable)
        {
            child.onError(throwable);
        }

        public void onNext(Object obj)
        {
            last = obj;
        }

        void requestMore(long l)
        {
            if (l <= 0L) goto _L2; else goto _L1
_L1:
            int i = state.get();
            if (i != 0) goto _L4; else goto _L3
_L3:
            if (!state.compareAndSet(0, 2))
            {
                continue; /* Loop/switch isn't completed */
            }
_L2:
            return;
_L4:
            if (i != 1) goto _L2; else goto _L5
_L5:
            if (state.compareAndSet(1, 3))
            {
                emit();
                return;
            }
            if (true) goto _L1; else goto _L6
_L6:
        }


        ParentSubscriber(Subscriber subscriber)
        {
            last = ABSENT;
            child = subscriber;
        }
    }


    private OperatorTakeLastOne()
    {
    }


    public static OperatorTakeLastOne instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        final ParentSubscriber parent = new ParentSubscriber(subscriber);
        subscriber.setProducer(new Producer() {

            final OperatorTakeLastOne this$0;
            final ParentSubscriber val$parent;

            public void request(long l)
            {
                parent.requestMore(l);
            }

            
            {
                this$0 = OperatorTakeLastOne.this;
                parent = parentsubscriber;
                super();
            }
        });
        subscriber.add(parent);
        return parent;
    }
}
