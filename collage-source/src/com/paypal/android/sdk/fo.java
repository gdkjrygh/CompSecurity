// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            fy, ec, gd, ca, 
//            fw, df, dc, ad, 
//            dx, ef

public final class fo extends fy
{

    private String a;
    private String b;
    private JSONArray c;
    private JSONObject d;
    private JSONArray e;
    private ca f;
    private Map g;
    private fw h[];
    private String i;
    private String j;
    private boolean k;
    private String l;
    private String m;
    private String n;

    public fo(dx dx, ef ef, String s, String s1, String s2, ca ca1, Map map, 
            fw afw[], String s3, boolean flag, String s4, String s5, String s6, boolean flag1)
    {
        super(ec.h, dx, ef, s);
        f = ca1;
        g = map;
        h = afw;
        i = s3;
        k = flag1;
        j = s6;
        if (gd.c(j))
        {
            j = "sale";
        }
        j = j.toLowerCase(Locale.US);
        a("PayPal-Request-Id", s1);
        if (gd.d(s4))
        {
            a("PayPal-Partner-Attribution-Id", s4);
        }
        if (gd.d(s5))
        {
            a("PayPal-Client-Metadata-Id", s5);
        }
    }

    public final String b()
    {
        JSONObject jsonobject3;
        JSONObject jsonobject4;
        jsonobject3 = new JSONObject();
        jsonobject3.accumulate("intent", j);
        Object obj = new JSONObject();
        ((JSONObject) (obj)).accumulate("payment_method", "paypal");
        jsonobject3.accumulate("payer", obj);
        obj = new JSONObject();
        ((JSONObject) (obj)).accumulate("cancel_url", "http://cancelurl");
        ((JSONObject) (obj)).accumulate("return_url", "http://returnurl");
        jsonobject3.accumulate("redirect_urls", obj);
        obj = f;
        jsonobject4 = new JSONObject();
        jsonobject4.accumulate("currency", ((ca) (obj)).b().getCurrencyCode());
        jsonobject4.accumulate("total", ((ca) (obj)).a().toPlainString());
        if (g == null || g.isEmpty()) goto _L2; else goto _L1
_L1:
        if (g != null && !g.isEmpty()) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject = null;
_L6:
        jsonobject4.accumulate("details", jsonobject);
_L2:
        jsonobject = new JSONObject();
        jsonobject.accumulate("amount", jsonobject4);
        jsonobject.accumulate("description", i);
        if (h != null && h.length > 0)
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.accumulate("items", fw.a(h));
            jsonobject.accumulate("item_list", jsonobject1);
        }
        Object obj1 = new JSONArray();
        ((JSONArray) (obj1)).put(jsonobject);
        jsonobject3.accumulate("transactions", obj1);
        if (gd.d(l))
        {
            jsonobject.accumulate("invoice_number", l);
        }
        if (gd.d(m))
        {
            jsonobject.accumulate("custom", m);
        }
        if (gd.d(n))
        {
            jsonobject.accumulate("soft_descriptor", n);
        }
        jsonobject = new JSONObject();
        jsonobject.accumulate("device_info", gd.a(df.a().toString()));
        jsonobject.accumulate("app_info", gd.a(dc.a().toString()));
        jsonobject.accumulate("risk_data", gd.a(ad.a().c().toString()));
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).accumulate("payment", jsonobject3);
        ((JSONObject) (obj1)).accumulate("client_info", jsonobject);
        if (k)
        {
            ((JSONObject) (obj1)).accumulate("retrieve_shipping_addresses", Boolean.valueOf(true));
        }
        return ((JSONObject) (obj1)).toString();
_L4:
        JSONObject jsonobject2 = new JSONObject();
        if (g.containsKey("shipping"))
        {
            jsonobject2.accumulate("shipping", g.get("shipping"));
        }
        if (g.containsKey("subtotal"))
        {
            jsonobject2.accumulate("subtotal", g.get("subtotal"));
        }
        jsonobject = jsonobject2;
        if (g.containsKey("tax"))
        {
            jsonobject2.accumulate("tax", g.get("tax"));
            jsonobject = jsonobject2;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        a = jsonobject.optString("payment_id");
        b = jsonobject.getString("session_id");
        c = jsonobject.optJSONArray("addresses");
        jsonobject = jsonobject.optJSONObject("funding_options");
        if (jsonobject != null)
        {
            d = jsonobject.optJSONObject("default_option");
            e = jsonobject.optJSONArray("alternate_options");
        }
    }

    public final fo d(String s)
    {
        l = s;
        return this;
    }

    public final void d()
    {
        b(n());
    }

    public final fo e(String s)
    {
        m = s;
        return this;
    }

    public final String e()
    {
        return "{    \"session_id\":\"7N0112287V303050T\",    \"payment_id\":\"PAY-18X32451H0459092JKO7KFUI\",    \"addresses\": [          {             \"city\": \"Columbia\",              \"line2\": \"6073 2nd Street\",              \"line1\": \"Suite 222\",              \"recipient_name\": \"Beverly Jello\",             \"state\": \"MD\",              \"postal_code\": \"21045\",             \"default_address\": false,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366853\"          },          {             \"city\": \"Austin\",              \"line2\": \"Apt. 222\",              \"line1\": \"52 North Main St. \",              \"recipient_name\": \"Michael Chassen\",             \"state\": \"TX\",              \"postal_code\": \"78729\",             \"default_address\": true,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366852\"          },          {             \"city\": \"Austin\",              \"line1\": \"202 South State St. \",              \"recipient_name\": \"Sam Stone\",             \"state\": \"TX\",              \"postal_code\": \"78729\",             \"default_address\": true,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366852\"          }     ],     \"funding_options\":{       \"default_option\":{          \"id\":\"1\",          \"backup_funding_instrument\":{             \"payment_card\":{                \"number\":\"8029\",                \"type\":\"VISA\"             }          },          \"funding_sources\":[             {                \"amount\":{                   \"value\":\"216.85\",                   \"currency\":\"USD\"                },                \"funding_instrument_type\":\"BANK_ACCOUNT\",                \"funding_mode\":\"INSTANT_TRANSFER\",                \"bank_account\":{                   \"bank_name\":\"SunTrust\",                   \"account_number\":\"7416\",                   \"account_number_type\":\"BBAN\",                   \"country_code\":\"US\",                   \"account_type\":\"CHECKING\"                }             },             {                \"amount\":{                   \"value\":\"6.00\",                   \"currency\":\"USD\"                },                \"funding_instrument_type\":\"CREDIT\",                \"funding_mode\":\"INSTANT_TRANSFER\",                \"credit\":{                   \"type\":\"BILL_ME_LATER\",                   \"id\":\"mock-id\"                }             }          ]       },       \"alternate_options\":[          {             \"id\":\"2\",             \"funding_sources\":[                {                   \"amount\":{                      \"value\":\"216.85\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"PAYMENT_CARD\",                   \"payment_card\":{                      \"number\":\"8029\",                      \"type\":\"VISA\"                   },                   \"funding_mode\":\"INSTANT_TRANSFER\"                },                {                   \"amount\":{                      \"value\":\"6.00\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"BALANCE\",                   \"funding_mode\":\"INSTANT_TRANSFER\"                }             ]          },          {             \"id\":\"3\",             \"funding_sources\":[                {                   \"amount\":{                      \"value\":\"216.85\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"PAYMENT_CARD\",                   \"payment_card\":{                      \"number\":\"8011\",                      \"type\":\"VISA\"                   },                   \"funding_mode\":\"INSTANT_TRANSFER\"                },                {                   \"amount\":{                      \"value\":\"6.00\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"BALANCE\",                   \"funding_mode\":\"INSTANT_TRANSFER\"                }             ]          }       ]    } }";
    }

    public final fo f(String s)
    {
        n = s;
        return this;
    }

    public final String u()
    {
        return a;
    }

    public final String v()
    {
        return b;
    }

    public final JSONArray w()
    {
        return c;
    }

    public final JSONObject x()
    {
        return d;
    }

    public final JSONArray y()
    {
        return e;
    }
}
