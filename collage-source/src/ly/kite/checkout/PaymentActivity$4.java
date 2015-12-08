// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.app.ProgressDialog;
import ly.kite.payment.PayPalCard;
import ly.kite.payment.PayPalCardChargeListener;

// Referenced classes of package ly.kite.checkout:
//            PaymentActivity

class val.dialog
    implements PayPalCardChargeListener
{

    final PaymentActivity this$0;
    final ProgressDialog val$dialog;

    public void onChargeSuccess(PayPalCard paypalcard, String s)
    {
        val$dialog.dismiss();
        PaymentActivity.access$400(PaymentActivity.this, s);
        paypalcard.saveAsLastUsedCard(PaymentActivity.this);
    }

    public void onError(PayPalCard paypalcard, Exception exception)
    {
        val$dialog.dismiss();
        PaymentActivity.access$600(PaymentActivity.this, exception.getMessage());
    }

    tener()
    {
        this$0 = final_paymentactivity;
        val$dialog = ProgressDialog.this;
        super();
    }
}
