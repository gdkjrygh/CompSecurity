// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.functions.Action1;

// Referenced classes of package rx.internal.operators:
//            OperatorDoOnRequest

class rentSubscriber
    implements Producer
{

    final OperatorDoOnRequest this$0;
    final rentSubscriber val$parent;

    public void request(long l)
    {
        OperatorDoOnRequest.access$100(OperatorDoOnRequest.this).call(Long.valueOf(l));
        rentSubscriber.access._mth200(val$parent, l);
    }

    rentSubscriber()
    {
        this$0 = final_operatordoonrequest;
        val$parent = rentSubscriber.this;
        super();
    }
}
