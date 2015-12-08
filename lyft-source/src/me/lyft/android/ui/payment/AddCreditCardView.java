// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import me.lyft.android.utils.Keyboard;
import rx.Observable;

// Referenced classes of package me.lyft.android.ui.payment:
//            BaseCreditCardView

public class AddCreditCardView extends BaseCreditCardView
{

    AdvancedEditText cardNumberEditText;
    AdvancedEditText expiresEditText;

    public AddCreditCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private String getCardNumberFromScreen()
    {
        return ((PaymentScreens.AddCreditCardScreen)getScreen()).getCardNumber();
    }

    private void setCardNumberText(String s)
    {
        if (!Strings.isNullOrEmpty(s))
        {
            cardNumberEditText.setTextAndMoveCursor(s);
            expiresEditText.requestFocus();
            Keyboard.showKeyboard(expiresEditText);
            return;
        } else
        {
            creditCardInput.showSoftwareKeyboard();
            return;
        }
    }

    protected int getToolbarTitleResource()
    {
        return 0x7f070243;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setCardNumberText(getCardNumberFromScreen());
    }

    protected Observable saveCardRequest(ICard icard, String s, String s1)
    {
        return paymentService.createCreditCard(icard, s, s1);
    }
}
