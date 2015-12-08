// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCouponView

class this._cls0
    implements TextWatcher
{

    public boolean avoidLoop;
    final AddCouponView this$0;

    public void afterTextChanged(Editable editable)
    {
        if (!avoidLoop)
        {
            avoidLoop = true;
            editable.replace(0, editable.length(), editable.toString().toUpperCase(), 0, editable.length());
            avoidLoop = false;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        boolean flag = true;
        Button button = applyCouponButton;
        if (charsequence.length() <= 1)
        {
            flag = false;
        }
        button.setEnabled(flag);
        inlineCouponError.setVisibility(8);
    }

    ()
    {
        this$0 = AddCouponView.this;
        super();
    }
}
