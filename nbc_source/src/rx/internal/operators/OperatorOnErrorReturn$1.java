// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Arrays;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

// Referenced classes of package rx.internal.operators:
//            OperatorOnErrorReturn

class done extends Subscriber
{

    private boolean done;
    final OperatorOnErrorReturn this$0;
    final Subscriber val$child;

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
            Object obj = resultFunction.call(throwable);
            val$child.onNext(obj);
        }
        catch (Throwable throwable1)
        {
            val$child.onError(new CompositeException(Arrays.asList(new Throwable[] {
                throwable, throwable1
            })));
            return;
        }
        val$child.onCompleted();
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

    public void setProducer(final Producer producer)
    {
        val$child.setProducer(new Producer() {

            final OperatorOnErrorReturn._cls1 this$1;
            final Producer val$producer;

            public void request(long l)
            {
                producer.request(l);
            }

            
            {
                this$1 = OperatorOnErrorReturn._cls1.this;
                producer = producer1;
                super();
            }
        });
    }

    _cls1.val.producer()
    {
        this$0 = final_operatoronerrorreturn;
        val$child = Subscriber.this;
        super();
        done = false;
    }
}
