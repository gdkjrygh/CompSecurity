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

class this._cls1 extends Subscriber
{

    final l.child this$1;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        child.onNext(obj);
    }

    l.child()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorOnErrorFlatMap$1

/* anonymous class */
    class OperatorOnErrorFlatMap._cls1 extends Subscriber
    {

        final OperatorOnErrorFlatMap this$0;
        final Subscriber val$child;

        public void onCompleted()
        {
            child.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            try
            {
                RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
                ((Observable)OperatorOnErrorFlatMap.access$000(OperatorOnErrorFlatMap.this).call(OnErrorThrowable.from(throwable))).unsafeSubscribe(new OperatorOnErrorFlatMap._cls1._cls1());
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
            child.onNext(obj);
        }

            
            {
                this$0 = final_operatoronerrorflatmap;
                child = subscriber1;
                super(Subscriber.this);
            }
    }

}
