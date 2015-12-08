// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.widget.TextView;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.pin.PinSettingsActivity;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            LegacySetupNfcPaymentCongratsActivity

final class this._cls0
    implements AsyncCallback
{

    final LegacySetupNfcPaymentCongratsActivity this$0;

    private void onSuccess(Integer integer)
    {
        boolean flag = true;
        LegacySetupNfcPaymentCongratsActivity.access$002(LegacySetupNfcPaymentCongratsActivity.this, true);
        if (integer.intValue() != 0)
        {
            flag = false;
        }
        updatePinTimeoutMessage(flag);
        LegacySetupNfcPaymentCongratsActivity.access$100(LegacySetupNfcPaymentCongratsActivity.this);
    }

    private void updatePinTimeoutMessage(boolean flag)
    {
        if (!flag)
        {
            LegacySetupNfcPaymentCongratsActivity.access$300(LegacySetupNfcPaymentCongratsActivity.this).setVisibility(8);
            return;
        } else
        {
            Views.setNativeLink(LegacySetupNfcPaymentCongratsActivity.access$300(LegacySetupNfcPaymentCongratsActivity.this), com.google.android.apps.walletnfcrel.expiration_reminder, InternalIntents.forClass(LegacySetupNfcPaymentCongratsActivity.this, com/google/android/apps/wallet/pin/PinSettingsActivity));
            LegacySetupNfcPaymentCongratsActivity.access$300(LegacySetupNfcPaymentCongratsActivity.this).setVisibility(0);
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
        LegacySetupNfcPaymentCongratsActivity.access$002(LegacySetupNfcPaymentCongratsActivity.this, true);
        updatePinTimeoutMessage(true);
        LegacySetupNfcPaymentCongratsActivity.access$100(LegacySetupNfcPaymentCongratsActivity.this);
        WLog.d(LegacySetupNfcPaymentCongratsActivity.access$200(), "Unable to fetch pin timeout from the secure pin manager, default to show user reminder message");
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Integer)obj);
    }

    ()
    {
        this$0 = LegacySetupNfcPaymentCongratsActivity.this;
        super();
    }
}
