// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.event.PaymentScannedEvent;
import com.pinterest.activity.commerce.view.PaymentFormView;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            PaymentFormFragmentController

class this._cls0
    implements com.pinterest.base.agmentController._cls7
{

    final PaymentFormFragmentController this$0;

    public void onEventMainThread(PaymentScannedEvent paymentscannedevent)
    {
        Events.removeStickyEvent(paymentscannedevent);
        PaymentFormFragmentController.access$600(PaymentFormFragmentController.this).updateCreditCardNumber(paymentscannedevent.getCardNumber(), paymentscannedevent.getExpiration());
    }

    ()
    {
        this$0 = PaymentFormFragmentController.this;
        super();
    }
}
