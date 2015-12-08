// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContextWrapper;
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
        Object obj3 = getContext();
        final Session openSession = LoginButton.access$1(LoginButton.this).getOpenSession();
        int i;
        if (openSession != null)
        {
            if (LoginButton.access$2(LoginButton.this))
            {
                Object obj1 = getResources().getString(com.facebook.android._log_out_action);
                String s = getResources().getString(com.facebook.android._cancel_action);
                Object obj;
                if (LoginButton.access$3(LoginButton.this) != null && LoginButton.access$3(LoginButton.this).getName() != null)
                {
                    obj = String.format(getResources().getString(com.facebook.android._logged_in_as), new Object[] {
                        LoginButton.access$3(LoginButton.this).getName()
                    });
                } else
                {
                    obj = getResources().getString(com.facebook.android._logged_in_using_facebook);
                }
                obj3 = new android.app.ook(((android.content.Context) (obj3)));
                ((android.app.ook) (obj3)).ook(((CharSequence) (obj))).le(true).Button(((CharSequence) (obj1)), new android.content.DialogInterface.OnClickListener() {

                    final LoginButton.LoginClickListener this$1;
                    private final Session val$openSession;

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
                ((android.app.ener) (obj3)).ener().show();
            } else
            {
                openSession.closeAndClearTokenInformation();
            }
        } else
        {
            Session session1;
label0:
            {
                Session session = LoginButton.access$1(LoginButton.this).getSession();
                if (session != null)
                {
                    session1 = session;
                    if (!session.getState().isClosed())
                    {
                        break label0;
                    }
                }
                LoginButton.access$1(LoginButton.this).setSession(null);
                session1 = (new com.facebook.ion(((android.content.Context) (obj3)))).d(LoginButton.access$4(LoginButton.this))._mth0();
                Session.setActiveSession(session1);
            }
            if (!session1.isOpened())
            {
                Object obj2 = null;
                com.facebook.ner ner;
                if (LoginButton.access$5(LoginButton.this) != null)
                {
                    ner = new com.facebook.stener.this._cls0(LoginButton.access$5(LoginButton.this));
                } else
                if (obj3 instanceof Activity)
                {
                    ner = new com.facebook.stener.this._cls0((Activity)obj3);
                } else
                {
                    ner = obj2;
                    if (obj3 instanceof ContextWrapper)
                    {
                        obj3 = ((ContextWrapper)obj3).getBaseContext();
                        ner = obj2;
                        if (obj3 instanceof Activity)
                        {
                            ner = new com.facebook.t((Activity)obj3);
                        }
                    }
                }
                if (ner != null)
                {
                    ner.udience(es.access._mth0(LoginButton.access$6(LoginButton.this)));
                    ner.ons(es.access._mth1(LoginButton.access$6(LoginButton.this)));
                    ner.avior(es.access._mth2(LoginButton.access$6(LoginButton.this)));
                    if (SessionAuthorizationType.PUBLISH.equals(es.access._mth3(LoginButton.access$6(LoginButton.this))))
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
        ((AppEventsLogger) (obj)).logSdkEvent(LoginButton.access$7(LoginButton.this), null, ((Bundle) (obj1)));
        if (LoginButton.access$8(LoginButton.this) != null)
        {
            LoginButton.access$8(LoginButton.this)._mth0(view);
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
