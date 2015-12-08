// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import ape;
import apk;
import com.facebook.Session;
import com.facebook.SessionState;
import com.spotify.mobile.android.util.logging.Logger;
import dmz;
import dvv;
import gdh;
import gfl;
import ggc;

public class FacebookPlaceholderActivity extends Activity
{

    private Session a;
    private apk b;

    public FacebookPlaceholderActivity()
    {
    }

    protected final void a(SessionState sessionstate, Exception exception)
    {
        if (exception != null)
        {
            dmz.a(ggc);
            ggc.a(this, exception);
            finish();
        } else
        {
            if (sessionstate.a())
            {
                gfl.a(this, a.d());
                gfl.a(this, 1);
                finish();
                return;
            }
            if (sessionstate.b())
            {
                finish();
                return;
            }
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        b.a(i, j, intent);
        for (a = Session.g(); a == null || !a.a() || i != 100 || gdh.a(gdh.a);)
        {
            return;
        }

        gdh.b(this);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = new apk(this, new ape() {

            private FacebookPlaceholderActivity a;

            public final void a(Session session, SessionState sessionstate, Exception exception)
            {
                a.a(sessionstate, exception);
            }

            
            {
                a = FacebookPlaceholderActivity.this;
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
            Logger.a(bundle, "error requesting read permissions", new Object[0]);
        }
        dmz.a(ggc);
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
            a(session.c(), null);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        b.b(bundle);
    }
}
