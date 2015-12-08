// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            AddDebitCardDialogView

class this._cls0
    implements me.lyft.android.ui.payment.cardinput.angedListener
{

    final AddDebitCardDialogView this$0;

    public void onInputChanged()
    {
        inlineErrorText.setVisibility(8);
    }

    angedListener()
    {
        this$0 = AddDebitCardDialogView.this;
        super();
    }
}
