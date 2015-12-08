// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.app.ProgressDialog;
import ly.kite.payment.PayPalCard;
import ly.kite.payment.PayPalCardVaultStorageListener;

// Referenced classes of package ly.kite.checkout:
//            PaymentActivity

class val.dialog
    implements PayPalCardVaultStorageListener
{

    final PaymentActivity this$0;
    final ProgressDialog val$dialog;

    public void onError(PayPalCard paypalcard, Exception exception)
    {
        if (val$dialog.isShowing())
        {
            val$dialog.dismiss();
        }
        PaymentActivity.access$200(PaymentActivity.this, exception.getMessage());
    }

    public void onStoreSuccess(PayPalCard paypalcard)
    {
        if (val$dialog.isShowing())
        {
            val$dialog.dismiss();
        }
        PaymentActivity.access$100(PaymentActivity.this, paypalcard);
    }

    ageListener()
    {
        this$0 = final_paymentactivity;
        val$dialog = ProgressDialog.this;
        super();
    }
}
