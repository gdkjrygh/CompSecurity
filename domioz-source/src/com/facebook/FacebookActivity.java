// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import com.facebook.internal.am;
import com.facebook.internal.p;
import com.facebook.login.n;

// Referenced classes of package com.facebook:
//            ax, aw

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
        setContentView(ax.a);
        Intent intent = getIntent();
        if (a.equals(intent.getAction()))
        {
            bundle = getIntent();
            setResult(0, am.a(bundle, null, am.a(am.a(bundle))));
            finish();
            return;
        }
        u u1 = getSupportFragmentManager();
        Fragment fragment = u1.a(b);
        bundle = fragment;
        if (fragment == null)
        {
            if ("FacebookDialogFragment".equals(intent.getAction()))
            {
                bundle = new p();
                bundle.setRetainInstance(true);
                bundle.show(u1, b);
            } else
            {
                bundle = new n();
                bundle.setRetainInstance(true);
                u1.a().a(aw.a, bundle, b).a();
            }
        }
        c = bundle;
    }

}
