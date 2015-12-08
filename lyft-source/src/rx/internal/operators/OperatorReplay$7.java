// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;
import rx.functions.Func0;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

final class val.bufferFactory
    implements rx.cribe
{

    final Func0 val$bufferFactory;
    final AtomicReference val$curr;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        playSubscriber playsubscriber;
        Object obj;
        do
        {
            obj = (playSubscriber)val$curr.get();
            playsubscriber = ((playSubscriber) (obj));
            if (obj != null)
            {
                break;
            }
            playsubscriber = new playSubscriber(val$curr, (playBuffer)val$bufferFactory.call());
            playsubscriber.init();
        } while (!val$curr.compareAndSet(obj, playsubscriber));
        obj = new nerProducer(playsubscriber, subscriber);
        playsubscriber.add(((nerProducer) (obj)));
        subscriber.add(((rx.Subscription) (obj)));
        subscriber.setProducer(((rx.Producer) (obj)));
    }

    ence()
    {
        val$curr = atomicreference;
        val$bufferFactory = func0;
        super();
    }
}
