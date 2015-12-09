// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.ea;
import com.paypal.android.sdk.eh;
import com.paypal.android.sdk.ej;
import com.paypal.android.sdk.gd;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.paypal.android.sdk.payments:
//            dp, ao

abstract class dm
    implements dp
{

    private ao a;

    protected dm(ao ao1)
    {
        a = ao1;
    }

    private String a(ej ej1, boolean flag)
    {
        String s = (new StringBuilder()).append(eh.b).append(":").append(b()).append(":").append(ej1.a()).toString();
        ej1 = s;
        if (flag)
        {
            ej1 = (new StringBuilder()).append(s).append("|error").toString();
        }
        return ej1;
    }

    protected final ao a()
    {
        return a;
    }

    public final void a(ej ej1, boolean flag, String s, String s1, String s2)
    {
        ea.a();
        String s4 = Locale.getDefault().toString();
        HashMap hashmap = new HashMap();
        String s3;
        boolean flag1;
        if (!gd.a(s))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        hashmap.put("gn", a(ej1, flag1));
        hashmap.put("v31", a(ej1, flag1));
        s3 = (new StringBuilder()).append(a(ej1, flag1)).append(":").append(ej1.a(a.d(), flag)).toString();
        if (flag1)
        {
            s3 = (new StringBuilder()).append(s3).append("|error").toString();
        }
        hashmap.put("c25", s3);
        hashmap.put("v25", "D=c25");
        hashmap.put("c37", (new StringBuilder()).append(eh.a).append("::").toString());
        hashmap.put("c50", s4);
        hashmap.put("c35", "out");
        a(((Map) (hashmap)), ej1, s1, s2);
        if (s != null)
        {
            hashmap.put("c29", s);
        }
        a("2.9.10", ((Map) (hashmap)));
    }

    abstract void a(String s, Map map);

    protected void a(Map map, ej ej1, String s, String s1)
    {
    }

    protected abstract String b();
}
