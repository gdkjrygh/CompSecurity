// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CreditCardInput

class this._cls0
    implements InputChangedListener
{

    final CreditCardInput this$0;

    public void onInputChanged()
    {
        creditCardErrorTextView.setVisibility(8);
        resetHighlight();
        cardNumberEditText.setHint(0x7f070252);
    }

    InputChangedListener()
    {
        this$0 = CreditCardInput.this;
        super();
    }
}
