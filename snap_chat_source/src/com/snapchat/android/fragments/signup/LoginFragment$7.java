// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.Button;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            LoginFragment

final class a
    implements Runnable
{

    private LoginFragment a;

    public final void run()
    {
        TransitionDrawable transitiondrawable = new TransitionDrawable(new Drawable[] {
            new ColorDrawable(LoginFragment.h()), new ColorDrawable(LoginFragment.m())
        });
        int i = LoginFragment.h(a).getPaddingBottom();
        LoginFragment.h(a).setBackgroundDrawable(transitiondrawable);
        LoginFragment.h(a).setPadding(i, i, i, i);
        transitiondrawable.startTransition(400);
    }

    (LoginFragment loginfragment)
    {
        a = loginfragment;
        super();
    }
}
