// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dialtone.nodex.startup;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.nodex.startup.signal.DialtoneSignalFile;
import com.facebook.nodex.startup.splashscreen.AbstractNodexSplashActivity;
import com.facebook.nodex.startup.warmup.NodexWarmupContentProvider;
import java.util.HashSet;
import java.util.Set;

public class NodexDialtoneSplashActivity extends AbstractNodexSplashActivity
{

    public NodexDialtoneSplashActivity()
    {
    }

    protected final String a()
    {
        return "dialtone_splash";
    }

    protected final String b()
    {
        return "progress_bar";
    }

    protected final String c()
    {
        return "login_fb_logo";
    }

    protected final String d()
    {
        return "progress_message";
    }

    protected final String e()
    {
        return "nodex_upgrading_message_string";
    }

    protected final String f()
    {
        return "nodex_main_app_loading_message_string";
    }

    protected final String g()
    {
        return getPackageName();
    }

    protected final Uri h()
    {
        return NodexWarmupContentProvider.b;
    }

    protected final ComponentName i()
    {
        return new ComponentName(this, "com.facebook.katana.activity.FbMainTabActivity");
    }

    protected final Set j()
    {
        return new HashSet();
    }

    protected final void k()
    {
        e.a();
        super.k();
    }

    protected final Intent l()
    {
        Intent intent = super.l();
        if (!getIntent().getData().getHost().equals("start")) goto _L2; else goto _L1
_L1:
        intent.putExtra("start", true);
        intent.putExtra("ref", getIntent().getStringExtra("ref"));
_L4:
        String s = getIntent().getData().getQueryParameter("follow_up_intent");
        if (s != null)
        {
            intent.putExtra("follow_up_intent", s);
        }
        return intent;
_L2:
        if (getIntent().getData().getHost().equals("switch_to_dialtone"))
        {
            intent.putExtra("switch_to_dialtone", true);
            intent.putExtra("ref", getIntent().getStringExtra("ref"));
        } else
        if (getIntent().getData().getHost().equals("switch_to_full_fb"))
        {
            intent.putExtra("switch_to_full_fb", true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void m()
    {
        startActivity(l());
        finish();
    }
}
