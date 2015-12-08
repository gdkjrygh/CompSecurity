// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OperatorMapPair

class val.o extends Subscriber
{

    final OperatorMapPair this$0;
    final Subscriber val$o;

    public void onCompleted()
    {
        val$o.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$o.onError(throwable);
    }

    public void onNext(final Object outer)
    {
        try
        {
            val$o.onNext(((Observable)collectionSelector.call(outer)).map(new Func1() {

                final OperatorMapPair._cls2 this$1;
                final Object val$outer;

                public Object call(Object obj)
                {
                    return resultSelector.call(outer, obj);
                }

            
            {
                this$1 = OperatorMapPair._cls2.this;
                outer = obj;
                super();
            }
            }));
            return;
        }
        catch (Throwable throwable)
        {
            val$o.onError(OnErrorThrowable.addValueAsLastCause(throwable, outer));
        }
    }

    _cls1.val.outer(Subscriber subscriber1)
    {
        this$0 = final_operatormappair;
        val$o = subscriber1;
        super(Subscriber.this);
    }
}
