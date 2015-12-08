// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.paymentcard.api.CredentialsChangedEvent;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModelPublisher

final class this._cls0
    implements Runnable
{

    final PaymentCardModelPublisher this$0;

    public final void run()
    {
        PaymentCardModelPublisher.access$600(PaymentCardModelPublisher.this, null);
        PaymentCardModelPublisher.access$700(PaymentCardModelPublisher.this).post(new CredentialsChangedEvent());
    }

    nt()
    {
        this$0 = PaymentCardModelPublisher.this;
        super();
    }
}
