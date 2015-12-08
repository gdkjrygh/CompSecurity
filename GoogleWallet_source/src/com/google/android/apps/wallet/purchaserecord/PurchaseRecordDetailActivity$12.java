// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity, PurchaseRecordPublisher

final class this._cls0
    implements AsyncCallback
{

    final PurchaseRecordDetailActivity this$0;

    private void onSuccess(com.google.wallet.proto.api.neyRequestResponse neyrequestresponse)
    {
        if (neyrequestresponse.callError != null)
        {
            analyticsUtil.sendError("CancelOutgoingMoneyRequest", new AnalyticsCustomDimension[0]);
            WLog.e(PurchaseRecordDetailActivity.access$800(), neyrequestresponse.callError.ng());
            if (neyrequestresponse.callError.t != null && neyrequestresponse.callError. != null)
            {
                AlertDialogFragment.newBuilder().itle(neyrequestresponse.callError.).essage(neyrequestresponse.callError.t).d().show(getSupportFragmentManager());
                return;
            } else
            {
                showToast(com.google.android.apps.walletnfcrel.iled);
                return;
            }
        } else
        {
            analyticsUtil.sendSuccess("CancelOutgoingMoneyRequest", new AnalyticsCustomDimension[0]);
            showToast(com.google.android.apps.walletnfcrel.mplete);
            purchaseRecordPublisher.reload();
            return;
        }
    }

    private void showToast(int i)
    {
        Toasts.show(PurchaseRecordDetailActivity.this, i);
    }

    public final void onFailure(Exception exception)
    {
        analyticsUtil.sendError("CancelOutgoingMoneyRequest", new AnalyticsCustomDimension[0]);
        WLog.e(PurchaseRecordDetailActivity.access$800(), "Failed to cancel money request", exception);
        showToast(com.google.android.apps.walletnfcrel.iled);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.neyRequestResponse)obj);
    }

    ()
    {
        this$0 = PurchaseRecordDetailActivity.this;
        super();
    }
}
