// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.RadioButton;
import com.dominos.android.sdk.constant.PaymentTag;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.extension.google.wallet.GoogleWalletManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class val.rb
    implements android.view.ctivity._cls7
{

    final LabsCheckoutActivity this$0;
    final RadioButton val$rb;

    public void onClick(View view)
    {
label0:
        {
            if (LabsCheckoutActivity.access$800(LabsCheckoutActivity.this).isGoogleWalletAvailable(mStoreManager.getStoreProfile()) && maskedWallet != null)
            {
                LabsCheckoutActivity.access$400(LabsCheckoutActivity.this);
                LabsCheckoutActivity.access$200(LabsCheckoutActivity.this);
                if (!LabsCheckoutActivity.access$900(LabsCheckoutActivity.this))
                {
                    break label0;
                }
                val$rb.setChecked(true);
                view = LabsCheckoutActivity.access$1000(LabsCheckoutActivity.this);
                LabsCheckoutActivity.access$300(LabsCheckoutActivity.this, view);
                mOrderManager.getOrder().setPaymentTag(PaymentTag.GOOGLE);
                LabsCheckoutActivity.access$1102(LabsCheckoutActivity.this, PaymentTag.GOOGLE);
            }
            return;
        }
        val$rb.setChecked(false);
        val$rb.setEnabled(false);
        mActivityHelper.showAlert(AlertType.WALLET_BACKING_NOT_ACCEPTED);
    }

    r()
    {
        this$0 = final_labscheckoutactivity;
        val$rb = RadioButton.this;
        super();
    }
}
