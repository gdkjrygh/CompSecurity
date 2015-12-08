// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.Timestamped;

// Referenced classes of package rx.internal.operators:
//            OperatorSkipLastTimed

class buffer extends Subscriber
{

    private Deque buffer;
    final OperatorSkipLastTimed this$0;
    final Subscriber val$subscriber;

    private void emitItemsOutOfWindow(long l)
    {
        long l1 = OperatorSkipLastTimed.access$000(OperatorSkipLastTimed.this);
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
            val$subscriber.onNext(timestamped.getValue());
        } while (true);
    }

    public void onCompleted()
    {
        emitItemsOutOfWindow(OperatorSkipLastTimed.access$100(OperatorSkipLastTimed.this).now());
        val$subscriber.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        long l = OperatorSkipLastTimed.access$100(OperatorSkipLastTimed.this).now();
        emitItemsOutOfWindow(l);
        buffer.offerLast(new Timestamped(l, obj));
    }

    (Subscriber subscriber2)
    {
        this$0 = final_operatorskiplasttimed;
        val$subscriber = subscriber2;
        super(Subscriber.this);
        buffer = new ArrayDeque();
    }
}
