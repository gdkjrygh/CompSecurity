// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.ui;

import android.content.Intent;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.ui:
//            PaymentCardDetailsActivity

final class val.credential
    implements Callable
{

    final PaymentCardDetailsActivity this$0;
    final PaymentCard val$credential;

    private Intent call()
        throws Exception
    {
        return paymentCardApi.createEditCardIntent(PaymentCardDetailsActivity.this, val$credential);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_paymentcarddetailsactivity;
        val$credential = PaymentCard.this;
        super();
    }
}
