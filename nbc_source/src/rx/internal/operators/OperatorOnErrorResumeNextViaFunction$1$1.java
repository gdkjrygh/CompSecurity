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

class this._cls1 extends Subscriber
{

    final l.pa this$1;

    public void onCompleted()
    {
        child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        child.onNext(obj);
    }

    public void setProducer(Producer producer)
    {
        pa.setProducer(producer);
    }

    ne()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorOnErrorResumeNextViaFunction$1

/* anonymous class */
    class OperatorOnErrorResumeNextViaFunction._cls1 extends Subscriber
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
                child.onCompleted();
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
                OperatorOnErrorResumeNextViaFunction._cls1._cls1 _lcls1 = new OperatorOnErrorResumeNextViaFunction._cls1._cls1();
                ssub.set(_lcls1);
                ((Observable)OperatorOnErrorResumeNextViaFunction.access$000(OperatorOnErrorResumeNextViaFunction.this).call(throwable)).unsafeSubscribe(_lcls1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                child.onError(throwable);
            }
        }

        public void onNext(Object obj)
        {
            if (done)
            {
                return;
            } else
            {
                child.onNext(obj);
                return;
            }
        }

        public void setProducer(Producer producer)
        {
            pa.setProducer(producer);
        }

            
            {
                this$0 = final_operatoronerrorresumenextviafunction;
                child = subscriber;
                pa = producerarbiter;
                ssub = SerialSubscription.this;
                super();
                done = false;
            }
    }

}
