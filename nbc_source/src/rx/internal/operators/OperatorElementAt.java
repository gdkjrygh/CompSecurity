// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Producer;
import rx.Subscriber;

public final class OperatorElementAt
    implements rx.Observable.Operator
{
    static class InnerProducer extends AtomicBoolean
        implements Producer
    {

        private static final long serialVersionUID = 1L;
        final Producer actual;

        public void request(long l)
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (l > 0L && compareAndSet(false, true))
            {
                actual.request(0x7fffffffffffffffL);
            }
        }

        public InnerProducer(Producer producer)
        {
            actual = producer;
        }
    }


    private final Object defaultValue;
    private final boolean hasDefault;
    private final int index;

    public OperatorElementAt(int i)
    {
        this(i, null, false);
    }

    public OperatorElementAt(int i, Object obj)
    {
        this(i, obj, true);
    }

    private OperatorElementAt(int i, Object obj, boolean flag)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append(i).append(" is out of bounds").toString());
        } else
        {
            index = i;
            defaultValue = obj;
            hasDefault = flag;
            return;
        }
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber child)
    {
        Subscriber subscriber = new Subscriber() {

            private int currentIndex;
            final OperatorElementAt this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
label0:
                {
                    if (currentIndex <= index)
                    {
                        if (!hasDefault)
                        {
                            break label0;
                        }
                        child.onNext(defaultValue);
                        child.onCompleted();
                    }
                    return;
                }
                child.onError(new IndexOutOfBoundsException((new StringBuilder()).append(index).append(" is out of bounds").toString()));
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                int i = currentIndex;
                currentIndex = i + 1;
                if (i == index)
                {
                    child.onNext(obj);
                    child.onCompleted();
                    unsubscribe();
                }
            }

            public void setProducer(Producer producer)
            {
                child.setProducer(new InnerProducer(producer));
            }

            
            {
                this$0 = OperatorElementAt.this;
                child = subscriber;
                super();
                currentIndex = 0;
            }
        };
        child.add(subscriber);
        return subscriber;
    }



}
