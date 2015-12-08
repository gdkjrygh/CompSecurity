// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerPayView

class this._cls0
    implements android.view.r
{

    final PassengerPayView this$0;

    public void onClick(View view)
    {
        PaymentAnalytics.trackPaymentSelectTap();
        appFlow.goTo(new me.lyft.android.ui.payment.entSelectScreen());
    }

    tSelectScreen()
    {
        this$0 = PassengerPayView.this;
        super();
    }
}
