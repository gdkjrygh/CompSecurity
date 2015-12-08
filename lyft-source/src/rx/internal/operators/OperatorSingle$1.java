// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            OperatorSingle

class rentSubscriber
    implements Producer
{

    private final AtomicBoolean requestedTwo = new AtomicBoolean(false);
    final OperatorSingle this$0;
    final rentSubscriber val$parent;

    public void request(long l)
    {
        if (l > 0L && requestedTwo.compareAndSet(false, true))
        {
            val$parent.requestMore(2L);
        }
    }

    rentSubscriber()
    {
        this$0 = final_operatorsingle;
        val$parent = rentSubscriber.this;
        super();
    }
}
