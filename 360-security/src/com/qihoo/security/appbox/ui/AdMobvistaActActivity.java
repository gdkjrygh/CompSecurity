// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui;

import android.content.Intent;
import android.os.Bundle;
import com.mobvista.sdk.m.core.AdMobvistaAct;
import com.qihoo.security.service.d;
import com.qihoo360.mobilesafe.b.r;

public class AdMobvistaActActivity extends AdMobvistaAct
{

    public AdMobvistaActActivity()
    {
    }

    public void finish()
    {
        Intent intent = getIntent();
        if (intent != null && "com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT".equals(intent.getAction()))
        {
            r.a(getApplicationContext(), com/qihoo/security/appbox/ui/AdMobvistaActActivity.getName(), true);
        }
        super.finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d.a(getClass().getSimpleName(), Integer.valueOf(getClass().hashCode()));
    }

    protected void onDestroy()
    {
        super.onDestroy();
        d.b(getClass().getSimpleName(), Integer.valueOf(getClass().hashCode()));
    }
}
