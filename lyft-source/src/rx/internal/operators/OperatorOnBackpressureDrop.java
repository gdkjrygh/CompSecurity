// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action1;

// Referenced classes of package rx.internal.operators:
//            BackpressureUtils

public class OperatorOnBackpressureDrop
    implements rx.Observable.Operator
{

    private final Action1 onDrop;

    private OperatorOnBackpressureDrop()
    {
        this(((Action1) (null)));
    }

    public OperatorOnBackpressureDrop(Action1 action1)
    {
        onDrop = action1;
    }


    public static OperatorOnBackpressureDrop instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        final AtomicLong requested = new AtomicLong();
        final_subscriber.setProducer(new Producer() {

            final OperatorOnBackpressureDrop this$0;
            final AtomicLong val$requested;

            public void request(long l)
            {
                BackpressureUtils.getAndAddRequest(requested, l);
            }

            
            {
                this$0 = OperatorOnBackpressureDrop.this;
                requested = atomiclong;
                super();
            }
        });
        return new Subscriber(requested) {

            final OperatorOnBackpressureDrop this$0;
            final Subscriber val$child;
            final AtomicLong val$requested;

            public void onCompleted()
            {
                child.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                if (requested.get() > 0L)
                {
                    child.onNext(obj);
                    requested.decrementAndGet();
                } else
                if (onDrop != null)
                {
                    onDrop.call(obj);
                    return;
                }
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            
            {
                this$0 = OperatorOnBackpressureDrop.this;
                child = subscriber1;
                requested = atomiclong;
                super(final_subscriber);
            }
        };
    }


    private class Holder
    {

        static final OperatorOnBackpressureDrop INSTANCE = new OperatorOnBackpressureDrop();


        private Holder()
        {
        }
    }

}
