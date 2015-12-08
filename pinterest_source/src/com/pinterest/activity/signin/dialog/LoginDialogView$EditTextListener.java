// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialogView

class <init>
    implements android.view.ogView.EditTextListener
{

    private EditText _et;
    final LoginDialogView this$0;

    public void onFocusChange(View view, boolean flag)
    {
        boolean flag1 = false;
        if (!flag)
        {
            flag1 = _et.getText().toString().isEmpty();
        }
        view = _et;
        int i;
        if (flag1)
        {
            i = 0x7f020219;
        } else
        {
            i = 0x7f020136;
        }
        view.setBackgroundResource(i);
    }

    private (EditText edittext)
    {
        this$0 = LoginDialogView.this;
        super();
        _et = edittext;
    }

    _et(EditText edittext, _et _pet)
    {
        this(edittext);
    }
}
