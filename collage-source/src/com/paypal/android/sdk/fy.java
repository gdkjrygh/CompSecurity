// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            fm, ec, dx, ef

public abstract class fy extends fm
{

    public fy(ec ec, dx dx, ef ef, String s)
    {
        super(ec, dx, ef, s);
    }

    protected final void b(JSONObject jsonobject)
    {
        String s;
        String s1;
        Object obj;
        String s2;
        String s3;
        String s4;
        obj = jsonobject.getString("name");
        s4 = jsonobject.getString("message");
        s2 = "";
        s3 = "";
        s = s3;
        s1 = s2;
        jsonobject = jsonobject.getJSONArray("details").getJSONObject(0);
        s = s3;
        s1 = s2;
        s2 = jsonobject.getString("field");
        s = s3;
        s1 = s2;
        s3 = jsonobject.getString("issue");
        jsonobject = ((JSONObject) (obj));
        s = s3;
        s1 = s2;
        if (!((String) (obj)).equals("VALIDATION_ERROR"))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        jsonobject = ((JSONObject) (obj));
        s = s3;
        s1 = s2;
        if (s2.contains("amount.currency"))
        {
            jsonobject = "pp_service_error_bad_currency";
        }
        obj = jsonobject;
        s1 = s2;
_L2:
        a(((String) (obj)), s4, (new StringBuilder("field:")).append(s1).append(", issue:").append(s3).toString());
        return;
        jsonobject;
        s3 = s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
