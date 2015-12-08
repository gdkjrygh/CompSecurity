// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Subscriber;

final class state extends AtomicBoolean
    implements rx.olean
{

    private static final long serialVersionUID = 0xd8e555c98d8dfdb2L;
    final ct state;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        call call1 = new init>(subscriber, state);
        state.oducer(call1);
        subscriber.add(call1);
        subscriber.setProducer(call1);
        if (!get() && compareAndSet(false, true))
        {
            state.ct();
        }
    }

    public ( )
    {
        state = ;
    }
}
