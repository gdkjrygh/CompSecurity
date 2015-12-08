// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithSize, BufferUntilSubscriber

final class child extends Subscriber
{

    final Subscriber child;
    int count;
    volatile boolean noWindow;
    final OperatorWindowWithSize this$0;
    BufferUntilSubscriber window;

    void init()
    {
        child.add(Subscriptions.create(new Action0() {

            final OperatorWindowWithSize.ExactSubscriber this$1;

            public void call()
            {
                if (noWindow)
                {
                    unsubscribe();
                }
            }

            
            {
                this$1 = OperatorWindowWithSize.ExactSubscriber.this;
                super();
            }
        }));
        child.setProducer(new Producer() {

            final OperatorWindowWithSize.ExactSubscriber this$1;

            public void request(long l)
            {
                if (l > 0L)
                {
                    long l2 = l * (long)size;
                    long l1 = l2;
                    if (l2 >>> 31 != 0L)
                    {
                        l1 = l2;
                        if (l2 / l != (long)size)
                        {
                            l1 = 0x7fffffffffffffffL;
                        }
                    }
                    requestMore(l1);
                }
            }

            
            {
                this$1 = OperatorWindowWithSize.ExactSubscriber.this;
                super();
            }
        });
    }

    public void onCompleted()
    {
        if (window != null)
        {
            window.onCompleted();
        }
        child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        if (window != null)
        {
            window.onError(throwable);
        }
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        if (window == null)
        {
            noWindow = false;
            window = BufferUntilSubscriber.create();
            child.onNext(window);
        }
        window.onNext(obj);
        int i = count + 1;
        count = i;
        if (i % size == 0)
        {
            window.onCompleted();
            window = null;
            noWindow = true;
            if (child.isUnsubscribed())
            {
                unsubscribe();
            }
        }
    }

    void requestMore(long l)
    {
        request(l);
    }

    public _cls2.this._cls1(Subscriber subscriber)
    {
        this$0 = OperatorWindowWithSize.this;
        super();
        noWindow = true;
        child = subscriber;
    }
}
