// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.content.res.Resources;
import android.text.Editable;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.SimpleTextWatcher;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            EditDebitCardView

class this._cls0 extends SimpleTextWatcher
{

    final EditDebitCardView this$0;

    public void afterTextChanged(Editable editable)
    {
        super.afterTextChanged(editable);
        if (editable.length() == 0)
        {
            cardNumberEditText.setHint(getResources().getText(0x7f0700ef));
        }
    }

    ()
    {
        this$0 = EditDebitCardView.this;
        super();
    }
}
