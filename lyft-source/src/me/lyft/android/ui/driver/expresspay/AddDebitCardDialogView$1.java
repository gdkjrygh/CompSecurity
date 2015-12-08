// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.view.View;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.utils.Keyboard;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            AddDebitCardDialogView

class this._cls0
    implements android.view.ddDebitCardDialogView._cls1
{

    final AddDebitCardDialogView this$0;

    public void onClick(View view)
    {
        Keyboard.hideKeyboard(creditCardInput);
        dialogFlow.dismiss();
    }

    ()
    {
        this$0 = AddDebitCardDialogView.this;
        super();
    }
}
