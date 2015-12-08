// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.pandora.android.view.ValidatingEditText;

// Referenced classes of package com.pandora.android.activity:
//            ForgotPasswordActivity

class a
    implements TextWatcher
{

    final ForgotPasswordActivity a;

    public void afterTextChanged(Editable editable)
    {
        ForgotPasswordActivity.b(a).setEnabled(ForgotPasswordActivity.a(a).b());
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (ForgotPasswordActivity forgotpasswordactivity)
    {
        a = forgotpasswordactivity;
        super();
    }
}
