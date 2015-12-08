// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            PaymentDialogView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PaymentDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PaymentDialogView paymentdialogview, Object obj)
    {
        paymentdialogview.closeButton = (View)viewinjector.closeButton(obj, 0x7f0d0069, "field 'closeButton'");
        paymentdialogview.walletButton = (View)viewinjector.walletButton(obj, 0x7f0d031d, "field 'walletButton'");
        paymentdialogview.paypalButton = (View)viewinjector.paypalButton(obj, 0x7f0d031e, "field 'paypalButton'");
        paymentdialogview.saveCreditCard = (View)viewinjector.saveCreditCard(obj, 0x7f0d0332, "field 'saveCreditCard'");
        paymentdialogview.creditCardInput = (CreditCardInput)viewinjector.ardInput((View)viewinjector.ardInput(obj, 0x7f0d032d, "field 'creditCardInput'"), 0x7f0d032d, "field 'creditCardInput'");
        paymentdialogview.otherPaymentGroup = (View)viewinjector.otherPaymentGroup(obj, 0x7f0d032f, "field 'otherPaymentGroup'");
        paymentdialogview.sslEncryptedTextView = (TextView)viewinjector.sslEncryptedTextView((View)viewinjector.sslEncryptedTextView(obj, 0x7f0d0331, "field 'sslEncryptedTextView'"), 0x7f0d0331, "field 'sslEncryptedTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PaymentDialogView)obj);
    }

    public void reset(PaymentDialogView paymentdialogview)
    {
        paymentdialogview.closeButton = null;
        paymentdialogview.walletButton = null;
        paymentdialogview.paypalButton = null;
        paymentdialogview.saveCreditCard = null;
        paymentdialogview.creditCardInput = null;
        paymentdialogview.otherPaymentGroup = null;
        paymentdialogview.sslEncryptedTextView = null;
    }

    public ()
    {
    }
}
