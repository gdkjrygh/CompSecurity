// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.mobvista.sdk.m.core.MobvistaAd;
import com.mobvista.sdk.m.core.MobvistaAdWall;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.app.e;
import com.qihoo.security.appbox.core.d;
import com.qihoo.security.support.b;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.appbox.ui:
//            AppBoxSelfFuncActivity, AdMobvistaActActivity

public class AppBoxActivity extends BaseActivity
{

    private boolean y;

    public AppBoxActivity()
    {
        y = false;
    }

    public void c(boolean flag)
    {
        if (flag)
        {
            SharedPref.a(this, "appbox_new_function_enable_last_time", Long.valueOf(System.currentTimeMillis()).longValue());
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getResources().getBoolean(0x7f070007))
        {
            e.b();
        }
        b.c(1121);
        if ("com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT".equals(getIntent().getAction()))
        {
            b.c(26001);
            y = true;
            boolean flag = d.a().d();
            SharedPref.a(this, "last_get_red_dot_show_rule_value", d.a().c());
            c(flag);
        } else
        {
            bundle = getIntent();
            if (bundle != null)
            {
                c(bundle.getBooleanExtra("current_red_point_is_showing", false));
            }
        }
        if (d.a().b())
        {
            bundle = new Intent(this, com/qihoo/security/appbox/ui/AppBoxSelfFuncActivity);
            if (y)
            {
                bundle.setAction("com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT");
            }
            startActivity(bundle);
        } else
        {
            com.qihoo.security.adv.a.c.a(this);
            MobvistaAdWall mobvistaadwall = MobvistaAd.newAdWallController(this, "55", "179046299094879_179857549013754");
            bundle = null;
            if (mobvistaadwall != null)
            {
                bundle = mobvistaadwall.getWallIntent();
            }
            if (y)
            {
                bundle.setAction("com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT");
            }
            bundle.setClass(this, com/qihoo/security/appbox/ui/AdMobvistaActActivity);
            startActivity(bundle);
        }
        com.qihoo.utils.notice.c.a(p, false);
        finish();
    }
}
