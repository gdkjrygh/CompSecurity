// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.domain.payment.ICard;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CreditCardInput

class this._cls0
    implements Action1
{

    final CreditCardInput this$0;

    public volatile void call(Object obj)
    {
        call((ICard)obj);
    }

    public void call(ICard icard)
    {
        clearCardEditTexts();
        cardNumberEditText.setTextAndMoveCursor(icard.getNumber());
        showSoftwareKeyboard();
    }

    ()
    {
        this$0 = CreditCardInput.this;
        super();
    }
}
