// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Collection;
import java.util.Map;
import rx.Subscriber;
import rx.functions.Func0;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorToMultimap

class this._cls0 extends Subscriber
{

    private Map map;
    final OperatorToMultimap this$0;
    final Subscriber val$subscriber;

    public void onCompleted()
    {
        Map map1 = map;
        map = null;
        val$subscriber.onNext(map1);
        val$subscriber.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        map = null;
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        Object obj1 = OperatorToMultimap.access$100(OperatorToMultimap.this).call(obj);
        Object obj2 = OperatorToMultimap.access$200(OperatorToMultimap.this).call(obj);
        Collection collection = (Collection)map.get(obj1);
        obj = collection;
        if (collection == null)
        {
            obj = (Collection)OperatorToMultimap.access$300(OperatorToMultimap.this).call(obj1);
            map.put(obj1, obj);
        }
        ((Collection) (obj)).add(obj2);
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    (Subscriber subscriber2)
    {
        this$0 = final_operatortomultimap;
        val$subscriber = subscriber2;
        super(Subscriber.this);
        map = (Map)OperatorToMultimap.access$000(OperatorToMultimap.this).call();
    }
}
