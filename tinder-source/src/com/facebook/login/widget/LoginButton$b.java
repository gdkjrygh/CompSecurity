// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.login.d;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

private final class <init>
    implements android.view.stener
{

    final LoginButton a;

    public final void onClick(View view)
    {
        LoginButton.a(a, view);
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
                ((android.app.ilder) (obj1)).setMessage(view).setCancelable(true).setPositiveButton(((CharSequence) (obj)), new android.content.DialogInterface.OnClickListener() {

                    final LoginButton.b a;

                    public final void onClick(DialogInterface dialoginterface, int j)
                    {
                        a.a.getLoginManager();
                        d.b();
                    }

            
            {
                a = LoginButton.b.this;
                super();
            }
                }).setNegativeButton(s, null);
                ((android.app.ilder) (obj1)).create().show();
            } else
            {
                a.getLoginManager();
                d.b();
            }
        } else
        {
            view = a.getLoginManager();
            view.b = a.getDefaultAudience();
            view.a = a.getLoginBehavior();
            if (LoginAuthorizationType.b.equals(com.facebook.login.widget.LoginButton.d(a).c))
            {
                if (a.getFragment() != null)
                {
                    view.b(a.getFragment(), com.facebook.login.widget.LoginButton.d(a).b);
                } else
                {
                    view.b(LoginButton.e(a), com.facebook.login.widget.LoginButton.d(a).b);
                }
            } else
            if (a.getFragment() != null)
            {
                view.a(a.getFragment(), com.facebook.login.widget.LoginButton.d(a).b);
            } else
            {
                view.a(LoginButton.f(a), com.facebook.login.widget.LoginButton.d(a).b);
            }
        }
        view = AppEventsLogger.c(a.getContext());
        obj = new Bundle();
        if (accesstoken != null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((Bundle) (obj)).putInt("logging_in", i);
        view.b(LoginButton.g(a), ((Bundle) (obj)));
    }

    private _cls1.a(LoginButton loginbutton)
    {
        a = loginbutton;
        super();
    }

    a(LoginButton loginbutton, byte byte0)
    {
        this(loginbutton);
    }
}
