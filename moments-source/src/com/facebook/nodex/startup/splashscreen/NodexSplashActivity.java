// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.udppriming.client.ColdStartPrimingInformation;
import com.facebook.nodex.startup.warmup.NodexWarmupContentProvider;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            AbstractNodexSplashActivity

public class NodexSplashActivity extends AbstractNodexSplashActivity
{

    public NodexSplashActivity()
    {
    }

    protected final String a()
    {
        return "nodex_splashscreen";
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

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ColdStartPrimingInformation.a().a(a);
    }
}
