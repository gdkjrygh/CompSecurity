// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            LoginFragment

final class a
    implements android.view.ener
{

    private LoginFragment a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        LoginFragment.h(a).setBackgroundDrawable(LoginFragment.g(a));
        return false;
    }

    (LoginFragment loginfragment)
    {
        a = loginfragment;
        super();
    }
}
