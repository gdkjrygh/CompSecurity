// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Map;
import rx.Subscriber;
import rx.functions.Func0;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OperatorToMap

class this._cls0 extends Subscriber
{

    private Map map;
    final OperatorToMap this$0;
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
        Object obj1 = OperatorToMap.access$100(OperatorToMap.this).call(obj);
        obj = OperatorToMap.access$200(OperatorToMap.this).call(obj);
        map.put(obj1, obj);
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    (Subscriber subscriber2)
    {
        this$0 = final_operatortomap;
        val$subscriber = subscriber2;
        super(Subscriber.this);
        map = (Map)OperatorToMap.access$000(OperatorToMap.this).call();
    }
}
