// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorDelay

class val.child extends Subscriber
{

    boolean done;
    final OperatorDelay this$0;
    final Subscriber val$child;
    final rx. val$worker;

    public void onCompleted()
    {
        val$worker.schedule(new Action0() {

            final OperatorDelay._cls1 this$1;

            public void call()
            {
                if (!done)
                {
                    done = true;
                    child.onCompleted();
                }
            }

            
            {
                this$1 = OperatorDelay._cls1.this;
                super();
            }
        }, delay, unit);
    }

    public void onError(final Throwable e)
    {
        val$worker.schedule(new Action0() {

            final OperatorDelay._cls1 this$1;
            final Throwable val$e;

            public void call()
            {
                if (!done)
                {
                    done = true;
                    child.onError(e);
                    worker.unsubscribe();
                }
            }

            
            {
                this$1 = OperatorDelay._cls1.this;
                e = throwable;
                super();
            }
        });
    }

    public void onNext(final Object t)
    {
        val$worker.schedule(new Action0() {

            final OperatorDelay._cls1 this$1;
            final Object val$t;

            public void call()
            {
                if (!done)
                {
                    child.onNext(t);
                }
            }

            
            {
                this$1 = OperatorDelay._cls1.this;
                t = obj;
                super();
            }
        }, delay, unit);
    }

    _cls3.val.t(Subscriber subscriber1)
    {
        this$0 = final_operatordelay;
        val$worker = rx..this;
        val$child = subscriber1;
        super(final_subscriber);
    }
}
