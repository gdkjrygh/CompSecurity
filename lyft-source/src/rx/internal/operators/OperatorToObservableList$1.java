// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.Subscriber;
import rx.internal.producers.SingleDelayedProducer;

// Referenced classes of package rx.internal.operators:
//            OperatorToObservableList

class list extends Subscriber
{

    boolean completed;
    List list;
    final OperatorToObservableList this$0;
    final Subscriber val$o;
    final SingleDelayedProducer val$producer;

    public void onCompleted()
    {
        if (!completed)
        {
            completed = true;
            ArrayList arraylist;
            try
            {
                arraylist = new ArrayList(list);
            }
            catch (Throwable throwable)
            {
                onError(throwable);
                return;
            }
            list = null;
            val$producer.setValue(arraylist);
        }
    }

    public void onError(Throwable throwable)
    {
        val$o.onError(throwable);
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
        this$0 = final_operatortoobservablelist;
        val$producer = singledelayedproducer;
        val$o = Subscriber.this;
        super();
        completed = false;
        list = new LinkedList();
    }
}
