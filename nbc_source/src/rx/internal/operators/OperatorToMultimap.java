// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import rx.Subscriber;
import rx.functions.Func0;
import rx.functions.Func1;

public final class OperatorToMultimap
    implements rx.Observable.Operator
{
    public static final class DefaultMultimapCollectionFactory
        implements Func1
    {

        public volatile Object call(Object obj)
        {
            return call(obj);
        }

        public Collection call(Object obj)
        {
            return new ArrayList();
        }

        public DefaultMultimapCollectionFactory()
        {
        }
    }

    public static final class DefaultToMultimapFactory
        implements Func0
    {

        public volatile Object call()
        {
            return call();
        }

        public Map call()
        {
            return new HashMap();
        }

        public DefaultToMultimapFactory()
        {
        }
    }


    private final Func1 collectionFactory;
    private final Func1 keySelector;
    private final Func0 mapFactory;
    private final Func1 valueSelector;

    public OperatorToMultimap(Func1 func1, Func1 func1_1)
    {
        this(func1, func1_1, ((Func0) (new DefaultToMultimapFactory())), ((Func1) (new DefaultMultimapCollectionFactory())));
    }

    public OperatorToMultimap(Func1 func1, Func1 func1_1, Func0 func0)
    {
        this(func1, func1_1, func0, ((Func1) (new DefaultMultimapCollectionFactory())));
    }

    public OperatorToMultimap(Func1 func1, Func1 func1_1, Func0 func0, Func1 func1_2)
    {
        keySelector = func1;
        valueSelector = func1_1;
        mapFactory = func0;
        collectionFactory = func1_2;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        return new Subscriber(final_subscriber1) {

            private Map map;
            final OperatorToMultimap this$0;
            final Subscriber val$subscriber;

            public void onCompleted()
            {
                Map map1 = map;
                map = null;
                subscriber.onNext(map1);
                subscriber.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                map = null;
                subscriber.onError(throwable);
            }

            public void onNext(Object obj)
            {
                Object obj1 = keySelector.call(obj);
                Object obj2 = valueSelector.call(obj);
                Collection collection = (Collection)map.get(obj1);
                obj = collection;
                if (collection == null)
                {
                    obj = (Collection)collectionFactory.call(obj1);
                    map.put(obj1, obj);
                }
                ((Collection) (obj)).add(obj2);
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            
            {
                this$0 = OperatorToMultimap.this;
                subscriber = subscriber2;
                super(final_subscriber1);
                map = (Map)mapFactory.call();
            }
        };
    }




}
