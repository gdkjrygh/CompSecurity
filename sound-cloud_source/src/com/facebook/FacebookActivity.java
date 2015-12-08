// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.facebook.internal.N;
import com.facebook.internal.q;
import com.facebook.login.k;

public class FacebookActivity extends FragmentActivity
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
        setContentView(O.e.com_facebook_activity_layout);
        Intent intent = getIntent();
        if (a.equals(intent.getAction()))
        {
            bundle = getIntent();
            setResult(0, N.a(bundle, null, N.a(N.b(bundle))));
            finish();
            return;
        }
        FragmentManager fragmentmanager = getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag(b);
        bundle = fragment;
        if (fragment == null)
        {
            if ("FacebookDialogFragment".equals(intent.getAction()))
            {
                bundle = new q();
                bundle.setRetainInstance(true);
                bundle.show(fragmentmanager, b);
            } else
            {
                bundle = new k();
                bundle.setRetainInstance(true);
                fragmentmanager.beginTransaction().add(O.d.com_facebook_fragment_container, bundle, b).commit();
            }
        }
        c = bundle;
    }

}
