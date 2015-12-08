// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            ch

public abstract class cg extends ch
{

    private String a;

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

    abstract void a(JSONObject jsonobject);

    public final String b()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.accumulate("intent", null);
        JSONObject jsonobject1 = new JSONObject();
        JSONArray jsonarray = u();
        if (jsonarray != null)
        {
            jsonobject1.accumulate("funding_instruments", jsonarray);
        }
        jsonobject1.accumulate("payment_method", v());
        jsonobject.accumulate("payer", jsonobject1);
        new JSONObject();
        throw new NullPointerException();
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        try
        {
            jsonobject.getString("state");
            a = jsonobject.optString("id");
            jsonobject.optString("create_time");
            a(jsonobject.getJSONArray("transactions"));
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

    protected JSONArray u()
    {
        return null;
    }

    protected abstract String v();

    public final String w()
    {
        return a;
    }
}
