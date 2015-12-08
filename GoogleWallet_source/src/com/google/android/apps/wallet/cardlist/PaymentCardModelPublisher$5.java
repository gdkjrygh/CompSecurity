// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.paymentcard.api.CredentialManager;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModelPublisher

final class this._cls0
    implements Callable
{

    final PaymentCardModelPublisher this$0;

    private List call()
        throws Exception
    {
        List list = PaymentCardModelPublisher.access$400(PaymentCardModelPublisher.this).getAll();
        Collections.sort(list, PaymentCardModelPublisher.access$800());
        return list;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    I()
    {
        this$0 = PaymentCardModelPublisher.this;
        super();
    }
}
