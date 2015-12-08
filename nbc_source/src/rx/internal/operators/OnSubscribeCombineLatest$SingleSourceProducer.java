// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.FuncN;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeCombineLatest

static final class leSubscriber
    implements Producer
{

    final Subscriber child;
    final FuncN combinator;
    final Observable source;
    final AtomicBoolean started = new AtomicBoolean();
    final leSubscriber subscriber;

    public void request(long l)
    {
        subscriber.requestMore(l);
        if (started.compareAndSet(false, true))
        {
            source.unsafeSubscribe(subscriber);
        }
    }

    public leSubscriber(Subscriber subscriber1, Observable observable, FuncN funcn)
    {
        source = observable;
        child = subscriber1;
        combinator = funcn;
        subscriber = new leSubscriber(subscriber1, funcn);
    }
}
