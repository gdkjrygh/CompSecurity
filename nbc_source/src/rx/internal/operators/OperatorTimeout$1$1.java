// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Subscription;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorTimeout

class val.seqId
    implements Action0
{

    final val.seqId this$1;
    final Long val$seqId;
    final TimeoutSubscriber val$timeoutSubscriber;

    public void call()
    {
        val$timeoutSubscriber.onTimeout(val$seqId.longValue());
    }

    TimeoutSubscriber()
    {
        this$1 = final_timeoutsubscriber;
        val$timeoutSubscriber = timeoutsubscriber1;
        val$seqId = Long.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorTimeout$1

/* anonymous class */
    class OperatorTimeout._cls1
        implements OperatorTimeoutBase.FirstTimeoutStub
    {

        final TimeUnit val$timeUnit;
        final long val$timeout;

        public volatile Object call(Object obj, Object obj1, Object obj2)
        {
            return call((OperatorTimeoutBase.TimeoutSubscriber)obj, (Long)obj1, (rx.Scheduler.Worker)obj2);
        }

        public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber timeoutSubscriber, Long long1, rx.Scheduler.Worker worker)
        {
            return worker.schedule(long1. new OperatorTimeout._cls1._cls1(), timeout, timeUnit);
        }

            
            {
                timeout = l;
                timeUnit = timeunit;
                super();
            }
    }

}
