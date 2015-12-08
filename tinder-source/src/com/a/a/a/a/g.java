// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a.a;

import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.a.a.a.a:
//            d

public final class g
{

    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final d e;

    public g(d d1)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject(d1.a);
        e = d1;
        a = jsonobject.getString("productId");
        b = jsonobject.optString("orderId");
        c = jsonobject.getString("purchaseToken");
        d = new Date(jsonobject.getLong("purchaseTime"));
    }

    public final String toString()
    {
        return String.format("%s purchased at %s(%s). Token: %s, Signature: %s", new Object[] {
            a, d, b, c, e.b
        });
    }
}
