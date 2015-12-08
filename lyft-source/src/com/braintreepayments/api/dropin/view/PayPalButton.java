// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class PayPalButton extends ImageButton
{

    public PayPalButton(Context context)
    {
        super(context);
        init();
    }

    public PayPalButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public PayPalButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        setBackgroundResource(com.braintreepayments.api.dropin.R.drawable.bt_paypal_button_background);
        setImageResource(com.braintreepayments.api.dropin.R.drawable.bt_paypal_button);
    }
}
