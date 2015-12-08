// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import rx.Subscriber;
import rx.functions.Func2;
import rx.internal.producers.SingleDelayedProducer;

public final class OperatorToObservableSortedList
    implements rx.Observable.Operator
{
    private static class DefaultComparableFunction
        implements Comparator
    {

        public int compare(Object obj, Object obj1)
        {
            return ((Comparable)obj).compareTo((Comparable)obj1);
        }

        private DefaultComparableFunction()
        {
        }

    }


    private static Comparator DEFAULT_SORT_FUNCTION = new DefaultComparableFunction();
    private final int initialCapacity;
    private final Comparator sortFunction;

    public OperatorToObservableSortedList(int i)
    {
        sortFunction = DEFAULT_SORT_FUNCTION;
        initialCapacity = i;
    }

    public OperatorToObservableSortedList(final Func2 sortFunction, int i)
    {
        initialCapacity = i;
        this.sortFunction = new Comparator() {

            final OperatorToObservableSortedList this$0;
            final Func2 val$sortFunction;

            public int compare(Object obj, Object obj1)
            {
                return ((Integer)sortFunction.call(obj, obj1)).intValue();
            }

            
            {
                this$0 = OperatorToObservableSortedList.this;
                sortFunction = func2;
                super();
            }
        };
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber child)
    {
        final SingleDelayedProducer producer = new SingleDelayedProducer(child);
        Subscriber subscriber = new Subscriber() {

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
                        Collections.sort(list1, sortFunction);
                    }
                    catch (Throwable throwable)
                    {
                        onError(throwable);
                        return;
                    }
                    producer.setValue(list1);
                }
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
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
                this$0 = OperatorToObservableSortedList.this;
                producer = singledelayedproducer;
                child = subscriber;
                super();
                list = new ArrayList(initialCapacity);
            }
        };
        child.add(subscriber);
        child.setProducer(producer);
        return subscriber;
    }



}
