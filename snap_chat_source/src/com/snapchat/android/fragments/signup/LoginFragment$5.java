// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            LoginFragment

final class a
    implements android.view.ener
{

    private LoginFragment a;

    public final void onClick(View view)
    {
        LoginFragment.b(a).setText("");
        LoginFragment.f(a);
    }

    (LoginFragment loginfragment)
    {
        a = loginfragment;
        super();
    }
}
