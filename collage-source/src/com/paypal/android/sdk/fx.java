// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            fy, gd, ca, fw, 
//            ec, dx, ef

public abstract class fx extends fy
{

    public String a;
    private ca b;
    private Map c;
    private fw d[];
    private String e;
    private boolean f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;

    public fx(ec ec, dx dx, ef ef, String s, String s1, String s2, ca ca1, 
            Map map, fw afw[], String s3, boolean flag, String s4, String s5, String s6)
    {
        super(ec, dx, ef, s);
        a = s2;
        b = ca1;
        c = map;
        d = afw;
        e = s3;
        f = flag;
        g = s6;
        if (gd.c(g))
        {
            g = "sale";
        }
        g = g.toLowerCase(Locale.US);
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

    private static String a(JSONArray jsonarray)
    {
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
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
        jsonarray = jsonarray.getJSONObject("authorization");
        if (jsonarray == null) goto _L1; else goto _L6
_L6:
        jsonarray = jsonarray.optString("id");
        return jsonarray;
    }

    protected abstract String A();

    public final boolean B()
    {
        return f;
    }

    protected final ca C()
    {
        return b;
    }

    public final String D()
    {
        return h;
    }

    public final String E()
    {
        return i;
    }

    public final String F()
    {
        return g;
    }

    public final String G()
    {
        return j;
    }

    public final String H()
    {
        return k;
    }

    abstract void a(JSONObject jsonobject);

    public final String b()
    {
        JSONObject jsonobject3;
        JSONObject jsonobject4;
        jsonobject3 = new JSONObject();
        jsonobject3.accumulate("intent", g);
        Object obj = new JSONObject();
        JSONArray jsonarray = z();
        if (jsonarray != null)
        {
            ((JSONObject) (obj)).accumulate("funding_instruments", jsonarray);
        }
        ((JSONObject) (obj)).accumulate("payment_method", A());
        jsonobject3.accumulate("payer", obj);
        obj = b;
        jsonobject4 = new JSONObject();
        jsonobject4.accumulate("currency", ((ca) (obj)).b().getCurrencyCode());
        jsonobject4.accumulate("total", ((ca) (obj)).a().toPlainString());
        if (c == null || c.isEmpty()) goto _L2; else goto _L1
_L1:
        if (c != null && !c.isEmpty()) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject = null;
_L6:
        jsonobject4.accumulate("details", jsonobject);
_L2:
        jsonobject = new JSONObject();
        jsonobject.accumulate("amount", jsonobject4);
        jsonobject.accumulate("description", e);
        if (d != null && d.length > 0)
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.accumulate("items", fw.a(d));
            jsonobject.accumulate("item_list", jsonobject1);
        }
        JSONArray jsonarray1 = new JSONArray();
        jsonarray1.put(jsonobject);
        a(jsonobject);
        jsonobject3.accumulate("transactions", jsonarray1);
        return jsonobject3.toString();
_L4:
        JSONObject jsonobject2 = new JSONObject();
        if (c.containsKey("shipping"))
        {
            jsonobject2.accumulate("shipping", c.get("shipping"));
        }
        if (c.containsKey("subtotal"))
        {
            jsonobject2.accumulate("subtotal", c.get("subtotal"));
        }
        jsonobject = jsonobject2;
        if (c.containsKey("tax"))
        {
            jsonobject2.accumulate("tax", c.get("tax"));
            jsonobject = jsonobject2;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        try
        {
            h = jsonobject.getString("state");
            i = jsonobject.optString("id");
            j = jsonobject.optString("create_time");
            k = a(jsonobject.getJSONArray("transactions"));
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

    protected JSONArray z()
    {
        return null;
    }
}
