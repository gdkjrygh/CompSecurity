// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import org.json.JSONObject;

public static final class b
{

    private static ang.String c = new <init>(0L, "");
    public final long a;
    public final String b;

    static on.JSONObject a(JSONObject jsonobject)
    {
        long l = jsonobject.optLong("price_amount_micros");
        jsonobject = jsonobject.optString("price_currency_code");
        if (l == 0L || TextUtils.isEmpty(jsonobject))
        {
            return c;
        } else
        {
            return new <init>(l, jsonobject);
        }
    }


    private (long l, String s)
    {
        a = l;
        b = s;
    }
}
