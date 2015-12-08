// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            SignupFragment

final class a
    implements TextWatcher
{

    private SignupFragment a;

    public final void afterTextChanged(Editable editable)
    {
        SignupFragment.d(a);
        SignupFragment.e(a);
        if (!SignupFragment.f(a))
        {
            SignupFragment.a(a, true);
        }
        SignupFragment.h();
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
