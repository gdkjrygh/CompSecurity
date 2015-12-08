// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;
import rx.subscriptions.SerialSubscription;

// Referenced classes of package rx.internal.operators:
//            OperatorOnErrorResumeNextViaFunction

class done extends Subscriber
{

    private boolean done;
    final OperatorOnErrorResumeNextViaFunction this$0;
    final Subscriber val$child;
    final ProducerArbiter val$pa;
    final SerialSubscription val$ssub;

    public void onCompleted()
    {
        if (done)
        {
            return;
        } else
        {
            done = true;
            val$child.onCompleted();
            return;
        }
    }

    public void onError(Throwable throwable)
    {
        if (done)
        {
            Exceptions.throwIfFatal(throwable);
            return;
        }
        done = true;
        try
        {
            RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
            unsubscribe();
            Subscriber subscriber = new Subscriber() {

                final OperatorOnErrorResumeNextViaFunction._cls1 this$1;

                public void onCompleted()
                {
                    child.onCompleted();
                }

                public void onError(Throwable throwable1)
                {
                    child.onError(throwable1);
                }

                public void onNext(Object obj)
                {
                    child.onNext(obj);
                }

                public void setProducer(Producer producer)
                {
                    pa.setProducer(producer);
                }

            
            {
                this$1 = OperatorOnErrorResumeNextViaFunction._cls1.this;
                super();
            }
            };
            val$ssub.set(subscriber);
            ((Observable)OperatorOnErrorResumeNextViaFunction.access$000(OperatorOnErrorResumeNextViaFunction.this).call(throwable)).unsafeSubscribe(subscriber);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            val$child.onError(throwable);
        }
    }

    public void onNext(Object obj)
    {
        if (done)
        {
            return;
        } else
        {
            val$child.onNext(obj);
            return;
        }
    }

    public void setProducer(Producer producer)
    {
        val$pa.setProducer(producer);
    }

    _cls1.this._cls1()
    {
        this$0 = final_operatoronerrorresumenextviafunction;
        val$child = subscriber;
        val$pa = producerarbiter;
        val$ssub = SerialSubscription.this;
        super();
        done = false;
    }
}
