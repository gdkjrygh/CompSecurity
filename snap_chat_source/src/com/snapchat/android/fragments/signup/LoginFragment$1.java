// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.Locale;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            LoginFragment

final class a
    implements android.view.ener
{

    private LoginFragment a;

    public final void onClick(View view)
    {
        ((InputMethodManager)a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(LoginFragment.a(a).getApplicationWindowToken(), 0);
        LoginFragment.a(a).getText().toString().trim().toLowerCase(Locale.US);
        LoginFragment.b(a).getText().toString().trim();
        LoginFragment.c(a);
    }

    (LoginFragment loginfragment)
    {
        a = loginfragment;
        super();
    }
}
