// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditFacebookCreditCardView

class this._cls0
    implements android.view.ditCardView._cls2
{

    final EditFacebookCreditCardView this$0;

    public void onClick(View view)
    {
        view = PaymentAnalytics.trackOpenFacebookMessenger();
        try
        {
            WebBrowser.open(getContext(), "fb-messenger://payments/settings");
            view.trackSuccess();
            return;
        }
        catch (Throwable throwable)
        {
            view.trackFailure(throwable);
        }
        dialogFlow.show(new gerNotInstalledDialogScreen());
    }

    gerNotInstalledDialogScreen()
    {
        this$0 = EditFacebookCreditCardView.this;
        super();
    }
}
