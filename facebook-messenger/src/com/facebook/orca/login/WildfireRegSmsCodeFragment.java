// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
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
import com.facebook.base.broadcast.q;
import com.facebook.base.fragment.e;
import com.facebook.c.s;
import com.facebook.common.k.a;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.ab;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.user.i;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Locale;

// Referenced classes of package com.facebook.orca.login:
//            ah, am, q, p, 
//            b, ai, WildfireRegPhoneNumberFragment, af, 
//            o, al

public class WildfireRegSmsCodeFragment extends AuthFragmentBase
    implements d, ah, am, com.facebook.orca.login.q
{

    private static final Class a = com/facebook/orca/login/WildfireRegSmsCodeFragment;
    private p Z;
    private av aa;
    private ObjectMapper ab;
    private i ac;
    private s ad;
    private com.facebook.orca.login.b ae;
    private af af;
    private ai ag;
    private q ah;
    private int c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public WildfireRegSmsCodeFragment()
    {
    }

    private void V()
    {
        android.net.Uri.Builder builder = Uri.parse("https://m.facebook.com/r.php").buildUpon();
        builder.appendQueryParameter("locale", com.facebook.common.k.a.a(Locale.getDefault()));
        ad.b(new Intent("android.intent.action.VIEW", builder.build()), n());
        a(com/facebook/auth/login/PasswordCredentialsFragment);
        d = false;
        Z.stopShowingProgress();
    }

    public static Bundle a(String s1, String s2, String s3, String s4)
    {
        Bundle bundle = new Bundle();
        bundle.putString("orca:authparam:firstname", s1);
        bundle.putString("orca:authparam:lastname", s2);
        bundle.putString("orca:authparam:phonenumber", s3);
        bundle.putString("orca:authparam:countrycode", s4);
        return bundle;
    }

    private void a(ApiErrorResult apierrorresult)
    {
        Z.stopShowingProgress();
        d = false;
        try
        {
            apierrorresult = ab.readTree(apierrorresult.c());
        }
        // Misplaced declaration of an exception variable
        catch (ApiErrorResult apierrorresult)
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unable to parse error data! ").append(apierrorresult.getMessage()).toString());
            apierrorresult = null;
        }
        if (apierrorresult != null)
        {
            String s1 = apierrorresult.get("error_title").asText();
            apierrorresult = apierrorresult.get("error_message").asText();
            com.facebook.ui.d.a.a(n()).a(s1).b(apierrorresult).a();
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append(s1).append(": ").append(apierrorresult).toString());
            aa.a(ae.b("service_error").b("title", s1).b("message", apierrorresult));
        }
    }

    static void a(WildfireRegSmsCodeFragment wildfireregsmscodefragment, Intent intent)
    {
        wildfireregsmscodefragment.c(intent);
    }

    private void c(Intent intent)
    {
        intent = intent.getStringExtra("confirmation_code");
        Z.setSmsCode(intent, true);
    }

    public void C()
    {
        super.C();
        ah.b();
    }

    public void Q()
    {
        aa.a(ae.b("resend_sms_success"));
        Z.setSmsCodePrompt(o().getString(o.wildfire_reg_enter_code_resent, new Object[] {
            ac.c(g)
        }));
    }

    public void T()
    {
        ag.a();
        d(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"));
        d = false;
        Z.stopShowingProgress();
    }

    public void U()
    {
        aa.a(ae.a("edit_number_tapped"));
        d((new e(com/facebook/orca/login/WildfireRegPhoneNumberFragment)).a().c().putExtras(com.facebook.orca.login.WildfireRegPhoneNumberFragment.a(e, f)));
        d = false;
        Z.stopShowingProgress();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a(com/facebook/orca/login/q, viewgroup);
        Z = (p)layoutinflater;
        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            i = bundle.getString("confirmationCode");
            c = bundle.getInt("numFails");
            d = bundle.getBoolean("isProgressIndicatorShowing");
        }
        e = k().getString("orca:authparam:firstname");
        f = k().getString("orca:authparam:lastname");
        g = k().getString("orca:authparam:phonenumber");
        h = k().getString("orca:authparam:countrycode");
        bundle = S();
        aa = (av)bundle.a(com/facebook/analytics/av);
        ab = (ObjectMapper)bundle.a(com/fasterxml/jackson/databind/ObjectMapper);
        ac = (i)bundle.a(com/facebook/user/i);
        ae = (com.facebook.orca.login.b)bundle.a(com/facebook/orca/login/b);
        ad = (s)bundle.a(com/facebook/c/s);
        ag = (ai)bundle.a(com/facebook/orca/login/ai);
        af = (af)bundle.a(com/facebook/orca/login/af);
        ag.a(this);
        ag.a(this);
        ag.a("wildfire_registration_manual");
        af.a(this);
        af.a(this);
        af.a("wildfire_registration_manual");
        bundle = new IntentFilter();
        bundle.addAction("com.facebook.orca.phonenumber.CONFIRMATION_CODE_RECEIVED");
        ah = new com.facebook.orca.login.o(this, n(), bundle);
        ah.a();
        aa.a(ae.a("view_reg_sms"));
    }

    public void a(ab ab1)
    {
        if (ag.b())
        {
            return;
        } else
        {
            ag.a(ab1);
            ag.b(g, h);
            aa.a(ae.b("resend_sms_started").b("phone_number", g).b("country_code", h));
            return;
        }
    }

    public void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("SMS request failed with error ").append(serviceexception.getMessage()).toString());
        String s1 = (new StringBuilder()).append(serviceexception.a()).append("").toString();
        if (serviceexception.a() == com.facebook.fbservice.service.t.API_ERROR)
        {
            ApiErrorResult apierrorresult = (ApiErrorResult)serviceexception.b().i();
            int j = apierrorresult.a();
            s1 = (new StringBuilder()).append(j).append("").toString();
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("API error code: ").append(j).toString());
            if (j == 2)
            {
                a(apierrorresult);
                return;
            }
            if (j == 368)
            {
                aa.a(ae.b("sentry_block"));
                V();
                return;
            }
        }
        aa.a(ae.b("resend_sms_failure").b("phone_number", g).b("country_code", h).b("error_code", s1));
        com.facebook.ui.d.a.a(n()).a(o.app_error_dialog_title).a(serviceexception).a();
    }

    public void a(String s1)
    {
        if (af.a())
        {
            return;
        } else
        {
            Z.beginShowingProgress();
            d = true;
            i = s1;
            af.a(e, f, g, h, s1);
            aa.a(ae.b("manual_sms_code_entered").b("code", s1));
            return;
        }
    }

    public void b(ServiceException serviceexception)
    {
        Z.stopShowingProgress();
        d = false;
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Registration failed with error ").append(serviceexception.getMessage()).toString());
        c = c + 1;
        if (c >= 3)
        {
            V();
            return;
        }
        if (serviceexception.a() == com.facebook.fbservice.service.t.API_ERROR)
        {
            ApiErrorResult apierrorresult = (ApiErrorResult)serviceexception.b().i();
            int j = apierrorresult.a();
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("API error code: ").append(j).toString());
            if (j == 3301)
            {
                serviceexception = ag.a(g, h);
                if (serviceexception != null && i.equals(((al) (serviceexception)).c))
                {
                    ag.a();
                }
                aa.a(ae.b("confirmation_code_invalid").b("code", i).a("error_code", j));
                Z.setSmsCodePromptResource(o.wildfire_reg_enter_code_invalid);
                Z.showSmsCodeError();
                return;
            }
            if (j == 3302)
            {
                serviceexception = ag.a(g, h);
                if (serviceexception != null && i.equals(((al) (serviceexception)).c))
                {
                    ag.a();
                }
                aa.a(ae.b("confirmation_code_invalid").b("code", i).a("error_code", j));
                Z.setSmsCodePromptResource(o.wildfire_reg_enter_code_expired);
                Z.showSmsCodeError();
                return;
            }
            if (j == 2)
            {
                a(apierrorresult);
                return;
            }
            if (j == 368)
            {
                aa.a(ae.b("sentry_block"));
                V();
                return;
            }
        }
        com.facebook.ui.d.a.a(n()).a(o.app_error_dialog_title).a(serviceexception).a();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        Z.setSmsCodePrompt(o().getString(o.wildfire_reg_enter_code, new Object[] {
            ac.c(g)
        }));
        if (d)
        {
            Z.beginShowingProgress();
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("numFails", c);
        bundle.putBoolean("isProgressIndicatorShowing", d);
    }

    public void f()
    {
        super.f();
        al al1 = ag.a(g, h);
        if (al1 != null)
        {
            Z.setSmsCode(al1.c, false);
        }
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.WILDFIRE_REG_SMS_CODE_ACTIVITY_NAME;
    }

}
