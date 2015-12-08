// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.LoginButton;
import com.tinder.managers.ManagerApp;

// Referenced classes of package com.tinder.fragments:
//            ba

final class a
    implements android.view.OnClickListener
{

    final ba a;

    public final void onClick(View view)
    {
        if (a.b != null)
        {
            a.b.d();
        }
        LoginButton loginbutton = a.a;
        if (ManagerApp.b)
        {
            view = LoginBehavior.a;
        } else
        {
            view = LoginBehavior.c;
        }
        loginbutton.setLoginBehavior(view);
        a.a.performClick();
    }

    LoginButton(ba ba1)
    {
        a = ba1;
        super();
    }
}
