// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui;

import android.content.Intent;
import android.os.Bundle;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.app.e;
import com.qihoo.security.lite.AppEnterActivity;
import com.qihoo360.mobilesafe.b.h;

public class AppBoxCreateShortcutActivity extends BaseActivity
{

    public AppBoxCreateShortcutActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction()))
        {
            e.b();
            finish();
            return;
        } else
        {
            int i = h.a(getIntent(), "from", 0);
            bundle = new Intent(p, com/qihoo/security/lite/AppEnterActivity);
            bundle.setAction("android.intent.action.MAIN");
            bundle.addCategory("android.intent.category.LAUNCHER");
            bundle.addFlags(0x200000);
            bundle.addFlags(0x10000000);
            bundle.putExtra("from", i);
            startActivity(bundle);
            finish();
            return;
        }
    }
}
