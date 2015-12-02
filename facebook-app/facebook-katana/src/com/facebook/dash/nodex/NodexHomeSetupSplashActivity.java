// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dash.nodex;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.nodex.startup.splashscreen.AbstractNodexSplashActivity;
import java.util.Set;

public class NodexHomeSetupSplashActivity extends AbstractNodexSplashActivity
{

    public NodexHomeSetupSplashActivity()
    {
    }

    protected final String a()
    {
        return "dash_splash_screen";
    }

    protected final String b()
    {
        return null;
    }

    protected final String c()
    {
        return null;
    }

    protected final String d()
    {
        return null;
    }

    protected final String e()
    {
        return null;
    }

    protected final String f()
    {
        return null;
    }

    protected final String g()
    {
        return (new StringBuilder()).append(getPackageName()).append(":dash").toString();
    }

    protected final Uri h()
    {
        String s = (new StringBuilder()).append(getPackageName()).append(".nodex.dash.setup").toString();
        return Uri.parse((new StringBuilder("content://")).append(s).toString());
    }

    protected final ComponentName i()
    {
        return new ComponentName(this, "com.facebook.dash.setupflow.ui.SetupActivity");
    }

    protected final Set j()
    {
        return getIntent().getCategories();
    }
}
