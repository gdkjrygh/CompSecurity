// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.purchaserecord.api.NewPurchaseRecordReceiptEvent;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            DeclineMoneyRequestDialog

final class val.reason
    implements AsyncCallback
{

    final DeclineMoneyRequestDialog this$0;
    final String val$eventLabel;
    final int val$reason;

    private void onSuccess(com.google.wallet.proto.api.ineMoneyRequestResponse inemoneyrequestresponse)
    {
        if (inemoneyrequestresponse.callError != null)
        {
            WLog.e(DeclineMoneyRequestDialog.access$100(), inemoneyrequestresponse.callError.String());
            analyticsUtil.sendError(val$eventLabel, new AnalyticsCustomDimension[0]);
            showToast(com.google.android.apps.walletnfcrel.ne_failed);
        } else
        {
            analyticsUtil.sendSuccess(val$eventLabel, new AnalyticsCustomDimension[0]);
            int i;
            if (val$reason == 2)
            {
                i = com.google.android.apps.walletnfcrel.ne_complete;
            } else
            {
                i = com.google.android.apps.walletnfcrel.spam_complete;
            }
            showToast(i);
            eventBus.post(Integer.valueOf(13), new NewPurchaseRecordReceiptEvent());
        }
        if (DeclineMoneyRequestDialog.access$200(DeclineMoneyRequestDialog.this) != null)
        {
            DeclineMoneyRequestDialog.access$200(DeclineMoneyRequestDialog.this).run();
        }
    }

    private void showToast(int i)
    {
        Toasts.show(application, i);
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(DeclineMoneyRequestDialog.access$100(), "Failed to decline request", exception);
        analyticsUtil.sendError(val$eventLabel, new AnalyticsCustomDimension[0]);
        showToast(com.google.android.apps.walletnfcrel.ne_failed);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.ineMoneyRequestResponse)obj);
    }

    ponse()
    {
        this$0 = final_declinemoneyrequestdialog;
        val$eventLabel = s;
        val$reason = I.this;
        super();
    }
}
