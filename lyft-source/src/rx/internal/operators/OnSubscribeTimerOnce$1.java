// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeTimerOnce

class val.child
    implements Action0
{

    final OnSubscribeTimerOnce this$0;
    final Subscriber val$child;

    public void call()
    {
        try
        {
            val$child.onNext(Long.valueOf(0L));
        }
        catch (Throwable throwable)
        {
            val$child.onError(throwable);
            return;
        }
        val$child.onCompleted();
    }

    ()
    {
        this$0 = final_onsubscribetimeronce;
        val$child = Subscriber.this;
        super();
    }
}
