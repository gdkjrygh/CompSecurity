// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class aoi
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a f[];
        public final int e;

        static a a(int k)
        {
            switch (k)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Id=")).append(k).append(" is not supported").toString());

            case 0: // '\0'
                return a;

            case 1: // '\001'
                return b;

            case 2: // '\002'
                return c;

            case 3: // '\003'
                return d;
            }
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(aoi$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("PURCHASED", 0, 0);
            b = new a("CANCELLED", 1, 1);
            c = new a("REFUNDED", 2, 2);
            d = new a("EXPIRED", 3, 3);
            f = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int k, int l)
        {
            super(s, k);
            e = l;
        }
    }


    public final String a;
    public final String b;
    public final long c;
    public final a d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    private String i;
    private boolean j;

    private aoi(String s, String s1, String s2, long l, int k, String s3, 
            String s4, boolean flag, String s5, String s6)
    {
        a = s;
        b = s1;
        i = s2;
        c = l;
        d = a.a(k);
        e = s3;
        f = s4;
        j = flag;
        h = s6;
        g = s5;
    }

    public static aoi a(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject(s);
        return new aoi(jsonobject.getString("productId"), jsonobject.optString("orderId"), jsonobject.optString("packageName"), jsonobject.getLong("purchaseTime"), jsonobject.optInt("purchaseState", 0), jsonobject.optString("developerPayload"), jsonobject.optString("token", jsonobject.optString("purchaseToken")), jsonobject.optBoolean("autoRenewing"), s, s1);
    }

    private static void a(JSONObject jsonobject, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            jsonobject.put(s, s1);
        }
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("productId", a);
            a(jsonobject, "orderId", b);
            a(jsonobject, "packageName", i);
            jsonobject.put("purchaseTime", c);
            jsonobject.put("purchaseState", d.e);
            a(jsonobject, "developerPayload", e);
            a(jsonobject, "token", f);
            if (j)
            {
                jsonobject.put("autoRenewing", true);
            }
        }
        catch (JSONException jsonexception)
        {
            throw new AssertionError(jsonexception);
        }
        return jsonobject;
    }

    public final String toString()
    {
        return (new StringBuilder("Purchase{state=")).append(d).append(", time=").append(c).append(", sku='").append(a).append('\'').append('}').toString();
    }
}
