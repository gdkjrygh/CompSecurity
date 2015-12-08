// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.a.a;
import com.facebook.internal.L;
import com.facebook.l;
import com.facebook.login.o;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton, d

private final class <init>
    implements android.view.stener
{

    final LoginButton a;

    public final void onClick(View view)
    {
        com.facebook.login.widget.LoginButton.a(a, view);
        Object obj1 = a.getContext();
        AccessToken accesstoken = AccessToken.a();
        int i;
        if (accesstoken != null)
        {
            if (LoginButton.c(a))
            {
                Object obj = a.getResources().getString(com.facebook.ok_loginview_log_out_action);
                String s = a.getResources().getString(com.facebook.ok_loginview_cancel_action);
                view = Profile.a();
                if (view != null && ((Profile) (view)).a != null)
                {
                    view = String.format(a.getResources().getString(com.facebook.ok_loginview_logged_in_as), new Object[] {
                        ((Profile) (view)).a
                    });
                } else
                {
                    view = a.getResources().getString(com.facebook.ok_loginview_logged_in_using_facebook);
                }
                obj1 = new android.app.ilder(((android.content.Context) (obj1)));
                ((android.app.ilder) (obj1)).setMessage(view).setCancelable(true).setPositiveButton(((CharSequence) (obj)), new d(this)).setNegativeButton(s, null);
                ((android.app.ilder) (obj1)).create().show();
            } else
            {
                a.d();
                o.b();
            }
        } else
        {
            view = a.d();
            view.b = a.c.a;
            view.a = a.c.d;
            if (L.b.equals(LoginButton.d(a).c))
            {
                if (((l) (a)).b != null)
                {
                    view.b(((l) (a)).b, LoginButton.d(a).b);
                } else
                {
                    view.b(LoginButton.e(a), LoginButton.d(a).b);
                }
            } else
            if (((l) (a)).b != null)
            {
                view.a(((l) (a)).b, LoginButton.d(a).b);
            } else
            {
                view.a(LoginButton.f(a), LoginButton.d(a).b);
            }
        }
        view = com.facebook.a.a.a(a.getContext());
        obj = new Bundle();
        if (accesstoken != null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((Bundle) (obj)).putInt("logging_in", i);
        view.a(LoginButton.g(a), ((Bundle) (obj)), true);
    }

    private (LoginButton loginbutton)
    {
        a = loginbutton;
        super();
    }

    a(LoginButton loginbutton, byte byte0)
    {
        this(loginbutton);
    }
}
