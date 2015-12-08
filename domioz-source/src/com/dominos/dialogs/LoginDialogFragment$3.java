// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment

class this._cls0
    implements android.widget.nListener
{

    final LoginDialogFragment this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            showLoading();
            executeLogin(mPasswordEntry.getText().toString());
            return true;
        } else
        {
            return false;
        }
    }

    ener()
    {
        this$0 = LoginDialogFragment.this;
        super();
    }
}
