// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.view.KeyEvent;
import android.widget.TextView;
import me.lyft.android.domain.payment.ICard;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CreditCardInput

class this._cls0
    implements android.widget.ctionListener
{

    final CreditCardInput this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 5 && getCard().validateNumber())
        {
            CreditCardInput.access$100(CreditCardInput.this, expiresEditText);
        }
        return true;
    }

    ()
    {
        this$0 = CreditCardInput.this;
        super();
    }
}
