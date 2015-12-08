// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentFraudView

class this._cls0
    implements android.view.r
{

    final PaymentFraudView this$0;

    public void onClick(View view)
    {
        PaymentAnalytics.trackPaymentFraudClose();
        appFlow.goBack();
    }

    tics()
    {
        this$0 = PaymentFraudView.this;
        super();
    }
}
