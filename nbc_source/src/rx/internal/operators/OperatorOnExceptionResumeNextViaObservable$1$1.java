// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

// Referenced classes of package rx.internal.operators:
//            OperatorOnExceptionResumeNextViaObservable

class val.producer
    implements Producer
{

    final val.producer this$1;
    final Producer val$producer;

    public void request(long l)
    {
        val$producer.request(l);
    }

    ne()
    {
        this$1 = final_ne;
        val$producer = Producer.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorOnExceptionResumeNextViaObservable$1

/* anonymous class */
    class OperatorOnExceptionResumeNextViaObservable._cls1 extends Subscriber
    {

        private boolean done;
        final OperatorOnExceptionResumeNextViaObservable this$0;
        final Subscriber val$child;

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
            if (throwable instanceof Exception)
            {
                RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
                unsubscribe();
                resumeSequence.unsafeSubscribe(child);
                return;
            } else
            {
                child.onError(throwable);
                return;
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

        public void setProducer(Producer producer1)
        {
            child.setProducer(producer1. new OperatorOnExceptionResumeNextViaObservable._cls1._cls1());
        }

            
            {
                this$0 = final_operatoronexceptionresumenextviaobservable;
                child = Subscriber.this;
                super();
                done = false;
            }
    }

}
