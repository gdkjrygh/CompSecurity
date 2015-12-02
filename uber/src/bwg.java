// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class bwg extends bwi
{

    private final String a;
    private final String b;

    public bwg(buk buk, bus bus, String s, String s1, String s2, String s3)
    {
        super(bup.e, buk, bus, c(s, s1));
        a = s2;
        b = s3;
    }

    public final String b()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("authn_schemes", "2fa_pre_login");
        hashmap.put("nonce", a);
        JSONObject jsonobject = new JSONObject();
        jsonobject.accumulate("authn_scheme", "security_key_sms_token");
        jsonobject.accumulate("token_identifier", b);
        hashmap.put("2fa_token_identifiers", a(jsonobject));
        return bwq.a(hashmap);
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        try
        {
            g = jsonobject.getString("nonce");
            return;
        }
        catch (JSONException jsonexception)
        {
            b(jsonobject);
        }
    }

    public final void d()
    {
        b(n());
    }

    public final String e()
    {
        return "{\"nonce\": \"mock-login-challenge-nonce\"}";
    }
}
