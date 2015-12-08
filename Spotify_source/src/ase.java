// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.facebook.AppEventsLogger;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.model.GraphUser;
import com.facebook.widget.LoginButton;

public final class ase
    implements android.view.View.OnClickListener
{

    private LoginButton a;

    private ase(LoginButton loginbutton)
    {
        a = loginbutton;
        super();
    }

    public ase(LoginButton loginbutton, byte byte0)
    {
        this(loginbutton);
    }

    public final void onClick(View view)
    {
        Session session1;
        Object obj3;
        obj3 = a.getContext();
        LoginButton.a(a);
        session1 = arl.a();
        if (session1 == null) goto _L2; else goto _L1
_L1:
        int i;
        if (LoginButton.c(a))
        {
            Object obj2 = a.getResources().getString(0x7f0805fe);
            String s = a.getResources().getString(0x7f0805fc);
            Object obj;
            if (LoginButton.b(a) != null && LoginButton.b(a).getName() != null)
            {
                obj = String.format(a.getResources().getString(0x7f080600), new Object[] {
                    LoginButton.b(a).getName()
                });
            } else
            {
                obj = a.getResources().getString(0x7f080601);
            }
            obj3 = new android.app.AlertDialog.Builder(((android.content.Context) (obj3)));
            ((android.app.AlertDialog.Builder) (obj3)).setMessage(((CharSequence) (obj))).setCancelable(true).setPositiveButton(((CharSequence) (obj2)), new android.content.DialogInterface.OnClickListener(session1) {

                private Session a;

                public final void onClick(DialogInterface dialoginterface, int j)
                {
                    a.f();
                }

            
            {
                a = session;
                super();
            }
            }).setNegativeButton(s, null);
            ((android.app.AlertDialog.Builder) (obj3)).create().show();
        } else
        {
            session1.f();
        }
_L4:
        obj = AppEventsLogger.b(a.getContext());
        obj2 = new Bundle();
        Object obj1;
        Session session;
        if (session1 != null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((Bundle) (obj2)).putInt("logging_in", i);
        ((AppEventsLogger) (obj)).b(LoginButton.e(a), ((Bundle) (obj2)));
        if (LoginButton.f(a) != null)
        {
            LoginButton.f(a).onClick(view);
        }
        return;
_L2:
label0:
        {
            LoginButton.a(a);
            session = Session.g();
            if (session != null)
            {
                obj1 = session;
                if (!session.c().b())
                {
                    break label0;
                }
            }
            LoginButton.a(a);
            obj1 = new apb(((android.content.Context) (obj3)));
            LoginButton.b();
            obj1 = ((apb) (obj1)).a();
            Session.a(((Session) (obj1)));
        }
        if (!((Session) (obj1)).a())
        {
            LoginButton.c();
            com.facebook.Session.OpenRequest openrequest;
            if (obj3 instanceof Activity)
            {
                openrequest = new com.facebook.Session.OpenRequest((Activity)obj3);
            } else
            {
                openrequest = null;
            }
            if (openrequest != null)
            {
                openrequest.b(LoginButton.d(a).a);
                openrequest.b(LoginButton.d(a).b);
                openrequest.b(LoginButton.d(a).c);
                obj3 = SessionAuthorizationType.b;
                LoginButton.d(a);
                if (((SessionAuthorizationType) (obj3)).equals(null))
                {
                    ((Session) (obj1)).a(openrequest, SessionAuthorizationType.b);
                } else
                {
                    ((Session) (obj1)).a(openrequest);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
