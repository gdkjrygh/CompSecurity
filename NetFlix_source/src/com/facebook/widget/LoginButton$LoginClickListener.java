// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.SessionTracker;
import com.facebook.model.GraphUser;

// Referenced classes of package com.facebook.widget:
//            LoginButton

private class <init>
    implements android.view.stener
{

    final LoginButton this$0;

    public void onClick(View view)
    {
        final Session openSession;
        Object obj;
        obj = getContext();
        openSession = LoginButton.access$300(LoginButton.this).getOpenSession();
        if (openSession == null) goto _L2; else goto _L1
_L1:
        if (!LoginButton.access$600(LoginButton.this)) goto _L4; else goto _L3
_L3:
        String s = getResources().getString(com.facebook.android._log_out_action);
        String s1 = getResources().getString(com.facebook.android._cancel_action);
        if (LoginButton.access$400(LoginButton.this) != null && LoginButton.access$400(LoginButton.this).getName() != null)
        {
            view = String.format(getResources().getString(com.facebook.android._logged_in_as), new Object[] {
                LoginButton.access$400(LoginButton.this).getName()
            });
        } else
        {
            view = getResources().getString(com.facebook.android._logged_in_using_facebook);
        }
        obj = new android.app.ook(((android.content.Context) (obj)));
        ((android.app.ook) (obj)).ook(view).le(true).Button(s, new android.content.DialogInterface.OnClickListener() {

            final LoginButton.LoginClickListener this$1;
            final Session val$openSession;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                openSession.closeAndClearTokenInformation();
            }

            
            {
                this$1 = LoginButton.LoginClickListener.this;
                openSession = session;
                super();
            }
        }).Button(s1, null);
        ((android.app.ener) (obj)).ener().show();
_L6:
        return;
_L4:
        openSession.closeAndClearTokenInformation();
        return;
_L2:
        view = LoginButton.access$300(LoginButton.this).getSession();
        if (view != null)
        {
            openSession = view;
            if (!view.getState().isClosed())
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        LoginButton.access$300(LoginButton.this).setSession(null);
        openSession = (new com.facebook.ion(((android.content.Context) (obj)))).d(LoginButton.access$700(LoginButton.this))._mth0();
        Session.setActiveSession(openSession);
        if (openSession.isOpened()) goto _L6; else goto _L5
_L5:
        view = null;
        if (LoginButton.access$800(LoginButton.this) != null)
        {
            view = new com.facebook.stener.this._cls0(LoginButton.access$800(LoginButton.this));
        } else
        if (obj instanceof Activity)
        {
            view = new com.facebook.stener.this._cls0((Activity)obj);
        }
        if (view != null)
        {
            view.udience(es.access._mth1000(LoginButton.access$900(LoginButton.this)));
            view.ons(es.access._mth1100(LoginButton.access$900(LoginButton.this)));
            view.avior(es.access._mth1200(LoginButton.access$900(LoginButton.this)));
            if (SessionAuthorizationType.PUBLISH.equals(es.access._mth1300(LoginButton.access$900(LoginButton.this))))
            {
                openSession.openForPublish(view);
                return;
            } else
            {
                openSession.openForRead(view);
                return;
            }
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    private _cls1.val.openSession()
    {
        this$0 = LoginButton.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
