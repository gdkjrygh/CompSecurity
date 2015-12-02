// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.lite.AppEnterActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.service.SecurityService;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.main.HomeActivity;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.b.i;

public class NotificationActivity extends BaseActivity
{

    public NotificationActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        String s;
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle == null)
        {
            finish();
            return;
        }
        s = bundle.getAction();
        if (!"com.qihoo.security.action.function.NOTIFICATION".equals(s)) goto _L2; else goto _L1
_L1:
        bundle.setClass(p, com/qihoo/security/service/SecurityService);
        bundle.setAction("com.qihoo.security.action.function.notification");
        startService(bundle);
_L4:
        finish();
        return;
_L2:
        if ("com.qihoo.security.action.function.LANGUAGE_AUTO_DOWN_FINISH".equals(s))
        {
            b.c(23011);
            bundle = bundle.getStringExtra("locale");
            d.a().a(bundle);
            bundle = new Intent(p, com/qihoo/security/ui/main/HomeActivity);
            bundle.addFlags(0x10000000);
            bundle.setAction("com.qihoo.security.action.function.LANGUAGE_AUTO_DOWN_FINISH");
            p.startActivity(bundle);
        } else
        if ("com.qihoo.security.action.function.MAIN".equals(s))
        {
            b.c(20001);
            b.a(20001);
            bundle = new Intent(p, com/qihoo/security/lite/AppEnterActivity);
            bundle.addFlags(0x10000000);
            bundle.addFlags(0x200000);
            bundle.setAction("android.intent.action.MAIN");
            bundle.addCategory("android.intent.category.LAUNCHER");
            bundle.putExtra("from", 1);
            p.startActivity(bundle);
        } else
        if ("com.qihoo.security.notify.ACTION_SAFE_APP".equals(s))
        {
            String s1 = bundle.getStringExtra("pkg_name");
            i.f(p, s1);
            c.a(p, bundle);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
