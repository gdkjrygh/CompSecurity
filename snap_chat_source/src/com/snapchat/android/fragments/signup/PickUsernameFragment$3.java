// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Collections;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class a
    implements TextWatcher
{

    private PickUsernameFragment a;

    public final void afterTextChanged(Editable editable)
    {
        a.a(null);
        a.a(ernameState.CLEAR);
        if (!PickUsernameFragment.c(a))
        {
            a.a(Collections.emptyList());
            PickUsernameFragment.a(a, true);
        }
        a.m();
        if (!PickUsernameFragment.d(a))
        {
            PickUsernameFragment.b(a, true);
        }
        PickUsernameFragment.e(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    ernameState(PickUsernameFragment pickusernamefragment)
    {
        a = pickusernamefragment;
        super();
    }
}
