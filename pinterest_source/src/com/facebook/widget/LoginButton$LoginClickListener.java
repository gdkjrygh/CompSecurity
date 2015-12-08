// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.facebook.AppEventsLogger;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.SessionTracker;
import com.facebook.model.GraphUser;

// Referenced classes of package com.facebook.widget:
//            LoginButton

class <init>
    implements android.view.stener
{

    final LoginButton this$0;

    public void onClick(View view)
    {
        final Session openSession;
        Object obj3;
        obj3 = getContext();
        openSession = LoginButton.access$400(LoginButton.this).getOpenSession();
        if (openSession == null) goto _L2; else goto _L1
_L1:
        int i;
        if (LoginButton.access$700(LoginButton.this))
        {
            Object obj2 = getResources().getString(com.facebook.android._log_out_action);
            String s = getResources().getString(com.facebook.android._cancel_action);
            class _cls1
                implements android.content.DialogInterface.OnClickListener
            {

                final LoginButton.LoginClickListener this$1;
                final Session val$openSession;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    openSession.closeAndClearTokenInformation();
                }

            _cls1()
            {
                this$1 = LoginButton.LoginClickListener.this;
                openSession = session;
                super();
            }
            }

            Object obj;
            if (LoginButton.access$500(LoginButton.this) != null && LoginButton.access$500(LoginButton.this).getName() != null)
            {
                obj = String.format(getResources().getString(com.facebook.android._logged_in_as), new Object[] {
                    LoginButton.access$500(LoginButton.this).getName()
                });
            } else
            {
                obj = getResources().getString(com.facebook.android._logged_in_using_facebook);
            }
            obj3 = new android.app.ook(((android.content.Context) (obj3)));
            ((android.app.ook) (obj3)).ook(((CharSequence) (obj))).le(true).Button(((CharSequence) (obj2)), new _cls1()).Button(s, null);
            ((android.app.ener) (obj3)).ener().show();
        } else
        {
            openSession.closeAndClearTokenInformation();
        }
_L7:
        Object obj1;
        obj = AppEventsLogger.newLogger(getContext());
        obj2 = new Bundle();
        Session session;
        if (openSession != null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((Bundle) (obj2)).putInt("logging_in", i);
        ((AppEventsLogger) (obj)).logSdkEvent(LoginButton.access$1500(LoginButton.this), null, ((Bundle) (obj2)));
        if (LoginButton.access$1600(LoginButton.this) != null)
        {
            LoginButton.access$1600(LoginButton.this)._mth0(view);
        }
        return;
_L2:
        obj1 = LoginButton.access$400(LoginButton.this).getSession();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        session = ((Session) (obj1));
        if (!((Session) (obj1)).getState().isClosed()) goto _L5; else goto _L4
_L4:
        LoginButton.access$400(LoginButton.this).setSession(null);
        session = (new com.facebook.ion(((android.content.Context) (obj3)))).d(LoginButton.access$800(LoginButton.this))._mth0();
        Session.setActiveSession(session);
_L5:
        if (session.isOpened()) goto _L7; else goto _L6
_L6:
        if (LoginButton.access$900(LoginButton.this) != null)
        {
            obj1 = new com.facebook.stener.this._cls0(LoginButton.access$900(LoginButton.this));
        } else
        if (obj3 instanceof Activity)
        {
            obj1 = new com.facebook.stener.this._cls0((Activity)obj3);
        } else
        {
label0:
            {
                if (!(obj3 instanceof ContextWrapper))
                {
                    break label0;
                }
                obj1 = ((ContextWrapper)obj3).getBaseContext();
                if (!(obj1 instanceof Activity))
                {
                    break label0;
                }
                obj1 = new com.facebook.t((Activity)obj1);
            }
        }
_L8:
        if (obj1 != null)
        {
            ((com.facebook.t) (obj1)).udience(es.access._mth1100(LoginButton.access$1000(LoginButton.this)));
            ((com.facebook.stener.this._cls0) (obj1)).ons(es.access._mth1200(LoginButton.access$1000(LoginButton.this)));
            ((com.facebook.stener.this._cls0) (obj1)).avior(es.access._mth1300(LoginButton.access$1000(LoginButton.this)));
            if (SessionAuthorizationType.PUBLISH.equals(es.access._mth1400(LoginButton.access$1000(LoginButton.this))))
            {
                session.openForPublish(((com.facebook.stener.this._cls0) (obj1)));
            } else
            {
                session.openForRead(((com.facebook.stener.this._cls0) (obj1)));
            }
        }
          goto _L7
        obj1 = null;
          goto _L8
    }

    private es()
    {
        this$0 = LoginButton.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
