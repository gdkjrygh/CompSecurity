// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            ch, bK, R, bH, 
//            aa

public final class bV extends ch
{

    private String a;
    private JSONObject b;

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
        jsonobject.accumulate("session_id", null);
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.accumulate("device_info", R.a(bK.a().toString()));
        jsonobject1.accumulate("app_info", R.a(bH.a().toString()));
        jsonobject1.accumulate("risk_data", R.a(aa.a().b().toString()));
        jsonobject.accumulate("client_info", jsonobject1);
        return jsonobject.toString();
    }

    public final void c()
    {
        JSONObject jsonobject = n();
        try
        {
            b = jsonobject.getJSONObject("payment");
            b.optString("state");
            a = b.optString("id");
            b.optString("create_time");
            b.optString("intent");
            a(b.getJSONArray("transactions"));
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
        aa.a().f();
    }

    public final String u()
    {
        return a;
    }
}
