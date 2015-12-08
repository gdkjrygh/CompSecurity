// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.content.DialogInterface;
import ly.kite.payment.PayPalCard;

// Referenced classes of package ly.kite.checkout:
//            PaymentActivity

class val.lastUsedCard
    implements android.content.ClickListener
{

    final PaymentActivity this$0;
    final PayPalCard val$lastUsedCard;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0)
        {
            PaymentActivity.access$500(PaymentActivity.this);
            return;
        } else
        {
            PaymentActivity.access$100(PaymentActivity.this, val$lastUsedCard);
            return;
        }
    }

    lickListener()
    {
        this$0 = final_paymentactivity;
        val$lastUsedCard = PayPalCard.this;
        super();
    }
}
