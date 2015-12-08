// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.internal.producers.ProducerArbiter;

class this._cls0
    implements Producer
{

    final biter this$0;

    public void request(long l)
    {
        if (l > 0L)
        {
            biter.request(l);
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
