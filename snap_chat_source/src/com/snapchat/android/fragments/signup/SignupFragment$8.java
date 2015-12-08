// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.View;
import android.widget.EditText;
import dA;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            SignupFragment

final class a
    implements android.view.ner
{

    private SignupFragment a;

    public final void onClick(View view)
    {
        if (!dA.c(SignupFragment.g(a)))
        {
            SignupFragment.c(a).setText(SignupFragment.g(a));
        }
    }

    (SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
