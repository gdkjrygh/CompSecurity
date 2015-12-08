// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment

class this._cls0
    implements android.view.ner
{

    final LoginDialogFragment this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            ((InputMethodManager)getActivity().getSystemService("input_method")).toggleSoftInput(2, 1);
        }
    }

    ()
    {
        this$0 = LoginDialogFragment.this;
        super();
    }
}
