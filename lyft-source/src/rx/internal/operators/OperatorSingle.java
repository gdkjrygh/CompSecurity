// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Producer;
import rx.Subscriber;

public final class OperatorSingle
    implements rx.Observable.Operator
{

    private final Object defaultValue;
    private final boolean hasDefaultValue;

    private OperatorSingle()
    {
        this(false, null);
    }

    public OperatorSingle(Object obj)
    {
        this(true, obj);
    }


    private OperatorSingle(boolean flag, Object obj)
    {
        hasDefaultValue = flag;
        defaultValue = obj;
    }

    public static OperatorSingle instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        final ParentSubscriber parent = new ParentSubscriber(subscriber, hasDefaultValue, defaultValue);
        subscriber.setProducer(new Producer() {

            private final AtomicBoolean requestedTwo = new AtomicBoolean(false);
            final OperatorSingle this$0;
            final ParentSubscriber val$parent;

            public void request(long l)
            {
                if (l > 0L && requestedTwo.compareAndSet(false, true))
                {
                    parent.requestMore(2L);
                }
            }

            
            {
                this$0 = OperatorSingle.this;
                parent = parentsubscriber;
                super();
            }
        });
        subscriber.add(parent);
        return parent;
    }

    private class Holder
    {

        static final OperatorSingle INSTANCE = new OperatorSingle();


        private Holder()
        {
        }
    }


    private class ParentSubscriber extends Subscriber
    {

        private final Subscriber child;
        private final Object defaultValue;
        private final boolean hasDefaultValue;
        private boolean hasTooManyElements;
        private boolean isNonEmpty;
        private Object value;

        public void onCompleted()
        {
            if (hasTooManyElements)
            {
                return;
            }
            if (isNonEmpty)
            {
                child.onNext(value);
                child.onCompleted();
                return;
            }
            if (hasDefaultValue)
            {
                child.onNext(defaultValue);
                child.onCompleted();
                return;
            } else
            {
                child.onError(new NoSuchElementException("Sequence contains no elements"));
                return;
            }
        }

        public void onError(Throwable throwable)
        {
            child.onError(throwable);
        }

        public void onNext(Object obj)
        {
            if (isNonEmpty)
            {
                hasTooManyElements = true;
                child.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
                return;
            } else
            {
                value = obj;
                isNonEmpty = true;
                return;
            }
        }

        void requestMore(long l)
        {
            request(l);
        }

        ParentSubscriber(Subscriber subscriber, boolean flag, Object obj)
        {
            isNonEmpty = false;
            hasTooManyElements = false;
            child = subscriber;
            hasDefaultValue = flag;
            defaultValue = obj;
        }
    }

}
