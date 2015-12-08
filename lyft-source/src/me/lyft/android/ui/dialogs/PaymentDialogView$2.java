// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import me.lyft.android.utils.ViewExtensions;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            PaymentDialogView

class this._cls0
    implements me.lyft.android.ui.payment.cardinput.putChangedListener
{

    final PaymentDialogView this$0;

    public void onInputChanged()
    {
        if (creditCardInput.getCard().isEmpty())
        {
            otherPaymentGroup.setVisibility(0);
            ViewExtensions.setVisibility(8, new View[] {
                sslEncryptedTextView, saveCreditCard
            });
        } else
        {
            otherPaymentGroup.setVisibility(8);
            ViewExtensions.setVisibility(0, new View[] {
                sslEncryptedTextView, saveCreditCard
            });
            if (creditCardInput.getCard().validateCard())
            {
                PaymentAnalytics.trackEnterCreditCard();
                return;
            }
        }
    }

    ics()
    {
        this$0 = PaymentDialogView.this;
        super();
    }
}
