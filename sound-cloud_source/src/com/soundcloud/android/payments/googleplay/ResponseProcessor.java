// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import com.soundcloud.android.payments.ProductDetails;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.soundcloud.android.payments.googleplay:
//            BillingUtil

class ResponseProcessor
{

    ResponseProcessor()
    {
    }

    public String extractToken(String s)
        throws JSONException
    {
        return (new JSONObject(s)).getString("developerPayload");
    }

    public ProductDetails parseProduct(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        return new ProductDetails(s.getString("productId"), BillingUtil.removeAppName(s.optString("title")), s.optString("description"), s.optString("price"));
    }
}
