// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.pandora.android.activity:
//            SignUpActivity

class a
    implements TextWatcher
{

    final SignUpActivity a;

    public void afterTextChanged(Editable editable)
    {
        SignUpActivity.a(a);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (SignUpActivity signupactivity)
    {
        a = signupactivity;
        super();
    }
}
