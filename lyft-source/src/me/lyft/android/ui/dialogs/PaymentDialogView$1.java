// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.utils.Keyboard;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            PaymentDialogView

class this._cls0
    implements android.view.
{

    final PaymentDialogView this$0;

    public void onClick(View view)
    {
        Keyboard.hideKeyboard(creditCardInput);
        dialogFlow.dismiss();
        PaymentAnalytics.trackPaymentDialogClose();
    }

    ics()
    {
        this$0 = PaymentDialogView.this;
        super();
    }
}
