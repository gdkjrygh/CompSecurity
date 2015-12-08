// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.ui;

import android.content.Intent;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.ui:
//            PaymentCardDetailsActivity

final class this._cls0
    implements AsyncCallback
{

    final PaymentCardDetailsActivity this$0;

    private void onSuccess(Intent intent)
    {
        analyticsUtil.sendScreen("Edit Payment Card", new AnalyticsCustomDimension[0]);
        startActivityForResult(intent, 1);
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(PaymentCardDetailsActivity.access$200(), "Could not create intent to edit instrument", exception);
        finish();
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Intent)obj);
    }

    ()
    {
        this$0 = PaymentCardDetailsActivity.this;
        super();
    }
}
