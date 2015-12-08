// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CreditCardInput

abstract class input
    implements android.view..OnCCInputFocusListener
{

    private CreditCardInput input;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            CreditCardInput.access$1102(input, (EditText)view);
        }
    }

    protected Q(CreditCardInput creditcardinput)
    {
        input = creditcardinput;
    }
}
