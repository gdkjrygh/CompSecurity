// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.auth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.analytics.d;
import com.facebook.auth.login.LogoutFragment;
import com.facebook.auth.login.SilentLoginFragment;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.config.a.a;
import com.facebook.config.background.f;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.activity.m;
import com.facebook.widget.titlebar.c;

// Referenced classes of package com.facebook.orca.auth:
//            f, g, e

public class UpgradeScreenOrcaFragment extends AbstractNavigableFragment
    implements d
{

    private static final Class a = com/facebook/orca/auth/UpgradeScreenOrcaFragment;
    private a c;
    private com.facebook.appconfig.m d;
    private m e;
    private Button f;
    private Button g;
    private BlueServiceFragment h;

    public UpgradeScreenOrcaFragment()
    {
    }

    private void O()
    {
        if (!e.a())
        {
            a(com/facebook/auth/login/SilentLoginFragment);
        }
    }

    static void a(UpgradeScreenOrcaFragment upgradescreenorcafragment)
    {
        upgradescreenorcafragment.O();
    }

    static void b(UpgradeScreenOrcaFragment upgradescreenorcafragment)
    {
        upgradescreenorcafragment.c();
    }

    private void c()
    {
        Uri uri;
        if (d.e() != null)
        {
            uri = Uri.parse(d.e());
        } else
        {
            uri = Uri.parse(c.g());
        }
        d(new Intent("android.intent.action.VIEW", uri));
    }

    static void c(UpgradeScreenOrcaFragment upgradescreenorcafragment)
    {
        upgradescreenorcafragment.d();
    }

    private void d()
    {
        a(com/facebook/auth/login/LogoutFragment);
    }

    public void A()
    {
        super.A();
        com.facebook.debug.log.b.c(a, "Resuming UpgradeScreenFragment");
        if (!h.a())
        {
            h.a(f.a, new Bundle());
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(k.upgrade_screen, viewgroup, false);
        com.facebook.widget.titlebar.c.a(l());
        f = (Button)layoutinflater.findViewById(i.upgrade_button);
        g = (Button)layoutinflater.findViewById(i.log_out_button);
        f.setOnClickListener(new com.facebook.orca.auth.f(this));
        g.setOnClickListener(new g(this));
        return layoutinflater;
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        bundle = S();
        c = (a)bundle.a(com/facebook/config/a/a);
        d = (com.facebook.appconfig.m)bundle.a(com/facebook/appconfig/m);
        e = (m)bundle.a(com/facebook/orca/activity/m);
        h = BlueServiceFragment.a(this, "fetchAppConfig");
        h.a(new e(this));
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.UPGRADE_SCREEN_ACTIVITY_NAME;
    }

}
