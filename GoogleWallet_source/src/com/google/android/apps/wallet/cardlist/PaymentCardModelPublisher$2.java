// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.base.java.System;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModelPublisher

final class this._cls0
    implements Runnable
{

    final PaymentCardModelPublisher this$0;

    public final void run()
    {
        System _tmp = PaymentCardModelPublisher.access$000(PaymentCardModelPublisher.this);
        if (System.currentTimeMillis() > PaymentCardModelPublisher.access$100(PaymentCardModelPublisher.this) + PaymentCardModelPublisher.access$200().toMillis(5L))
        {
            PaymentCardModelPublisher.access$300(PaymentCardModelPublisher.this);
        }
    }

    I()
    {
        this$0 = PaymentCardModelPublisher.this;
        super();
    }
}
