// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import org.json.JSONObject;

public final class aox
{
    public static final class a
    {

        private static a c = new a(0L, "");
        public final long a;
        public final String b;

        static a a(JSONObject jsonobject)
        {
            long l = jsonobject.optLong("price_amount_micros");
            jsonobject = jsonobject.optString("price_currency_code");
            if (l == 0L || TextUtils.isEmpty(jsonobject))
            {
                return c;
            } else
            {
                return new a(l, jsonobject);
            }
        }


        private a(long l, String s)
        {
            a = l;
            b = s;
        }
    }


    public final String a;
    public final String b;
    public final String c;
    public final a d;

    aox(String s, String s1, String s2, a a1)
    {
        a = s;
        b = s1;
        c = s2;
        d = a1;
    }
}
