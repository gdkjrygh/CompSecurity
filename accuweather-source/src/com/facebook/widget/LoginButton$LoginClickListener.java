// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

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
        Object obj2 = getContext();
        final Session openSession = LoginButton.access$400(LoginButton.this).getOpenSession();
        int i;
        if (openSession != null)
        {
            if (LoginButton.access$700(LoginButton.this))
            {
                Object obj1 = getResources().getString(com.facebook.android._log_out_action);
                String s = getResources().getString(com.facebook.android._cancel_action);
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
                obj2 = new android.app.ook(((android.content.Context) (obj2)));
                ((android.app.ook) (obj2)).ook(((CharSequence) (obj))).le(true).Button(((CharSequence) (obj1)), new android.content.DialogInterface.OnClickListener() {

                    final LoginButton.LoginClickListener this$1;
                    final Session val$openSession;

                    public void onClick(DialogInterface dialoginterface, int j)
                    {
                        openSession.closeAndClearTokenInformation();
                    }

            
            {
                this$1 = LoginButton.LoginClickListener.this;
                openSession = session;
                super();
            }
                }).Button(s, null);
                ((android.app.ener) (obj2)).ener().show();
            } else
            {
                openSession.closeAndClearTokenInformation();
            }
        } else
        {
            Session session1;
label0:
            {
                Session session = LoginButton.access$400(LoginButton.this).getSession();
                if (session != null)
                {
                    session1 = session;
                    if (!session.getState().isClosed())
                    {
                        break label0;
                    }
                }
                LoginButton.access$400(LoginButton.this).setSession(null);
                session1 = (new com.facebook.ion(((android.content.Context) (obj2)))).d(LoginButton.access$800(LoginButton.this))._mth0();
                Session.setActiveSession(session1);
            }
            if (!session1.isOpened())
            {
                com.facebook.ner ner = null;
                if (LoginButton.access$900(LoginButton.this) != null)
                {
                    ner = new com.facebook.stener.this._cls0(LoginButton.access$900(LoginButton.this));
                } else
                if (obj2 instanceof Activity)
                {
                    ner = new com.facebook.stener.this._cls0((Activity)obj2);
                }
                if (ner != null)
                {
                    ner.udience(es.access._mth1100(LoginButton.access$1000(LoginButton.this)));
                    ner.ons(es.access._mth1200(LoginButton.access$1000(LoginButton.this)));
                    ner.avior(es.access._mth1300(LoginButton.access$1000(LoginButton.this)));
                    if (SessionAuthorizationType.PUBLISH.equals(es.access._mth1400(LoginButton.access$1000(LoginButton.this))))
                    {
                        session1.openForPublish(ner);
                    } else
                    {
                        session1.openForRead(ner);
                    }
                }
            }
        }
        obj = AppEventsLogger.newLogger(getContext());
        obj1 = new Bundle();
        if (openSession != null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((Bundle) (obj1)).putInt("logging_in", i);
        ((AppEventsLogger) (obj)).logSdkEvent(LoginButton.access$1500(LoginButton.this), null, ((Bundle) (obj1)));
        if (LoginButton.access$1600(LoginButton.this) != null)
        {
            LoginButton.access$1600(LoginButton.this)._mth0(view);
        }
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
