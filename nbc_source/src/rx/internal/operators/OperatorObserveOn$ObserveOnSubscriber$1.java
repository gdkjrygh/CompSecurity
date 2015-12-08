// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            OperatorObserveOn, BackpressureUtils

class this._cls0
    implements Producer
{

    final hedule this$0;

    public void request(long l)
    {
        BackpressureUtils.getAndAddRequest(QUESTED, this._cls0.this, l);
        hedule();
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
