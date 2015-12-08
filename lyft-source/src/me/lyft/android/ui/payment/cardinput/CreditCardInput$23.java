// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import me.lyft.android.controls.AdvancedEditText;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            ZipCodeTextWatcher, CreditCardInput

class <init> extends ZipCodeTextWatcher
{

    final CreditCardInput this$0;

    public void onMaxLengthReached()
    {
        super.onMaxLengthReached();
        if (CreditCardInput.access$800(CreditCardInput.this))
        {
            addressEditText.requestFocusAndMoverCursor();
            CreditCardInput.access$1000(CreditCardInput.this, zipEditText.getText().toString(), CreditCardInput.access$900(CreditCardInput.this));
        }
    }

    (String s)
    {
        this$0 = CreditCardInput.this;
        super(s);
    }
}
