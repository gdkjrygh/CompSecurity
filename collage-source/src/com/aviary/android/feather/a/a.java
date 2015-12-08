// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.a;

import android.content.Context;
import com.aviary.android.feather.common.utils.f;
import com.aviary.android.feather.common.utils.i;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.a:
//            d

public final class com.aviary.android.feather.a.a
{
    public static class a
    {

        private final boolean a;
        private String b;
        private long c;
        private String d;
        private String e;
        private boolean f;
        private String g;

        public a a(long l)
        {
            c = l;
            return this;
        }

        public a a(String s)
        {
            b = s;
            return this;
        }

        public a a(boolean flag)
        {
            f = flag;
            return this;
        }

        public com.aviary.android.feather.a.a a()
            throws AssertionError
        {
            com.aviary.android.feather.a.a a1 = new com.aviary.android.feather.a.a(b, c);
            a1.g = f;
            if (a)
            {
                a1.d = true;
            } else
            {
                a1.d = false;
                if (f)
                {
                    Assert.assertNotNull("orderId cannot be null", d);
                    Assert.assertNotNull("token cannot be null", g);
                    Assert.assertNotNull("price cannot be null", e);
                    a1.e = d;
                    a1.c = g;
                    a1.f = e;
                    return a1;
                }
            }
            return a1;
        }

        public a b(String s)
        {
            d = s;
            return this;
        }

        public a c(String s)
        {
            e = s;
            return this;
        }

        public a d(String s)
        {
            g = s;
            return this;
        }

        public a(boolean flag)
        {
            a = flag;
        }
    }


    final String a;
    final long b;
    String c;
    boolean d;
    String e;
    String f;
    boolean g;

    com.aviary.android.feather.a.a(String s, long l)
    {
        a = s;
        b = l;
    }

    public JSONObject a(Context context)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("apiKey", i.a(context));
        jsonobject.put("sdkVersion", String.valueOf(348));
        jsonobject.put("binaryVersion", String.valueOf(com.aviary.android.feather.a.d.a(context)));
        jsonobject.put("aviaryId", com.aviary.android.feather.a.d.b(context));
        jsonobject.put("productId", a);
        jsonobject.put("packageName", context.getPackageName());
        jsonobject.put("country", com.aviary.android.feather.a.d.a());
        jsonobject.put("language", com.aviary.android.feather.a.d.b());
        jsonobject.put("purchaseTime", b);
        boolean flag;
        if (!com.aviary.android.feather.common.utils.f.d(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jsonobject.put("isProduction", flag);
        if (!d)
        {
            jsonobject.put("isNewPurchase", g);
            if (e != null)
            {
                jsonobject.put("orderId", e);
            }
            if (c != null)
            {
                jsonobject.put("receipt", c);
            }
            if (f != null)
            {
                jsonobject.put("price", f);
            }
        }
        return jsonobject;
    }
}
