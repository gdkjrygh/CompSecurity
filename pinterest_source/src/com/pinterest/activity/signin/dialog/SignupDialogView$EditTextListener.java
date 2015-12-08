// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.pinterest.kit.utils.SignupFormUtils;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupDialogView

public class _et
    implements TextWatcher, android.view.ogView.EditTextListener
{

    private EditText _et;
    final SignupDialogView this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onFocusChange(View view, boolean flag)
    {
        int i = 1;
        if (flag) goto _L2; else goto _L1
_L1:
        int j;
        j = _et.getId();
        view = _et.getText().toString();
        j;
        JVM INSTR lookupswitch 4: default 72
    //                   2131689844: 104
    //                   2131689845: 116
    //                   2131689884: 128
    //                   2131689894: 92;
           goto _L2 _L3 _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_128;
_L2:
        i = 0;
_L7:
        view = _et;
        if (i != 0)
        {
            i = 0x7f020219;
        } else
        {
            i = 0x7f020136;
        }
        view.setBackgroundResource(i);
        return;
_L6:
        if (SignupFormUtils.isFirstNameValid(view))
        {
            i = 0;
        }
          goto _L7
_L3:
        if (SignupFormUtils.isEmailValid(view))
        {
            i = 0;
        }
          goto _L7
_L4:
        if (SignupFormUtils.isPasswordValid(view))
        {
            i = 0;
        }
          goto _L7
        if (SignupFormUtils.isBusinessNameValid(view))
        {
            i = 0;
        }
          goto _L7
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    protected (EditText edittext)
    {
        this$0 = SignupDialogView.this;
        super();
        _et = edittext;
    }
}
