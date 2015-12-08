// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity, PurchaseRecordPublisher

final class val.transactionId
    implements AsyncCallback
{

    final PurchaseRecordDetailActivity this$0;
    final String val$transactionId;

    private void onSuccess(com.google.wallet.proto.api.onGeoMerchantFeedbackResponse ongeomerchantfeedbackresponse)
    {
        if (ongeomerchantfeedbackresponse.callError != null)
        {
            if (ongeomerchantfeedbackresponse.callError.nt != null && ongeomerchantfeedbackresponse.callError. != null)
            {
                WLog.e(PurchaseRecordDetailActivity.access$800(), ongeomerchantfeedbackresponse.callError.ing());
                AlertDialogFragment.newBuilder().Title(ongeomerchantfeedbackresponse.callError.).Message(ongeomerchantfeedbackresponse.callError.nt).ld().show(getSupportFragmentManager());
                return;
            } else
            {
                Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel.back_failure_toast));
                return;
            }
        } else
        {
            Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel.back_success_toast));
            purchaseRecordPublisher.fetchPurchaseRecord(val$transactionId);
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(PurchaseRecordDetailActivity.access$800(), "Failed to send geo merchant feedback", exception);
        Toasts.show(PurchaseRecordDetailActivity.this, com.google.android.apps.walletnfcrel.back_failure_toast);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.onGeoMerchantFeedbackResponse)obj);
    }

    ackResponse()
    {
        this$0 = final_purchaserecorddetailactivity;
        val$transactionId = String.this;
        super();
    }
}
