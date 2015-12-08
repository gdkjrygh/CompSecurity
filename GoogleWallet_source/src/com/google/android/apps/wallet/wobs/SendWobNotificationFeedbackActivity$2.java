// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.gms.feedback.Feedback;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            SendWobNotificationFeedbackActivity

final class val.reason
    implements AsyncCallback
{

    final SendWobNotificationFeedbackActivity this$0;
    final String val$reason;

    private void onSuccess(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("geofence_info", s);
        s = (new com.google.android.gms.feedback.y()).y(bundle).e(accountName).("com.google.android.apps.walletnfcrel.WOB_NOTIFICATION_FEEDBACK");
        if (!val$reason.equals(getResources().getString(com.google.android.apps.walletnfcrel.ason_other)))
        {
            s.(val$reason);
        }
        Feedback.startFeedback(SendWobNotificationFeedbackActivity.access$000(SendWobNotificationFeedbackActivity.this), s.y());
        finish();
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(SendWobNotificationFeedbackActivity.access$100(), "Error creating userFeedback.", exception);
        finish();
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    ()
    {
        this$0 = final_sendwobnotificationfeedbackactivity;
        val$reason = String.this;
        super();
    }
}
