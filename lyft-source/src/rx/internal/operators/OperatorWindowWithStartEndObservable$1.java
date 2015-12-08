// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithStartEndObservable

class urceSubscriber extends Subscriber
{

    final OperatorWindowWithStartEndObservable this$0;
    final urceSubscriber val$sub;

    public void onCompleted()
    {
        val$sub.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$sub.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$sub.beginWindow(obj);
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    urceSubscriber()
    {
        this$0 = final_operatorwindowwithstartendobservable;
        val$sub = urceSubscriber.this;
        super();
    }
}
