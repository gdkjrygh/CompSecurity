// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func0;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorMapNotification

class val.o extends Subscriber
{

    ngleEmitter emitter;
    final OperatorMapNotification this$0;
    final Subscriber val$o;

    public void onCompleted()
    {
        try
        {
            emitter.offerAndComplete(OperatorMapNotification.access$000(OperatorMapNotification.this).call());
            return;
        }
        catch (Throwable throwable)
        {
            val$o.onError(throwable);
        }
    }

    public void onError(Throwable throwable)
    {
        try
        {
            emitter.offerAndComplete(OperatorMapNotification.access$100(OperatorMapNotification.this).call(throwable));
            return;
        }
        catch (Throwable throwable1)
        {
            val$o.onError(throwable);
        }
    }

    public void onNext(Object obj)
    {
        try
        {
            emitter.offer(OperatorMapNotification.access$200(OperatorMapNotification.this).call(obj));
            return;
        }
        catch (Throwable throwable)
        {
            val$o.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
        }
    }

    public void setProducer(Producer producer)
    {
        emitter = new ngleEmitter(val$o, producer, this);
        val$o.setProducer(emitter);
    }

    ngleEmitter()
    {
        this$0 = final_operatormapnotification;
        val$o = Subscriber.this;
        super();
    }
}
