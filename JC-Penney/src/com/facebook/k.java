// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.aj;
import android.support.v4.app.ay;
import com.facebook.b.aa;
import com.facebook.b.q;
import com.facebook.login.n;

// Referenced classes of package com.facebook:
//            bb, ba

public class k extends ac
{

    public static String i = "PassThrough";
    private static String j = "SingleFragment";
    private Fragment k;

    public k()
    {
    }

    private void g()
    {
        Intent intent = getIntent();
        setResult(0, aa.a(intent, null, aa.a(aa.c(intent))));
        finish();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (k != null)
        {
            k.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(bb.com_facebook_activity_layout);
        Intent intent = getIntent();
        if (i.equals(intent.getAction()))
        {
            g();
            return;
        }
        aj aj1 = f();
        Fragment fragment = aj1.a(j);
        bundle = fragment;
        if (fragment == null)
        {
            if ("FacebookDialogFragment".equals(intent.getAction()))
            {
                bundle = new q();
                bundle.d(true);
                bundle.a(aj1, j);
            } else
            {
                bundle = new n();
                bundle.d(true);
                aj1.a().a(ba.com_facebook_fragment_container, bundle, j).a();
            }
        }
        k = bundle;
    }

}
