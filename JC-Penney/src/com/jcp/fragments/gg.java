// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments:
//            SignInFragment

class gg extends DebouncingOnClickListener
{

    final SignInFragment a;
    final SignInFragment..ViewInjector b;

    gg(SignInFragment..ViewInjector viewinjector, SignInFragment signinfragment)
    {
        b = viewinjector;
        a = signinfragment;
        super();
    }

    public void doClick(View view)
    {
        a.onForgotPasswordClicked();
    }
}
