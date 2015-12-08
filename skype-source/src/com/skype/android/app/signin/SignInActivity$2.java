// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package com.skype.android.app.signin:
//            SignInActivity

final class this._cls0
    implements TextWatcher
{

    final SignInActivity this$0;

    public final void afterTextChanged(Editable editable)
    {
        int i = editable.length();
        editable = getString(0x7f08042a);
        if (i > 0)
        {
            editable = getResources().getQuantityString(0x7f0b0014, i, new Object[] {
                Integer.valueOf(i)
            });
        }
        passwordEdit.setContentDescription(editable);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        enableSignInButton();
    }

    ()
    {
        this$0 = SignInActivity.this;
        super();
    }
}
