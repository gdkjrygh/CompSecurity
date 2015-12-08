// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.LoginButton;
import com.tinder.managers.ManagerApp;

// Referenced classes of package com.tinder.fragments:
//            FragmentIntro

final class a
    implements android.view.ener
{

    final FragmentIntro a;

    public final void onClick(View view)
    {
        if (a.e != null)
        {
            a.e.d();
        }
        LoginButton loginbutton = a.b;
        if (ManagerApp.b)
        {
            view = LoginBehavior.a;
        } else
        {
            view = LoginBehavior.c;
        }
        loginbutton.setLoginBehavior(view);
        a.b.performClick();
    }

    (FragmentIntro fragmentintro)
    {
        a = fragmentintro;
        super();
    }
}
