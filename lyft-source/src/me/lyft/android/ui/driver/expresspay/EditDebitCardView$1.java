// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            EditDebitCardView

class this._cls0
    implements me.lyft.android.ui.payment.cardinput.putChangedListener
{

    final EditDebitCardView this$0;

    public void onInputChanged()
    {
        inlineErrorText.setVisibility(8);
    }

    putChangedListener()
    {
        this$0 = EditDebitCardView.this;
        super();
    }
}
