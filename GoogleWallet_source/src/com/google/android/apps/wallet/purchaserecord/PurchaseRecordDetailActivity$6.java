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

    private void onSuccess(com.google.wallet.proto.api.inderResponse inderresponse)
    {
        if (inderresponse.callError != null)
        {
            analyticsUtil.sendError("RequestMoneyRemind", new AnalyticsCustomDimension[0]);
            if (inderresponse.callError.nt != null && inderresponse.callError. != null)
            {
                WLog.e(PurchaseRecordDetailActivity.access$800(), inderresponse.callError.ing());
                AlertDialogFragment.newBuilder().Title(inderresponse.callError.).Message(inderresponse.callError.nt).ld().show(getSupportFragmentManager());
                return;
            } else
            {
                Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel._failed));
                return;
            }
        } else
        {
            analyticsUtil.sendSuccess("RequestMoneyRemind", new AnalyticsCustomDimension[0]);
            Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel._sent));
            purchaseRecordPublisher.reload();
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
        analyticsUtil.sendError("RequestMoneyRemind", new AnalyticsCustomDimension[0]);
        WLog.e(PurchaseRecordDetailActivity.access$800(), "Failed to send reminder for money request", exception);
        Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel._failed));
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.inderResponse)obj);
    }

    ()
    {
        this$0 = PurchaseRecordDetailActivity.this;
        super();
    }
}
