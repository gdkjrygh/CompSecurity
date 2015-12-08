// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.login;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.fitbit.onboarding.login:
//            LoginActivity

class a
    implements TextWatcher
{

    final LoginActivity a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.d();
    }

    (LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }
}
