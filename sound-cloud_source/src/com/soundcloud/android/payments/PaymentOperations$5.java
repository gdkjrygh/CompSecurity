// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b.b;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentOperations, TokenStorage

class this._cls0
    implements b
{

    final PaymentOperations this$0;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        PaymentOperations.access$000(PaymentOperations.this).setCheckoutToken(s);
    }

    _cls9()
    {
        this$0 = PaymentOperations.this;
        super();
    }
}
