// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.widget.CompoundButton;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            PaymentFormView

class this._cls0
    implements android.widget.heckedChangeListener
{

    final PaymentFormView this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        PaymentFormView.access$000(PaymentFormView.this, flag);
        PaymentFormView.access$100(PaymentFormView.this);
        Pinalytics.b(EventType.TAP, ElementType.BUYABLE_PAYMENT_BILLING_TOGGLE, null, null);
    }

    ()
    {
        this$0 = PaymentFormView.this;
        super();
    }
}
