// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            OperatorMaterialize

class rentSubscriber
    implements Producer
{

    final OperatorMaterialize this$0;
    final rentSubscriber val$parent;

    public void request(long l)
    {
        if (l > 0L)
        {
            val$parent.requestMore(l);
        }
    }

    rentSubscriber()
    {
        this$0 = final_operatormaterialize;
        val$parent = rentSubscriber.this;
        super();
    }
}
