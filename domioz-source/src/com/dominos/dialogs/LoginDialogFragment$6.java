// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment

class this._cls0
    implements android.view.ment._cls6
{

    final LoginDialogFragment this$0;

    public void onClick(View view)
    {
        mPasswordEntry.requestFocus();
        ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(mPasswordEntry, 1);
    }

    r()
    {
        this$0 = LoginDialogFragment.this;
        super();
    }
}
