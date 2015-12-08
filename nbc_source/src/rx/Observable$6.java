// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.internal.producers.SingleProducer;

// Referenced classes of package rx:
//            Observable, Subscriber

class 
    implements Subscribe
{

    final Observable this$0;
    final Object val$defaultValue;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        subscriber.setProducer(new SingleProducer(subscriber, val$defaultValue));
    }

    ()
    {
        this$0 = final_observable;
        val$defaultValue = Object.this;
        super();
    }
}
