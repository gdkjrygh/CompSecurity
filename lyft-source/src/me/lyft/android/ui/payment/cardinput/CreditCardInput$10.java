// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;


// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CardExpiryFormattingTextWatcher, CreditCardInput

class gTextWatcher extends CardExpiryFormattingTextWatcher
{

    final CreditCardInput this$0;

    public void onCardExpiryChanged(String s)
    {
        super.onCardExpiryChanged(s);
        CreditCardInput.access$300(CreditCardInput.this);
    }

    public void onMaxLengthReached()
    {
        super.onMaxLengthReached();
        CreditCardInput.access$500(CreditCardInput.this);
    }

    gTextWatcher()
    {
        this$0 = CreditCardInput.this;
        super();
    }
}
