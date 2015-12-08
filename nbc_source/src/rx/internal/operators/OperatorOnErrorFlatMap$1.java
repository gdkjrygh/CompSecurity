// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

// Referenced classes of package rx.internal.operators:
//            OperatorOnErrorFlatMap

class val.child extends Subscriber
{

    final OperatorOnErrorFlatMap this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        val$child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        try
        {
            RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
            ((Observable)OperatorOnErrorFlatMap.access$000(OperatorOnErrorFlatMap.this).call(OnErrorThrowable.from(throwable))).unsafeSubscribe(new Subscriber() {

                final OperatorOnErrorFlatMap._cls1 this$1;

                public void onCompleted()
                {
                }

                public void onError(Throwable throwable1)
                {
                    child.onError(throwable1);
                }

                public void onNext(Object obj)
                {
                    child.onNext(obj);
                }

            
            {
                this$1 = OperatorOnErrorFlatMap._cls1.this;
                super();
            }
            });
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
        val$child.onNext(obj);
    }

    _cls1.this._cls1(Subscriber subscriber1)
    {
        this$0 = final_operatoronerrorflatmap;
        val$child = subscriber1;
        super(Subscriber.this);
    }
}
