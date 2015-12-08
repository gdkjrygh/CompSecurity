// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.Timestamped;

public class OperatorSkipLastTimed
    implements rx.Observable.Operator
{

    private final Scheduler scheduler;
    private final long timeInMillis;

    public OperatorSkipLastTimed(long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        timeInMillis = timeunit.toMillis(l);
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        return new Subscriber(final_subscriber1) {

            private Deque buffer;
            final OperatorSkipLastTimed this$0;
            final Subscriber val$subscriber;

            private void emitItemsOutOfWindow(long l)
            {
                long l1 = timeInMillis;
                do
                {
                    if (buffer.isEmpty())
                    {
                        break;
                    }
                    Timestamped timestamped = (Timestamped)buffer.getFirst();
                    if (timestamped.getTimestampMillis() >= l - l1)
                    {
                        break;
                    }
                    buffer.removeFirst();
                    subscriber.onNext(timestamped.getValue());
                } while (true);
            }

            public void onCompleted()
            {
                emitItemsOutOfWindow(scheduler.now());
                subscriber.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                subscriber.onError(throwable);
            }

            public void onNext(Object obj)
            {
                long l = scheduler.now();
                emitItemsOutOfWindow(l);
                buffer.offerLast(new Timestamped(l, obj));
            }

            
            {
                this$0 = OperatorSkipLastTimed.this;
                subscriber = subscriber2;
                super(final_subscriber1);
                buffer = new ArrayDeque();
            }
        };
    }


}
