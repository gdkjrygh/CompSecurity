// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            fy, ec, gd, df, 
//            dc, ad, dx, ef

public final class fl extends fy
{

    private String a;
    private String b;
    private boolean c;
    private JSONObject d;
    private JSONObject e;
    private JSONObject f;
    private String g;
    private String h;
    private String i;
    private String j;

    public fl(dx dx, ef ef, String s, String s1, boolean flag, String s2, String s3, 
            String s4, String s5, JSONObject jsonobject, JSONObject jsonobject1)
    {
        super(ec.i, dx, ef, s);
        c = flag;
        a = s4;
        b = s5;
        d = jsonobject;
        e = jsonobject1;
        a("PayPal-Request-Id", s1);
        if (gd.d(s2))
        {
            a("PayPal-Partner-Attribution-Id", s2);
        }
        if (gd.d(s3))
        {
            a("PayPal-Client-Metadata-Id", s3);
        }
    }

    private static String a(JSONArray jsonarray)
    {
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        JSONObject jsonobject;
        try
        {
            jsonarray = jsonarray.getJSONObject(0);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            return null;
        }
        if (jsonarray == null) goto _L1; else goto _L3
_L3:
        jsonarray = jsonarray.getJSONArray("related_resources");
        if (jsonarray == null) goto _L1; else goto _L4
_L4:
        jsonarray = jsonarray.getJSONObject(0);
        if (jsonarray == null) goto _L1; else goto _L5
_L5:
        jsonobject = jsonarray.optJSONObject("authorization");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        return jsonobject.optString("id");
        jsonarray = jsonarray.optJSONObject("order");
        if (jsonarray == null) goto _L1; else goto _L6
_L6:
        jsonarray = jsonarray.optString("id");
        return jsonarray;
    }

    public final String b()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.accumulate("payment_id", a);
        jsonobject.accumulate("session_id", b);
        if (e != null)
        {
            jsonobject.accumulate("funding_option", e);
        }
        if (d != null)
        {
            jsonobject.accumulate("shipping_address", d);
        }
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.accumulate("device_info", gd.a(df.a().toString()));
        jsonobject1.accumulate("app_info", gd.a(dc.a().toString()));
        jsonobject1.accumulate("risk_data", gd.a(ad.a().c().toString()));
        jsonobject.accumulate("client_info", jsonobject1);
        return jsonobject.toString();
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        try
        {
            f = jsonobject.getJSONObject("payment");
            g = f.optString("state");
            a = f.optString("id");
            h = f.optString("create_time");
            i = f.optString("intent");
            j = a(f.getJSONArray("transactions"));
            return;
        }
        catch (JSONException jsonexception)
        {
            d();
        }
    }

    public final void d()
    {
        b(n());
    }

    public final String e()
    {
        return "{     \"payment\": {         \"id\": \"PAY-6PU626847B294842SKPEWXHY\",         \"transactions\": [             {                 \"amount\": {                     \"total\": \"2.85\",                     \"details\": {                         \"subtotal\": \"2.85\"                     },                     \"currency\": \"USD\"                 },                 \"description\": \"Awesome Sauce\",                 \"related_resources\": [                     {                         \"sale\": {                             \"amount\": {                                 \"total\": \"2.85\",                                 \"currency\": \"USD\"                             },                             \"id\": \"5LR21373K59921925\",                             \"parent_payment\": \"PAY-6PU626847B294842SKPEWXHY\",                             \"update_time\": \"2014-07-18T18:47:06Z\",                             \"state\": \"completed\",                             \"create_time\": \"2014-07-18T18:46:55Z\",                             \"links\": [                                 {                                     \"method\": \"GET\",                                     \"rel\": \"self\",                                     \"href\": \"https://www.stage2std019.stage.\"                                 },                                 {                                     \"method\": \"POST\",                                     \"rel\": \"refund\",                                     \"href\": \"https://www.stage2std019.stage. \"                                 },                                 {                                     \"method\": \"GET\",                                     \"rel\": \"parent_payment\",                                     \"href\": \"https://www.stage2std019.stage.PEWXHY \"                                 }                             ]                         }                     }                 ]             }         ],         \"update_time\": \"2014-07-18T18:47:06Z\",         \"payer\": {             \"payer_info\": {                 \"shipping_address\": {                                      }             },             \"payment_method\": \"paypal\"         },         \"state\": \"approved\",         \"create_time\": \"2014-07-18T18:46:55Z\",         \"links\": [             {                 \"method\": \"GET\",                 \"rel\": \"self\",                 \"href\": \"https://www.stage2std019.stage.paypal.\"             }         ],         \"intent\": \"sale\"     } } ";
    }

    public final void m()
    {
        ad.a().g();
    }

    public final String u()
    {
        return a;
    }

    public final boolean v()
    {
        return c;
    }

    public final String w()
    {
        return g;
    }

    public final String x()
    {
        return h;
    }

    public final String y()
    {
        return i;
    }

    public final String z()
    {
        return j;
    }
}
