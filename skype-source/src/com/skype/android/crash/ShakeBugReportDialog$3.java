// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

// Referenced classes of package com.skype.android.crash:
//            ShakeBugReportDialog

final class c
    implements TextWatcher
{

    final EditText a;
    final EditText b;
    final Button c;
    final ShakeBugReportDialog d;

    public final void afterTextChanged(Editable editable)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a.getText().toString().length() > 5)
        {
            flag = flag1;
            if (b.getText().toString().length() > 5)
            {
                flag = true;
            }
        }
        c.setEnabled(flag);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (ShakeBugReportDialog shakebugreportdialog, EditText edittext, EditText edittext1, Button button)
    {
        d = shakebugreportdialog;
        a = edittext;
        b = edittext1;
        c = button;
        super();
    }
}
