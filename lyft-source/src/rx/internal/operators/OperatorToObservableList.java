// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.Subscriber;
import rx.internal.producers.SingleDelayedProducer;

public final class OperatorToObservableList
    implements rx.Observable.Operator
{

    private OperatorToObservableList()
    {
    }


    public static OperatorToObservableList instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber o)
    {
        final SingleDelayedProducer producer = new SingleDelayedProducer(o);
        Subscriber subscriber = new Subscriber() {

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
                    producer.setValue(arraylist);
                }
            }

            public void onError(Throwable throwable)
            {
                o.onError(throwable);
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

            
            {
                this$0 = OperatorToObservableList.this;
                producer = singledelayedproducer;
                o = subscriber;
                super();
                completed = false;
                list = new LinkedList();
            }
        };
        o.add(subscriber);
        o.setProducer(producer);
        return subscriber;
    }

    private class Holder
    {

        static final OperatorToObservableList INSTANCE = new OperatorToObservableList();


        private Holder()
        {
        }
    }

}
