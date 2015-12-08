// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import android.widget.TextView;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapCompletedActivity

final class val.id
    implements AsyncCallback
{

    final TapCompletedActivity this$0;
    final String val$id;

    private void onSuccess(PurchaseRecord purchaserecord)
    {
        TapCompletedActivity.access$202(TapCompletedActivity.this, true);
        purchaseRecord = purchaserecord;
        TapCompletedActivity.access$300(TapCompletedActivity.this);
        if (TapCompletedActivity.access$400(TapCompletedActivity.this) != ansactionDetailState.NOT_STARTED && TapCompletedActivity.access$400(TapCompletedActivity.this) != ansactionDetailState.DETAILS_DONE)
        {
            TapCompletedActivity.access$500(TapCompletedActivity.this);
        }
        TapCompletedActivity.access$600(TapCompletedActivity.this).setVisibility(4);
        TapCompletedActivity.access$702(TapCompletedActivity.this, false);
        eventBus.unregisterAll(this);
    }

    public final void onFailure(Exception exception)
    {
        String s = TapCompletedActivity.access$800();
        exception = String.valueOf(val$id);
        if (exception.length() != 0)
        {
            exception = "Unable to fetch purchase record for id: ".concat(exception);
        } else
        {
            exception = new String("Unable to fetch purchase record for id: ");
        }
        WLog.d(s, exception);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((PurchaseRecord)obj);
    }

    ansactionDetailState()
    {
        this$0 = final_tapcompletedactivity;
        val$id = String.this;
        super();
    }
}
