// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.RadioButton;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.constant.PaymentTag;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.StoreManager;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class val.cashButton
    implements android.view.ctivity._cls5
{

    final LabsCheckoutActivity this$0;
    final RadioButton val$cashButton;

    public void onClick(View view)
    {
        if (!cashLimitExceeded())
        {
            LabsCheckoutActivity.access$200(LabsCheckoutActivity.this);
            val$cashButton.setChecked(true);
            LabsCheckoutActivity.access$400(LabsCheckoutActivity.this);
            mOrderManager.getOrder().setPaymentTag(PaymentTag.CASH);
            return;
        } else
        {
            val$cashButton.setChecked(false);
            LabsCheckoutActivity.access$500(LabsCheckoutActivity.this, NumberUtil.formatPrice(Double.valueOf(mStoreManager.getStoreProfile().getCashLimit())));
            return;
        }
    }

    ile()
    {
        this$0 = final_labscheckoutactivity;
        val$cashButton = RadioButton.this;
        super();
    }
}
