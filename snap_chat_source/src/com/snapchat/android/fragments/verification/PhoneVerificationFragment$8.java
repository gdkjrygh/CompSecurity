// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

final class a
    implements TextWatcher
{

    private PhoneVerificationFragment a;

    public final void afterTextChanged(Editable editable)
    {
        PhoneVerificationFragment.e(a);
        a.u();
        if (!PhoneVerificationFragment.f(a))
        {
            PhoneVerificationFragment.b(a, true);
        }
        PhoneVerificationFragment.g(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (PhoneVerificationFragment phoneverificationfragment)
    {
        a = phoneverificationfragment;
        super();
    }
}
