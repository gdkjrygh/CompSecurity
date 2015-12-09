// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.math.BigDecimal;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            fx, ec, gd, ca, 
//            dd, dx, ef, fw

public final class fp extends fx
{

    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private String g;
    private String h;
    private String i;
    private String j;

    public fp(dx dx, ef ef, String s, String s1, String s2, String s3, ca ca1, 
            Map map, fw afw[], String s4, boolean flag, String s5, String s6, String s7)
    {
        super(ec.g, dx, ef, s, s1, s3, ca1, map, afw, s4, flag, s5, s6, s7);
        g = s2;
    }

    public fp(dx dx, ef ef, String s, String s1, String s2, String s3, String s4, 
            int k, int l, String s5, ca ca1, Map map, fw afw[], String s6, 
            boolean flag, String s7, String s8, String s9)
    {
        super(ec.g, dx, ef, s, s1, null, ca1, map, afw, s6, flag, s7, s8, s9);
        b = s2;
        c = s3;
        d = s4;
        e = k;
        f = l;
    }

    protected final String A()
    {
        return "credit_card";
    }

    final void a(JSONObject jsonobject)
    {
        if (gd.d(h))
        {
            jsonobject.accumulate("invoice_number", h);
        }
        if (gd.d(i))
        {
            jsonobject.accumulate("custom", i);
        }
        if (gd.d(j))
        {
            jsonobject.accumulate("soft_descriptor", j);
        }
    }

    public final fp d(String s)
    {
        h = s;
        return this;
    }

    public final fp e(String s)
    {
        i = s;
        return this;
    }

    public final String e()
    {
        String s1 = dd.a(C().a().doubleValue(), C().b());
        StringBuilder stringbuilder = (new StringBuilder("{\"id\":\"PAY-6RV70583SB702805EKEYSZ6Y\",\"intent\":\"sale\",\"create_time\": \"2014-02-12T22:29:49Z\",\"update_time\": \"2014-02-12T22:29:50Z\",\"payer\":{\"funding_instruments\":[{\"credit_card\":{\"expire_month\":\"")).append(e).append("\",\"expire_year\":\"").append(f).append("\",\"number\":\"");
        String s;
        if (b != null)
        {
            s = c.substring(c.length() - 4);
        } else
        {
            s = "xxxxxxxxxx1111";
        }
        return stringbuilder.append(s).append("\",\"type\":\"VISA\"}").append("}],").append("\"payment_method\":\"credit_card\"},").append("\"state\":\"approved\",\"transactions\":").append("[{").append("\"amount\":{\"currency\":\"USD\",").append("\"total\":\"").append(s1).append("\"},\"description\":\"I am a sanity check payment.\",").append("\"item_list\":{},\"payee\":").append("{\"merchant_id\":\"PKKPTJKL75YDS\"},\"related_resources\":").append("[{\"sale\":{\"amount\":{\"currency\":\"USD\",\"total\":\"").append(s1).append("\"},\"id\":\"0EW02334X44816642\",").append("\"parent_payment\":\"PAY-123456789012345689\",\"state\":\"completed\"}}]}]}").toString();
    }

    public final fp f(String s)
    {
        j = s;
        return this;
    }

    public final String u()
    {
        return c;
    }

    public final String v()
    {
        return b;
    }

    public final String w()
    {
        return d;
    }

    public final int x()
    {
        return e;
    }

    public final int y()
    {
        return f;
    }

    protected final JSONArray z()
    {
        JSONArray jsonarray = new JSONArray();
        if (b != null)
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.accumulate("cvv2", d);
            jsonobject.accumulate("expire_month", Integer.valueOf(e));
            jsonobject.accumulate("expire_year", Integer.valueOf(f));
            jsonobject.accumulate("number", c);
            jsonobject.accumulate("type", b);
            JSONObject jsonobject2 = new JSONObject();
            jsonobject2.accumulate("credit_card", jsonobject);
            jsonarray.put(jsonobject2);
            return jsonarray;
        } else
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.accumulate("payer_id", super.a);
            jsonobject1.accumulate("credit_card_id", g);
            JSONObject jsonobject3 = new JSONObject();
            jsonobject3.accumulate("credit_card_token", jsonobject1);
            jsonarray.put(jsonobject3);
            return jsonarray;
        }
    }
}
