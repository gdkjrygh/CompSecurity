// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

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
import com.facebook.base.fragment.e;
import com.facebook.c.s;
import com.facebook.common.hardware.PhoneIsoCountryCode;
import com.facebook.common.k.a;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.j;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.o;
import com.facebook.orca.server.aq;
import com.facebook.phonenumbers.NumberParseException;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Locale;

// Referenced classes of package com.facebook.orca.login:
//            am, ap, j, b, 
//            ai, WildfireRegSmsCodeFragment, i, an, 
//            h

public class WildfireRegPhoneNumberFragment extends AuthFragmentBase
    implements d, am, ap, com.facebook.orca.login.j
{

    private static final Class a = com/facebook/orca/login/WildfireRegPhoneNumberFragment;
    private av Z;
    private ObjectMapper aa;
    private com.facebook.prefs.shared.d ab;
    private javax.inject.a ac;
    private PhoneNumberUtil ad;
    private s ae;
    private com.facebook.orca.login.b af;
    private ai ag;
    private an ah;
    private BlueServiceFragment ai;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private boolean h;
    private i i;

    public WildfireRegPhoneNumberFragment()
    {
    }

    private void T()
    {
        com.facebook.debug.log.b.c(a, "Registration data verification succeeded");
        Z.a(af.b("manual_phone_number_ok").b("phone_number", e).b("country_code", f));
        U();
    }

    private void U()
    {
        ag.b(e, f);
        Z.a(af.b("manual_sms_started").b("phone_number", e).b("country_code", f));
    }

    private void V()
    {
        Bundle bundle = com.facebook.orca.login.WildfireRegSmsCodeFragment.a(c, d, e, f);
        d((new e(com/facebook/orca/login/WildfireRegSmsCodeFragment)).a().c().putExtras(bundle));
        h = false;
        i.stopShowingProgress();
    }

    private void W()
    {
        android.net.Uri.Builder builder = Uri.parse("https://m.facebook.com/r.php").buildUpon();
        builder.appendQueryParameter("locale", com.facebook.common.k.a.a(Locale.getDefault()));
        ae.b(new Intent("android.intent.action.VIEW", builder.build()), n());
        a(com/facebook/auth/login/PasswordCredentialsFragment);
        h = false;
        i.stopShowingProgress();
    }

    public static Bundle a(String s1, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putString("orca:authparam:firstname", s1);
        bundle.putString("orca:authparam:lastname", s2);
        return bundle;
    }

    private void a(ApiErrorResult apierrorresult)
    {
        i.stopShowingProgress();
        h = false;
        try
        {
            apierrorresult = aa.readTree(apierrorresult.c());
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
            Z.a(af.b("service_error").b("title", s1).b("message", apierrorresult));
        }
    }

    static void a(WildfireRegPhoneNumberFragment wildfireregphonenumberfragment)
    {
        wildfireregphonenumberfragment.T();
    }

    static void a(WildfireRegPhoneNumberFragment wildfireregphonenumberfragment, ServiceException serviceexception)
    {
        wildfireregphonenumberfragment.b(serviceexception);
    }

    private void b(ServiceException serviceexception)
    {
        Object obj;
        int k;
        Z.a(af.a("manual_phone_number_error", serviceexception).b("phone_number", e).b("country_code", f));
        if (serviceexception.a() != t.API_ERROR)
        {
            break MISSING_BLOCK_LABEL_439;
        }
        obj = (ApiErrorResult)serviceexception.b().i();
        k = ((ApiErrorResult) (obj)).a();
        if (k != 3116)
        {
            break MISSING_BLOCK_LABEL_397;
        }
        try
        {
            serviceexception = aa.readTree(((ApiErrorResult) (obj)).c());
        }
        // Misplaced declaration of an exception variable
        catch (ServiceException serviceexception)
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Unable to parse error data! ").append(serviceexception.getMessage()).toString());
            W();
            return;
        }
        if (serviceexception.get("phone") == null) goto _L2; else goto _L1
_L1:
        if (serviceexception.get("phone").get("error_code").asInt() != 3128) goto _L4; else goto _L3
_L3:
        obj = serviceexception.get("phone").get("existing_uid").asText();
        if (!serviceexception.get("phone").get("is_existing_user_partial").asBoolean()) goto _L6; else goto _L5
_L5:
        com.facebook.debug.log.b.c(a, "Error was caused by the phone number belonging to a partial account. False alarm.");
        Z.a(af.b("already_wf_user").b("user_id", ((String) (obj))));
        T();
_L8:
        return;
_L6:
        Z.a(af.b("already_fb_user").b("user_id", ((String) (obj))));
        ah.a(((String) (obj)), e);
        return;
_L4:
        Z.a(af.b("manual_phone_number_invalid").b("phone_number", e).b("country_code", f).a("error_code", serviceexception.get("phone").get("error_code").asInt()));
        com.facebook.ui.d.a.a(l()).a(o.app_error_dialog_title).b(serviceexception.get("phone").get("error_body").asText()).a();
_L2:
        i.stopShowingProgress();
        h = false;
        g = g + 1;
        if (g < 3) goto _L8; else goto _L7
_L7:
        W();
        return;
        if (k == 2)
        {
            a(((ApiErrorResult) (obj)));
            return;
        }
        if (k == 368)
        {
            Z.a(af.b("sentry_block"));
            W();
            return;
        }
        i.stopShowingProgress();
        h = false;
        com.facebook.ui.d.a.a(l()).a(o.app_error_dialog_title).a(serviceexception).a();
        return;
    }

    public void Q()
    {
        com.facebook.debug.log.b.c(a, "SMS request succeeded");
        Z.a(af.b("manual_sms_success"));
        V();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a(com/facebook/orca/login/j, viewgroup);
        i = (i)layoutinflater;
        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        com.facebook.inject.t t1 = S();
        Z = (av)t1.a(com/facebook/analytics/av);
        aa = (ObjectMapper)t1.a(com/fasterxml/jackson/databind/ObjectMapper);
        ab = (com.facebook.prefs.shared.d)t1.a(com/facebook/prefs/shared/d);
        ac = t1.b(java/lang/String, com/facebook/common/hardware/PhoneIsoCountryCode);
        ad = (PhoneNumberUtil)t1.a(com/facebook/phonenumbers/PhoneNumberUtil);
        ae = (s)t1.a(com/facebook/c/s);
        af = (com.facebook.orca.login.b)t1.a(com/facebook/orca/login/b);
        ag = (ai)t1.a(com/facebook/orca/login/ai);
        ah = (an)t1.a(com/facebook/orca/login/an);
        ag.a(this);
        ag.a(this);
        ag.a("wildfire_registration_manual");
        ah.a(this);
        ah.a(this);
        c = k().getString("orca:authparam:firstname");
        d = k().getString("orca:authparam:lastname");
        f = (String)ac.b();
        if (bundle != null)
        {
            e = bundle.getString("phoneNumber");
            f = bundle.getString("countryCode");
            g = bundle.getInt("numVerificationFails", 0);
            h = bundle.getBoolean("isProgressIndicatorShowing", false);
        }
        ai = BlueServiceFragment.a(this, "regDataVerificationOperation");
        ai.a(new h(this));
        Z.a(af.a("view_reg_phone"));
    }

    public void a(ServiceException serviceexception)
    {
        i.stopShowingProgress();
        h = false;
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("SMS request failed with error ").append(serviceexception.getMessage()).toString());
        String s1 = (new StringBuilder()).append(serviceexception.a()).append("").toString();
        if (serviceexception.a() == t.API_ERROR)
        {
            ApiErrorResult apierrorresult = (ApiErrorResult)serviceexception.b().i();
            int k = apierrorresult.a();
            s1 = (new StringBuilder()).append(k).append("").toString();
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("API error code: ").append(k).toString());
            if (k == 3308)
            {
                com.facebook.debug.log.b.e(a, "We have already requested too many SMSes for this number. Continuing to confirmation code entry screen anyway.");
                V();
                return;
            }
            if (k == 2)
            {
                a(apierrorresult);
                return;
            }
            if (k == 368)
            {
                Z.a(af.b("sentry_block"));
                W();
                return;
            }
        }
        Z.a(af.b("manual_sms_failure").b("phone_number", e).b("country_code", f).b("error_code", s1));
        com.facebook.ui.d.a.a(n()).a(o.app_error_dialog_title).a(serviceexception).a();
    }

    public void a(String s1)
    {
        f = s1;
    }

    public void b(String s1, String s2)
    {
        if (ai.b() != j.INIT)
        {
            return;
        }
        try
        {
            s1 = ad.parse(s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.facebook.ui.d.a.a(n()).a(o.app_error_dialog_title).b(o.wildfire_reg_phone_number_invalid).a();
            return;
        }
        e = ad.format(s1, com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
        f = s2;
        s1 = new Bundle();
        s1.putString("phone", e);
        s1.putString("countryCode", f);
        i.beginShowingProgress();
        h = true;
        ai.a(aq.b, s1);
        Z.a(af.b("manual_phone_number_entered").b("phone_number", e).b("country_code", f));
    }

    public void c(Intent intent)
    {
        d(intent);
        h = false;
        i.stopShowingProgress();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        i.setCountryCode(f);
        if (h)
        {
            i.beginShowingProgress();
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("phoneNumber", e);
        bundle.putString("countryCode", f);
        bundle.putInt("numVerificationFails", g);
        bundle.putBoolean("isProgressIndicatorShowing", h);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.WILDFIRE_REG_PHONE_NUMBER_ACTIVITY_NAME;
    }

}
