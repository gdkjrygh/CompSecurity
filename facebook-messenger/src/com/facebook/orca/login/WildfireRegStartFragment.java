// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.auth.login.AuthFragmentBase;
import com.facebook.auth.login.PasswordCredentialsFragment;
import com.facebook.auth.login.bm;
import com.facebook.auth.login.v;
import com.facebook.base.fragment.e;
import com.facebook.c.s;
import com.facebook.common.k.a;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.j;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.k;
import com.facebook.orca.nux.LearnMoreActivity;
import com.facebook.orca.prefs.o;
import com.facebook.orca.server.aq;
import com.google.common.base.Optional;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.facebook.orca.login:
//            x, w, b, WildfireRegNameFragment, 
//            v

public class WildfireRegStartFragment extends AuthFragmentBase
    implements d, x
{

    private static final Class a = com/facebook/orca/login/WildfireRegStartFragment;
    private v Z;
    private com.facebook.config.a.a aa;
    private com.facebook.prefs.shared.d ab;
    private s ac;
    private bm ad;
    private com.facebook.orca.login.b ae;
    private BlueServiceFragment af;
    private boolean c;
    private boolean d;
    private Optional e;
    private Optional f;
    private Optional g;
    private w h;
    private av i;

    public WildfireRegStartFragment()
    {
    }

    private void X()
    {
        b.b(a, "Attempting to start wildfire gatekeeper checks");
        if (af.b() != j.INIT)
        {
            return;
        }
        if (!e.isPresent() || !f.isPresent() || !g.isPresent())
        {
            b.b(a, "Preparing to start wildfire gatekeeper checks");
            h.beginShowingProgress();
            d = true;
            af.a(aq.a, new Bundle());
            b.b(a, "Started wildfire gatekeeper checks");
            return;
        } else
        {
            b.b(a, "Using cached wildfire gatekeeper values");
            Y();
            return;
        }
    }

    private void Y()
    {
        if (((Boolean)e.get()).booleanValue())
        {
            b.c(a, "Registration enabled");
            if (((Boolean)g.get()).booleanValue() && !c)
            {
                a(false);
                return;
            } else
            {
                String s1 = android.provider.Settings.Secure.getString(n().getContentResolver(), "android_id");
                i.a(ae.a("view_reg_start").a("has_fb4a", ad.c(l())).a("used_signup_button", c).a("alternate_start_page", ((Boolean)f.get()).booleanValue()).a("skipped_signup_page", ((Boolean)g.get()).booleanValue()).b("device_id", s1));
                h.showStartPage(((Boolean)f.get()).booleanValue());
                h.stopShowingProgress();
                d = false;
                return;
            }
        }
        b.c(a, "Registration disabled");
        if (c)
        {
            Z();
            return;
        } else
        {
            a(false);
            return;
        }
    }

    private void Z()
    {
        android.net.Uri.Builder builder = Uri.parse("https://m.facebook.com/r.php").buildUpon();
        builder.appendQueryParameter("locale", com.facebook.common.k.a.a(Locale.getDefault()));
        ac.b(new Intent("android.intent.action.VIEW", builder.build()), n());
        a(com/facebook/auth/login/PasswordCredentialsFragment);
        d = false;
        h.stopShowingProgress();
    }

    private Uri a(String s1)
    {
        s1 = Uri.parse(s1).buildUpon();
        s1.appendQueryParameter("cid", aa.b());
        s1.appendQueryParameter("locale", com.facebook.common.k.a.a(Locale.getDefault()));
        return s1.build();
    }

    private void a(OperationResult operationresult)
    {
label0:
        {
            boolean flag1 = false;
            operationresult = (Bundle)operationresult.i();
            boolean flag = operationresult.getBoolean("messenger_wildfire_android");
            b.c(a, (new StringBuilder()).append("messenger_wildfire_android: ").append(flag).toString());
            if (flag || aa.h() != com.facebook.config.a.b.PUBLIC)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = Optional.of(Boolean.valueOf(flag));
            flag = operationresult.getBoolean("messenger_wildfire_entry_test");
            b.c(a, (new StringBuilder()).append("messenger_wildfire_entry_test: ").append(flag).toString());
            if (flag || ab.a(o.y, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = Optional.of(Boolean.valueOf(flag));
            flag = operationresult.getBoolean("messenger_wildfire_skip_start_test");
            b.c(a, (new StringBuilder()).append("messenger_wildfire_skip_start_test: ").append(flag).toString());
            if (!flag)
            {
                flag = flag1;
                if (!ab.a(o.z, false))
                {
                    break label0;
                }
            }
            flag = true;
        }
        g = Optional.of(Boolean.valueOf(flag));
        Y();
    }

    private void a(ServiceException serviceexception)
    {
        b.e(a, (new StringBuilder()).append(af).append(" failed with error ").append(serviceexception.getMessage()).toString());
        if (serviceexception.a() == t.API_ERROR)
        {
            int l = ((ApiErrorResult)serviceexception.b().i()).a();
            b.e(a, (new StringBuilder()).append("API error code: ").append(l).toString());
        }
        e = Optional.of(Boolean.valueOf(false));
        f = Optional.of(Boolean.valueOf(false));
        g = Optional.of(Boolean.valueOf(false));
        Y();
    }

    static void a(WildfireRegStartFragment wildfireregstartfragment, OperationResult operationresult)
    {
        wildfireregstartfragment.a(operationresult);
    }

    static void a(WildfireRegStartFragment wildfireregstartfragment, ServiceException serviceexception)
    {
        wildfireregstartfragment.a(serviceexception);
    }

    public void Q()
    {
        i.a(ae.a("create_tapped").a("alternate_start_page", ((Boolean)f.get()).booleanValue()).a("skipped_signup_page", ((Boolean)g.get()).booleanValue()));
        d((new e(com/facebook/orca/login/WildfireRegNameFragment)).c());
    }

    public void T()
    {
        ac.b(new Intent("android.intent.action.VIEW", a("https://m.facebook.com/srr")), n());
    }

    public void U()
    {
        ac.b(new Intent("android.intent.action.VIEW", a("https://m.facebook.com/dup")), n());
    }

    public void V()
    {
        ac.b(new Intent("android.intent.action.VIEW", a("https://m.facebook.com/help/mobilecookies")), n());
    }

    public void W()
    {
        Intent intent = new Intent(n(), com/facebook/orca/nux/LearnMoreActivity);
        intent.putExtra("layout", k.orca_wildfire_reg_learn_more);
        ac.a(intent, n());
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a(com/facebook/orca/login/x, viewgroup);
        h = (w)layoutinflater;
        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        Bundle bundle1 = k();
        if (bundle1 != null)
        {
            c = bundle1.getBoolean("orca:authparam:userrequestedsignup", false);
        }
        if (bundle != null)
        {
            d = bundle.getBoolean("isProgressIndicatorShowing", false);
            e = (Optional)bundle.getSerializable("wildfireGkResult");
            f = (Optional)bundle.getSerializable("wildfireEntryTestGkResult");
            g = (Optional)bundle.getSerializable("wildfireSkipStartTestGkResult");
        }
        if (e == null)
        {
            e = Optional.absent();
        }
        if (f == null)
        {
            f = Optional.absent();
        }
        if (g == null)
        {
            g = Optional.absent();
        }
        bundle = S();
        i = (av)bundle.a(com/facebook/analytics/av);
        Z = (v)bundle.a(com/facebook/auth/login/v);
        aa = (com.facebook.config.a.a)bundle.a(com/facebook/config/a/a);
        ab = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        ac = (s)bundle.a(com/facebook/c/s);
        ad = (bm)bundle.a(com/facebook/auth/login/bm);
        ae = (com.facebook.orca.login.b)bundle.a(com/facebook/orca/login/b);
        if (!ab.a(com.facebook.auth.e.a.p))
        {
            bundle = ab.b();
            bundle.a(com.facebook.auth.e.a.p, com.facebook.common.h.a.a().toString());
            bundle.a();
        }
        af = BlueServiceFragment.a(this, "getWildfireGksOperation");
        af.a(new com.facebook.orca.login.v(this));
    }

    public void a(boolean flag)
    {
        e e1 = new e(com/facebook/auth/login/PasswordCredentialsFragment);
        if (flag)
        {
            i.a(ae.a("login_tapped").a("alternate_start_page", ((Boolean)f.get()).booleanValue()).a("skipped_signup_page", ((Boolean)g.get()).booleanValue()));
            e1.a();
        }
        d(e1.c());
        h.stopShowingProgress();
        d = false;
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        Z.a();
        if (d)
        {
            h.beginShowingProgress();
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("isProgressIndicatorShowing", d);
        bundle.putSerializable("wildfireGkResult", e);
        bundle.putSerializable("wildfireEntryTestGkResult", f);
        bundle.putSerializable("wildfireSkipStartTestGkResult", g);
    }

    public void f()
    {
        super.f();
        X();
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.WILDFIRE_REG_START_ACTIVITY_NAME;
    }

}
