// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;
import com.facebook.analytics.av;
import com.facebook.analytics.d;
import com.facebook.auth.login.AuthFragmentLogoViewGroup;
import com.facebook.auth.login.AuthNavigationController;
import com.facebook.auth.login.AuthStateMachineConfig;
import com.facebook.auth.login.FirstPartySsoFragment;
import com.facebook.auth.login.GenericLoginApprovalViewGroup;
import com.facebook.auth.login.SilentLoginFragment;
import com.facebook.auth.login.am;
import com.facebook.auth.login.bg;
import com.facebook.auth.login.l;
import com.facebook.backgroundtasks.e;
import com.facebook.base.activity.i;
import com.facebook.base.fragment.NavigableFragmentController;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.aa;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.activity.m;
import com.facebook.orca.login.OrcaSilentLoginViewGroup;
import com.facebook.orca.login.WildfireRegNameViewGroup;
import com.facebook.orca.login.WildfireRegPhoneNumberViewGroup;
import com.facebook.orca.login.WildfireRegSmsCodeViewGroup;
import com.facebook.orca.login.WildfireRegStartFragment;
import com.facebook.orca.login.WildfireRegStartViewGroup;
import com.facebook.orca.login.a;
import com.facebook.push.PushInitializer;
import com.facebook.selfupdate.q;

// Referenced classes of package com.facebook.orca.auth:
//            UpgradeScreenOrcaFragment, d

public class StartScreenActivity extends i
    implements d
{

    private AuthNavigationController p;
    private Class q;
    private AuthStateMachineConfig r;
    private m s;
    private PushInitializer t;
    private e u;
    private am v;
    private av w;

    public StartScreenActivity()
    {
    }

    static void a(StartScreenActivity startscreenactivity, Intent intent)
    {
        startscreenactivity.b(intent);
    }

    private Class b(String s1)
    {
        Class class1 = null;
        if (s1 != null)
        {
            try
            {
                class1 = Class.forName(s1);
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                com.facebook.debug.log.b.c("orca:StartScreenActivity", "Cannot find class %s. Returning null.", new Object[] {
                    s1
                });
                return null;
            }
        }
        return class1;
    }

    private void b(Intent intent)
    {
        if ("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE".equals(intent.getAction()))
        {
            if (v.a())
            {
                t.i();
                v.b();
                w.a(null);
            }
            u.b();
            w.c();
            if (s.a())
            {
                p.b(new Intent("com.facebook.fragment.FRAGMENT_ACTION", null, this, com/facebook/orca/auth/UpgradeScreenOrcaFragment));
                return;
            } else
            {
                startActivity(s.m(this));
                overridePendingTransition(0, 0);
                finish();
                return;
            }
        }
        if ("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE".equals(intent.getAction()))
        {
            p.b(new Intent("com.facebook.fragment.FRAGMENT_ACTION", null, this, com/facebook/auth/login/FirstPartySsoFragment));
            w.b();
            return;
        }
        if ("com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE".equals(intent.getAction()))
        {
            p.b(new Intent("com.facebook.fragment.FRAGMENT_ACTION", null, this, com/facebook/auth/login/SilentLoginFragment));
            return;
        }
        if ("com.facebook.orca.login.AuthStateMachineMonitor.EXIT_TO_WILDFIRE_REGISTRATION".equals(intent.getAction()))
        {
            p.b(new Intent("com.facebook.fragment.FRAGMENT_ACTION", null, this, com/facebook/orca/login/WildfireRegStartFragment));
            return;
        } else
        {
            startActivity(intent);
            return;
        }
    }

    public void a(Fragment fragment)
    {
        super.a(fragment);
        if (fragment instanceof NavigableFragmentController)
        {
            ((NavigableFragmentController)fragment).a(new com.facebook.orca.auth.d(this));
        }
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        Object obj = i();
        s = (m)((t) (obj)).a(com/facebook/orca/activity/m);
        t = (PushInitializer)((t) (obj)).a(com/facebook/push/PushInitializer);
        u = (e)((t) (obj)).a(com/facebook/backgroundtasks/e);
        v = (am)((t) (obj)).a(com/facebook/auth/login/am);
        w = (av)((t) (obj)).a(com/facebook/analytics/av);
        com.facebook.auth.b.b b1 = (com.facebook.auth.b.b)((t) (obj)).a(com/facebook/auth/b/b);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            ((q)((t) (obj)).a(com/facebook/selfupdate/q)).a();
        }
        obj = getIntent();
        q = null;
        if (obj != null)
        {
            s.a(((Intent) (obj)));
            q = b(((Intent) (obj)).getStringExtra("orca:loginparam:LoginFragmentState"));
            ((Intent) (obj)).removeExtra("orca:loginparam:LoginFragmentState");
        }
        if (!s.a() && bundle == null && q == null && b1.a() != null && b1.b())
        {
            b(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"));
            return;
        }
        if (bundle != null)
        {
            r = new AuthStateMachineConfig((com.facebook.auth.login.AuthStateMachineConfig.ParcelableConfigInformation)bundle.getParcelable("authStateMachineConfig"), new bg(new aa(this, o.logging_out_progress)));
        } else
        {
            bundle = AuthFragmentLogoViewGroup.createParameterBundle(0, h.bolt, h.messenger, 0, 0, l.LOGO_SLIDE, null);
            r = com.facebook.orca.login.a.a(b1, bundle, OrcaSilentLoginViewGroup.createParameterBundle(0), bundle, GenericLoginApprovalViewGroup.createParameterBundle(0), WildfireRegNameViewGroup.createParameterBundle(h.bolt, h.messenger), WildfireRegStartViewGroup.createParameterBundle(h.bolt, h.messenger), WildfireRegPhoneNumberViewGroup.createParameterBundle(h.bolt, h.messenger), WildfireRegSmsCodeViewGroup.createParameterBundle(h.bolt, h.messenger), new aa(this, o.logging_out_progress));
        }
        setContentView(k.new_start_screen);
        p = (AuthNavigationController)f().a(com.facebook.i.login_fragment_controller);
        p.a(r);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.START_SCREEN_ACTIVITY_NAME;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onBackPressed()
    {
        if (!p.q().e())
        {
            super.onBackPressed();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authStateMachineConfig", r.b());
    }

    public void onStart()
    {
        super.onStart();
        Intent intent;
        if (q != null)
        {
            intent = new Intent("com.facebook.fragment.FRAGMENT_ACTION", null, this, q);
            q = null;
        } else
        if (!p.c())
        {
            intent = new Intent("com.facebook.fragment.FRAGMENT_ACTION", null, this, com/facebook/auth/login/FirstPartySsoFragment);
        } else
        {
            intent = null;
        }
        if (intent != null)
        {
            p.b(intent);
        }
    }
}
