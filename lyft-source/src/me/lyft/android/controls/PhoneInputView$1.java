// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package me.lyft.android.controls:
//            PhoneInputView, KeyboardlessEditText

class this._cls0
    implements TextWatcher
{

    final PhoneInputView this$0;

    public void afterTextChanged(Editable editable)
    {
        if (editable.length() > 0)
        {
            phoneEditText.setGravity(17);
        } else
        {
            phoneEditText.setGravity(3);
        }
        requestEditTextFocus();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    ext()
    {
        this$0 = PhoneInputView.this;
        super();
    }
}
