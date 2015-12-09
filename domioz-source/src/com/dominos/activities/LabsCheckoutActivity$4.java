// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.RadioButton;
import com.dominos.android.sdk.constant.PaymentTag;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.order.OrderManager;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class t
    implements android.view.ctivity._cls4
{

    final LabsCheckoutActivity this$0;
    final RadioButton val$rb;
    final LabsPayment val$token;

    public void onClick(View view)
    {
        mOrderManager.getOrder().setPaymentTag(PaymentTag.ANON);
        LabsCheckoutActivity.access$200(LabsCheckoutActivity.this);
        val$rb.setChecked(true);
        LabsCheckoutActivity.access$300(LabsCheckoutActivity.this, val$token);
    }

    t()
    {
        this$0 = final_labscheckoutactivity;
        val$rb = radiobutton;
        val$token = LabsPayment.this;
        super();
    }
}
