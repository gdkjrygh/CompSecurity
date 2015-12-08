// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.async.ActionExecutor;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            VerifyCloudPinActivity, UserPin

final class this._cls0
    implements OnActionListener
{

    final VerifyCloudPinActivity this$0;

    private void onAction(UserPin userpin)
    {
        WLog.d(VerifyCloudPinActivity.access$000(), "Entered: PinEnteredListener.onAction()");
        appStartTimeLogger.notifyVerifyPin();
        analyticsUtil.startTiming(null, "user_verify_pin");
        VerifyCloudPinActivity.access$100(VerifyCloudPinActivity.this, splayState.WAITING, false);
        actionExecutor.executeAction(new rifyPinAction(VerifyCloudPinActivity.this, userpin), new rifyPinCallback(VerifyCloudPinActivity.this));
    }

    public final volatile void onAction(Object obj)
    {
        onAction((UserPin)obj);
    }

    rifyPinCallback()
    {
        this$0 = VerifyCloudPinActivity.this;
        super();
    }
}
