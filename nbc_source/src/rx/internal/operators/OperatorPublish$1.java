// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorPublish

static final class val.curr
    implements rx.ribe
{

    final AtomicReference val$curr;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        blishSubscriber blishsubscriber;
        Object obj;
        do
        {
            do
            {
                obj = (blishSubscriber)val$curr.get();
                if (obj != null)
                {
                    blishsubscriber = ((blishSubscriber) (obj));
                    if (!((blishSubscriber) (obj)).isUnsubscribed())
                    {
                        break;
                    }
                }
                blishsubscriber = new blishSubscriber(val$curr);
                blishsubscriber.init();
            } while (!val$curr.compareAndSet(obj, blishsubscriber));
            obj = new nerProducer(blishsubscriber, subscriber);
        } while (!blishsubscriber.add(((nerProducer) (obj))));
        subscriber.add(((rx.Subscription) (obj)));
        subscriber.setProducer(((rx.Producer) (obj)));
    }

    nce(AtomicReference atomicreference)
    {
        val$curr = atomicreference;
        super();
    }
}
