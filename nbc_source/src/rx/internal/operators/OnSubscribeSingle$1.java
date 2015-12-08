// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.SingleSubscriber;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeSingle

class emission extends Subscriber
{

    private Object emission;
    private boolean emittedTooMany;
    private boolean itemEmitted;
    final OnSubscribeSingle this$0;
    final SingleSubscriber val$child;

    public void onCompleted()
    {
        if (emittedTooMany)
        {
            return;
        }
        if (itemEmitted)
        {
            val$child.onSuccess(emission);
            return;
        } else
        {
            val$child.onError(new NoSuchElementException("Observable emitted no items"));
            return;
        }
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
        unsubscribe();
    }

    public void onNext(Object obj)
    {
        if (itemEmitted)
        {
            emittedTooMany = true;
            val$child.onError(new IllegalArgumentException("Observable emitted too many elements"));
            unsubscribe();
            return;
        } else
        {
            itemEmitted = true;
            emission = obj;
            return;
        }
    }

    public void onStart()
    {
        request(2L);
    }

    ()
    {
        this$0 = final_onsubscribesingle;
        val$child = SingleSubscriber.this;
        super();
        emittedTooMany = false;
        itemEmitted = false;
        emission = null;
    }
}
