// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.widget.LinearLayout;
import android.widget.ScrollView;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import me.lyft.android.utils.Keyboard;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentFraudView

class this._cls0
    implements Action1
{

    final PaymentFraudView this$0;

    public volatile void call(Object obj)
    {
        call((ICard)obj);
    }

    public void call(ICard icard)
    {
        enterCreditCardInfoGroup.setVisibility(0);
        scanCardButton.setVisibility(8);
        creditCardInput.clearCardEditTexts();
        cardNumberEditText.setText(icard.getNumber());
        Keyboard.showKeyboard(cvcEditText);
    }

    dInput()
    {
        this$0 = PaymentFraudView.this;
        super();
    }
}
