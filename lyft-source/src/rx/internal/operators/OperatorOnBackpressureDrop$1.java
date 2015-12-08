// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            OperatorOnBackpressureDrop, BackpressureUtils

class val.requested
    implements Producer
{

    final OperatorOnBackpressureDrop this$0;
    final AtomicLong val$requested;

    public void request(long l)
    {
        BackpressureUtils.getAndAddRequest(val$requested, l);
    }

    ()
    {
        this$0 = final_operatoronbackpressuredrop;
        val$requested = AtomicLong.this;
        super();
    }
}
