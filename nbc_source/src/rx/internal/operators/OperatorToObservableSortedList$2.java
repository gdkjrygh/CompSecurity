// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Subscriber;
import rx.internal.producers.SingleDelayedProducer;

// Referenced classes of package rx.internal.operators:
//            OperatorToObservableSortedList

class this._cls0 extends Subscriber
{

    boolean completed;
    List list;
    final OperatorToObservableSortedList this$0;
    final Subscriber val$child;
    final SingleDelayedProducer val$producer;

    public void onCompleted()
    {
        if (!completed)
        {
            completed = true;
            List list1 = list;
            list = null;
            try
            {
                Collections.sort(list1, OperatorToObservableSortedList.access$100(OperatorToObservableSortedList.this));
            }
            catch (Throwable throwable)
            {
                onError(throwable);
                return;
            }
            val$producer.setValue(list1);
        }
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        if (!completed)
        {
            list.add(obj);
        }
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    ()
    {
        this$0 = final_operatortoobservablesortedlist;
        val$producer = singledelayedproducer;
        val$child = Subscriber.this;
        super();
        list = new ArrayList(OperatorToObservableSortedList.access$000(OperatorToObservableSortedList.this));
    }
}
