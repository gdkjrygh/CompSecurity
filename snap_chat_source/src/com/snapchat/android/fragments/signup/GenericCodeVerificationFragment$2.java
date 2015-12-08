// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            GenericCodeVerificationFragment

final class a
    implements TextWatcher
{

    private GenericCodeVerificationFragment a;

    public final void afterTextChanged(Editable editable)
    {
        a.a(null);
        a.t();
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (GenericCodeVerificationFragment genericcodeverificationfragment)
    {
        a = genericcodeverificationfragment;
        super();
    }
}
