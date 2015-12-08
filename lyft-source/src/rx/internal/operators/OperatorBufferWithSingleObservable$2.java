// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorBufferWithSingleObservable

class fferingSubscriber extends Subscriber
{

    final OperatorBufferWithSingleObservable this$0;
    final fferingSubscriber val$bsub;

    public void onCompleted()
    {
        val$bsub.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$bsub.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$bsub.emit();
    }

    fferingSubscriber()
    {
        this$0 = final_operatorbufferwithsingleobservable;
        val$bsub = fferingSubscriber.this;
        super();
    }
}
