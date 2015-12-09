// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.content.DialogInterface;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            ViewRecurringTopupActivity, CancelRecurringTopupAction, RecurringTopupEvent

final class this._cls0
    implements android.content.er
{

    final ViewRecurringTopupActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            progressSpinnerManager.showImmediately();
            WLog.i(ViewRecurringTopupActivity.access$000(), "Canceling recurring topup");
            analyticsUtil.sendButtonTap("RecurringTransferCancel", new AnalyticsCustomDimension[] {
                ViewRecurringTopupActivity.access$100(ViewRecurringTopupActivity.this)
            });
            executeAction("CANCEL", new CancelRecurringTopupAction(recurringTopupPublisher, ViewRecurringTopupActivity.access$200(ViewRecurringTopupActivity.this).getTopupSchedule().serverData, true));
        }
    }

    innerManager()
    {
        this$0 = ViewRecurringTopupActivity.this;
        super();
    }
}
