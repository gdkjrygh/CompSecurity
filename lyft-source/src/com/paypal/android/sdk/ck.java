// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            ch, bm, bU, bh, 
//            c

public final class ck extends ch
{

    public String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private String g;
    private String h;
    private Date i;

    public ck(bh bh, c c1, String s, String s1, String s2, String s3, String s4, 
            int j, int k)
    {
        super(bm.g, bh, c1, s);
        a = s1;
        b = s2;
        if (s3 == null)
        {
            throw new RuntimeException("cardNumber should not be null.  If it is, then you're probably trying to tokenize a card that's already been tokenized.");
        } else
        {
            c = s3;
            d = s4;
            e = j;
            f = k;
            return;
        }
    }

    public final String b()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.accumulate("payer_id", a);
        jsonobject.accumulate("cvv2", d);
        jsonobject.accumulate("expire_month", Integer.valueOf(e));
        jsonobject.accumulate("expire_year", Integer.valueOf(f));
        jsonobject.accumulate("number", c);
        jsonobject.accumulate("type", b);
        return jsonobject.toString();
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        try
        {
            g = jsonobject.getString("id");
            String s = jsonobject.getString("number");
            if (h == null || !h.endsWith(s.substring(s.length() - 4)))
            {
                h = s;
            }
            i = bU.a(jsonobject.getString("valid_until"));
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
        return (new StringBuilder("{\"id\":\"CARD-50Y58962PH1899901KFFBSDA\",\"valid_until\":\"2016-03-19T00:00:00.000Z\",\"state\":\"ok\",\"type\":\"visa\",\"number\":\"xxxxxxxxxxxx")).append(c.substring(c.length() - 4)).append("\",\"expire_month\":\"").append(e).append("\",\"expire_year\":\"").append(f).append("\",\"links\":[").append("{\"href\":\"https://api.sandbox.paypal.com/v1/vault/credit-card/CARD-50Y58962PH1899901KFFBSDA\",").append("\"rel\":\"self\",\"method\":\"GET\"").append("}]").append("}").toString();
    }

    public final String u()
    {
        return g;
    }

    public final String v()
    {
        return h;
    }

    public final Date w()
    {
        return i;
    }

    public final String x()
    {
        return b;
    }

    public final int y()
    {
        return e;
    }

    public final int z()
    {
        return f;
    }
}
