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

class val.outer
    implements Func1
{

    final val.outer this$1;
    final Object val$outer;

    public Object call(Object obj)
    {
        return resultSelector.call(val$outer, obj);
    }

    l.o()
    {
        this$1 = final_o;
        val$outer = Object.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorMapPair$2

/* anonymous class */
    class OperatorMapPair._cls2 extends Subscriber
    {

        final OperatorMapPair this$0;
        final Subscriber val$o;

        public void onCompleted()
        {
            o.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            o.onError(throwable);
        }

        public void onNext(Object obj)
        {
            try
            {
                o.onNext(((Observable)collectionSelector.call(obj)).map(((OperatorMapPair._cls2._cls1) (obj)). new OperatorMapPair._cls2._cls1()));
                return;
            }
            catch (Throwable throwable)
            {
                o.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            }
        }

            
            {
                this$0 = final_operatormappair;
                o = subscriber1;
                super(Subscriber.this);
            }
    }

}
