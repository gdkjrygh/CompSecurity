// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;


// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CardNumberFormattingTextWatcher, CreditCardInput

class ngTextWatcher extends CardNumberFormattingTextWatcher
{

    final CreditCardInput this$0;

    public void onCardNumberChanged(String s)
    {
        super.onCardNumberChanged(s);
        CreditCardInput.access$200(CreditCardInput.this);
        CreditCardInput.access$300(CreditCardInput.this);
    }

    public void onMaxLengthReached()
    {
        super.onMaxLengthReached();
        CreditCardInput.access$400(CreditCardInput.this);
    }

    ngTextWatcher()
    {
        this$0 = CreditCardInput.this;
        super();
    }
}
