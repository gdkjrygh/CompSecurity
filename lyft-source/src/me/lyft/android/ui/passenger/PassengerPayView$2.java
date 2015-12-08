// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerPayView

class this._cls0
    implements android.view.r
{

    final PassengerPayView this$0;

    public void onClick(View view)
    {
        if (Strings.isNullOrEmpty(checkoutSession.getSelectedPaymentMethodId()))
        {
            L.e(new IllegalStateException("No payment id found in checkout session."), "selectedPaymentMethodId is empty.", new Object[0]);
            appFlow.goTo(new me.lyft.android.ui.payment.entSelectScreen());
            return;
        } else
        {
            appFlow.goTo(new ssengerRateRideScreen());
            return;
        }
    }

    ssengerRateRideScreen()
    {
        this$0 = PassengerPayView.this;
        super();
    }
}
