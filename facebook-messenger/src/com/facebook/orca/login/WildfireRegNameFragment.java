// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.auth.login.AuthFragmentBase;
import com.facebook.auth.login.PasswordCredentialsFragment;
import com.facebook.base.fragment.e;
import com.facebook.c.s;
import com.facebook.common.hardware.PhoneIsoCountryCode;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.j;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.o;
import com.facebook.orca.server.aq;
import com.facebook.user.i;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import java.io.IOException;
import java.util.Locale;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.login:
//            am, ap, e, ai, 
//            b, d, WildfireRegPhoneNumberFragment, WildfireRegSmsCodeFragment, 
//            an, c

public class WildfireRegNameFragment extends AuthFragmentBase
    implements d, am, ap, com.facebook.orca.login.e
{

    private static final Class a = com/facebook/orca/login/WildfireRegNameFragment;
    private boolean Z;
    private boolean aa;
    private com.facebook.orca.login.d ab;
    private av ac;
    private i ad;
    private ObjectMapper ae;
    private a af;
    private s ag;
    private com.facebook.orca.login.b ah;
    private ai ai;
    private an aj;
    private BlueServiceFragment ak;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private Optional h;
    private int i;

    public WildfireRegNameFragment()
    {
    }

    private void T()
    {
        com.facebook.debug.log.b.b(a, "Attempting to start phone verification operation...");
        if (ai.b() || g)
        {
            return;
        }
        com.facebook.debug.log.b.b(a, "Preparing to start phone verification operation...");
        c = ((TelephonyManager)n().getSystemService("phone")).getLine1Number();
        d = (String)af.b();
        if (n.a(new CharSequence[] {
    c, d
}))
        {
            ac.a(ah.a("sms_request_skipped").b("phone_number", c).b("country_code", d));
            U();
            com.facebook.debug.log.b.d(a, "Skipped phone verification operation");
            return;
        } else
        {
            ai.b(c, d);
            g = true;
            ac.a(ah.a("sms_request_started").b("phone_number", c).b("country_code", d));
            com.facebook.debug.log.b.b(a, "Started phone verification operation");
            return;
        }
    }

    private void U()
    {
        h = Optional.of(Boolean.valueOf(false));
        if (Z)
        {
            W();
        }
    }

    private void V()
    {
        com.facebook.debug.log.b.c(a, "Registration data verification succeeded");
        ab.setNamePromptResource(o.wildfire_reg_enter_name);
        ab.hideFirstNameError();
        ab.hideLastNameError();
        Z = true;
        ac.a(ah.a("reg_data_ok"));
        if (h.isPresent() && ((Boolean)h.get()).booleanValue())
        {
            X();
            return;
        } else
        {
            W();
            return;
        }
    }

    private void W()
    {
        d((new e(com/facebook/orca/login/WildfireRegPhoneNumberFragment)).a().c().putExtras(com.facebook.orca.login.WildfireRegPhoneNumberFragment.a(e, f)));
        aa = false;
        ab.stopShowingProgress();
    }

    private void X()
    {
        Bundle bundle = com.facebook.orca.login.WildfireRegSmsCodeFragment.a(e, f, c, d);
        d((new e(com/facebook/orca/login/WildfireRegSmsCodeFragment)).a().c().putExtras(bundle));
        aa = false;
        ab.stopShowingProgress();
    }

    private void Y()
    {
        android.net.Uri.Builder builder = Uri.parse("https://m.facebook.com/r.php").buildUpon();
        builder.appendQueryParameter("locale", com.facebook.common.k.a.a(Locale.getDefault()));
        ag.b(new Intent("android.intent.action.VIEW", builder.build()), n());
        a(com/facebook/auth/login/PasswordCredentialsFragment);
        aa = false;
        ab.stopShowingProgress();
    }

    private void a(ApiErrorResult apierrorresult)
    {
        ab.stopShowingProgress();
        aa = false;
        try
        {
            apierrorresult = ae.readTree(apierrorresult.c());
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
            ac.a(ah.a("service_error").b("title", s1).b("message", apierrorresult));
        }
    }

    static void a(WildfireRegNameFragment wildfireregnamefragment)
    {
        wildfireregnamefragment.V();
    }

    static void a(WildfireRegNameFragment wildfireregnamefragment, ServiceException serviceexception)
    {
        wildfireregnamefragment.b(serviceexception);
    }

    private void b(ServiceException serviceexception)
    {
        Object obj;
        int k;
        ac.a(ah.a("reg_data_invalid", serviceexception).b("first_name", e).b("last_name", f).b("phone_number", c).b("country_code", d));
        if (serviceexception.a() != t.API_ERROR)
        {
            break MISSING_BLOCK_LABEL_577;
        }
        obj = (ApiErrorResult)serviceexception.b().i();
        k = ((ApiErrorResult) (obj)).a();
        if (k != 3116)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        try
        {
            serviceexception = ae.readTree(((ApiErrorResult) (obj)).c());
        }
        // Misplaced declaration of an exception variable
        catch (ServiceException serviceexception)
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unable to parse error data! ").append(serviceexception.getMessage()).toString());
            Y();
            return;
        }
        if (serviceexception.get("name") == null) goto _L2; else goto _L1
_L1:
        ab.setNamePrompt(serviceexception.get("name").get("error_body").asText());
        ab.showFirstNameError();
        ab.showLastNameError();
        ac.a(ah.a("invalid_name_restart").b("first_name", e).b("last_name", f).a("error_code", serviceexception.get("name").get("error_code").asInt()));
_L4:
        ab.stopShowingProgress();
        aa = false;
        i = i + 1;
        if (i >= 3)
        {
            Y();
        }
        return;
_L2:
        if (serviceexception.get("phone") == null) goto _L4; else goto _L3
_L3:
        if (serviceexception.get("phone").get("error_code").asInt() == 3128)
        {
            obj = serviceexception.get("phone").get("existing_uid").asText();
            if (serviceexception.get("phone").get("is_existing_user_partial").asBoolean())
            {
                com.facebook.debug.log.b.c(a, "Error was caused by the phone number belonging to a partial account. False alarm.");
                ac.a(ah.a("already_wf_user").b("user_id", ((String) (obj))));
                V();
                return;
            } else
            {
                ac.a(ah.a("already_fb_user").b("user_id", ((String) (obj))));
                aj.a(((String) (obj)), c);
                return;
            }
        } else
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Error with phone number validation: ").append(serviceexception.get("phone").get("error_body").asText()).toString());
            ac.a(ah.a("invalid_phone_number").b("phone_number", c).b("country_code", d).a("error_code", serviceexception.get("phone").get("error_code").asInt()));
            W();
            return;
        }
        if (k == 2)
        {
            a(((ApiErrorResult) (obj)));
            return;
        }
        if (k == 368)
        {
            ac.a(ah.a("sentry_block"));
            Y();
            return;
        }
        ab.stopShowingProgress();
        aa = false;
        ab.setNamePromptResource(o.wildfire_reg_enter_name);
        com.facebook.ui.d.a.a(n()).a(o.app_error_dialog_title).a(serviceexception).a();
        return;
    }

    public void Q()
    {
        h = Optional.of(Boolean.valueOf(true));
        ac.a(ah.a("sms_request_success"));
        if (Z)
        {
            X();
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a(com/facebook/orca/login/e, viewgroup);
        ab = (com.facebook.orca.login.d)layoutinflater;
        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            c = bundle.getString("phoneNumber");
            d = bundle.getString("countryCode");
            e = bundle.getString("firstName");
            f = bundle.getString("lastName");
            g = bundle.getBoolean("smsRequestStarted", false);
            h = (Optional)bundle.getSerializable("smsRequestResult");
            i = bundle.getInt("numNameVerificationFails", 0);
            Z = bundle.getBoolean("isNameVerificationComplete", false);
            aa = bundle.getBoolean("isProgressIndicatorShowing", false);
        }
        if (h == null)
        {
            h = Optional.absent();
        }
        bundle = S();
        ac = (av)bundle.a(com/facebook/analytics/av);
        ad = (i)bundle.a(com/facebook/user/i);
        ae = (ObjectMapper)bundle.a(com/fasterxml/jackson/databind/ObjectMapper);
        af = bundle.b(java/lang/String, com/facebook/common/hardware/PhoneIsoCountryCode);
        ag = (s)bundle.a(com/facebook/c/s);
        ah = (com.facebook.orca.login.b)bundle.a(com/facebook/orca/login/b);
        ai = (ai)bundle.a(com/facebook/orca/login/ai);
        aj = (an)bundle.a(com/facebook/orca/login/an);
        ai.a(this);
        ai.a(this);
        ai.a("wildfire_registration");
        aj.a(this);
        aj.a(this);
        ak = BlueServiceFragment.a(this, "regDataVerificationOperation");
        ak.a(new c(this));
        ac.a(ah.a("view_reg_name"));
    }

    public void a(ServiceException serviceexception)
    {
        String s1 = serviceexception.a().toString();
        if (serviceexception.a() == t.API_ERROR)
        {
            int k = ((ApiErrorResult)serviceexception.b().i()).a();
            s1 = (new StringBuilder()).append(k).append("").toString();
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("API error code: ").append(k).toString());
        }
        ac.a(ah.a("sms_request_failure").b("phone_number", c).b("country_code", d).b("error_code", s1));
        U();
    }

    public void a(String s1, String s2)
    {
        if (ak.b() != j.INIT)
        {
            return;
        } else
        {
            e = s1;
            f = s2;
            Bundle bundle = new Bundle();
            bundle.putString("firstName", s1);
            bundle.putString("lastName", s2);
            bundle.putString("phone", ad.b(c));
            bundle.putString("countryCode", d);
            ab.beginShowingProgress();
            aa = true;
            ak.a(aq.b, bundle);
            ac.a(ah.a("name_entered").b("first_name", e).b("last_name", f));
            return;
        }
    }

    public void c(Intent intent)
    {
        d(intent);
        aa = false;
        ab.stopShowingProgress();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        if (aa)
        {
            ab.beginShowingProgress();
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("phoneNumber", c);
        bundle.putString("countryCode", d);
        bundle.putString("firstName", e);
        bundle.putString("lastName", f);
        bundle.putBoolean("smsRequestStarted", g);
        bundle.putSerializable("smsRequestResult", h);
        bundle.putInt("numNameVerificationFails", i);
        bundle.putBoolean("isNameVerificationComplete", Z);
        bundle.putBoolean("isProgressIndicatorShowing", aa);
    }

    public void f()
    {
        super.f();
        T();
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.WILDFIRE_REG_NAME_ACTIVITY_NAME;
    }

}
