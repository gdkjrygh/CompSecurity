// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.q;
import com.facebook.internal.d;
import com.facebook.login.b;

public class FacebookActivity extends i
{

    public static String a = "PassThrough";
    private static String b = "SingleFragment";
    private Fragment c;

    public FacebookActivity()
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (c != null)
        {
            c.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(p.d.com_facebook_activity_layout);
        Intent intent = getIntent();
        if (a.equals(intent.getAction()))
        {
            bundle = getIntent();
            setResult(0, com.facebook.internal.i.a(bundle, null, com.facebook.internal.i.a(com.facebook.internal.i.a(bundle))));
            finish();
            return;
        }
        m m1 = getSupportFragmentManager();
        Fragment fragment = m1.a(b);
        bundle = fragment;
        if (fragment == null)
        {
            if ("FacebookDialogFragment".equals(intent.getAction()))
            {
                bundle = new d();
                bundle.setRetainInstance(true);
                bundle.show(m1, b);
            } else
            {
                bundle = new b();
                bundle.setRetainInstance(true);
                m1.a().a(p.c.com_facebook_fragment_container, bundle, b).c();
            }
        }
        c = bundle;
    }

}
