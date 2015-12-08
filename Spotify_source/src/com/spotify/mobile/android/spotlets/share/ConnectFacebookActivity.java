// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import ape;
import apk;
import com.facebook.Session;
import com.facebook.SessionState;
import dmz;
import dvv;
import gdh;
import gfl;
import ggc;
import java.util.List;

public class ConnectFacebookActivity extends Activity
{

    private Session a;
    private apk b;
    private boolean c;

    public ConnectFacebookActivity()
    {
    }

    protected final void a(Session session, SessionState sessionstate, Exception exception)
    {
        if (exception == null) goto _L2; else goto _L1
_L1:
        if (exception.getMessage() != null)
        {
            dmz.a(ggc);
            ggc.a(this, exception);
        }
        gfl.a(this, "");
        finish();
_L4:
        return;
_L2:
        if (!sessionstate.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!c) goto _L4; else goto _L3
_L3:
        if (gdh.a(gdh.a))
        {
            gfl.a(this, session.d());
            gfl.a(this, new String[] {
                (String)gdh.a.get(0)
            });
        } else
        {
            gfl.a(this, "");
            dmz.a(ggc);
            ggc.a(this);
        }
        finish();
        return;
        if (!sessionstate.b()) goto _L4; else goto _L5
_L5:
        finish();
        return;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        b.a(i, j, intent);
        a = Session.g();
        if (a == null || !a.a())
        {
            return;
        }
        if (i == 100 && !gdh.a(gdh.a))
        {
            c = false;
            gdh.b(this);
            return;
        } else
        {
            c = true;
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
        }
        b = new apk(this, new ape() {

            private ConnectFacebookActivity a;

            public final void a(Session session, SessionState sessionstate, Exception exception)
            {
                a.a(session, sessionstate, exception);
            }

            
            {
                a = ConnectFacebookActivity.this;
                super();
            }
        });
        b.a(bundle);
        a = Session.g();
        if (a == null || a.c().b())
        {
            bundle = new Session(this);
            Session.a(bundle);
            a = bundle;
        }
        if (a.a())
        {
            finish();
            return;
        }
        try
        {
            gdh.a(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            dmz.a(ggc);
        }
        ggc.a(this);
        finish();
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        b.b();
    }

    protected void onResume()
    {
        super.onResume();
        b.a();
        startService(dvv.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
        Session session = Session.g();
        if (session != null && (session.a() || session.b()))
        {
            a(session, session.c(), null);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        b.b(bundle);
    }
}
