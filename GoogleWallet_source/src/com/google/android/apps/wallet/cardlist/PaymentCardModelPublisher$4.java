// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.paymentcard.api.CredentialsChangedEvent;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModelPublisher

final class this._cls0
    implements AsyncCallback
{

    final PaymentCardModelPublisher this$0;

    private void onSuccess(Boolean boolean1)
    {
        PaymentCardModelPublisher.access$502(PaymentCardModelPublisher.this, null);
        PaymentCardModelPublisher paymentcardmodelpublisher = PaymentCardModelPublisher.this;
        System _tmp = PaymentCardModelPublisher.access$000(PaymentCardModelPublisher.this);
        PaymentCardModelPublisher.access$102(paymentcardmodelpublisher, System.currentTimeMillis());
        if (boolean1.booleanValue())
        {
            PaymentCardModelPublisher.access$600(PaymentCardModelPublisher.this, null);
            PaymentCardModelPublisher.access$700(PaymentCardModelPublisher.this).post(new CredentialsChangedEvent());
        }
    }

    public final void onFailure(Exception exception)
    {
        PaymentCardModelPublisher.access$502(PaymentCardModelPublisher.this, exception);
        PaymentCardModelPublisher.access$600(PaymentCardModelPublisher.this, null);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Boolean)obj);
    }

    nt()
    {
        this$0 = PaymentCardModelPublisher.this;
        super();
    }
}
