// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Build;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            fv, ec, gd, ad, 
//            bY, ce, dx, ef

public final class fu extends fv
{

    public bY a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public long f;
    private String j;
    private final boolean k;
    private final String l;
    private String m;
    private String n;

    public fu(dx dx, ef ef, String s, String s1, bY by, String s2, String s3, 
            boolean flag, String s4, boolean flag1, String s5)
    {
        this(dx, ef, s, s1, by, flag, s4, flag1, s5);
        m = s2;
        n = s3;
    }

    public fu(dx dx, ef ef, String s, String s1, bY by, boolean flag, String s2, 
            boolean flag1, String s3)
    {
        super(ec.d, dx, ef, b(s, s1));
        a = by;
        b = flag;
        j = s2;
        k = flag1;
        l = s3;
    }

    public final String b()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("response_type", j);
        if (j != null && j.equals("token"))
        {
            hashmap.put("scope_consent_context", "access_token");
            if (!gd.c(l))
            {
                hashmap.put("scope", l);
            }
        }
        hashmap.put("risk_data", gd.a(ad.a().c().toString()));
        if (m != null)
        {
            hashmap.put("grant_type", "urn:paypal:params:oauth2:grant_type:otp");
            hashmap.put("nonce", n);
            JSONObject jsonobject = new JSONObject();
            jsonobject.accumulate("token_identifier", "otp");
            jsonobject.accumulate("token_value", m);
            hashmap.put("2fa_token_claims", a(jsonobject));
        } else
        if (a.a())
        {
            hashmap.put("grant_type", "password");
            hashmap.put("email", gd.a(a.b()));
            hashmap.put("password", gd.a(a.c()));
        } else
        {
            hashmap.put("grant_type", "password");
            a.d().c();
            hashmap.put("phone", gd.a((new StringBuilder("+")).append(a.d().c()).append(" ").append(a.d().a()).toString()));
            hashmap.put("pin", a.e());
        }
        hashmap.put("remember_me", "true");
        hashmap.put("device_name", gd.a(Build.DEVICE));
        hashmap.put("redirect_uri", gd.a("urn:ietf:wg:oauth:2.0:oob"));
        return gd.a(hashmap);
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        jsonobject.getString("scope");
        e = jsonobject.getString("scope");
        if (k)
        {
            c = jsonobject.getString("code");
            g = jsonobject.getString("nonce");
            return;
        }
        try
        {
            d = jsonobject.getString("access_token");
            f = jsonobject.getLong("expires_in");
            return;
        }
        catch (JSONException jsonexception)
        {
            b(jsonobject);
        }
        return;
    }

    public final void d()
    {
        b(n());
    }

    public final String e()
    {
        return "{ \"access_token\": \"mock_access_token\", \"code\": \"mock_code_EJhi9jOPswug9TDOv93qg4Y28xIlqPDpAoqd7biDLpeGCPvORHjP1Fh4CbFPgKMGCHejdDwe9w1uDWnjPCp1lkaFBjVmjvjpFtnr6z1YeBbmfZYqa9faQT_71dmgZhMIFVkbi4yO7hk0LBHXt_wtdsw\", \"scope\": \"https://api.paypal.com/v1/payments/.*\", \"nonce\": \"mock_nonce\", \"token_type\": \"Bearer\",\"expires_in\":28800,\"visitor_id\":\"zVxjDBTRRNfYXdOb19-lcTblxm-6bzXGvSlP76ZiHOudKaAvoxrW8Cg5pA6EjIPpiz4zlw\" }";
    }

    public final boolean u()
    {
        return m != null;
    }
}
